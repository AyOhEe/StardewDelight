package io.github.ayohee.stardewdelight.datagen.bootstrapped;

import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
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

    public static final ResourceKey<PlacedFeature> WILD_CAULIFLOWER = key("wild_cauliflower");
    public static final ResourceKey<PlacedFeature> WILD_COFFEE_BUSH = key("wild_coffee_bush");
    public static final ResourceKey<PlacedFeature> WILD_GARLIC = key("wild_garlic");
    public static final ResourceKey<PlacedFeature> WILD_GREEN_BEANS = key("wild_green_beans");
    public static final ResourceKey<PlacedFeature> WILD_KALE = key("wild_kale");
    public static final ResourceKey<PlacedFeature> WILD_PARSNIP = key("wild_parsnip");
    public static final ResourceKey<PlacedFeature> WILD_RHUBARB = key("wild_rhubarb");
    public static final ResourceKey<PlacedFeature> WILD_STRAWBERRY = key("wild_strawberry");
    public static final ResourceKey<PlacedFeature> WILD_CROPS_SPRING = key("wild_crops_spring");

    public static final ResourceKey<PlacedFeature> WILD_BLUEBERRY = key("wild_blueberry");
    public static final ResourceKey<PlacedFeature> WILD_CORN = key("wild_corn");
    public static final ResourceKey<PlacedFeature> WILD_HOPS = key("wild_hops");
    public static final ResourceKey<PlacedFeature> WILD_HOT_PEPPERS = key("wild_hot_peppers");
    public static final ResourceKey<PlacedFeature> WILD_PINK_MELON = key("wild_pink_melon");
    public static final ResourceKey<PlacedFeature> WILD_RADISH = key("wild_radish");
    public static final ResourceKey<PlacedFeature> WILD_RED_CABBAGE = key("wild_red_cabbage");
    public static final ResourceKey<PlacedFeature> WILD_STARFRUIT = key("wild_starfruit");
    public static final ResourceKey<PlacedFeature> WILD_SUMMER_SQUASH = key("wild_summer_squash");
    public static final ResourceKey<PlacedFeature> WILD_CROPS_SUMMER = key("wild_crops_summer");

    public static final ResourceKey<PlacedFeature> WILD_AMARANTH = key("wild_amaranth");
    public static final ResourceKey<PlacedFeature> WILD_ARTICHOKE = key("wild_artichoke");
    public static final ResourceKey<PlacedFeature> WILD_BOK_CHOY = key("wild_bok_choy");
    public static final ResourceKey<PlacedFeature> WILD_BROCCOLI = key("wild_broccoli");
    public static final ResourceKey<PlacedFeature> WILD_CRANBERRY = key("wild_cranberry");
    public static final ResourceKey<PlacedFeature> WILD_EGGPLANT = key("wild_eggplant");
    public static final ResourceKey<PlacedFeature> WILD_GRAPES = key("wild_grapes");
    public static final ResourceKey<PlacedFeature> WILD_SUGAR_PUMPKIN = key("wild_sugar_pumpkin");
    public static final ResourceKey<PlacedFeature> WILD_YAM = key("wild_yam");
    public static final ResourceKey<PlacedFeature> WILD_CROPS_AUTUMN = key("wild_crops_autumn");

    public static final ResourceKey<PlacedFeature> WILD_POWDERMELON = key("wild_powdermelon");
    public static final ResourceKey<PlacedFeature> WILD_CROPS_WINTER = key("wild_crops_winter");

    public static final ResourceKey<PlacedFeature> WILD_PINEAPPLE = key("wild_pineapple");
    public static final ResourceKey<PlacedFeature> WILD_TARO_ROOT = key("wild_taro_root");
    public static final ResourceKey<PlacedFeature> WILD_CROPS_TROPICAL = key("wild_crops_tropical");

    public static final ResourceKey<PlacedFeature> JAZZ_PATCH = key("jazz_patch");
    public static final ResourceKey<PlacedFeature> SPANGLE_PATCH = key("spangle_patch");
    public static final ResourceKey<PlacedFeature> FAIRY_PATCH = key("fairy_patch");
    public static final ResourceKey<PlacedFeature> FLOWER_PATCH = key("flower_patch");

    public static void bootstrap(BootstrapContext<PlacedFeature> bootstrap) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = bootstrap.lookup(Registries.CONFIGURED_FEATURE);

        // TODO refactor - gross
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


        individualPatch(bootstrap, configuredFeatures, WILD_CAULIFLOWER, SDConfiguredFeatures.WILD_CAULIFLOWER);
        individualPatch(bootstrap, configuredFeatures, WILD_COFFEE_BUSH, SDConfiguredFeatures.WILD_COFFEE_BUSH);
        individualPatch(bootstrap, configuredFeatures, WILD_GARLIC, SDConfiguredFeatures.WILD_GARLIC);
        individualPatch(bootstrap, configuredFeatures, WILD_GREEN_BEANS, SDConfiguredFeatures.WILD_GREEN_BEANS);
        individualPatch(bootstrap, configuredFeatures, WILD_KALE, SDConfiguredFeatures.WILD_KALE);
        individualPatch(bootstrap, configuredFeatures, WILD_PARSNIP, SDConfiguredFeatures.WILD_PARSNIP);
        individualPatch(bootstrap, configuredFeatures, WILD_RHUBARB, SDConfiguredFeatures.WILD_RHUBARB);
        individualPatch(bootstrap, configuredFeatures, WILD_STRAWBERRY, SDConfiguredFeatures.WILD_STRAWBERRY);
        individualPatch(bootstrap, configuredFeatures, WILD_BLUEBERRY, SDConfiguredFeatures.WILD_BLUEBERRY);
        individualPatch(bootstrap, configuredFeatures, WILD_CORN, SDConfiguredFeatures.WILD_CORN);
        individualPatch(bootstrap, configuredFeatures, WILD_HOPS, SDConfiguredFeatures.WILD_HOPS);
        individualPatch(bootstrap, configuredFeatures, WILD_HOT_PEPPERS, SDConfiguredFeatures.WILD_HOT_PEPPERS);
        individualPatch(bootstrap, configuredFeatures, WILD_PINK_MELON, SDConfiguredFeatures.WILD_PINK_MELON);
        individualPatch(bootstrap, configuredFeatures, WILD_RADISH, SDConfiguredFeatures.WILD_RADISH);
        individualPatch(bootstrap, configuredFeatures, WILD_RED_CABBAGE, SDConfiguredFeatures.WILD_RED_CABBAGE);
        individualPatch(bootstrap, configuredFeatures, WILD_STARFRUIT, SDConfiguredFeatures.WILD_STARFRUIT);
        individualPatch(bootstrap, configuredFeatures, WILD_SUMMER_SQUASH, SDConfiguredFeatures.WILD_SUMMER_SQUASH);
        individualPatch(bootstrap, configuredFeatures, WILD_AMARANTH, SDConfiguredFeatures.WILD_AMARANTH);
        individualPatch(bootstrap, configuredFeatures, WILD_ARTICHOKE, SDConfiguredFeatures.WILD_ARTICHOKE);
        individualPatch(bootstrap, configuredFeatures, WILD_BOK_CHOY, SDConfiguredFeatures.WILD_BOK_CHOY);
        individualPatch(bootstrap, configuredFeatures, WILD_BROCCOLI, SDConfiguredFeatures.WILD_BROCCOLI);
        individualPatch(bootstrap, configuredFeatures, WILD_CRANBERRY, SDConfiguredFeatures.WILD_CRANBERRY);
        individualPatch(bootstrap, configuredFeatures, WILD_EGGPLANT, SDConfiguredFeatures.WILD_EGGPLANT);
        individualPatch(bootstrap, configuredFeatures, WILD_GRAPES, SDConfiguredFeatures.WILD_GRAPES);
        individualPatch(bootstrap, configuredFeatures, WILD_SUGAR_PUMPKIN, SDConfiguredFeatures.WILD_SUGAR_PUMPKIN);
        individualPatch(bootstrap, configuredFeatures, WILD_YAM, SDConfiguredFeatures.WILD_YAM);
        individualPatch(bootstrap, configuredFeatures, WILD_POWDERMELON, SDConfiguredFeatures.WILD_POWDERMELON);
        individualPatch(bootstrap, configuredFeatures, WILD_PINEAPPLE, SDConfiguredFeatures.WILD_PINEAPPLE);
        individualPatch(bootstrap, configuredFeatures, WILD_TARO_ROOT, SDConfiguredFeatures.WILD_TARO_ROOT);
        individualPatch(bootstrap, configuredFeatures, JAZZ_PATCH, SDConfiguredFeatures.JAZZ_PATCH);
        individualPatch(bootstrap, configuredFeatures, SPANGLE_PATCH, SDConfiguredFeatures.SPANGLE_PATCH);
        individualPatch(bootstrap, configuredFeatures, FAIRY_PATCH, SDConfiguredFeatures.FAIRY_PATCH);


        patchGroup(bootstrap, configuredFeatures, WILD_CROPS_SPRING, SDConfiguredFeatures.WILD_CROPS_SPRING);
        patchGroup(bootstrap, configuredFeatures, WILD_CROPS_SUMMER, SDConfiguredFeatures.WILD_CROPS_SUMMER);
        patchGroup(bootstrap, configuredFeatures, WILD_CROPS_AUTUMN, SDConfiguredFeatures.WILD_CROPS_AUTUMN);
        patchGroup(bootstrap, configuredFeatures, WILD_CROPS_WINTER, SDConfiguredFeatures.WILD_CROPS_WINTER);
        patchGroup(bootstrap, configuredFeatures, WILD_CROPS_TROPICAL, SDConfiguredFeatures.WILD_CROPS_TROPICAL);
        patchGroup(bootstrap, configuredFeatures, FLOWER_PATCH, SDConfiguredFeatures.FLOWER_PATCH);
    }

    private static ResourceKey<PlacedFeature> key(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, StardewDelight.modLoc(name));
    }

    private static void individualPatch(BootstrapContext<PlacedFeature> bootstrap, HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures, ResourceKey<PlacedFeature> placedFeature, ResourceKey<ConfiguredFeature<?, ?>> configuredFeature) {
        bootstrap.register(placedFeature, new PlacedFeature(configuredFeatures.getOrThrow(configuredFeature), List.of()));
    }

    private static void patchGroup(BootstrapContext<PlacedFeature> bootstrap, HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures, ResourceKey<PlacedFeature> placedFeature, ResourceKey<ConfiguredFeature<?, ?>> configuredFeature) {
        bootstrap.register(placedFeature, new PlacedFeature(
                configuredFeatures.getOrThrow(configuredFeature),
                List.of(
                        RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()
                )
        ));
    }
}
