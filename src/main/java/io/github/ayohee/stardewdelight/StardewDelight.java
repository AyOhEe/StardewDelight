package io.github.ayohee.stardewdelight;

import com.mojang.logging.LogUtils;
import io.github.ayohee.stardewdelight.register.*;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

@Mod(StardewDelight.MODID)
public class StardewDelight {
    public static final String MODID = "stardewdelight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public StardewDelight(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(EventPriority.HIGHEST, SDDatagen::gatherDataHighPriority);
        modEventBus.addListener(EventPriority.LOWEST, SDDatagen::gatherData);

        SDTabs.register();
        SDItems.register();
        SDBlocks.register();
        SDBlockEntityTypes.register();
        SDDataComponents.register();
        SDTags.init();

        SDRegistries.register(modEventBus);

        NeoForge.EVENT_BUS.register(SDNeoEvents.class);

        modContainer.registerConfig(ModConfig.Type.COMMON, SDConfig.SPEC);
    }

    public static ResourceLocation modLoc(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name);
    }
}
