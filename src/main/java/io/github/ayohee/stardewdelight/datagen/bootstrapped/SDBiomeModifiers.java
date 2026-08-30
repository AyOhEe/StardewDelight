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

    public static final ResourceKey<BiomeModifier> ADD_WILD_CROPS_SPRING = key("add_wild_crops_spring");
    public static final ResourceKey<BiomeModifier> ADD_WILD_CROPS_SUMMER = key("add_wild_crops_summer");
    public static final ResourceKey<BiomeModifier> ADD_WILD_CROPS_AUTUMN = key("add_wild_crops_autumn");
    public static final ResourceKey<BiomeModifier> ADD_WILD_CROPS_WINTER = key("add_wild_crops_winter");
    public static final ResourceKey<BiomeModifier> ADD_WILD_CROPS_TROPICAL = key("add_wild_crops_tropical");
    public static final ResourceKey<BiomeModifier> ADD_FLOWER_PATCHES = key("add_flower_patches");

    public static void bootstrap(BootstrapContext<BiomeModifier> bootstrap) {
        HolderGetter<Biome> biomes = bootstrap.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> features = bootstrap.lookup(Registries.PLACED_FEATURE);

        // TODO maybe refactor?
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


        bootstrap.register(
                ADD_WILD_CROPS_SPRING,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(SDTags.BiomeTags.WILD_CROP_SPAWNS_SPRING),
                        HolderSet.direct(features.getOrThrow(SDPlacedFeatures.WILD_CROPS_SPRING)),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );

        bootstrap.register(
                ADD_WILD_CROPS_SUMMER,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(SDTags.BiomeTags.WILD_CROP_SPAWNS_SUMMER),
                        HolderSet.direct(features.getOrThrow(SDPlacedFeatures.WILD_CROPS_SUMMER)),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );

        bootstrap.register(
                ADD_WILD_CROPS_AUTUMN,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(SDTags.BiomeTags.WILD_CROP_SPAWNS_AUTUMN),
                        HolderSet.direct(features.getOrThrow(SDPlacedFeatures.WILD_CROPS_AUTUMN)),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );

        bootstrap.register(
                ADD_WILD_CROPS_WINTER,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(SDTags.BiomeTags.WILD_CROP_SPAWNS_WINTER),
                        HolderSet.direct(features.getOrThrow(SDPlacedFeatures.WILD_CROPS_WINTER)),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );

        bootstrap.register(
                ADD_WILD_CROPS_TROPICAL,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(SDTags.BiomeTags.WILD_CROP_SPAWNS_TROPICAL),
                        HolderSet.direct(features.getOrThrow(SDPlacedFeatures.WILD_CROPS_TROPICAL)),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );


        bootstrap.register(
                ADD_FLOWER_PATCHES,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(SDTags.BiomeTags.FLOWER_PATCH_SPAWNS),
                        HolderSet.direct(features.getOrThrow(SDPlacedFeatures.FLOWER_PATCH)),
                        GenerationStep.Decoration.VEGETAL_DECORATION
                )
        );
    }

    private static ResourceKey<BiomeModifier> key(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, StardewDelight.modLoc(name));
    }
}
