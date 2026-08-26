package io.github.ayohee.stardewdelight.datagen.bootstrapped;

import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class SDConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> APRICOT_TREE = key("apricot_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FRUITING_CHERRY_TREE = key("fruiting_cherry_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BANANA_TREE = key("banana_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGO_TREE = key("mango_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_TREE = key("orange_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_TREE = key("peach_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> APPLE_TREE = key("apple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POMEGRANATE_TREE = key("pomegranate_tree");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> bootstrap) {
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
    }

    private static Block getSDLog(WoodType type) {
        return SDBlocks.WOOD_BLOCKS.get(type).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get();
    }

    private static Block getSDLeaves(WoodType type) {
        return SDBlocks.WOOD_BLOCKS.get(type).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get();
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> key(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, StardewDelight.modLoc(name));
    }
}
