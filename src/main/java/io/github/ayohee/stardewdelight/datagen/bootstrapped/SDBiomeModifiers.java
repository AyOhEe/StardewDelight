package io.github.ayohee.stardewdelight.datagen.bootstrapped;

import io.github.ayohee.stardewdelight.SDTags;
import io.github.ayohee.stardewdelight.StardewDelight;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class SDBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_FRUIT_TREE_FEATURES_FOREST = key("add_fruit_tree_features_forest");
    public static final ResourceKey<BiomeModifier> ADD_FRUIT_TREE_FEATURES_PLAINS = key("add_fruit_tree_features_plains");

    public static void bootstrap(BootstrapContext<BiomeModifier> bootstrap) {
        HolderGetter<Biome> biomes = bootstrap.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> features = bootstrap.lookup(Registries.PLACED_FEATURE);

        bootstrap.register(
                ADD_FRUIT_TREE_FEATURES_FOREST,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(SDTags.BiomeTags.FRUIT_TREE_FOREST_SPAWNS),
                        HolderSet.direct(features.getOrThrow(SDPlacedFeatures.TREES_FOREST_FRUIT)),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );

        bootstrap.register(
                ADD_FRUIT_TREE_FEATURES_PLAINS,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(SDTags.BiomeTags.FRUIT_TREE_PLAINS_SPAWNS),
                        HolderSet.direct(features.getOrThrow(SDPlacedFeatures.TREES_PLAINS_FRUIT)),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
    }

    private static ResourceKey<BiomeModifier> key(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, StardewDelight.modLoc(name));
    }
}
