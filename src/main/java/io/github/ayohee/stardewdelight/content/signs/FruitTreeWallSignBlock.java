package io.github.ayohee.stardewdelight.content.signs;

import io.github.ayohee.stardewdelight.register.SDBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class FruitTreeWallSignBlock extends WallSignBlock {
    public FruitTreeWallSignBlock(WoodType woodType, Properties properties) {
        super(woodType, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return SDBlockEntityTypes.SIGN.get().create(pos, state);
    }
}
