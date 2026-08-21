package io.github.ayohee.stardewdelight.content;

import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.level.block.Block;

public class DoubleHighNamedBlockItem extends DoubleHighBlockItem {
    public DoubleHighNamedBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    public String getDescriptionId() {
        return this.getOrCreateDescriptionId();
    }
}
