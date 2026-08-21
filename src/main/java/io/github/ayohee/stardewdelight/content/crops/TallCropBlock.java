package io.github.ayohee.stardewdelight.content.crops;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.neoforged.neoforge.common.CommonHooks;


public abstract class TallCropBlock extends BaseCropBlock {
    protected int doubleAge;

    protected TallCropBlock(Properties properties, int maxAge, ItemLike seed, int doubleAge) {
        super(properties, maxAge, seed);
        this.doubleAge = doubleAge;

        registerDefaultState(defaultBlockState()
                .setValue(getAgeProperty(), 0)
                .setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER)
        );
    }

    // We do it this way because providing it in the constructor doesn't give us a way to
    // have it *not* be null in createBlockStateDefinition
    public static TallCropBlock create(Properties properties, IntegerProperty ageProperty, int maxAge, ItemLike seed, int doubleAge) {
        return new TallCropBlock(properties, maxAge, seed, doubleAge) {
            @Override
            public IntegerProperty getAgeProperty() {
                return ageProperty;
            }
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        if (doubleAge == 0) {
            BlockPos clicked = ctx.getClickedPos();
            Level level = ctx.getLevel();
            return clicked.getY() < level.getMaxBuildHeight() - 1 && level.getBlockState(clicked.above()).canBeReplaced(ctx) ? super.getStateForPlacement(ctx) : null;
        } else {
            return super.getStateForPlacement(ctx);
        }
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack stack) {
        if (doubleAge == 0) {
            BlockPos above = pos.above();
            level.setBlock(above, this.defaultBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), Block.UPDATE_ALL);
        }
    }

    @Override
    protected boolean canSurvive(BlockState blockstate, LevelReader level, BlockPos pos) {
        if (blockstate.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) != DoubleBlockHalf.UPPER) {
            return super.canSurvive(blockstate, level, pos);
        } else {
            BlockState below = level.getBlockState(pos.below());
            if (!blockstate.is(this)) {
                return super.canSurvive(blockstate, level, pos);
            } else {
                return below.is(this) && below.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER;
            }
        }
    }

    @Override
    protected boolean isRandomlyTicking(BlockState blockstate) {
        return blockstate.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER;
    }

    @Override
    protected void randomTick(BlockState blockstate, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isAreaLoaded(pos, 1)) {
            return;
        }

        if (level.getRawBrightness(pos, 0) < 9) {
            return;
        }

        int age = this.getAge(blockstate);
        if (age == this.getMaxAge()) {
            return;
        }

        if (age + 1 == this.doubleAge && !level.isEmptyBlock(pos.above())) {
            return;
        }

        float f = getGrowthSpeed(blockstate, level, pos);
        if (CommonHooks.canCropGrow(level, pos, blockstate, random.nextInt((int)(25.0F / f) + 1) == 0)) {
            growToAge(age + 1, pos, level);
            CommonHooks.fireCropGrowPost(level, pos, blockstate);
        }
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState blockstate) {
        int age = this.getAge(blockstate);

        // This could be simplified, but it looks really weird when you do that
        if (age + 1 == this.doubleAge && !level.isEmptyBlock(pos.above())) {
            return false;
        }
        return true;
    }

    @Override
    public void growCrops(Level level, BlockPos pos, BlockState blockstate) {
        int age = Math.min(this.getAge(blockstate) + this.getBonemealAgeIncrease(level), this.getMaxAge());
        if (!(level.isEmptyBlock(pos.above()) || level.getBlockState(pos.above()).is(this))) {
            age = Math.min(age, this.doubleAge - 1);
        }

        growToAge(age, pos, level);
    }

    protected void growToAge(int age, BlockPos pos, LevelAccessor level) {
        if (age >= doubleAge) {
            level.setBlock(pos.above(), this.getStateForAge(age).setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), Block.UPDATE_CLIENTS);
        }
        level.setBlock(pos, this.getStateForAge(age), Block.UPDATE_CLIENTS);
    }

    @Override
    public void destroy(LevelAccessor level, BlockPos pos, BlockState blockstate) {
        if (blockstate.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER) {
            if (level.getBlockState(pos.below()).is(this)) {
                level.destroyBlock(pos.below(), true);
            }
        }
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(BlockStateProperties.DOUBLE_BLOCK_HALF);
    }
}
