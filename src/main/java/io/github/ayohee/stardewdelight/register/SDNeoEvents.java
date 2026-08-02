package io.github.ayohee.stardewdelight.register;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.event.level.BlockEvent;

public class SDNeoEvents {
    @SubscribeEvent
    public static void onToolUse(BlockEvent.BlockToolModificationEvent event) {
        BlockState originalState = event.getState();
        ResourceLocation blockRL = BuiltInRegistries.BLOCK.getKeyOrNull(event.getState().getBlock());
        if (event.getItemAbility() == ItemAbilities.AXE_STRIP && SDBlocks.STRIPPABLES.containsKey(blockRL)) {
            BlockState stripped = SDBlocks.STRIPPABLES.get(blockRL).get().setValue(BlockStateProperties.AXIS, originalState.getValue(BlockStateProperties.AXIS));
            event.setFinalState(stripped);
        }
    }
}
