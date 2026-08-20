package io.github.ayohee.stardewdelight;

import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
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
        public static final TagKey<Block> FRUIT_TREE_PLANKS = create("fruit_tree_planks");
        public static final TagKey<Block> FRUIT_TREE_STAIRS = create("fruit_tree_stairs");
        public static final TagKey<Block> FRUIT_TREE_SLABS = create("fruit_tree_slabs");
        public static final TagKey<Block> FRUIT_TREE_FENCES = create("fruit_tree_fences");
        public static final TagKey<Block> FRUIT_TREE_FENCE_GATES = create("fruit_tree_fence_gates");
        public static final TagKey<Block> FRUIT_TREE_DOORS = create("fruit_tree_doors");
        public static final TagKey<Block> FRUIT_TREE_TRAPDOORS = create("fruit_tree_trapdoors");
        public static final TagKey<Block> FRUIT_TREE_PRESSURE_PLATES = create("fruit_tree_pressure_plates");
        public static final TagKey<Block> FRUIT_TREE_BUTTONS = create("fruit_tree_buttons");
        public static final TagKey<Block> FRUIT_TREE_LEAVES = create("fruit_tree_leaves");

        public static final TagKey<Block> FRUIT_TREE_SAPLINGS = create("fruit_tree_saplings");


        public static final TagKey<Block> SMALL_FLOWERS = create("small_flowers");
        public static final TagKey<Block> TALL_FLOWERS = create("tall_flowers");


        public static final TagKey<Block> CROPS = create("crops");


        public static final TagKey<Block> SD_STORAGE_BLOCKS = create("storage_blocks");

        public static final TagKey<Block> STORAGE_BLOCKS_BLUE_JAZZ = common("storage_blocks/blue_jazz");
        public static final TagKey<Block> STORAGE_BLOCKS_CAULIFLOWER = common("storage_blocks/cauliflower");
        public static final TagKey<Block> STORAGE_BLOCKS_COFFEE = common("storage_blocks/coffee");
        public static final TagKey<Block> STORAGE_BLOCKS_GARLIC = common("storage_blocks/garlic");
        public static final TagKey<Block> STORAGE_BLOCKS_GREEN_BEAN = common("storage_blocks/green_bean");
        public static final TagKey<Block> STORAGE_BLOCKS_KALE = common("storage_blocks/kale");
        public static final TagKey<Block> STORAGE_BLOCKS_PARSNIP = common("storage_blocks/parsnip");
        public static final TagKey<Block> STORAGE_BLOCKS_RHUBARB = common("storage_blocks/rhubarb");
        public static final TagKey<Block> STORAGE_BLOCKS_STRAWBERRY_PUNNET = common("storage_blocks/strawberry_punnet");
        public static final TagKey<Block> STORAGE_BLOCKS_BLUEBERRY_PUNNET = common("storage_blocks/blueberry_punnet");
        public static final TagKey<Block> STORAGE_BLOCKS_CORN = common("storage_blocks/corn");
        public static final TagKey<Block> STORAGE_BLOCKS_HOPS = common("storage_blocks/hops");
        public static final TagKey<Block> STORAGE_BLOCKS_HOT_PEPPER = common("storage_blocks/hot_pepper");
        public static final TagKey<Block> STORAGE_BLOCKS_PINK_MELON = common("storage_blocks/pink_melon");
        public static final TagKey<Block> STORAGE_BLOCKS_RADISH = common("storage_blocks/radish");
        public static final TagKey<Block> STORAGE_BLOCKS_RED_CABBAGE = common("storage_blocks/red_cabbage");
        public static final TagKey<Block> STORAGE_BLOCKS_STARFRUIT = common("storage_blocks/starfruit");
        public static final TagKey<Block> STORAGE_BLOCKS_SUMMER_SPANGLE = common("storage_blocks/summer_spangle");
        public static final TagKey<Block> STORAGE_BLOCKS_AMARANTH = common("storage_blocks/amaranth");
        public static final TagKey<Block> STORAGE_BLOCKS_ARTICHOKE = common("storage_blocks/artichoke");
        public static final TagKey<Block> STORAGE_BLOCKS_BOK_CHOY = common("storage_blocks/bok_choy");
        public static final TagKey<Block> STORAGE_BLOCKS_BROCCOLI = common("storage_blocks/broccoli");
        public static final TagKey<Block> STORAGE_BLOCKS_CRANBERRY_PUNNET = common("storage_blocks/cranberry_punnet");
        public static final TagKey<Block> STORAGE_BLOCKS_EGGPLANT = common("storage_blocks/eggplant");
        public static final TagKey<Block> STORAGE_BLOCKS_FAIRY_ROSE = common("storage_blocks/fairy_rose");
        public static final TagKey<Block> STORAGE_BLOCKS_GRAPE = common("storage_blocks/grape");
        public static final TagKey<Block> STORAGE_BLOCKS_SUGAR_PUMPKIN = common("storage_blocks/sugar_pumpkin");
        public static final TagKey<Block> STORAGE_BLOCKS_YAM = common("storage_blocks/yam");
        public static final TagKey<Block> STORAGE_BLOCKS_POWDERMELON = common("storage_blocks/powdermelon");
        public static final TagKey<Block> STORAGE_BLOCKS_ANCIENT_FRUIT = common("storage_blocks/ancient_fruit");
        public static final TagKey<Block> STORAGE_BLOCKS_QI_FRUIT = common("storage_blocks/qi_fruit");
        public static final TagKey<Block> STORAGE_BLOCKS_SWEET_GEM_BERRY = common("storage_blocks/sweet_gem_berry");
        public static final TagKey<Block> STORAGE_BLOCKS_PINEAPPLE = common("storage_blocks/pineapple");
        public static final TagKey<Block> STORAGE_BLOCKS_TARO_ROOT = common("storage_blocks/taro_root");

        private static TagKey<Block> create(String name) {
            return TagKey.create(Registries.BLOCK, StardewDelight.modLoc(name));
        }

        private static TagKey<Block> common(String name) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", name));
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
