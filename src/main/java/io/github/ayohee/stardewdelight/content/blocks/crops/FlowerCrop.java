package io.github.ayohee.stardewdelight.content.blocks.crops;

import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.world.level.block.state.BlockState;

public abstract class FlowerCrop extends BaseCropBlock {
    public FlowerCrop(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForAge(int age) {
        if (age == getMaxAge()) {
            return getMatureBlockState();
        } else {
            return super.getStateForAge(age);
        }
    }

    public abstract BlockState getMatureBlockState();
}
