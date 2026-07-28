package io.github.ayohee.stardewdelight.content.blocks.crops;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.neoforged.neoforge.common.CommonHooks;


// TODO i want to revisit this, and probably move it out into its own TallCropBlock or something
public abstract class TallFlowerCrop extends BaseCropBlock {
    public TallFlowerCrop(Properties properties) {
        super(properties);
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

        if (age + 1 == this.getMaxAge() && !level.isEmptyBlock(pos.above())) {
            return;
        }

        float f = getGrowthSpeed(blockstate, level, pos);
        if (CommonHooks.canCropGrow(level, pos, blockstate, random.nextInt((int)(25.0F / f) + 1) == 0)) {
            if (age + 1 == this.getMaxAge()) {
                level.setBlock(pos, this.getBottomMatureBlockState(), Block.UPDATE_CLIENTS);
                level.setBlock(pos.above(), this.getBottomMatureBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), Block.UPDATE_CLIENTS);
            } else {
                level.setBlock(pos, this.getStateForAge(age + 1), Block.UPDATE_CLIENTS);
            }
            CommonHooks.fireCropGrowPost(level, pos, blockstate);
        }
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState blockstate) {
        int age = this.getAge(blockstate);

        // This could be simplified, but it looks really weird when you do that
        if (age + 1 == this.getMaxAge() && !level.isEmptyBlock(pos.above())) {
            return false;
        }
        return true;
    }

    @Override
    public void growCrops(Level level, BlockPos pos, BlockState blockstate) {
        int age = Math.min(this.getAge(blockstate) + this.getBonemealAgeIncrease(level), this.getMaxAge());
        if (!level.isEmptyBlock(pos.above())) {
            age = Math.min(age, this.getMaxAge() - 1);
        }

        if (age == this.getMaxAge()) {
            level.setBlock(pos, this.getBottomMatureBlockState(), Block.UPDATE_CLIENTS);
            level.setBlock(pos.above(), this.getBottomMatureBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), Block.UPDATE_CLIENTS);
        } else {
            level.setBlock(pos, this.getStateForAge(age), Block.UPDATE_CLIENTS);
        }
    }

    @Override
    public void performBonemeal(ServerLevel p_221040_, RandomSource p_221041_, BlockPos p_221042_, BlockState p_221043_) {
        super.performBonemeal(p_221040_, p_221041_, p_221042_, p_221043_);
    }

    public abstract BlockState getBottomMatureBlockState();
}
