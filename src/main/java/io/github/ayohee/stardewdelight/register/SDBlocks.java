package io.github.ayohee.stardewdelight.register;

import io.github.ayohee.stardewdelight.SDBlockStateProperties;
import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.content.crops.*;
import io.github.ayohee.stardewdelight.content.signs.FruitTreeCeilingHangingSignBlock;
import io.github.ayohee.stardewdelight.content.signs.FruitTreeStandingSignBlock;
import io.github.ayohee.stardewdelight.content.signs.FruitTreeWallHangingSignBlock;
import io.github.ayohee.stardewdelight.content.signs.FruitTreeWallSignBlock;
import io.github.ayohee.stardewdelight.content.trees.FruitSaplingBlock;
import io.github.ayohee.stardewdelight.register.lib.DeferredBlockItem;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;
import static io.github.ayohee.stardewdelight.register.SDRegistries.BLOCKS;
import static io.github.ayohee.stardewdelight.register.SDRegistries.ITEMS;
import static io.github.ayohee.stardewdelight.register.SDTabs.TAB_CONTENTS;

public class SDBlocks {
    private static DeferredHolder<CreativeModeTab, CreativeModeTab> currentTab = SDTabs.STARDEW_DELIGHT;
    public static final List<DeferredBlock<? extends Block>> CRATES = new LinkedList<>();
    public static final Map<ResourceLocation, Supplier<BlockState>> STRIPPABLES = new HashMap<>();


