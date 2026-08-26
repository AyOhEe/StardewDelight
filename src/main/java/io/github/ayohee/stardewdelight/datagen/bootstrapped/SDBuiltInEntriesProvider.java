package io.github.ayohee.stardewdelight.datagen.bootstrapped;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;

public class SDBuiltInEntriesProvider extends DatapackBuiltinEntriesProvider {

    public SDBuiltInEntriesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(
                output,
                registries,
                new RegistrySetBuilder()
                        .add(Registries.CONFIGURED_FEATURE, SDConfiguredFeatures::bootstrap)
                        .add(Registries.PLACED_FEATURE, SDPlacedFeatures::bootstrap)
                        .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, SDBiomeModifiers::bootstrap),
                Set.of(MODID)
        );
    }
}
