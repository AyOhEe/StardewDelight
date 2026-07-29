package io.github.ayohee.stardewdelight.content.blocks.crops;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.neoforged.neoforge.common.CommonHooks;

import java.util.function.Supplier;


public abstract class TallFlowerCrop extends BaseCropBlock {
    protected Supplier<BlockState> grownForm;

    protected TallFlowerCrop(Properties properties, int maxAge, ItemLike seed, Supplier<BlockState> grownForm) {
        super(properties, maxAge, seed);
        this.grownForm = grownForm;
    }

    // We do it this way because providing it in the constructor doesn't give us a way to
    // have it *not* be null in createBlockStateDefinition
    public static TallFlowerCrop create(Properties properties, IntegerProperty ageProperty, int maxAge, ItemLike seed, Supplier<BlockState> grownForm) {
        return new TallFlowerCrop(properties, maxAge, seed, grownForm) {
            @Override
            public IntegerProperty getAgeProperty() {
                return ageProperty;
            }
        };
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
            growToAge(age + 1, pos, level);
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

        growToAge(age, pos, level);
    }

    protected void growToAge(int age, BlockPos pos, LevelAccessor level) {
        if (age == this.getMaxAge()) {
            level.setBlock(pos, grownForm.get(), Block.UPDATE_CLIENTS);
            level.setBlock(pos.above(), grownForm.get().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), Block.UPDATE_CLIENTS);
        } else {
            level.setBlock(pos, this.getStateForAge(age), Block.UPDATE_CLIENTS);
        }
    }
}
