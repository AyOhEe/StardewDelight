package io.github.ayohee.stardewdelight;

import io.github.ayohee.stardewdelight.datagen.bootstrapped.SDConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class SDTreeGrowers {
    public static final TreeGrower APRICOT = new TreeGrower(
            "apricot",
            Optional.empty(),
            Optional.of(SDConfiguredFeatures.APRICOT_TREE),
            Optional.empty()
    );
    public static final TreeGrower FRUITING_CHERRY = new TreeGrower(
            "fruiting_cherry",
            Optional.empty(),
            Optional.of(SDConfiguredFeatures.FRUITING_CHERRY_TREE),
            Optional.empty()
    );
    public static final TreeGrower BANANA = new TreeGrower(
            "banana",
            Optional.empty(),
            Optional.of(SDConfiguredFeatures.BANANA_TREE),
            Optional.empty()
    );
    public static final TreeGrower MANGO = new TreeGrower(
            "mango",
            Optional.empty(),
            Optional.of(SDConfiguredFeatures.MANGO_TREE),
            Optional.empty()
    );
    public static final TreeGrower ORANGE = new TreeGrower(
            "orange",
            Optional.empty(),
            Optional.of(SDConfiguredFeatures.ORANGE_TREE),
            Optional.empty()
    );
    public static final TreeGrower PEACH = new TreeGrower(
            "peach",
            Optional.empty(),
            Optional.of(SDConfiguredFeatures.PEACH_TREE),
            Optional.empty()
    );
    public static final TreeGrower APPLE = new TreeGrower(
            "apple",
            Optional.empty(),
            Optional.of(SDConfiguredFeatures.APPLE_TREE),
            Optional.empty()
    );
    public static final TreeGrower POMEGRANATE = new TreeGrower(
            "pomegranate",
            Optional.empty(),
            Optional.of(SDConfiguredFeatures.POMEGRANATE_TREE),
            Optional.empty()
    );
}
