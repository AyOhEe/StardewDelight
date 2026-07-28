package io.github.ayohee.stardewdelight.content.blocks.crops;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class GrownFairyRoseBlock extends TallFlowerBlock {
    public GrownFairyRoseBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader p_256234_, BlockPos p_57304_, BlockState p_57305_) {
        return false;
    }
}
