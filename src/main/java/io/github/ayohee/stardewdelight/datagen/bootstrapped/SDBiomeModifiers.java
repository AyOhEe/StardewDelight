package io.github.ayohee.stardewdelight.datagen.bootstrapped;

import io.github.ayohee.stardewdelight.SDTags;
import io.github.ayohee.stardewdelight.StardewDelight;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
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


        addFeatures(
                ADD_FRUIT_TREE_FEATURES_FOREST,
                bootstrap, biomes, features,
                SDTags.BiomeTags.FRUIT_TREE_FOREST_SPAWNS,
                GenerationStep.Decoration.VEGETAL_DECORATION,
                SDPlacedFeatures.TREES_FOREST_FRUIT
        );
        addFeatures(
                ADD_FRUIT_TREE_FEATURES_PLAINS,
                bootstrap, biomes, features,
                SDTags.BiomeTags.FRUIT_TREE_PLAINS_SPAWNS,
                GenerationStep.Decoration.VEGETAL_DECORATION,
                SDPlacedFeatures.TREES_PLAINS_FRUIT
        );


        addFeatures(
                ADD_WILD_CROPS_SPRING,
                bootstrap, biomes, features,
                SDTags.BiomeTags.WILD_CROP_SPAWNS_SPRING,
                GenerationStep.Decoration.VEGETAL_DECORATION,
                SDPlacedFeatures.WILD_CROPS_SPRING
        );
        addFeatures(
                ADD_WILD_CROPS_SUMMER,
                bootstrap, biomes, features,
                SDTags.BiomeTags.WILD_CROP_SPAWNS_SUMMER,
                GenerationStep.Decoration.VEGETAL_DECORATION,
                SDPlacedFeatures.WILD_CROPS_SUMMER
        );
        addFeatures(
                ADD_WILD_CROPS_AUTUMN,
                bootstrap, biomes, features,
                SDTags.BiomeTags.WILD_CROP_SPAWNS_AUTUMN,
                GenerationStep.Decoration.VEGETAL_DECORATION,
                SDPlacedFeatures.WILD_CROPS_AUTUMN
        );
        addFeatures(
                ADD_WILD_CROPS_WINTER,
                bootstrap, biomes, features,
                SDTags.BiomeTags.WILD_CROP_SPAWNS_WINTER,
                GenerationStep.Decoration.VEGETAL_DECORATION,
                SDPlacedFeatures.WILD_CROPS_WINTER
        );
        addFeatures(
                ADD_WILD_CROPS_TROPICAL,
                bootstrap, biomes, features,
                SDTags.BiomeTags.WILD_CROP_SPAWNS_TROPICAL,
                GenerationStep.Decoration.VEGETAL_DECORATION,
                SDPlacedFeatures.WILD_CROPS_TROPICAL
        );


        addFeatures(
                ADD_FLOWER_PATCHES,
                bootstrap, biomes, features,
                SDTags.BiomeTags.FLOWER_PATCH_SPAWNS,
                GenerationStep.Decoration.VEGETAL_DECORATION,
                SDPlacedFeatures.FLOWER_PATCH
        );
    }

    private static void addFeatures(
            ResourceKey<BiomeModifier> key,
            BootstrapContext<BiomeModifier> bootstrap,
            HolderGetter<Biome> biomes,
            HolderGetter<PlacedFeature> features,
            TagKey<Biome> where,
            GenerationStep.Decoration when,
            ResourceKey<PlacedFeature> ...what) {
        bootstrap.register(
                key,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(where),
                        HolderSet.direct(features::getOrThrow, what),
                        when
                )
        );
    }

    private static ResourceKey<BiomeModifier> key(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, StardewDelight.modLoc(name));
    }
}
