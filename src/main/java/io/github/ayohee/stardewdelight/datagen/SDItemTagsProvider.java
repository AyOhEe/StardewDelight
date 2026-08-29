package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.SDTags;
import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class SDItemTagsProvider extends ItemTagsProvider {
    public SDItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTagProvider, StardewDelight.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        /*----- FRUIT TREE TAGS -----*/
        this.copy(SDTags.BlockTags.APRICOT_LOGS, SDTags.ItemTags.APRICOT_LOGS);
        this.copy(SDTags.BlockTags.BANANA_LOGS, SDTags.ItemTags.BANANA_LOGS);
        this.copy(SDTags.BlockTags.MANGO_LOGS, SDTags.ItemTags.MANGO_LOGS);
        this.copy(SDTags.BlockTags.ORANGE_LOGS, SDTags.ItemTags.ORANGE_LOGS);
        this.copy(SDTags.BlockTags.PEACH_LOGS, SDTags.ItemTags.PEACH_LOGS);
        this.copy(SDTags.BlockTags.APPLE_LOGS, SDTags.ItemTags.APPLE_LOGS);
        this.copy(SDTags.BlockTags.POMEGRANATE_LOGS, SDTags.ItemTags.POMEGRANATE_LOGS);


        /*----- COMMON LOG TAGS -----*/
        tag(ItemTags.LOGS).addTags(
                SDTags.ItemTags.APRICOT_LOGS,
                SDTags.ItemTags.BANANA_LOGS,
                SDTags.ItemTags.MANGO_LOGS,
                SDTags.ItemTags.ORANGE_LOGS,
                SDTags.ItemTags.PEACH_LOGS,
                SDTags.ItemTags.APPLE_LOGS,
                SDTags.ItemTags.POMEGRANATE_LOGS
        );

        tag(ItemTags.LOGS_THAT_BURN).addTags(
                SDTags.ItemTags.APRICOT_LOGS,
                SDTags.ItemTags.BANANA_LOGS,
                SDTags.ItemTags.MANGO_LOGS,
                SDTags.ItemTags.ORANGE_LOGS,
                SDTags.ItemTags.PEACH_LOGS,
                SDTags.ItemTags.APPLE_LOGS,
                SDTags.ItemTags.POMEGRANATE_LOGS
        );

        tag(ItemTags.COMPLETES_FIND_TREE_TUTORIAL).addTags(
                SDTags.ItemTags.APRICOT_LOGS,
                SDTags.ItemTags.BANANA_LOGS,
                SDTags.ItemTags.MANGO_LOGS,
                SDTags.ItemTags.ORANGE_LOGS,
                SDTags.ItemTags.PEACH_LOGS,
                SDTags.ItemTags.APPLE_LOGS,
                SDTags.ItemTags.POMEGRANATE_LOGS
        );


        /*----- LOG BLOCK TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_LOGS, SDTags.ItemTags.FRUIT_TREE_LOGS);


        /*----- WOOD BLOCK TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_WOOD, SDTags.ItemTags.FRUIT_TREE_WOOD);


        /*----- STRIPPED LOG TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_STRIPPED_LOGS, SDTags.ItemTags.FRUIT_TREE_STRIPPED_LOGS);

        tag(Tags.Items.STRIPPED_LOGS).addTag(SDTags.ItemTags.FRUIT_TREE_STRIPPED_LOGS);


        /*----- STRIPPED WOOD TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_STRIPPED_WOOD, SDTags.ItemTags.FRUIT_TREE_STRIPPED_WOOD);

        tag(Tags.Items.STRIPPED_WOODS).addTag(SDTags.ItemTags.FRUIT_TREE_STRIPPED_WOOD);


        /*----- PLANK TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_PLANKS, SDTags.ItemTags.FRUIT_TREE_PLANKS);

        tag(ItemTags.PLANKS).addTag(SDTags.ItemTags.FRUIT_TREE_PLANKS);


        /*----- STAIR TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_STAIRS, SDTags.ItemTags.FRUIT_TREE_STAIRS);

        tag(ItemTags.STAIRS).addTag(SDTags.ItemTags.FRUIT_TREE_STAIRS);
        tag(ItemTags.WOODEN_STAIRS).addTag(SDTags.ItemTags.FRUIT_TREE_STAIRS);


        /*----- SLAB TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_SLABS, SDTags.ItemTags.FRUIT_TREE_SLABS);

        tag(ItemTags.SLABS).addTag(SDTags.ItemTags.FRUIT_TREE_SLABS);
        tag(ItemTags.WOODEN_SLABS).addTag(SDTags.ItemTags.FRUIT_TREE_SLABS);


        /*----- FENCE TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_FENCES, SDTags.ItemTags.FRUIT_TREE_FENCES);

        tag(ItemTags.FENCES).addTag(SDTags.ItemTags.FRUIT_TREE_FENCES);
        tag(ItemTags.WOODEN_FENCES).addTag(SDTags.ItemTags.FRUIT_TREE_FENCES);
        tag(Tags.Items.FENCES).addTag(SDTags.ItemTags.FRUIT_TREE_FENCES);
        tag(Tags.Items.FENCES_WOODEN).addTag(SDTags.ItemTags.FRUIT_TREE_FENCES);


        /*----- FENCE GATE TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES, SDTags.ItemTags.FRUIT_TREE_FENCE_GATES);

        tag(ItemTags.FENCE_GATES).addTag(SDTags.ItemTags.FRUIT_TREE_FENCE_GATES);
        tag(Tags.Items.FENCE_GATES).addTag(SDTags.ItemTags.FRUIT_TREE_FENCE_GATES);
        tag(Tags.Items.FENCE_GATES_WOODEN).addTag(SDTags.ItemTags.FRUIT_TREE_FENCE_GATES);


        /*----- DOOR TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_DOORS, SDTags.ItemTags.FRUIT_TREE_DOORS);

        tag(ItemTags.DOORS).addTag(SDTags.ItemTags.FRUIT_TREE_DOORS);
        tag(ItemTags.WOODEN_DOORS).addTag(SDTags.ItemTags.FRUIT_TREE_DOORS);


        /*----- TRAPDOOR TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_TRAPDOORS, SDTags.ItemTags.FRUIT_TREE_TRAPDOORS);

        tag(ItemTags.TRAPDOORS).addTag(SDTags.ItemTags.FRUIT_TREE_TRAPDOORS);
        tag(ItemTags.WOODEN_TRAPDOORS).addTag(SDTags.ItemTags.FRUIT_TREE_TRAPDOORS);


        /*----- PRESSURE PLATE TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES, SDTags.ItemTags.FRUIT_TREE_PRESSURE_PLATES);

        tag(ItemTags.WOODEN_PRESSURE_PLATES).addTag(SDTags.ItemTags.FRUIT_TREE_PRESSURE_PLATES);


        /*----- BUTTON TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_BUTTONS, SDTags.ItemTags.FRUIT_TREE_BUTTONS);

        tag(ItemTags.BUTTONS).addTag(SDTags.ItemTags.FRUIT_TREE_BUTTONS);
        tag(ItemTags.WOODEN_BUTTONS).addTag(SDTags.ItemTags.FRUIT_TREE_BUTTONS);


        /*----- LEAVES TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_LEAVES, SDTags.ItemTags.FRUIT_TREE_LEAVES);

        tag(ItemTags.COMPLETES_FIND_TREE_TUTORIAL).addTag(SDTags.ItemTags.FRUIT_TREE_LEAVES);


        /*----- SIGN TAGS -----*/
        tag(SDTags.ItemTags.FRUIT_TREE_SIGNS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.SIGN).getItem().get());

        tag(ItemTags.SIGNS).addTag(SDTags.ItemTags.FRUIT_TREE_SIGNS);


        /*----- HANGING SIGN TAGS -----*/
        tag(SDTags.ItemTags.FRUIT_TREE_HANGING_SIGNS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getItem().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getItem().get());

        tag(ItemTags.HANGING_SIGNS).addTag(SDTags.ItemTags.FRUIT_TREE_HANGING_SIGNS);


        /*----- SAPLING TAGS -----*/
        copy(SDTags.BlockTags.FRUIT_TREE_SAPLINGS, SDTags.ItemTags.FRUIT_TREE_SAPLINGS);

        tag(ItemTags.SAPLINGS).addTag(SDTags.ItemTags.FRUIT_TREE_SAPLINGS);


        /*----- FLOWER ITEM TAGS -----*/
        copy(SDTags.BlockTags.SMALL_FLOWERS, SDTags.ItemTags.SMALL_FLOWERS);
        copy(SDTags.BlockTags.TALL_FLOWERS, SDTags.ItemTags.TALL_FLOWERS);

        tag(ItemTags.SMALL_FLOWERS).addTag(SDTags.ItemTags.SMALL_FLOWERS);
        tag(ItemTags.FLOWERS).addTag(SDTags.ItemTags.SMALL_FLOWERS);
        tag(ItemTags.BEE_FOOD).addTag(SDTags.ItemTags.SMALL_FLOWERS);
        tag(Tags.Items.ANIMAL_FOODS).addTag(SDTags.ItemTags.SMALL_FLOWERS);

        tag(ItemTags.TALL_FLOWERS).addTag(SDTags.ItemTags.TALL_FLOWERS);
        tag(ItemTags.FLOWERS).addTag(SDTags.ItemTags.TALL_FLOWERS);
        tag(ItemTags.BEE_FOOD).addTag(SDTags.ItemTags.TALL_FLOWERS);
        tag(Tags.Items.ANIMAL_FOODS).addTag(SDTags.ItemTags.TALL_FLOWERS);


        /*----- CRATE TAGS -----*/
        copy(SDTags.BlockTags.SD_STORAGE_BLOCKS, SDTags.ItemTags.SD_STORAGE_BLOCKS);

        tag(Tags.Items.STORAGE_BLOCKS).addTag(SDTags.ItemTags.SD_STORAGE_BLOCKS);

        tag(SDTags.ItemTags.STORAGE_BLOCKS_BLUE_JAZZ).add(SDBlocks.BLUE_JAZZ_BOX.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_CAULIFLOWER).add(SDBlocks.CAULIFLOWER_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_COFFEE).add(SDBlocks.COFFEE_BAG.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_GARLIC).add(SDBlocks.GARLIC_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_GREEN_BEAN).add(SDBlocks.GREEN_BEAN_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_KALE).add(SDBlocks.KALE_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_PARSNIP).add(SDBlocks.PARSNIP_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_RHUBARB).add(SDBlocks.RHUBARB_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_STRAWBERRY_PUNNET).add(SDBlocks.STRAWBERRY_PUNNET_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_BLUEBERRY_PUNNET).add(SDBlocks.BLUEBERRY_PUNNET_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_CORN).add(SDBlocks.CORN_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_HOPS).add(SDBlocks.HOPS_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_HOT_PEPPER).add(SDBlocks.HOT_PEPPER_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_PINK_MELON).add(SDBlocks.PINK_MELON_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_RADISH).add(SDBlocks.RADISH_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_RED_CABBAGE).add(SDBlocks.RED_CABBAGE_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_STARFRUIT).add(SDBlocks.STARFRUIT_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_SUMMER_SPANGLE).add(SDBlocks.SUMMER_SPANGLE_BOX.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_AMARANTH).add(SDBlocks.AMARANTH_BALE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_ARTICHOKE).add(SDBlocks.ARTICHOKE_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_BOK_CHOY).add(SDBlocks.BOK_CHOY_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_BROCCOLI).add(SDBlocks.BROCCOLI_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_CRANBERRY_PUNNET).add(SDBlocks.CRANBERRY_PUNNET_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_EGGPLANT).add(SDBlocks.EGGPLANT_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_FAIRY_ROSE).add(SDBlocks.FAIRY_ROSE_BOX.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_GRAPE).add(SDBlocks.GRAPE_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_SUGAR_PUMPKIN).add(SDBlocks.SUGAR_PUMPKIN_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_YAM).add(SDBlocks.YAM_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_POWDERMELON).add(SDBlocks.POWDERMELON_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_ANCIENT_FRUIT).add(SDBlocks.ANCIENT_FRUIT_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_QI_FRUIT).add(SDBlocks.QI_FRUIT_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_SWEET_GEM_BERRY).add(SDBlocks.SWEET_GEM_BERRY_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_PINEAPPLE).add(SDBlocks.PINEAPPLE_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_TARO_ROOT).add(SDBlocks.TARO_ROOT_CRATE.getItem().get());

        tag(SDTags.ItemTags.STORAGE_BLOCKS_TEA).add(SDBlocks.TEA_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_APRICOT).add(SDBlocks.APRICOT_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_CHERRY).add(SDBlocks.CHERRY_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_BANANA).add(SDBlocks.BANANA_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_MANGO).add(SDBlocks.MANGO_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_ORANGE).add(SDBlocks.ORANGE_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_PEACH).add(SDBlocks.PEACH_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_APPLE).add(SDBlocks.APPLE_CRATE.getItem().get());
        tag(SDTags.ItemTags.STORAGE_BLOCKS_POMEGRANATE).add(SDBlocks.POMEGRANATE_CRATE.getItem().get());


        /*----- SEED TAGS -----*/
        tag(SDTags.ItemTags.SD_SEEDS)
                .add(SDItems.JAZZ_SEEDS.asItem())
                .add(SDItems.CAULIFLOWER_SEEDS.asItem())
                .add(SDItems.COFFEE_BEAN.asItem())
                .add(SDItems.GARLIC_SEEDS.asItem())
                .add(SDItems.BEAN_STARTER.asItem())
                .add(SDItems.KALE_SEEDS.asItem())
                .add(SDItems.PARSNIP_SEEDS.asItem())
                .add(SDItems.RHUBARB_SEEDS.asItem())
                .add(SDItems.STRAWBERRY_SEEDS.asItem())
                .add(SDItems.BLUEBERRY_SEEDS.asItem())
                .add(SDItems.CORN_SEEDS.asItem())
                .add(SDItems.HOPS_STARTER.asItem())
                .add(SDItems.PEPPER_SEEDS.asItem())
                .add(SDItems.PINK_MELON_SEEDS.asItem())
                .add(SDItems.RADISH_SEEDS.asItem())
                .add(SDItems.RED_CABBAGE_SEEDS.asItem())
                .add(SDItems.STARFRUIT_SEEDS.asItem())
                .add(SDItems.SPANGLE_SEEDS.asItem())
                .add(SDItems.SUMMER_SQUASH_SEEDS.asItem())
                .add(SDItems.AMARANTH_SEEDS.asItem())
                .add(SDItems.ARTICHOKE_SEEDS.asItem())
                .add(SDItems.BOK_CHOY_SEEDS.asItem())
                .add(SDItems.BROCCOLI_SEEDS.asItem())
                .add(SDItems.CRANBERRY_SEEDS.asItem())
                .add(SDItems.EGGPLANT_SEEDS.asItem())
                .add(SDItems.FAIRY_SEEDS.asItem())
                .add(SDItems.GRAPE_STARTER.asItem())
                .add(SDItems.SUGAR_PUMPKIN_SEEDS.asItem())
                .add(SDItems.YAM_SEEDS.asItem())
                .add(SDItems.POWDERMELON_SEEDS.asItem())
                .add(SDItems.ANCIENT_SEEDS.asItem())
                .add(SDItems.QI_BEAN.asItem())
                .add(SDItems.RARE_SEED.asItem())
                .add(SDItems.PINEAPPLE_SEEDS.asItem())
                .add(SDItems.TARO_TUBER.asItem());


        tag(Tags.Items.SEEDS).addTag(SDTags.ItemTags.SD_SEEDS);
        tag(ItemTags.VILLAGER_PLANTABLE_SEEDS).addTag(SDTags.ItemTags.SD_SEEDS);


        /*----- CROP ITEM TAGS -----*/
        tag(SDTags.ItemTags.SD_CROPS)
                .add(SDItems.CAULIFLOWER.asItem())
                .add(SDItems.COFFEE_BEAN.asItem()) // Not a food
                .add(SDItems.GARLIC.asItem())
                .add(SDItems.GREEN_BEAN.asItem())
                .add(SDItems.KALE.asItem())
                .add(SDItems.PARSNIP.asItem())
                .add(SDItems.RHUBARB.asItem()) // Not a food
                .add(SDItems.STRAWBERRY.asItem())
                .add(SDItems.BLUEBERRY.asItem())
                .add(SDItems.CORN.asItem())
                .add(SDItems.HOPS.asItem()) // Not a food
                .add(SDItems.HOT_PEPPER.asItem())
                .add(SDItems.PINK_MELON.asItem())
                .add(SDItems.RADISH.asItem())
                .add(SDItems.RED_CABBAGE.asItem())
                .add(SDItems.STARFRUIT.asItem())
                .add(SDItems.SUMMER_SQUASH.asItem())
                .add(SDItems.AMARANTH.asItem()) // Not a food
                .add(SDItems.ARTICHOKE.asItem())
                .add(SDItems.BOK_CHOY.asItem())
                .add(SDItems.BROCCOLI.asItem())
                .add(SDItems.CRANBERRY.asItem())
                .add(SDItems.EGGPLANT.asItem())
                .add(SDItems.GRAPES.asItem())
                .add(SDItems.SUGAR_PUMPKIN.asItem()) // Not a food
                .add(SDItems.YAM.asItem())
                .add(SDItems.POWDERMELON.asItem())
                .add(SDItems.ANCIENT_FRUIT.asItem()) // Not a food
                .add(SDItems.QI_FRUIT.asItem()) // Not a food
                .add(SDItems.SWEET_GEM_BERRY.asItem()) // Not a food
                .add(SDItems.PINEAPPLE.asItem())
                .add(SDItems.TARO_ROOT.asItem());

        tag(Tags.Items.CROPS).addTag(SDTags.ItemTags.SD_CROPS);


        tag(SDTags.ItemTags.CROP_CAULIFLOWER).add(SDItems.CAULIFLOWER.asItem());
        tag(SDTags.ItemTags.CROP_GREEN_BEAN).add(SDItems.GREEN_BEAN.asItem());
        tag(SDTags.ItemTags.CROP_GARLIC).add(SDItems.GARLIC.asItem());
        tag(SDTags.ItemTags.CROP_COFFEE).add(SDItems.COFFEE_BEAN.asItem());
        tag(SDTags.ItemTags.CROP_KALE).add(SDItems.KALE.asItem());
        tag(SDTags.ItemTags.CROP_PARSNIP).add(SDItems.PARSNIP.asItem());
        tag(SDTags.ItemTags.CROP_RHUBARB).add(SDItems.RHUBARB.asItem());
        tag(SDTags.ItemTags.CROP_STRAWBERRY).add(SDItems.STRAWBERRY.asItem());
        tag(SDTags.ItemTags.CROP_BLUEBERRY).add(SDItems.BLUEBERRY.asItem());
        tag(SDTags.ItemTags.CROP_CORN).add(SDItems.CORN.asItem());
        tag(SDTags.ItemTags.CROP_HOPS).add(SDItems.HOPS.asItem());
        tag(SDTags.ItemTags.CROP_HOT_PEPPER).add(SDItems.HOT_PEPPER.asItem());
        tag(SDTags.ItemTags.CROP_CHILLI_PEPPER).add(SDItems.HOT_PEPPER.asItem());
        tag(SDTags.ItemTags.CROP_PINK_MELON).add(SDItems.PINK_MELON.asItem());
        tag(SDTags.ItemTags.CROP_RADISH).add(SDItems.RADISH.asItem());
        tag(SDTags.ItemTags.CROP_RED_CABBAGE).add(SDItems.RED_CABBAGE.asItem());
        tag(SDTags.ItemTags.CROP_STARFRUIT).add(SDItems.STARFRUIT.asItem());
        tag(SDTags.ItemTags.CROP_SQUASH).add(SDItems.SUMMER_SQUASH.asItem());
        tag(SDTags.ItemTags.CROP_AMARANTH).add(SDItems.AMARANTH.asItem());
        tag(SDTags.ItemTags.CROP_ARTICHOKE).add(SDItems.ARTICHOKE.asItem());
        tag(SDTags.ItemTags.CROP_BOK_CHOY).add(SDItems.BOK_CHOY.asItem());
        tag(SDTags.ItemTags.CROP_BROCCOLI).add(SDItems.BROCCOLI.asItem());
        tag(SDTags.ItemTags.CROP_CRANBERRY).add(SDItems.CRANBERRY.asItem());
        tag(SDTags.ItemTags.CROP_EGGPLANT).add(SDItems.EGGPLANT.asItem());
        tag(SDTags.ItemTags.CROP_GRAPES).add(SDItems.GRAPES.asItem());
        tag(SDTags.ItemTags.CROP_SUGAR_PUMPKIN).add(SDItems.SUGAR_PUMPKIN.asItem());
        tag(SDTags.ItemTags.CROP_YAM).add(SDItems.YAM.asItem());
        tag(SDTags.ItemTags.CROP_POWDERMELON).add(SDItems.POWDERMELON.asItem());
        tag(SDTags.ItemTags.CROP_ANCIENT_FRUIT).add(SDItems.ANCIENT_FRUIT.asItem());
        tag(SDTags.ItemTags.CROP_QI_FRUIT).add(SDItems.QI_FRUIT.asItem());
        tag(SDTags.ItemTags.CROP_SWEET_GEM_BERRY).add(SDItems.SWEET_GEM_BERRY.asItem());
        tag(SDTags.ItemTags.CROP_PINEAPPLE).add(SDItems.PINEAPPLE.asItem());
        tag(SDTags.ItemTags.CROP_TARO_ROOT).add(SDItems.TARO_ROOT.asItem());
        tag(SDTags.ItemTags.CROP_TARO).add(SDItems.TARO_ROOT.asItem());

        tag(SDTags.ItemTags.CROP_TEA).add(SDItems.TEA_LEAVES.asItem());
        tag(SDTags.ItemTags.CROP_APRICOT).add(SDItems.APRICOT.asItem());
        tag(SDTags.ItemTags.CROP_CHERRY).add(SDItems.CHERRY.asItem());
        tag(SDTags.ItemTags.CROP_BANANA).add(SDItems.BANANA.asItem());
        tag(SDTags.ItemTags.CROP_MANGO).add(SDItems.MANGO.asItem());
        tag(SDTags.ItemTags.CROP_ORANGE).add(SDItems.ORANGE.asItem());
        tag(SDTags.ItemTags.CROP_PEACH).add(SDItems.PEACH.asItem());
        tag(SDTags.ItemTags.CROP_POMEGRANATE).add(SDItems.POMEGRANATE.asItem());


        tag(SDTags.ItemTags.SD_FOODS_BERRY)
                .add(SDItems.STRAWBERRY.asItem())
                .add(SDItems.BLUEBERRY.asItem())
                .add(SDItems.CRANBERRY.asItem());
        tag(SDTags.ItemTags.SD_FOODS_FRUIT)
                .add(SDItems.PINK_MELON.asItem())
                .add(SDItems.STARFRUIT.asItem())
                .add(SDItems.GRAPES.asItem())
                .add(SDItems.POWDERMELON.asItem())
                .add(SDItems.PINEAPPLE.asItem())
                .add(SDItems.APRICOT.asItem())
                .add(SDItems.CHERRY.asItem())
                .add(SDItems.BANANA.asItem())
                .add(SDItems.MANGO.asItem())
                .add(SDItems.ORANGE.asItem())
                .add(SDItems.PEACH.asItem())
                .add(SDItems.POMEGRANATE.asItem());
        tag(SDTags.ItemTags.SD_FOODS_VEGETABLE)
                .add(SDItems.CAULIFLOWER.asItem())
                .add(SDItems.GARLIC.asItem())
                .add(SDItems.GREEN_BEAN.asItem())
                .add(SDItems.KALE.asItem())
                .add(SDItems.PARSNIP.asItem())
                .add(SDItems.CORN.asItem())
                .add(SDItems.HOT_PEPPER.asItem())
                .add(SDItems.RADISH.asItem())
                .add(SDItems.RED_CABBAGE.asItem())
                .add(SDItems.SUMMER_SQUASH.asItem())
                .add(SDItems.ARTICHOKE.asItem())
                .add(SDItems.BOK_CHOY.asItem())
                .add(SDItems.BROCCOLI.asItem())
                .add(SDItems.EGGPLANT.asItem())
                .add(SDItems.YAM.asItem())
                .add(SDItems.TARO_ROOT.asItem());

        tag(SDTags.ItemTags.SD_FOODS)
                .addTag(SDTags.ItemTags.SD_FOODS_BERRY)
                .addTag(SDTags.ItemTags.SD_FOODS_FRUIT)
                .addTag(SDTags.ItemTags.SD_FOODS_VEGETABLE);

        tag(Tags.Items.FOODS).addTag(SDTags.ItemTags.SD_FOODS);
        tag(Tags.Items.FOODS_BERRY).addTag(SDTags.ItemTags.SD_FOODS_BERRY);
        tag(Tags.Items.FOODS_FRUIT).addTag(SDTags.ItemTags.SD_FOODS_FRUIT);
        tag(Tags.Items.FOODS_VEGETABLE).addTag(SDTags.ItemTags.SD_FOODS_VEGETABLE);


        tag(SDTags.ItemTags.FOOD_STRAWBERRY).add(SDItems.STRAWBERRY.asItem());
        tag(SDTags.ItemTags.FOOD_BLUEBERRY).add(SDItems.BLUEBERRY.asItem());
        tag(SDTags.ItemTags.FOOD_CRANBERRY).add(SDItems.CRANBERRY.asItem());
        tag(SDTags.ItemTags.FOOD_PINK_MELON).add(SDItems.PINK_MELON.asItem());
        tag(SDTags.ItemTags.FOOD_STARFRUIT).add(SDItems.STARFRUIT.asItem());
        tag(SDTags.ItemTags.FOOD_GRAPES).add(SDItems.GRAPES.asItem());
        tag(SDTags.ItemTags.FOOD_POWDERMELON).add(SDItems.POWDERMELON.asItem());
        tag(SDTags.ItemTags.FOOD_PINEAPPLE).add(SDItems.PINEAPPLE.asItem());
        tag(SDTags.ItemTags.FOOD_CAULIFLOWER).add(SDItems.CAULIFLOWER.asItem());
        tag(SDTags.ItemTags.FOOD_GARLIC).add(SDItems.GARLIC.asItem());
        tag(SDTags.ItemTags.FOOD_GREEN_BEAN).add(SDItems.GREEN_BEAN.asItem());
        tag(SDTags.ItemTags.FOOD_KALE).add(SDItems.KALE.asItem());
        tag(SDTags.ItemTags.FOOD_PARSNIP).add(SDItems.PARSNIP.asItem());
        tag(SDTags.ItemTags.FOOD_CORN).add(SDItems.CORN.asItem());
        tag(SDTags.ItemTags.FOOD_HOT_PEPPER).add(SDItems.HOT_PEPPER.asItem());
        tag(SDTags.ItemTags.FOOD_CHILLI_PEPPER).add(SDItems.HOT_PEPPER.asItem());
        tag(SDTags.ItemTags.FOOD_RADISH).add(SDItems.RADISH.asItem());
        tag(SDTags.ItemTags.FOOD_RED_CABBAGE).add(SDItems.RED_CABBAGE.asItem());
        tag(SDTags.ItemTags.FOOD_SQUASH).add(SDItems.SUMMER_SQUASH.asItem());
        tag(SDTags.ItemTags.FOOD_ARTICHOKE).add(SDItems.ARTICHOKE.asItem());
        tag(SDTags.ItemTags.FOOD_BOK_CHOY).add(SDItems.BOK_CHOY.asItem());
        tag(SDTags.ItemTags.FOOD_BROCCOLI).add(SDItems.BROCCOLI.asItem());
        tag(SDTags.ItemTags.FOOD_EGGPLANT).add(SDItems.EGGPLANT.asItem());
        tag(SDTags.ItemTags.FOOD_YAM).add(SDItems.YAM.asItem());
        tag(SDTags.ItemTags.FOOD_TARO_ROOT).add(SDItems.TARO_ROOT.asItem());
        tag(SDTags.ItemTags.FOOD_TARO).add(SDItems.TARO_ROOT.asItem());

        tag(SDTags.ItemTags.FOOD_TEA).add(SDItems.TEA_LEAVES.asItem());
        tag(SDTags.ItemTags.FOOD_APRICOT).add(SDItems.APRICOT.asItem());
        tag(SDTags.ItemTags.FOOD_CHERRY).add(SDItems.CHERRY.asItem());
        tag(SDTags.ItemTags.FOOD_BANANA).add(SDItems.BANANA.asItem());
        tag(SDTags.ItemTags.FOOD_MANGO).add(SDItems.MANGO.asItem());
        tag(SDTags.ItemTags.FOOD_ORANGE).add(SDItems.ORANGE.asItem());
        tag(SDTags.ItemTags.FOOD_PEACH).add(SDItems.PEACH.asItem());
        tag(SDTags.ItemTags.FOOD_POMEGRANATE).add(SDItems.POMEGRANATE.asItem());


        /*----- SEED PACKET OPTIONS -----*/
        // Explicitly excluded:
        // - Ancient seeds
        // - Qi bean
        // - Rare seed
        tag(SDTags.ItemTags.SEED_PACKET_OPTIONS)
                .add(SDItems.JAZZ_SEEDS.asItem())
                .add(SDItems.CAULIFLOWER_SEEDS.asItem())
                .add(SDItems.COFFEE_BEAN.asItem())
                .add(SDItems.GARLIC_SEEDS.asItem())
                .add(SDItems.BEAN_STARTER.asItem())
                .add(SDItems.KALE_SEEDS.asItem())
                .add(SDItems.PARSNIP_SEEDS.asItem())
                .add(SDItems.RHUBARB_SEEDS.asItem())
                .add(SDItems.STRAWBERRY_SEEDS.asItem())
                .add(SDItems.BLUEBERRY_SEEDS.asItem())
                .add(SDItems.CORN_SEEDS.asItem())
                .add(SDItems.HOPS_STARTER.asItem())
                .add(SDItems.PEPPER_SEEDS.asItem())
                .add(SDItems.PINK_MELON_SEEDS.asItem())
                .add(SDItems.RADISH_SEEDS.asItem())
                .add(SDItems.RED_CABBAGE_SEEDS.asItem())
                .add(SDItems.STARFRUIT_SEEDS.asItem())
                .add(SDItems.SPANGLE_SEEDS.asItem())
                .add(SDItems.SUMMER_SQUASH_SEEDS.asItem())
                .add(SDItems.AMARANTH_SEEDS.asItem())
                .add(SDItems.ARTICHOKE_SEEDS.asItem())
                .add(SDItems.BOK_CHOY_SEEDS.asItem())
                .add(SDItems.BROCCOLI_SEEDS.asItem())
                .add(SDItems.CRANBERRY_SEEDS.asItem())
                .add(SDItems.EGGPLANT_SEEDS.asItem())
                .add(SDItems.FAIRY_SEEDS.asItem())
                .add(SDItems.GRAPE_STARTER.asItem())
                .add(SDItems.SUGAR_PUMPKIN_SEEDS.asItem())
                .add(SDItems.YAM_SEEDS.asItem())
                .add(SDItems.POWDERMELON_SEEDS.asItem())
                .add(SDItems.PINEAPPLE_SEEDS.asItem())
                .add(SDItems.TARO_TUBER.asItem())
                .add(ModItems.CABBAGE_SEEDS.get())
                .add(ModItems.TOMATO_SEEDS.get())
                .add(ModItems.ONION.get())
                .add(ModItems.RICE.get())
                .add(Items.MELON_SEEDS)
                .add(Items.PUMPKIN_SEEDS)
                .add(Items.BEETROOT_SEEDS);


        /*----- WILD CROPS -----*/
        copy(SDTags.BlockTags.SD_WILD_CROPS, SDTags.ItemTags.SD_WILD_CROPS);

        tag(ItemTags.SMALL_FLOWERS).addTag(SDTags.ItemTags.SD_WILD_CROPS);
        tag(ItemTags.BEE_FOOD).addTag(SDTags.ItemTags.SD_WILD_CROPS);
        tag(ModTags.WILD_CROPS_ITEM).addTag(SDTags.ItemTags.SD_WILD_CROPS);
        tag(Tags.Items.ANIMAL_FOODS).addTag(SDTags.ItemTags.SD_WILD_CROPS);
        tag(ItemTags.FLOWERS).addTag(SDTags.ItemTags.SD_WILD_CROPS);
    }
}
