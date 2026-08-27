package io.github.ayohee.stardewdelight;

import io.github.ayohee.stardewdelight.register.SDBlockEntityTypes;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;
import static net.minecraft.ChatFormatting.GRAY;
import static net.minecraft.ChatFormatting.ITALIC;

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

    @SubscribeEvent
    public static void addToItemTooltip(ItemTooltipEvent event) {
        if (event.getEntity() == null)
            return;

        Item item = event.getItemStack().getItem();
        ResourceLocation location = BuiltInRegistries.ITEM.getKey(item);

        // NOTE components need to be added in reverse order, here
        String italicName = "item." + location.getNamespace() + "." + location.getPath() + ".tooltip_italic";
        if (I18n.exists(italicName)) {
            event.getToolTip().add(1, Component.translatable(italicName).withStyle(GRAY).withStyle(ITALIC));
        }

        String componentName = "item." + location.getNamespace() + "." + location.getPath() + ".tooltip";
        if (I18n.exists(componentName)) {
            event.getToolTip().add(1, Component.translatable(componentName).withStyle(GRAY));
        }
    }
}
