package io.github.ayohee.stardewdelight.datagen.bootstrapped;

import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class SDConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> APRICOT_TREE = key("apricot_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FRUITING_CHERRY_TREE = key("fruiting_cherry_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BANANA_TREE = key("banana_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGO_TREE = key("mango_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_TREE = key("orange_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_TREE = key("peach_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> APPLE_TREE = key("apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POMEGRANATE_TREE = key("pomegranate_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_FRUIT = key("trees_fruit");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_CAULIFLOWER = key("wild_cauliflower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_COFFEE_BUSH = key("wild_coffee_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_GARLIC = key("wild_garlic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_GREEN_BEANS = key("wild_green_beans");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_KALE = key("wild_kale");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_PARSNIP = key("wild_parsnip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_RHUBARB = key("wild_rhubarb");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_STRAWBERRY = key("wild_strawberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_CROPS_SPRING = key("wild_crops_spring");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_BLUEBERRY = key("wild_blueberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_CORN = key("wild_corn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_HOPS = key("wild_hops");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_HOT_PEPPERS = key("wild_hot_peppers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_PINK_MELON = key("wild_pink_melon");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_RADISH = key("wild_radish");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_RED_CABBAGE = key("wild_red_cabbage");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_STARFRUIT = key("wild_starfruit");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_SUMMER_SQUASH = key("wild_summer_squash");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_CROPS_SUMMER = key("wild_crops_summer");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_AMARANTH = key("wild_amaranth");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_ARTICHOKE = key("wild_artichoke");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_BOK_CHOY = key("wild_bok_choy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_BROCCOLI = key("wild_broccoli");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_CRANBERRY = key("wild_cranberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_EGGPLANT = key("wild_eggplant");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_GRAPES = key("wild_grapes");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_SUGAR_PUMPKIN = key("wild_sugar_pumpkin");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_YAM = key("wild_yam");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_CROPS_AUTUMN = key("wild_crops_autumn");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_POWDERMELON = key("wild_powdermelon");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_CROPS_WINTER = key("wild_crops_winter");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_PINEAPPLE = key("wild_pineapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_TARO_ROOT = key("wild_taro_root");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_CROPS_TROPICAL = key("wild_crops_tropical");

    public static final ResourceKey<ConfiguredFeature<?, ?>> JAZZ_PATCH = key("jazz_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPANGLE_PATCH = key("spangle_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FAIRY_PATCH = key("fairy_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWER_PATCH = key("flower_patch");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> bootstrap) {
        HolderGetter<PlacedFeature> placedFeatures = bootstrap.lookup(Registries.PLACED_FEATURE);

        // TODO refactor - gross
        bootstrap.register(APRICOT_TREE,
                new ConfiguredFeature<>(
                        Feature.TREE,
                        new TreeConfiguration.TreeConfigurationBuilder(
                                BlockStateProvider.simple(getSDLog(SDBlocks.SDWoodTypes.APRICOT)),
                                new StraightTrunkPlacer(4, 2, 0),
                                BlockStateProvider.simple(getSDLeaves(SDBlocks.SDWoodTypes.APRICOT)),
                                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                                new TwoLayersFeatureSize(1, 0, 1)
                        ).ignoreVines().build()
                )
        );
        bootstrap.register(FRUITING_CHERRY_TREE,
                new ConfiguredFeature<>(
                        Feature.TREE,
                        new TreeConfiguration.TreeConfigurationBuilder(
                                BlockStateProvider.simple(Blocks.CHERRY_LOG),
                                new StraightTrunkPlacer(4, 2, 0),
                                BlockStateProvider.simple(SDBlocks.FRUITING_CHERRY_LEAVES.getBlock().get()),
                                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                                new TwoLayersFeatureSize(1, 0, 1)
                        ).ignoreVines().build()
                )
        );
        bootstrap.register(BANANA_TREE,
                new ConfiguredFeature<>(
                        Feature.TREE,
                        new TreeConfiguration.TreeConfigurationBuilder(
                                BlockStateProvider.simple(getSDLog(SDBlocks.SDWoodTypes.BANANA)),
                                new StraightTrunkPlacer(4, 2, 0),
                                BlockStateProvider.simple(getSDLeaves(SDBlocks.SDWoodTypes.BANANA)),
                                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                                new TwoLayersFeatureSize(1, 0, 1)
                        ).ignoreVines().build()
                )
        );
        bootstrap.register(MANGO_TREE,
                new ConfiguredFeature<>(
                        Feature.TREE,
                        new TreeConfiguration.TreeConfigurationBuilder(
                                BlockStateProvider.simple(getSDLog(SDBlocks.SDWoodTypes.MANGO)),
                                new StraightTrunkPlacer(4, 2, 0),
                                BlockStateProvider.simple(getSDLeaves(SDBlocks.SDWoodTypes.MANGO)),
                                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                                new TwoLayersFeatureSize(1, 0, 1)
                        ).ignoreVines().build()
                )
        );
        bootstrap.register(ORANGE_TREE,
                new ConfiguredFeature<>(
                        Feature.TREE,
                        new TreeConfiguration.TreeConfigurationBuilder(
                                BlockStateProvider.simple(getSDLog(SDBlocks.SDWoodTypes.ORANGE)),
                                new StraightTrunkPlacer(4, 2, 0),
                                BlockStateProvider.simple(getSDLeaves(SDBlocks.SDWoodTypes.ORANGE)),
                                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                                new TwoLayersFeatureSize(1, 0, 1)
                        ).ignoreVines().build()
                )
        );
        bootstrap.register(PEACH_TREE,
                new ConfiguredFeature<>(
                        Feature.TREE,
                        new TreeConfiguration.TreeConfigurationBuilder(
                                BlockStateProvider.simple(getSDLog(SDBlocks.SDWoodTypes.PEACH)),
                                new StraightTrunkPlacer(4, 2, 0),
                                BlockStateProvider.simple(getSDLeaves(SDBlocks.SDWoodTypes.PEACH)),
                                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                                new TwoLayersFeatureSize(1, 0, 1)
                        ).ignoreVines().build()
                )
        );
        bootstrap.register(APPLE_TREE,
                new ConfiguredFeature<>(
                        Feature.TREE,
                        new TreeConfiguration.TreeConfigurationBuilder(
                                BlockStateProvider.simple(getSDLog(SDBlocks.SDWoodTypes.APPLE)),
                                new StraightTrunkPlacer(4, 2, 0),
                                BlockStateProvider.simple(getSDLeaves(SDBlocks.SDWoodTypes.APPLE)),
                                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                                new TwoLayersFeatureSize(1, 0, 1)
                        ).ignoreVines().build()
                )
        );
        bootstrap.register(POMEGRANATE_TREE,
                new ConfiguredFeature<>(
                        Feature.TREE,
                        new TreeConfiguration.TreeConfigurationBuilder(
                                BlockStateProvider.simple(getSDLog(SDBlocks.SDWoodTypes.POMEGRANATE)),
                                new StraightTrunkPlacer(4, 2, 0),
                                BlockStateProvider.simple(getSDLeaves(SDBlocks.SDWoodTypes.POMEGRANATE)),
                                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                                new TwoLayersFeatureSize(1, 0, 1)
                        ).ignoreVines().build()
                )
        );

        bootstrap.register(TREES_FRUIT,
                simpleRandomFeature(
                        placedFeatures,
                        SDPlacedFeatures.APRICOT_TREE,
                        SDPlacedFeatures.FRUITING_CHERRY_TREE,
                        SDPlacedFeatures.BANANA_TREE,
                        SDPlacedFeatures.MANGO_TREE,
                        SDPlacedFeatures.ORANGE_TREE,
                        SDPlacedFeatures.PEACH_TREE,
                        SDPlacedFeatures.APPLE_TREE,
                        SDPlacedFeatures.POMEGRANATE_TREE
                )
        );


        bootstrap.register(WILD_CAULIFLOWER, flowerlikePatch(SDBlocks.CAULIFLOWER_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_COFFEE_BUSH, flowerlikePatch(SDBlocks.COFFEE_BUSH_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_GARLIC, flowerlikePatch(SDBlocks.GARLIC_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_GREEN_BEANS, flowerlikePatch(SDBlocks.GREEN_BEANS_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_KALE, flowerlikePatch(SDBlocks.KALE_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_PARSNIP, flowerlikePatch(SDBlocks.PARSNIP_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_RHUBARB, flowerlikePatch(SDBlocks.RHUBARB_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_STRAWBERRY, flowerlikePatch(SDBlocks.STRAWBERRY_BUSH_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));

        bootstrap.register(WILD_CROPS_SPRING,
                simpleRandomFeature(
                        placedFeatures,
                        SDPlacedFeatures.WILD_CAULIFLOWER,
                        SDPlacedFeatures.WILD_COFFEE_BUSH,
                        SDPlacedFeatures.WILD_GARLIC,
                        SDPlacedFeatures.WILD_GREEN_BEANS,
                        SDPlacedFeatures.WILD_KALE,
                        SDPlacedFeatures.WILD_PARSNIP,
                        SDPlacedFeatures.WILD_RHUBARB,
                        SDPlacedFeatures.WILD_STRAWBERRY
                )
        );


        bootstrap.register(WILD_BLUEBERRY, flowerlikePatch(SDBlocks.BLUEBERRY_BUSH_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_CORN, flowerlikePatch(SDBlocks.CORN_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_HOPS, flowerlikePatch(SDBlocks.HOPS_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_HOT_PEPPERS, flowerlikePatch(SDBlocks.HOT_PEPPERS_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_PINK_MELON, flowerlikePatch(SDBlocks.PINK_MELON_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_RADISH, flowerlikePatch(SDBlocks.RADISH_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_RED_CABBAGE, flowerlikePatch(SDBlocks.RED_CABBAGE_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_STARFRUIT, flowerlikePatch(SDBlocks.STARFRUIT_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_SUMMER_SQUASH, flowerlikePatch(SDBlocks.SUMMER_SQUASH_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));

        bootstrap.register(WILD_CROPS_SUMMER,
                simpleRandomFeature(
                        placedFeatures,
                        SDPlacedFeatures.WILD_BLUEBERRY,
                        SDPlacedFeatures.WILD_CORN,
                        SDPlacedFeatures.WILD_HOPS,
                        SDPlacedFeatures.WILD_HOT_PEPPERS,
                        SDPlacedFeatures.WILD_PINK_MELON,
                        SDPlacedFeatures.WILD_RADISH,
                        SDPlacedFeatures.WILD_RED_CABBAGE,
                        SDPlacedFeatures.WILD_STARFRUIT,
                        SDPlacedFeatures.WILD_SUMMER_SQUASH
                )
        );


        bootstrap.register(WILD_AMARANTH, flowerlikePatch(SDBlocks.AMARANTH_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_ARTICHOKE, flowerlikePatch(SDBlocks.ARTICHOKE_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_BOK_CHOY, flowerlikePatch(SDBlocks.BOK_CHOY_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_BROCCOLI, flowerlikePatch(SDBlocks.BROCCOLI_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_CRANBERRY, flowerlikePatch(SDBlocks.CRANBERRY_BUSH_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_EGGPLANT, flowerlikePatch(SDBlocks.EGGPLANT_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_GRAPES, flowerlikePatch(SDBlocks.GRAPES_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_SUGAR_PUMPKIN, flowerlikePatch(SDBlocks.SUGAR_PUMPKIN_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_YAM, flowerlikePatch(SDBlocks.YAM_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));

        bootstrap.register(WILD_CROPS_AUTUMN,
                simpleRandomFeature(
                        placedFeatures,
                        SDPlacedFeatures.WILD_AMARANTH,
                        SDPlacedFeatures.WILD_ARTICHOKE,
                        SDPlacedFeatures.WILD_BOK_CHOY,
                        SDPlacedFeatures.WILD_BROCCOLI,
                        SDPlacedFeatures.WILD_CRANBERRY,
                        SDPlacedFeatures.WILD_EGGPLANT,
                        SDPlacedFeatures.WILD_GRAPES,
                        SDPlacedFeatures.WILD_SUGAR_PUMPKIN,
                        SDPlacedFeatures.WILD_YAM
                )
        );


        bootstrap.register(WILD_POWDERMELON, flowerlikePatch(SDBlocks.POWDERMELON_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));

        bootstrap.register(WILD_CROPS_WINTER,
                simpleRandomFeature(
                        placedFeatures,
                        SDPlacedFeatures.WILD_POWDERMELON
                )
        );


        bootstrap.register(WILD_PINEAPPLE, flowerlikePatch(SDBlocks.PINEAPPLE_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));
        bootstrap.register(WILD_TARO_ROOT, flowerlikePatch(SDBlocks.TARO_ROOT_CROP_WILD.getBlock().get().defaultBlockState(), 6, 3, 48));

        bootstrap.register(WILD_CROPS_TROPICAL,
                simpleRandomFeature(
                        placedFeatures,
                        SDPlacedFeatures.WILD_PINEAPPLE,
                        SDPlacedFeatures.WILD_TARO_ROOT
                )
        );


        bootstrap.register(JAZZ_PATCH, flowerlikePatch(SDBlocks.GROWN_BLUE_JAZZ.getBlock().get().defaultBlockState(), 6, 3, 32));
        bootstrap.register(SPANGLE_PATCH, flowerlikePatch(SDBlocks.GROWN_SUMMER_SPANGLE.getBlock().get().defaultBlockState(), 6, 3, 32));
        bootstrap.register(FAIRY_PATCH, flowerlikePatch(SDBlocks.GROWN_FAIRY_ROSE.getBlock().get().defaultBlockState(), 6, 3, 32));

        bootstrap.register(FLOWER_PATCH,
                simpleRandomFeature(
                        placedFeatures,
                        SDPlacedFeatures.JAZZ_PATCH,
                        SDPlacedFeatures.SPANGLE_PATCH,
                        SDPlacedFeatures.FAIRY_PATCH
                )
        );
    }

    private static Block getSDLog(WoodType type) {
        return SDBlocks.WOOD_BLOCKS.get(type).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get();
    }

    private static Block getSDLeaves(WoodType type) {
        return SDBlocks.WOOD_BLOCKS.get(type).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get();
    }

    private static ConfiguredFeature<SimpleRandomFeatureConfiguration, Feature<SimpleRandomFeatureConfiguration>> simpleRandomFeature(HolderGetter<PlacedFeature> placedFeatures, ResourceKey<PlacedFeature> ...features) {
        return new ConfiguredFeature<>(
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfiguration(HolderSet.direct(placedFeatures::getOrThrow, features))
        );
    }

    private static ConfiguredFeature<RandomPatchConfiguration, Feature<RandomPatchConfiguration>> flowerlikePatch(BlockState state, int xzSpread, int ySpread, int tries) {
        return new ConfiguredFeature<>(
                Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(
                        tries,
                        xzSpread,
                        ySpread,
                        PlacementUtils.inlinePlaced(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(state)),
                                BlockPredicateFilter.forPredicate(BlockPredicate.replaceable()),
                                BlockPredicateFilter.forPredicate(BlockPredicate.noFluid()),
                                PlacementUtils.filteredByBlockSurvival(state.getBlock())
                        )
        ));
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> key(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, StardewDelight.modLoc(name));
    }
}
