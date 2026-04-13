package io.github.ayohee.stardewdelight;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SDClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        // Yet empty.
    }
}
