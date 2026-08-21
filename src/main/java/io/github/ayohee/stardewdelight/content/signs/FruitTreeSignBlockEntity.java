package io.github.ayohee.stardewdelight.content.signs;

import io.github.ayohee.stardewdelight.register.SDBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class FruitTreeSignBlockEntity extends SignBlockEntity {
    public FruitTreeSignBlockEntity(BlockPos pos, BlockState state) {
        super(SDBlockEntityTypes.SIGN.get(), pos, state);
    }
}