    /*----- CROP BLOCKS -----*/
    /*----- SPRING CROPS -----*/
    public static final DeferredBlock<FlowerCropBlock> BLUE_JAZZ_CROP = standardCrop(
            "blue_jazz_crop",
            p -> FlowerCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.JAZZ_SEEDS, () -> SDBlocks.GROWN_BLUE_JAZZ.getBlock().get().defaultBlockState()),
            p -> p
    );

    public static final DeferredBlock<BaseCropBlock> CAULIFLOWER_CROP = standardCrop(
            "cauliflower_crop",
            p -> BaseCropBlock.create(p, BlockStateProperties.AGE_5, 5, SDItems.CAULIFLOWER_SEEDS),
            p -> p
    );

    public static final DeferredBlock<TallBushCropBlock> COFFEE_BUSH = standardCrop(
            "coffee_bush",
            p -> TallBushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.COFFEE_BEAN, 4, SDItems.COFFEE_BEAN, 1, 1),
            p -> p
    );

    public static final DeferredBlock<BaseCropBlock> GARLIC_CROP = standardCrop(
            "garlic_crop",
            p -> BaseCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.GARLIC_SEEDS),
            p -> p
    );

    public static final DeferredBlock<TallBushCropBlock> GREEN_BEANS_CROP = trellisCrop(
            "green_beans_crop",
            p -> TallBushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.BEAN_STARTER, 0, SDItems.GREEN_BEAN, 1, 0),
            p -> p
    );

    public static final DeferredBlock<BaseCropBlock> KALE_CROP = standardCrop(
            "kale_crop",
            p -> BaseCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.KALE_SEEDS),
            p -> p
    );

    public static final DeferredBlock<BaseCropBlock> PARSNIP_CROP = standardCrop(
            "parsnip_crop",
            p -> BaseCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.PARSNIP_SEEDS),
            p -> p
    );

    public static final DeferredBlock<BaseCropBlock> RHUBARB_CROP = standardCrop(
            "rhubarb_crop",
            p -> BaseCropBlock.create(p, BlockStateProperties.AGE_5, 5, SDItems.RHUBARB_SEEDS),
            p -> p
    );

    public static final DeferredBlock<BushCropBlock> STRAWBERRY_BUSH = standardCrop(
            "strawberry_bush",
            p -> BushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.STRAWBERRY_SEEDS, SDItems.STRAWBERRY, 1, 1),
            p -> p
    );


    /*----- SUMMER CROPS -----*/
    public static final DeferredBlock<BushCropBlock> BLUEBERRY_BUSH = standardCrop(
            "blueberry_bush",
            p -> BushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.BLUEBERRY_SEEDS, SDItems.BLUEBERRY, 1, 1),
            p -> p
    );

    public static final DeferredBlock<TallUpperBushCropBlock> CORN_CROP = standardCrop(
            "corn_crop",
            p -> TallUpperBushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.CORN_SEEDS, 4, SDItems.CORN, 1, 0),
            p -> p
    );

    public static final DeferredBlock<TallBushCropBlock> HOPS_CROP = trellisCrop(
            "hops_crop",
            p -> TallBushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.HOPS_STARTER, 0, SDItems.HOPS, 1, 0),
            p -> p
    );

    public static final DeferredBlock<BushCropBlock> HOT_PEPPERS_CROP = standardCrop(
            "hot_peppers_crop",
            p -> BushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.PEPPER_SEEDS, SDItems.HOT_PEPPER, 1, 1),
            p -> p
    );

    public static final DeferredBlock<Block> PINK_MELON_CROP = standardCrop(
            "pink_melon_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<BaseCropBlock> RADISH_CROP = standardCrop(
            "radish_crop",
            p -> BaseCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.RADISH_SEEDS),
            p -> p
    );

    public static final DeferredBlock<BaseCropBlock> RED_CABBAGE_CROP = standardCrop(
            "red_cabbage_crop",
            p -> BaseCropBlock.create(p, BlockStateProperties.AGE_5, 5, SDItems.RED_CABBAGE_SEEDS),
            p -> p
    );

    public static final DeferredBlock<TallCropBlock> STARFRUIT_CROP = standardCrop(
            "starfruit_crop",
            p -> TallCropBlock.create(p, BlockStateProperties.AGE_5, 5, SDItems.STARFRUIT_SEEDS, 4),
            p -> p
    );

    public static final DeferredBlock<FlowerCropBlock> SUMMER_SPANGLE_CROP = standardCrop(
            "summer_spangle_crop",
            p -> FlowerCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.SPANGLE_SEEDS, () -> SDBlocks.GROWN_SUMMER_SPANGLE.getBlock().get().defaultBlockState()),
            p -> p
    );

    public static final DeferredBlock<BushCropBlock> SUMMER_SQUASH_CROP = standardCrop(
            "summer_squash_crop",
            p -> BushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.SUMMER_SQUASH_SEEDS, SDItems.SUMMER_SQUASH, 1, 0),
            p -> p
    );


    /*----- FALL CROPS -----*/
    public static final DeferredBlock<TallCropBlock> AMARANTH_CROP = standardCrop(
            "amaranth_crop",
            p -> TallCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.AMARANTH_SEEDS, 4),
            p -> p
    );

    public static final DeferredBlock<TallCropBlock> ARTICHOKE_CROP = standardCrop(
            "artichoke_crop",
            p -> TallCropBlock.create(p, BlockStateProperties.AGE_5, 5, SDItems.ARTICHOKE_SEEDS, 4),
            p -> p
    );

    public static final DeferredBlock<BaseCropBlock> BOK_CHOY_CROP = standardCrop(
            "bok_choy_crop",
            p -> BaseCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.BOK_CHOY_SEEDS),
            p -> p
    );

    public static final DeferredBlock<BushCropBlock> BROCCOLI_CROP = standardCrop(
            "broccoli_crop",
            p -> BushCropBlock.create(p, BlockStateProperties.AGE_5, 5, SDItems.BROCCOLI_SEEDS, SDItems.BROCCOLI, 1, 0),
            p -> p
    );

    public static final DeferredBlock<TallBushCropBlock> CRANBERRY_BUSH = standardCrop(
            "cranberry_bush",
            p -> TallBushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.CRANBERRY_SEEDS, 4, SDItems.CRANBERRY, 1, 1),
            p -> p
    );

    public static final DeferredBlock<BushCropBlock> EGGPLANT_CROP = standardCrop(
            "eggplant_crop",
            p -> BushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.EGGPLANT_SEEDS, SDItems.EGGPLANT, 1, 0),
            p -> p
    );

    public static final DeferredBlock<TallFlowerCropBlock> FAIRY_ROSE_CROP = standardCrop(
            "fairy_rose_crop",
            p -> TallFlowerCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.FAIRY_SEEDS, 3, () -> SDBlocks.GROWN_FAIRY_ROSE.getBlock().get().defaultBlockState()),
            p -> p
    );

    public static final DeferredBlock<TallBushCropBlock> GRAPES_CROP = trellisCrop(
            "grapes_crop",
            p -> TallBushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.GRAPE_STARTER, 0, SDItems.GRAPES, 1, 0),
            p -> p
    );

    public static final DeferredBlock<Block> SUGAR_PUMPKIN_CROP = standardCrop(
            "sugar_pumpkin_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<BaseCropBlock> YAM_CROP = standardCrop(
            "yam_crop",
            p -> BaseCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.YAM_SEEDS),
            p -> p
    );


    /*----- WINTER CROPS -----*/
    public static final DeferredBlock<Block> POWDERMELON_CROP = standardCrop(
            "powdermelon_crop",
            Block::new,
            p -> p
    );


    /*----- SPECIAL CROPS -----*/
    public static final DeferredBlock<TallUpperBushCropBlock> ANCIENT_FRUIT_CROP = standardCrop(
            "ancient_fruit_crop",
            p -> TallUpperBushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.ANCIENT_SEEDS, 3, SDItems.ANCIENT_FRUIT, 1, 0),
            p -> p
    );

    public static final DeferredBlock<Block> QI_FRUIT_CROP = standardCrop(
            "qi_fruit_crop",
            Block::new,
            p -> p
    );

    public static final DeferredBlock<TallCropBlock> SWEET_GEM_BERRY_CROP = standardCrop(
            "sweet_gem_berry_crop",
            p -> TallCropBlock.create(p, BlockStateProperties.AGE_5, 5, SDItems.RARE_SEED, 4),
            p -> p
    );

    public static final DeferredBlock<BushCropBlock> PINEAPPLE_CROP = standardCrop(
            "pineapple_crop",
            p -> BushCropBlock.create(p, SDBlockStateProperties.AGE_6, 6, SDItems.PINEAPPLE_SEEDS, SDItems.PINEAPPLE, 1, 0),
            p -> p
    );

    public static final DeferredBlock<BaseCropBlock> TARO_ROOT_CROP = standardCrop(
            "taro_root_crop",
            p -> BaseCropBlock.create(p, BlockStateProperties.AGE_4, 4, SDItems.TARO_TUBER),
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

    /*----- WOOD/TREE BLOCKS -----*/
    static {
        currentTab = SDTabs.STARDEW_DELIGHT_BUILDING;
    }

    // TODO this is disgusting
    public static final Map<WoodType, Map<WoodBlockTypes, DeferredBlockItem<?>>> WOOD_BLOCKS = Map.ofEntries(
            Arrays.stream(SDWoodTypes.values())
                    .map((t) -> new AbstractMap.SimpleImmutableEntry<>(t, WoodBlockTypes.createVariants(t)))
                    .toList()
                    .toArray(new AbstractMap.SimpleImmutableEntry[SDWoodTypes.values().length])
    );


    /*----- GROWN FLOWERS -----*/
    static {
        currentTab = SDTabs.STARDEW_DELIGHT;
    }

    public static final DeferredBlockItem<FlowerBlock> GROWN_BLUE_JAZZ = flower(
            "grown_blue_jazz",
            p -> new FlowerBlock(SuspiciousStewEffects.EMPTY, p),
            p -> p
    );

    public static final DeferredBlockItem<FlowerBlock> GROWN_SUMMER_SPANGLE = flower(
            "grown_summer_spangle",
            p -> new FlowerBlock(SuspiciousStewEffects.EMPTY, p),
            p -> p
    );

    public static final DeferredBlockItem<GrownFairyRoseBlock> GROWN_FAIRY_ROSE = tallFlower(
            "grown_fairy_rose",
            GrownFairyRoseBlock::new,
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
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    }

    private static <B extends Block> DeferredBlock<B> standardCrop(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return block(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    }

    private static <B extends Block> DeferredBlock<B> trellisCrop(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return block(name, sup, (p) -> pBuilder.apply(p.mapColor(MapColor.PLANT).randomTicks().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY).forceSolidOff()));
    }

    private static <B extends Block> DeferredBlockItem<B> crate(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        var b = blockItem(name, sup, (p) -> pBuilder.apply(
                BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
                .strength(2.0F, 3.0F)
                .sound(SoundType.WOOD)
                )
        );
        CRATES.add(b.getBlock());
        return b;
    }

    private static <B extends Block> DeferredBlockItem<B> flower(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY)));
    }

    private static <B extends Block> DeferredBlockItem<B> tallFlower(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH)));
    }

    private static <B extends Block> DeferredBlockItem<B> log(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    }

    private static <B extends Block> DeferredBlockItem<B> strippedLog(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    }

    private static <B extends Block> DeferredBlockItem<B> planks(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    }

    private static <B extends Block> DeferredBlockItem<B> wood(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    }

    private static <B extends Block> DeferredBlockItem<B> strippedWood(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    }

    private static <B extends Block> DeferredBlockItem<B> leaves(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    }

    private static <B extends Block> DeferredBlockItem<B> button(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    }

    private static <B extends Block> DeferredBlockItem<B> stairs(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    }

    private static <B extends Block> DeferredBlockItem<B> slab(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    }

    private static <B extends Block> DeferredBlockItem<B> fence(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    }

    private static <B extends Block> DeferredBlockItem<B> fenceGate(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    }

    private static <B extends Block> DeferredBlockItem<B> door(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    }

    private static <B extends Block> DeferredBlockItem<B> trapdoor(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    }

    private static <B extends Block> DeferredBlockItem<B> pressurePlate(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return blockItem(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    }

    private static <B extends Block> DeferredBlockItem<B> sign(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return new DeferredBlockItem<>(block(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN))));
    }

    private static <B extends Block> DeferredBlockItem<B> wallSign(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return new DeferredBlockItem<>(block(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN))));
    }

    private static <B extends Block> DeferredBlockItem<B> hangingSign(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return new DeferredBlockItem<>(block(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN))));
    }

    private static <B extends Block> DeferredBlockItem<B> wallHangingSign(String name, Function<BlockBehaviour.Properties, B> sup, Function<BlockBehaviour.Properties, BlockBehaviour.Properties> pBuilder) {
        return new DeferredBlockItem<>(block(name, sup, (p) -> pBuilder.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN))));
    }

    /*----- STATIC INITIALIZER -----*/
    public static void register() { }


    public enum WoodBlockTypes {
        LOG("", "log"),
        WOOD("", "wood"),
        STRIPPED_LOG("stripped", "log"),
        STRIPPED_WOOD("stripped", "wood"),
        PLANKS("", "planks"),
        STAIRS("", "stairs"),
        SLAB("", "slab"),
        FENCE("", "fence"),
        FENCE_GATE("", "fence_gate"),
        DOOR("", "door"),
        TRAPDOOR("", "trapdoor"),
        PRESSURE_PLATE("", "pressure_plate"),
        BUTTON("", "button"),
        LEAVES("", "leaves"),

        SIGN("", "sign"),
        WALL_SIGN("", "wall_sign"),
        HANGING_SIGN("", "hanging_sign"),
        WALL_HANGING_SIGN("", "wall_hanging_sign");

        private String prefix;
        private String suffix;

        WoodBlockTypes(String prefix, String suffix) {
            this.prefix = prefix;
            this.suffix = suffix;
        }

        public String of(WoodType wood) {
            if (prefix.isEmpty()) {
                return wood.name() + "_" + suffix;
            } else {
                return prefix + "_" + wood.name() + "_" + suffix;
            }
        }

        public static Map<WoodBlockTypes, DeferredBlockItem<?>> createVariants(WoodType type) {
            Map<WoodBlockTypes, DeferredBlockItem<?>> map = new EnumMap<>(WoodBlockTypes.class);

            map.put(LOG, log(LOG.of(type), RotatedPillarBlock::new, p -> p));
            map.put(WOOD, wood(WOOD.of(type), RotatedPillarBlock::new, p -> p));
            map.put(STRIPPED_LOG, strippedLog(STRIPPED_LOG.of(type), RotatedPillarBlock::new, p -> p));
            map.put(STRIPPED_WOOD, strippedWood(STRIPPED_WOOD.of(type), RotatedPillarBlock::new, p -> p));
            map.put(PLANKS, planks(PLANKS.of(type), Block::new, p -> p));
            map.put(STAIRS, stairs(STAIRS.of(type), p -> new StairBlock(map.get(PLANKS).getBlock().get().defaultBlockState(), p), p -> p));
            map.put(SLAB, slab(SLAB.of(type), SlabBlock::new, p -> p));
            map.put(FENCE, fence(FENCE.of(type), FenceBlock::new, p -> p));
            map.put(FENCE_GATE, fenceGate(FENCE_GATE.of(type), p -> new FenceGateBlock(type, p), p -> p));
            map.put(DOOR, door(DOOR.of(type), p -> new DoorBlock(type.setType(), p), p -> p));
            map.put(TRAPDOOR, trapdoor(TRAPDOOR.of(type), p -> new TrapDoorBlock(type.setType(), p), p -> p));
            map.put(PRESSURE_PLATE, pressurePlate(PRESSURE_PLATE.of(type), p -> new PressurePlateBlock(type.setType(), p), p -> p));
            map.put(BUTTON, button(BUTTON.of(type), p -> new ButtonBlock(type.setType(), 30, p), p -> p));
            map.put(LEAVES, leaves(LEAVES.of(type), LeavesBlock::new, p -> p));

            map.put(SIGN, sign(SIGN.of(type), p -> new FruitTreeStandingSignBlock(type, p), p -> p));
            map.put(WALL_SIGN, wallSign(WALL_SIGN.of(type), p -> new FruitTreeWallSignBlock(type, p), p -> p));
            map.put(HANGING_SIGN, hangingSign(HANGING_SIGN.of(type), p -> new FruitTreeCeilingHangingSignBlock(type, p), p -> p));
            map.put(WALL_HANGING_SIGN, wallHangingSign(WALL_HANGING_SIGN.of(type), p -> new FruitTreeWallHangingSignBlock(type, p), p -> p));

            DeferredItem<SignItem> signItem = ITEMS.registerItem(
                    SIGN.of(type),
                    p -> new SignItem(p, map.get(SIGN).getBlock().get(), map.get(WALL_SIGN).getBlock().get())
            );
            DeferredItem<HangingSignItem> hangingSignItem = ITEMS.registerItem(
                    HANGING_SIGN.of(type),
                    p -> new HangingSignItem(map.get(HANGING_SIGN).getBlock().get(), map.get(WALL_HANGING_SIGN).getBlock().get(), p)
            );

            TAB_CONTENTS.get(currentTab).add(signItem);
            TAB_CONTENTS.get(currentTab).add(hangingSignItem);

            map.get(SIGN).provideItem(signItem);
            map.get(WALL_SIGN).provideItem(signItem);
            map.get(HANGING_SIGN).provideItem(hangingSignItem);
            map.get(WALL_HANGING_SIGN).provideItem(hangingSignItem);


            DeferredBlockItem<?> log = map.get(LOG);
            DeferredBlockItem<?> wood = map.get(WOOD);
            DeferredBlockItem<?> stripped_log = map.get(STRIPPED_LOG);
            DeferredBlockItem<?> stripped_wood = map.get(STRIPPED_WOOD);

            STRIPPABLES.put(log.getBlock().getId(), () -> stripped_log.getBlock().get().defaultBlockState());
            STRIPPABLES.put(wood.getBlock().getId(), () -> stripped_wood.getBlock().get().defaultBlockState());

            return map;
        }
    }

    public static class SDWoodTypes {
        public static final BlockSetType
            APRICOT_SET = BlockSetType.register(new BlockSetType("apricot")),
            BANANA_SET = BlockSetType.register(new BlockSetType("banana")),
            MANGO_SET = BlockSetType.register(new BlockSetType("mango")),
            ORANGE_SET = BlockSetType.register(new BlockSetType("orange")),
            PEACH_SET = BlockSetType.register(new BlockSetType("peach")),
            APPLE_SET = BlockSetType.register(new BlockSetType("apple")),
            POMEGRANATE_SET = BlockSetType.register(new BlockSetType("pomegranate"));

        public static final WoodType
                APRICOT = register("apricot", APRICOT_SET),
                BANANA = register("banana", BANANA_SET),
                MANGO = register("mango", MANGO_SET),
                ORANGE = register("orange", ORANGE_SET),
                PEACH = register("peach", PEACH_SET),
                APPLE = register("apple", APPLE_SET),
                POMEGRANATE = register("pomegranate", POMEGRANATE_SET);

        public static WoodType[] values() {
            return new WoodType[] {APRICOT, BANANA, MANGO, ORANGE, PEACH, APPLE, POMEGRANATE};
        }

        private static WoodType register(String name, BlockSetType set) {
            WoodType type = new WoodType(name, set);
            WoodType.register(type);

            Sheets.SIGN_MATERIALS.put(type, createSignMaterial(type));
            Sheets.HANGING_SIGN_MATERIALS.put(type, createHangingSignMaterial(type));

            return type;
        }

        private static Material createSignMaterial(WoodType type) {
            return new Material(Sheets.SIGN_SHEET, StardewDelight.modLoc("entity/signs/" + type.name()));
        }

        private static Material createHangingSignMaterial(WoodType type) {
            return new Material(Sheets.SIGN_SHEET, StardewDelight.modLoc("entity/signs/hanging/" + type.name()));
        }
    }
}
