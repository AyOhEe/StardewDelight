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


public abstract class TallFlowerCrop extends TallCropBlock {
    protected Supplier<BlockState> grownForm;

    protected TallFlowerCrop(Properties properties, int maxAge, ItemLike seed, int doubleAge, Supplier<BlockState> grownForm) {
        super(properties, maxAge, seed, doubleAge);
        this.grownForm = grownForm;
    }

    // We do it this way because providing it in the constructor doesn't give us a way to
    // have it *not* be null in createBlockStateDefinition
    public static TallFlowerCrop create(Properties properties, IntegerProperty ageProperty, int maxAge, ItemLike seed, int doubleAge, Supplier<BlockState> grownForm) {
        return new TallFlowerCrop(properties, maxAge, seed, doubleAge, grownForm) {
            @Override
            public IntegerProperty getAgeProperty() {
                return ageProperty;
            }
        };
    }


    @Override
    public BlockState getStateForAge(int age) {
        if (age == getMaxAge()) {
            return grownForm.get();
        } else {
            return super.getStateForAge(age);
        }
    }
}
