package io.github.ayohee.stardewdelight.content.blocks.crops;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.function.Supplier;

public abstract class FlowerCrop extends BaseCropBlock {
    protected Supplier<BlockState> grownForm;

    protected FlowerCrop(Properties properties, int maxAge, ItemLike seed, Supplier<BlockState> grownForm) {
        super(properties, maxAge, seed);
        this.grownForm = grownForm;
    }

    // We do it this way because providing it in the constructor doesn't give us a way to
    // have it *not* be null in createBlockStateDefinition
    public static FlowerCrop create(Properties properties, IntegerProperty ageProperty, int maxAge, ItemLike seed, Supplier<BlockState> grownForm) {
        return new FlowerCrop(properties, maxAge, seed, grownForm) {
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
