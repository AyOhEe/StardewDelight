package io.github.ayohee.stardewdelight;

import com.mojang.logging.LogUtils;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import io.github.ayohee.stardewdelight.register.SDItems;
import io.github.ayohee.stardewdelight.register.SDRegistries;
import io.github.ayohee.stardewdelight.register.SDTabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(StardewDelight.MODID)
public class StardewDelight {
    public static final String MODID = "stardewdelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public StardewDelight(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(EventPriority.HIGHEST, SDDatagen::gatherDataHighPriority);
        modEventBus.addListener(EventPriority.LOWEST, SDDatagen::gatherData);

        SDTabs.register();
        SDBlocks.register();
        SDItems.register();

        SDRegistries.register(modEventBus);

        // Uncomment when we have an @SubscribeEvent callback
        //NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, SDConfig.SPEC);
    }

    public static ResourceLocation modLoc(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Yet empty.
    }
}
