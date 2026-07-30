package io.github.ayohee.stardewdelight.content.blocks.crops;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.function.Supplier;


public abstract class TallFlowerCropBlock extends TallCropBlock {
    protected Supplier<BlockState> grownForm;

    protected TallFlowerCropBlock(Properties properties, int maxAge, ItemLike seed, int doubleAge, Supplier<BlockState> grownForm) {
        super(properties, maxAge, seed, doubleAge);
        this.grownForm = grownForm;
    }

    // We do it this way because providing it in the constructor doesn't give us a way to
    // have it *not* be null in createBlockStateDefinition
    public static TallFlowerCropBlock create(Properties properties, IntegerProperty ageProperty, int maxAge, ItemLike seed, int doubleAge, Supplier<BlockState> grownForm) {
        return new TallFlowerCropBlock(properties, maxAge, seed, doubleAge, grownForm) {
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
