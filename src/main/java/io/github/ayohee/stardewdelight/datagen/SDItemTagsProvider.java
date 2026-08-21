package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.SDTags;
import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class SDItemTagsProvider extends ItemTagsProvider {
    public SDItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTagProvider, StardewDelight.MODID, existingFileHelper);
    }


    // TODO FINISH
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


        /*----- LOG BLOCK TAGS -----*/
        /*----- WOOD BLOCK TAGS -----*/
        /*----- STRIPPED LOG TAGS -----*/
        /*----- STRIPPED WOOD TAGS -----*/
        /*----- PLANK TAGS -----*/
        /*----- STAIR TAGS -----*/
        /*----- SLAB TAGS -----*/
        /*----- FENCE TAGS -----*/
        /*----- FENCE GATE TAGS -----*/
        /*----- DOOR TAGS -----*/
        /*----- TRAPDOOR TAGS -----*/
        /*----- PRESSURE PLATE TAGS -----*/
        /*----- BUTTON TAGS -----*/
        /*----- LEAVES TAGS -----*/




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


        /*----- SEED TAGS -----*/


        /*----- CROP ITEM TAGS -----*/


    }
}
