package io.github.ayohee.stardewdelight;

import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.Map;

public class SDTags {
    public static class BlockTags {
        public static final TagKey<Block> APRICOT_LOGS = create("apricot_logs");
        public static final TagKey<Block> BANANA_LOGS = create("banana_logs");
        public static final TagKey<Block> MANGO_LOGS = create("mango_logs");
        public static final TagKey<Block> ORANGE_LOGS = create("orange_logs");
        public static final TagKey<Block> PEACH_LOGS = create("peach_logs");
        public static final TagKey<Block> APPLE_LOGS = create("apple_logs");
        public static final TagKey<Block> POMEGRANATE_LOGS = create("pomegrate_logs");

        public static final TagKey<Block> FRUIT_TREE_LOGS = create("fruit_tree_logs");
        public static final TagKey<Block> FRUIT_TREE_WOOD = create("fruit_tree_wood");
        public static final TagKey<Block> FRUIT_TREE_STRIPPED_LOGS = create("fruit_tree_stripped_logs");
        public static final TagKey<Block> FRUIT_TREE_STRIPPED_WOOD = create("fruit_tree_stripped_wood");

        private static TagKey<Block> create(String name) {
            return TagKey.create(Registries.BLOCK, StardewDelight.modLoc(name));
        }
    }

    public static class ItemTags {
        public static final TagKey<Item> APRICOT_LOGS = create("apricot_logs");
        public static final TagKey<Item> BANANA_LOGS = create("banana_logs");
        public static final TagKey<Item> MANGO_LOGS = create("mango_logs");
        public static final TagKey<Item> ORANGE_LOGS = create("orange_logs");
        public static final TagKey<Item> PEACH_LOGS = create("peach_logs");
        public static final TagKey<Item> APPLE_LOGS = create("apple_logs");
        public static final TagKey<Item> POMEGRANATE_LOGS = create("pomegrate_logs");

        public static final Map<WoodType, TagKey<Item>> LOG_TAGS = Map.of(
                SDBlocks.SDWoodTypes.APRICOT, APRICOT_LOGS,
                SDBlocks.SDWoodTypes.BANANA, BANANA_LOGS,
                SDBlocks.SDWoodTypes.MANGO, MANGO_LOGS,
                SDBlocks.SDWoodTypes.ORANGE, ORANGE_LOGS,
                SDBlocks.SDWoodTypes.PEACH, PEACH_LOGS,
                SDBlocks.SDWoodTypes.APPLE, APPLE_LOGS,
                SDBlocks.SDWoodTypes.POMEGRANATE, POMEGRANATE_LOGS
        );

        private static TagKey<Item> create(String name) {
            return TagKey.create(Registries.ITEM, StardewDelight.modLoc(name));
        }
    }

    public static void init() { }
}
