package io.github.ayohee.stardewdelight;

import io.github.ayohee.stardewdelight.register.SDBlockEntityTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SDClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        // Yet empty.
    }
    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(SDBlockEntityTypes.SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(SDBlockEntityTypes.HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
