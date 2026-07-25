package io.github.ayohee.stardewdelight.register;

import io.github.ayohee.stardewdelight.register.lib.DeferredBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.function.Function;

import static io.github.ayohee.stardewdelight.register.SDRegistries.BLOCKS;
import static io.github.ayohee.stardewdelight.register.SDRegistries.ITEMS;
import static io.github.ayohee.stardewdelight.register.SDTabs.TAB_CONTENTS;

public class SDBlocks {
    private static DeferredHolder<CreativeModeTab, CreativeModeTab> currentTab = SDTabs.STARDEW_DELIGHT;


    /*----- SPRING CROPS -----*/
    public static final DeferredBlock<Block> BLUE_JAZZ = block(
            "blue_jazz",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> CAULIFLOWER = block(
            "cauliflower",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> COFFEE_BUSH = block(
            "coffee_bush",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> GARLIC = block(
            "garlic",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> GREEN_BEANS = block(
            "green_beans",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> KALE = block(
            "kale",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> PARSNIP = block(
            "parsnip",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> RHUBARB = block(
            "rhubarb",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> STRAWBERRY_BUSH = block(
            "strawberry_bush",
            Block::new,
            p -> p
    );


    /*----- SUMMER CROPS -----*/
    public static final DeferredBlock<Block> BLUEBERRY_BUSH = block(
            "blueberry_bush",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> CORN = block(
            "corn",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> HOPS = block(
            "hops",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> HOT_PEPPERS = block(
            "hot_peppers",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> PINK_MELON = block(
            "pink_melon",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> RADISH = block(
            "radish",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> RED_CABBAGE = block(
            "red_cabbage",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> STARFRUIT = block(
            "starfruit",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SUMMER_SPANGLE = block(
            "summer_spangle",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SUMMER_SQUASH = block(
            "summer_squash",
            Block::new,
            p -> p
    );


    /*----- FALL CROPS -----*/
    public static final DeferredBlock<Block> AMARANTH = block(
            "amaranth",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> ARTICHOKE = block(
            "artichoke",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> BOK_CHOY = block(
            "bok_choy",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> BROCCOLI = block(
            "broccoli",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> CRANBERRY_BUSH = block(
            "cranberry",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> EGGPLANT = block(
            "eggplant",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> FAIRY_ROSE = block(
            "fairy_rose",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> GRAPES = block(
            "grapes",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SUGAR_PUMPKIN = block(
            "sugar_pumpkin",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> YAM = block(
            "yam",
            Block::new,
            p -> p
    );


    /*----- WINTER CROPS -----*/
    public static final DeferredBlock<Block> POWDERMELON = block(
            "powdermelon",
            Block::new,
            p -> p
    );


    /*----- SPECIAL CROPS -----*/
    public static final DeferredBlock<Block> ANCIENT_FRUIT = block(
            "ancient_fruit",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> QI_FRUIT = block(
            "qi_fruit",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SWEET_GEM_BERRY = block(
            "sweet_gem_berry",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> PINEAPPLE = block(
            "pineapple",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> TARO_ROOT = block(
            "taro_root",
            Block::new,
            p -> p
    );


    /*----- FRUIT TREES -----*/
    public static final DeferredBlockItem<Block> TEA_SAPLING = blockItem(
            "tea_sapling",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> APRICOT_SAPLING = blockItem(
            "apricot_sapling",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> CHERRY_SAPLING = blockItem(
            "cherry_sapling",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> BANANA_SAPLING = blockItem(
            "banana_sapling",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> MANGO_SAPLING = blockItem(
            "mango_sapling",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> ORANGE_SAPLING = blockItem(
            "orange_sapling",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> PEACH_SAPLING = blockItem(
            "peach_sapling",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> POMEGRANATE_SAPLING = blockItem(
            "pomegranate_sapling",
            Block::new,
            p -> p
    );


    /*----- UTILITY METHODS -----*/
    private static <B extends Block> DeferredBlock<B> block(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return BLOCKS.registerBlock(name, (p) -> sup.apply(pBuilder.apply(p)));
    }

    private static <B extends Block> DeferredBlock<B> block(String name, Function<BlockBehaviour.Properties, B> sup) {
        return block(name, sup, p -> p);
    }


    private static <B extends Block> DeferredBlockItem<B> blockItem(DeferredBlock<B> block) {
        DeferredBlockItem<B> d = new DeferredBlockItem<>(block, ITEMS);
        if (currentTab != null) {
            TAB_CONTENTS.get(currentTab).add(d);
        }
        return d;
    }

    private static <B extends Block> DeferredBlockItem<B> blockItem(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(block(name, sup, pBuilder));
    }

    private static <B extends Block> DeferredBlockItem<B> blockItem(String name, Function<BlockBehaviour.Properties, B> sup) {
        return blockItem(block(name, sup));
    }


    /*----- STATIC INITIALIZER -----*/
    public static void register() { }
}
