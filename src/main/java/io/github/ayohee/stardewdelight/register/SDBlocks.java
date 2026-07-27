package io.github.ayohee.stardewdelight.register;

import io.github.ayohee.stardewdelight.content.blocks.crops.*;
import io.github.ayohee.stardewdelight.content.blocks.trees.FruitSaplingBlock;
import io.github.ayohee.stardewdelight.register.lib.DeferredBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

import static io.github.ayohee.stardewdelight.register.SDRegistries.BLOCKS;
import static io.github.ayohee.stardewdelight.register.SDRegistries.ITEMS;
import static io.github.ayohee.stardewdelight.register.SDTabs.TAB_CONTENTS;

public class SDBlocks {
    private static DeferredHolder<CreativeModeTab, CreativeModeTab> currentTab = SDTabs.STARDEW_DELIGHT;
    public static final List<DeferredBlock<? extends Block>> CRATES = new LinkedList<>();
    public static final List<DeferredBlock<? extends Block>> SAPLINGS = new LinkedList<>();


    /*----- CROP BLOCKS -----*/
    /*----- SPRING CROPS -----*/
    public static final DeferredBlock<Block> BLUE_JAZZ_CROP = standardCrop(
            "blue_jazz_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> CAULIFLOWER_CROP = standardCrop(
            "cauliflower_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> COFFEE_BUSH = standardCrop(
            "coffee_bush",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<GarlicBlock> GARLIC_CROP = standardCrop(
            "garlic_crop",
            GarlicBlock::new,
            p -> p
    );

    public static final DeferredBlock<Block> GREEN_BEANS_CROP = standardCrop(
            "green_beans_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<KaleBlock> KALE_CROP = standardCrop(
            "kale_crop",
            KaleBlock::new,
            p -> p
    );

    public static final DeferredBlock<ParsnipBlock> PARSNIP_CROP = standardCrop(
            "parsnip_crop",
            ParsnipBlock::new,
            p -> p
    );

    public static final DeferredBlock<RhubarbBlock> RHUBARB_CROP = standardCrop(
            "rhubarb_crop",
            RhubarbBlock::new,
            p -> p
    );

    public static final DeferredBlock<Block> STRAWBERRY_BUSH = standardCrop(
            "strawberry_bush",
            Block::new,
            p -> p
    );


    /*----- SUMMER CROPS -----*/
    public static final DeferredBlock<Block> BLUEBERRY_BUSH = standardCrop(
            "blueberry_bush",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> CORN_CROP = standardCrop(
            "corn_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> HOPS_CROP = standardCrop(
            "hops_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> HOT_PEPPERS_CROP = standardCrop(
            "hot_peppers_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> PINK_MELON_CROP = standardCrop(
            "pink_melon_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<RadishBlock> RADISH_CROP = standardCrop(
            "radish_crop",
            RadishBlock::new,
            p -> p
    );

    public static final DeferredBlock<Block> RED_CABBAGE_CROP = standardCrop(
            "red_cabbage_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> STARFRUIT_CROP = standardCrop(
            "starfruit_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SUMMER_SPANGLE_CROP = standardCrop(
            "summer_spangle_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SUMMER_SQUASH_CROP = standardCrop(
            "summer_squash_crop",
            Block::new,
            p -> p
    );


    /*----- FALL CROPS -----*/
    public static final DeferredBlock<Block> AMARANTH_CROP = standardCrop(
            "amaranth_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> ARTICHOKE_CROP = standardCrop(
            "artichoke_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> BOK_CHOY_CROP = standardCrop(
            "bok_choy_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> BROCCOLI_CROP = standardCrop(
            "broccoli_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> CRANBERRY_BUSH = standardCrop(
            "cranberry_bush",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> EGGPLANT_CROP = standardCrop(
            "eggplant_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> FAIRY_ROSE_CROP = standardCrop(
            "fairy_rose_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> GRAPES_CROP = standardCrop(
            "grapes_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SUGAR_PUMPKIN_CROP = standardCrop(
            "sugar_pumpkin_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<YamBlock> YAM_CROP = standardCrop(
            "yam_crop",
            YamBlock::new,
            p -> p
    );


    /*----- WINTER CROPS -----*/
    public static final DeferredBlock<Block> POWDERMELON_CROP = standardCrop(
            "powdermelon_crop",
            Block::new,
            p -> p
    );


    /*----- SPECIAL CROPS -----*/
    public static final DeferredBlock<Block> ANCIENT_FRUIT_CROP = standardCrop(
            "ancient_fruit_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> QI_FRUIT_CROP = standardCrop(
            "qi_fruit_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> SWEET_GEM_BERRY_CROP = standardCrop(
            "sweet_gem_berry_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> PINEAPPLE_CROP = standardCrop(
            "pineapple_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<Block> TARO_ROOT_CROP = standardCrop(
            "taro_root_crop",
            Block::new,
            p -> p
    );


    /*----- FRUIT TREES -----*/
    public static final DeferredBlockItem<FruitSaplingBlock> TEA_SAPLING = sapling(
            "tea_sapling",
            FruitSaplingBlock::new,
            p -> p
    );

    public static final DeferredBlockItem<FruitSaplingBlock> APRICOT_SAPLING = sapling(
            "apricot_sapling",
            FruitSaplingBlock::new,
            p -> p
    );

    public static final DeferredBlockItem<FruitSaplingBlock> FRUITING_CHERRY_SAPLING = sapling(
            "fruiting_cherry_sapling",
            FruitSaplingBlock::new,
            p -> p
    );

    public static final DeferredBlockItem<FruitSaplingBlock> BANANA_SAPLING = sapling(
            "banana_sapling",
            FruitSaplingBlock::new,
            p -> p
    );

    public static final DeferredBlockItem<FruitSaplingBlock> MANGO_SAPLING = sapling(
            "mango_sapling",
            FruitSaplingBlock::new,
            p -> p
    );

    public static final DeferredBlockItem<FruitSaplingBlock> ORANGE_SAPLING = sapling(
            "orange_sapling",
            FruitSaplingBlock::new,
            p -> p
    );

    public static final DeferredBlockItem<FruitSaplingBlock> PEACH_SAPLING = sapling(
            "peach_sapling",
            FruitSaplingBlock::new,
            p -> p
    );

    public static final DeferredBlockItem<FruitSaplingBlock> APPLE_SAPLING = sapling(
            "apple_sapling",
            FruitSaplingBlock::new,
            p -> p
    );

    public static final DeferredBlockItem<FruitSaplingBlock> POMEGRANATE_SAPLING = sapling(
            "pomegranate_sapling",
            FruitSaplingBlock::new,
            p -> p
    );


    /*----- CRATES -----*/
    /*----- SPRING CROPS -----*/
    public static final DeferredBlockItem<Block> BLUE_JAZZ_BOX = crate(
            "blue_jazz_box",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> CAULIFLOWER_CRATE = crate(
            "cauliflower_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> COFFEE_BAG = crate(
            "coffee_bag",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> GARLIC_CRATE = crate(
            "garlic_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> GREEN_BEAN_CRATE = crate(
            "green_bean_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> KALE_CRATE = crate(
            "kale_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> PARSNIP_CRATE = crate(
            "parsnip_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> RHUBARB_CRATE = crate(
            "rhubarb_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> STRAWBERRY_PUNNET_CRATE = crate(
            "strawberry_punnet_crate",
            Block::new,
            p -> p
    );


    /*----- SUMMER CROPS -----*/
    public static final DeferredBlockItem<Block> BLUEBERRY_PUNNET_CRATE = crate(
            "blueberry_punnet_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> CORN_CRATE = crate(
            "corn_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> HOPS_CRATE = crate(
            "hops_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> HOT_PEPPER_CRATE = crate(
            "hot_pepper_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> PINK_MELON_CRATE = crate(
            "pink_melon_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> RADISH_CRATE = crate(
            "radish_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> RED_CABBAGE_CRATE = crate(
            "red_cabbage_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> STARFRUIT_CRATE = crate(
            "starfruit_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> SUMMER_SPANGLE_BOX = crate(
            "summer_spangle_box",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> SUMMER_SQUASH_CRATE = crate(
            "summer_squash_crate",
            Block::new,
            p -> p
    );


    /*----- FALL CROPS -----*/
    public static final DeferredBlockItem<Block> AMARANTH_BALE = crate(
            "amaranth_bale",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> ARTICHOKE_CRATE = crate(
            "artichoke_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> BOK_CHOY_CRATE = crate(
            "bok_choy_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> BROCCOLI_CRATE = crate(
            "broccoli_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> CRANBERRY_PUNNET_CRATE = crate(
            "cranberry_punnet_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> EGGPLANT_CRATE = crate(
            "eggplant_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> FAIRY_ROSE_BOX = crate(
            "fairy_rose_box",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> GRAPE_CRATE = crate(
            "grape_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> SUGAR_PUMPKIN_CRATE = crate(
            "sugar_pumpkin_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> YAM_CRATE = crate(
            "yam_crate",
            Block::new,
            p -> p
    );


    /*----- WINTER CROPS -----*/
    public static final DeferredBlockItem<Block> POWDERMELON_CRATE = crate(
            "powdermelon_crate",
            Block::new,
            p -> p
    );


    /*----- SPECIAL CROPS -----*/
    public static final DeferredBlockItem<Block> ANCIENT_FRUIT_CRATE = crate(
            "ancient_fruit_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> QI_FRUIT_CRATE = crate(
            "qi_fruit_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> SWEET_GEM_BERRY_CRATE = crate(
            "sweet_gem_berry_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> PINEAPPLE_CRATE = crate(
            "pineapple_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> TARO_ROOT_CRATE = crate(
            "taro_root_crate",
            Block::new,
            p -> p
    );


    /*----- FRUIT TREES -----*/
    public static final DeferredBlockItem<Block> TEA_CRATE = crate(
            "tea_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> APRICOT_CRATE = crate(
            "apricot_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> CHERRY_CRATE = crate(
            "cherry_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> BANANA_CRATE = crate(
            "banana_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> MANGO_CRATE = crate(
            "mango_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> ORANGE_CRATE = crate(
            "orange_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> PEACH_CRATE = crate(
            "peach_crate",
            Block::new,
            p -> p
    );


    public static final DeferredBlockItem<Block> APPLE_CRATE = crate(
            "apple_crate",
            Block::new,
            p -> p
    );

    public static final DeferredBlockItem<Block> POMEGRANATE_CRATE = crate(
            "pomegranate_crate",
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

    private static <B extends Block> DeferredBlockItem<B> sapling(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        var b = blockItem(name, sup, (p) -> pBuilder.apply(p)
                .mapColor(MapColor.PLANT)
                .noCollission()
                .randomTicks()
                .instabreak()
                .sound(SoundType.GRASS)
                .pushReaction(PushReaction.DESTROY)
        );
        SAPLINGS.add(b.getBlock());
        return b;
    }

    private static <B extends Block> DeferredBlock<B> standardCrop(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return block(name, sup, (p) -> pBuilder.apply(p)
                .mapColor(MapColor.PLANT)
                .noCollission()
                .randomTicks()
                .instabreak()
                .sound(SoundType.CROP)
                .pushReaction(PushReaction.DESTROY)
        );
    }

    private static <B extends Block> DeferredBlockItem<B> crate(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        var b = blockItem(name, sup, (p) -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
                .strength(2.0F, 3.0F)
                .sound(SoundType.WOOD)
        );
        CRATES.add(b.getBlock());
        return b;
    }


    /*----- STATIC INITIALIZER -----*/
    public static void register() { }
}
