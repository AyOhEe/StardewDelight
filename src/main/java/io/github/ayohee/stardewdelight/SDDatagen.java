package io.github.ayohee.stardewdelight;

import io.github.ayohee.stardewdelight.datagen.SDBlockLoot;
import io.github.ayohee.stardewdelight.datagen.SDBlockStateProvider;
import io.github.ayohee.stardewdelight.datagen.SDItemModelProvider;
import io.github.ayohee.stardewdelight.datagen.SDRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;

public class SDDatagen {
    public static void gatherDataHighPriority(GatherDataEvent event) {
        // Yet empty.
    }

    public static void gatherData(GatherDataEvent event) {
        if (!event.getMods().contains(MODID)) {
            return;
        }
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();


        generator.addProvider(event.includeServer(), new SDRecipeProvider(output, lookupProvider).namedWrapper());
        generator.addProvider(event.includeClient(), new SDBlockStateProvider(output, fileHelper).namedWrapper());
        generator.addProvider(event.includeClient(), new SDItemModelProvider(output, fileHelper).namedWrapper());
        generator.addProvider(event.includeServer(), new LootTableProvider(output, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(SDBlockLoot::new, LootContextParamSets.BLOCK)), lookupProvider));

        System.out.println("Gathering data for Stardew's Delight");
        System.out.println(event.includeServer());
    }
}
