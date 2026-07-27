package io.github.ayohee.stardewdelight.content.blocks.crops;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public abstract class BaseCropBlock extends CropBlock {
    public BaseCropBlock(Properties properties) {
        super(properties);
    }

    public IntegerProperty getAgeProperty() {
        return super.getAgeProperty();
    }
}
