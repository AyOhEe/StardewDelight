package io.github.ayohee.stardewdelight;

import io.github.ayohee.stardewdelight.content.seedbag.SeedBagItem;
import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;

@EventBusSubscriber(modid = StardewDelight.MODID)
public class SDModEvents {
    @SubscribeEvent
    private static void commonSetup(FMLCommonSetupEvent event) {
        // Yet empty.
    }

    @SubscribeEvent
    private static void onWandererTrades(WandererTradesEvent event) {
        event.getRareTrades().add(new VillagerTrades.ItemsForEmeralds(SDItems.RARE_SEED.asItem(), 5, 1, 1, 1));
        event.getRareTrades().add(new VillagerTrades.ItemsForEmeralds(SDItems.QI_BEAN.asItem(), 5, 1, 1, 1));
    }

    @SubscribeEvent
    private static void onVillagerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            event.getTrades().get(1).add(new VillagerTrades.ItemsForEmeralds(SDItems.SEED_PACKET.asItem(), 2, 1, 3, 1));
        }
    }

    @SubscribeEvent
    private static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
        event.registerItem(
                Capabilities.ItemHandler.ITEM,
                SeedBagItem::getCapability,
                SDItems.SEED_BAG
        );
    }
}
