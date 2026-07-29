package io.github.ayohee.stardewdelight.content.blocks.crops;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;


public abstract class BaseCropBlock extends CropBlock {
    protected int maxAge;
    protected ItemLike seed;

    protected BaseCropBlock(Properties properties, int maxAge, ItemLike seed) {
        super(properties);
        this.maxAge = maxAge;
        this.seed = seed;

        registerDefaultState(defaultBlockState().setValue(getAgeProperty(), 0));
    }

    // We do it this way because providing it in the constructor doesn't give us a way to
    // have it *not* be null in createBlockStateDefinition
    public static BaseCropBlock create(Properties properties, IntegerProperty ageProperty, int maxAge, ItemLike seed) {
        return new BaseCropBlock(properties, maxAge, seed) {
            @Override
            public IntegerProperty getAgeProperty() {
                return ageProperty;
            }
        };
    }

    @Override
    public abstract IntegerProperty getAgeProperty();

    @Override
    protected ItemLike getBaseSeedId() {
        return seed;
    }

    @Override
    public int getMaxAge() {
        return maxAge;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(getAgeProperty());
    }
}
