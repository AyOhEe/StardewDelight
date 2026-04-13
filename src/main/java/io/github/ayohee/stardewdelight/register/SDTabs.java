package io.github.ayohee.stardewdelight.register;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredHolder;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

import java.util.*;

import static io.github.ayohee.stardewdelight.register.SDRegistries.CREATIVE_MODE_TABS;

public class SDTabs {
    private static final DeferredHolder<CreativeModeTab, CreativeModeTab> FARMERS_TAB = (DeferredHolder<CreativeModeTab, CreativeModeTab>)ModCreativeTabs.TAB_FARMERS_DELIGHT;

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> STARDEW_DELIGHT = CREATIVE_MODE_TABS.register("stardew_delight", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.stardewdelight"))
            .withTabsBefore(FARMERS_TAB.getKey())
            .icon(SDBlocks.EXAMPLE_BLOCK.getItem()::toStack)
            .displayItems((parameters, output) -> {
                SDTabs.TAB_CONTENTS.get(SDTabs.STARDEW_DELIGHT).forEach(output::accept);
            })
            .build());


    /* Keeps track of the order in which items should appear in the creative menu. Each tab needs a new empty list. */
    public static final Map<DeferredHolder<CreativeModeTab, CreativeModeTab>, List<ItemLike>> TAB_CONTENTS = new HashMap<>();
    static {
        TAB_CONTENTS.put(SDTabs.STARDEW_DELIGHT, new LinkedList<>());
    }

    /*----- STATIC INITIALIZER -----*/
    public static void register() { }
}
