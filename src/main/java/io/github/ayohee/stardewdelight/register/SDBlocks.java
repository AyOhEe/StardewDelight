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
    public static final DeferredBlock<Block> BLUE_JAZZ_CROP = block(
            "blue_jazz_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> CAULIFLOWER_CROP = block(
            "cauliflower_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> COFFEE_BUSH = block(
            "coffee_bush",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> GARLIC_CROP = block(
            "garlic_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> GREEN_BEANS_CROP = block(
            "green_beans_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> KALE_CROP = block(
            "kale_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> PARSNIP_CROP = block(
            "parsnip_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> RHUBARB_CROP = block(
            "rhubarb_crop",
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

    public static final DeferredBlock<Block> CORN_CROP = block(
            "corn_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> HOPS_CROP = block(
            "hops_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> HOT_PEPPERS_CROP = block(
            "hot_peppers_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> PINK_MELON_CROP = block(
            "pink_melon_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> RADISH_CROP = block(
            "radish_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> RED_CABBAGE_CROP = block(
            "red_cabbage_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> STARFRUIT_CROP = block(
            "starfruit_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SUMMER_SPANGLE_CROP = block(
            "summer_spangle_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SUMMER_SQUASH_CROP = block(
            "summer_squash_crop",
            Block::new,
            p -> p
    );


    /*----- FALL CROPS -----*/
    public static final DeferredBlock<Block> AMARANTH_CROP = block(
            "amaranth_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> ARTICHOKE_CROP = block(
            "artichoke_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> BOK_CHOY_CROP = block(
            "bok_choy_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> BROCCOLI_CROP = block(
            "broccoli_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> CRANBERRY_BUSH = block(
            "cranberry_bush",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> EGGPLANT_CROP = block(
            "eggplant_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> FAIRY_ROSE_CROP = block(
            "fairy_rose_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> GRAPES_CROP = block(
            "grapes_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SUGAR_PUMPKIN_CROP = block(
            "sugar_pumpkin_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> YAM_CROP = block(
            "yam_crop",
            Block::new,
            p -> p
    );


    /*----- WINTER CROPS -----*/
    public static final DeferredBlock<Block> POWDERMELON_CROP = block(
            "powdermelon_crop",
            Block::new,
            p -> p
    );


    /*----- SPECIAL CROPS -----*/
    public static final DeferredBlock<Block> ANCIENT_FRUIT_CROP = block(
            "ancient_fruit_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> QI_FRUIT_CROP = block(
            "qi_fruit_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SWEET_GEM_BERRY_CROP = block(
            "sweet_gem_berry_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> PINEAPPLE_CROP = block(
            "pineapple_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> TARO_ROOT_CROP = block(
            "taro_root_crop",
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
