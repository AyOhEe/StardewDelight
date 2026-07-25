package io.github.ayohee.stardewdelight.register;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.function.BiFunction;
import java.util.function.Function;

import static io.github.ayohee.stardewdelight.register.SDRegistries.ITEMS;
import static io.github.ayohee.stardewdelight.register.SDTabs.TAB_CONTENTS;

public class SDItems {
    private static DeferredHolder<CreativeModeTab, CreativeModeTab> currentTab = SDTabs.STARDEW_DELIGHT;


    /*----- SEEDS -----*/
    /*----- SPRING CROPS -----*/
    public static final DeferredItem<Item> JAZZ_SEEDS = seed(
            "jazz_seeds",
            SDBlocks.BLUE_JAZZ_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> CAULIFLOWER_SEEDS = seed(
            "cauliflower_seeds",
            SDBlocks.CAULIFLOWER_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> COFFEE_BEAN = seed(
            "coffee_bean",
            SDBlocks.COFFEE_BUSH,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> GARLIC_SEEDS = seed(
            "garlic_seeds",
            SDBlocks.GARLIC_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> BEAN_STARTER = seed(
            "bean_starter",
            SDBlocks.GREEN_BEANS_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> KALE_SEEDS = seed(
            "kale_seeds",
            SDBlocks.KALE_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> PARSNIP_SEEDS = seed(
            "parsnip_seeds",
            SDBlocks.PARSNIP_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> RHUBARB_SEEDS = seed(
            "rhubarb_seeds",
            SDBlocks.RHUBARB_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> STRAWBERRY_SEEDS = seed(
            "strawberry_seeds",
            SDBlocks.STRAWBERRY_BUSH,
            ItemNameBlockItem::new,
            p -> p
    );


    /*----- SUMMER CROPS -----*/
    public static final DeferredItem<Item> BLUEBERRY_SEEDS = seed(
            "blueberry_seeds",
            SDBlocks.BLUEBERRY_BUSH,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> CORN_SEEDS = seed(
            "corn_seeds",
            SDBlocks.CORN_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> HOPS_STARTER = seed(
            "hops_starter",
            SDBlocks.HOPS_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> PEPPER_SEEDS = seed(
            "pepper_seeds",
            SDBlocks.HOT_PEPPERS_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> PINK_MELON_SEEDS = seed(
            "pink_melon_seeds",
            SDBlocks.PINK_MELON_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> RADISH_SEEDS = seed(
            "radish_seeds",
            SDBlocks.RADISH_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> RED_CABBAGE_SEEDS = seed(
            "red_cabbage_seeds",
            SDBlocks.RED_CABBAGE_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> STARFRUIT_SEEDS = seed(
            "starfruit_seeds",
            SDBlocks.STARFRUIT_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> SPANGLE_SEEDS = seed(
            "spangle_seeds",
            SDBlocks.SUMMER_SPANGLE_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> SUMMER_SQUASH_SEEDS = seed(
            "summer_squash_seeds",
            SDBlocks.SUMMER_SQUASH_CROP,
            ItemNameBlockItem::new,
            p -> p
    );


    /*----- FALL CROPS -----*/
    public static final DeferredItem<Item> AMARANTH_SEEDS = seed(
            "amaranth_seeds",
            SDBlocks.AMARANTH_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> ARTICHOKE_SEEDS = seed(
            "artichoke_seeds",
            SDBlocks.ARTICHOKE_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> BOK_CHOY_SEEDS = seed(
            "bok_choy_seeds",
            SDBlocks.BOK_CHOY_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> BROCCOLI_SEEDS = seed(
            "broccoli_seeds",
            SDBlocks.BROCCOLI_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> CRANBERRY_SEEDS = seed(
            "cranberry_seeds",
            SDBlocks.CRANBERRY_BUSH,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> EGGPLANT_SEEDS = seed(
            "eggplant_seeds",
            SDBlocks.EGGPLANT_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> FAIRY_SEEDS = seed(
            "fairy_seeds",
            SDBlocks.FAIRY_ROSE_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> GRAPE_STARTER = seed(
            "grape_starter",
            SDBlocks.GRAPES_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> SUGAR_PUMPKIN_SEEDS = seed(
            "sugar_pumpkin_seeds",
            SDBlocks.SUGAR_PUMPKIN_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> YAM_SEEDS = seed(
            "yam_seeds",
            SDBlocks.YAM_CROP,
            ItemNameBlockItem::new,
            p -> p
    );


    /*----- WINTER CROPS -----*/
    public static final DeferredItem<Item> POWDERMELON_SEEDS = seed(
            "powdermelon_seeds",
            SDBlocks.POWDERMELON_CROP,
            ItemNameBlockItem::new,
            p -> p
    );


    /*----- SPECIAL CROPS -----*/
    public static final DeferredItem<Item> ANCIENT_SEEDS = seed(
            "ancient_seeds",
            SDBlocks.ANCIENT_FRUIT_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> QI_BEAN = seed(
            "qi_bean",
            SDBlocks.QI_FRUIT_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> RARE_SEED = seed(
            "rare_seed",
            SDBlocks.SWEET_GEM_BERRY_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> PINEAPPLE_SEEDS = seed(
            "pineapple_seeds",
            SDBlocks.PINEAPPLE_CROP,
            ItemNameBlockItem::new,
            p -> p
    );

    public static final DeferredItem<Item> TARO_TUBER = seed(
            "taro_tuber",
            SDBlocks.TARO_ROOT_CROP,
            ItemNameBlockItem::new,
            p -> p
    );



    /*----- CROP ITEMS -----*/
    /*----- SPRING CROPS -----*/
    public static final DeferredItem<Item> BLUE_JAZZ = item(
            "blue_jazz",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> CAULIFLOWER = item(
            "cauliflower",
            Item::new,
            p -> p
    );

    // Coffee beans are both seeds and a usable crop.

    public static final DeferredItem<Item> GARLIC = item(
            "garlic",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> GREEN_BEAN = item(
            "green_bean",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> KALE = item(
            "kale",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> PARSNIP = item(
            "parsnip",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> RHUBARB = item(
            "rhubarb",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> STRAWBERRY = item(
            "strawberry",
            Item::new,
            p -> p
    );


    /*----- SUMMER CROPS -----*/
    public static final DeferredItem<Item> BLUEBERRY = item(
            "blueberry",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> CORN = item(
            "corn",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> HOPS = item(
            "hops",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> HOT_PEPPER = item(
            "hot_pepper",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> PINK_MELON = item(
            "pink_melon",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> RADISH = item(
            "radish",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> RED_CABBAGE = item(
            "red_cabbage",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> STARFRUIT = item(
            "starfruit",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> SUMMER_SPANGLE = item(
            "summer_spangle",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> SUMMER_SQUASH = item(
            "summer_squash",
            Item::new,
            p -> p
    );


    /*----- FALL CROPS -----*/
    public static final DeferredItem<Item> AMARANTH = item(
            "amaranth",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> ARTICHOKE = item(
            "artichoke",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> BOK_CHOY = item(
            "bok_choy",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> BROCCOLI = item(
            "broccoli",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> CRANBERRY = item(
            "cranberry",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> EGGPLANT = item(
            "eggplant",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> FAIRY_ROSE = item(
            "fairy_rose",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> GRAPES = item(
            "grapes",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> SUGAR_PUMPKIN = item(
            "sugar_pumpkin",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> YAM = item(
            "yam",
            Item::new,
            p -> p
    );


    /*----- WINTER CROPS -----*/
    public static final DeferredItem<Item> POWDERMELON = item(
            "powdermelon",
            Item::new,
            p -> p
    );


    /*----- SPECIAL CROPS -----*/
    public static final DeferredItem<Item> ANCIENT_FRUIT = item(
            "ancient_fruit",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> QI_FRUIT = item(
            "qi_fruit",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> SWEET_GEM_BERRY = item(
            "sweet_gem_berry",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> PINEAPPLE = item(
            "pineapple",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> TARO_ROOT = item(
            "taro_root",
            Item::new,
            p -> p
    );


    /*----- FRUIT TREES -----*/
    public static final DeferredItem<Item> TEA_LEAVES = item(
            "tea_leaves",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> APRICOT = item(
            "apricot",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> CHERRY = item(
            "cherry",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> BANANA = item(
            "banana",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> MANGO = item(
            "mango",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> ORANGE = item(
            "orange",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> PEACH = item(
            "peach",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> POMEGRANATE = item(
            "pomegranate",
            Item::new,
            p -> p
    );


    /*----- BERRY PUNNETS -----*/
    public static final DeferredItem<Item> STRAWBERRY_PUNNET = item(
            "strawberry_punnet",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> BLUEBERRY_PUNNET = item(
            "blueberry_punnet",
            Item::new,
            p -> p
    );

    public static final DeferredItem<Item> CRANBERRY_PUNNET = item(
            "cranberry_punnet",
            Item::new,
            p -> p
    );


    /*----- UTILITY METHODS -----*/
    public static <I extends Item> DeferredItem<I> item(String name, Function<Item.Properties, I> sup, Function<Item.Properties, Item.Properties> pBuilder) {
        DeferredItem<I> i = ITEMS.registerItem(name, p -> sup.apply(pBuilder.apply(p)));
        if (currentTab != null) {
            TAB_CONTENTS.get(currentTab).add(i);
        }
        return i;
    }

    public static <I extends Item> DeferredItem<I> item(String name, Function<Item.Properties, I> sup) {
        return item(name, sup, p -> p);
    }

    public static <I extends Item> DeferredItem<I> seed(String name, DeferredBlock<Block> b, BiFunction<Block, Item.Properties, I> sup, Function<Item.Properties, Item.Properties> pBuilder) {
        return item(name, p -> sup.apply(b.get(), p), pBuilder);
    }



        /*----- STATIC INITIALIZER -----*/
    public static void register() { }
}
