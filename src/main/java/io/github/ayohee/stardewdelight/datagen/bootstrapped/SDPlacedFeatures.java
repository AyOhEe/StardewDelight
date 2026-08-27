package io.github.ayohee.stardewdelight.datagen.bootstrapped;

import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class SDPlacedFeatures {
    public static final ResourceKey<PlacedFeature> APRICOT_TREE = key("apricot_tree");
    public static final ResourceKey<PlacedFeature> FRUITING_CHERRY_TREE = key("fruiting_cherry_tree");
    public static final ResourceKey<PlacedFeature> BANANA_TREE = key("banana_tree");
    public static final ResourceKey<PlacedFeature> MANGO_TREE = key("mango_tree");
    public static final ResourceKey<PlacedFeature> ORANGE_TREE = key("orange_tree");
    public static final ResourceKey<PlacedFeature> PEACH_TREE = key("peach_tree");
    public static final ResourceKey<PlacedFeature> APPLE_TREE = key("apple_tree");
    public static final ResourceKey<PlacedFeature> POMEGRANATE_TREE = key("pomegranate_tree");

    public static final ResourceKey<PlacedFeature> TREES_FOREST_FRUIT = key("trees_forest_fruit");
    public static final ResourceKey<PlacedFeature> TREES_PLAINS_FRUIT = key("trees_plains_fruit");

    public static void bootstrap(BootstrapContext<PlacedFeature> bootstrap) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = bootstrap.lookup(Registries.CONFIGURED_FEATURE);


        bootstrap.register(APRICOT_TREE, new PlacedFeature(
                configuredFeatures.getOrThrow(SDConfiguredFeatures.APRICOT_TREE),
                List.of(
                        BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(SDBlocks.APRICOT_SAPLING.getBlock().get().defaultBlockState(), Vec3i.ZERO))
                )
        ));
        bootstrap.register(FRUITING_CHERRY_TREE, new PlacedFeature(
                configuredFeatures.getOrThrow(SDConfiguredFeatures.FRUITING_CHERRY_TREE),
                List.of(
                        BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(SDBlocks.FRUITING_CHERRY_SAPLING.getBlock().get().defaultBlockState(), Vec3i.ZERO))
                )
        ));
        bootstrap.register(BANANA_TREE, new PlacedFeature(
                configuredFeatures.getOrThrow(SDConfiguredFeatures.BANANA_TREE),
                List.of(
                        BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(SDBlocks.BANANA_SAPLING.getBlock().get().defaultBlockState(), Vec3i.ZERO))
                )
        ));
        bootstrap.register(MANGO_TREE, new PlacedFeature(
                configuredFeatures.getOrThrow(SDConfiguredFeatures.MANGO_TREE),
                List.of(
                        BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(SDBlocks.MANGO_SAPLING.getBlock().get().defaultBlockState(), Vec3i.ZERO))
                )
        ));
        bootstrap.register(ORANGE_TREE, new PlacedFeature(
                configuredFeatures.getOrThrow(SDConfiguredFeatures.ORANGE_TREE),
                List.of(
                        BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(SDBlocks.ORANGE_SAPLING.getBlock().get().defaultBlockState(), Vec3i.ZERO))
                )
        ));
        bootstrap.register(PEACH_TREE, new PlacedFeature(
                configuredFeatures.getOrThrow(SDConfiguredFeatures.PEACH_TREE),
                List.of(
                        BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(SDBlocks.PEACH_SAPLING.getBlock().get().defaultBlockState(), Vec3i.ZERO))
                )
        ));
        bootstrap.register(APPLE_TREE, new PlacedFeature(
                configuredFeatures.getOrThrow(SDConfiguredFeatures.APPLE_TREE),
                List.of(
                        BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(SDBlocks.APPLE_SAPLING.getBlock().get().defaultBlockState(), Vec3i.ZERO))
                )
        ));
        bootstrap.register(POMEGRANATE_TREE, new PlacedFeature(
                configuredFeatures.getOrThrow(SDConfiguredFeatures.POMEGRANATE_TREE),
                List.of(
                        BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(SDBlocks.POMEGRANATE_SAPLING.getBlock().get().defaultBlockState(), Vec3i.ZERO))
                )
        ));

        bootstrap.register(TREES_FOREST_FRUIT, new PlacedFeature(
                configuredFeatures.getOrThrow(SDConfiguredFeatures.TREES_FRUIT),
                List.of(
                        CountPlacement.of(
                                new WeightedListInt(
                                        SimpleWeightedRandomList.<IntProvider>builder()
                                                .add(ConstantInt.of(0), 5)
                                                .add(ConstantInt.of(1), 1)
                                                .build()
                                )
                        ),
                        new InSquarePlacement(),
                        SurfaceWaterDepthFilter.forMaxDepth(0),
                        HeightmapPlacement.onHeightmap(Heightmap.Types.OCEAN_FLOOR),
                        BiomeFilter.biome()
                )
        ));
        bootstrap.register(TREES_PLAINS_FRUIT, new PlacedFeature(
                configuredFeatures.getOrThrow(SDConfiguredFeatures.TREES_FRUIT),
                List.of(
                        CountPlacement.of(
                                new WeightedListInt(
                                        SimpleWeightedRandomList.<IntProvider>builder()
                                                .add(ConstantInt.of(0), 15)
                                                .add(ConstantInt.of(1), 1)
                                                .build()
                                )
                        ),
                        new InSquarePlacement(),
                        SurfaceWaterDepthFilter.forMaxDepth(0),
                        HeightmapPlacement.onHeightmap(Heightmap.Types.OCEAN_FLOOR),
                        BiomeFilter.biome()
                )
        ));
    }

    private static ResourceKey<PlacedFeature> key(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, StardewDelight.modLoc(name));
    }
}
