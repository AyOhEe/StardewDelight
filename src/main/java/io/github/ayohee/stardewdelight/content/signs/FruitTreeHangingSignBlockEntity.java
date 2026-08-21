package io.github.ayohee.stardewdelight.content.signs;

import io.github.ayohee.stardewdelight.register.SDBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class FruitTreeHangingSignBlockEntity extends HangingSignBlockEntity {
    public FruitTreeHangingSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return SDBlockEntityTypes.HANGING_SIGN.get();
    }
}
