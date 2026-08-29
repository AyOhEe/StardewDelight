package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.SDTags;
import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class SDBlockTagsProvider extends BlockTagsProvider {
    public SDBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, StardewDelight.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        /*----- FRUIT TREE TAGS -----*/
        tag(SDTags.BlockTags.APRICOT_LOGS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get());
        tag(SDTags.BlockTags.BANANA_LOGS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get());
        tag(SDTags.BlockTags.MANGO_LOGS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get());
        tag(SDTags.BlockTags.ORANGE_LOGS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get());
        tag(SDTags.BlockTags.PEACH_LOGS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get());
        tag(SDTags.BlockTags.APPLE_LOGS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get());
        tag(SDTags.BlockTags.POMEGRANATE_LOGS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get());

        /*----- COMMON LOG TAGS -----*/
        tag(BlockTags.LOGS)
                .addTags(
                        SDTags.BlockTags.APRICOT_LOGS,
                        SDTags.BlockTags.BANANA_LOGS,
                        SDTags.BlockTags.MANGO_LOGS,
                        SDTags.BlockTags.ORANGE_LOGS,
                        SDTags.BlockTags.PEACH_LOGS,
                        SDTags.BlockTags.APPLE_LOGS,
                        SDTags.BlockTags.POMEGRANATE_LOGS
                );

        tag(BlockTags.LOGS_THAT_BURN)
                .addTags(
                        SDTags.BlockTags.APRICOT_LOGS,
                        SDTags.BlockTags.BANANA_LOGS,
                        SDTags.BlockTags.MANGO_LOGS,
                        SDTags.BlockTags.ORANGE_LOGS,
                        SDTags.BlockTags.PEACH_LOGS,
                        SDTags.BlockTags.APPLE_LOGS,
                        SDTags.BlockTags.POMEGRANATE_LOGS
                );

        tag(BlockTags.PARROTS_SPAWNABLE_ON)
                .addTags(
                        SDTags.BlockTags.APRICOT_LOGS,
                        SDTags.BlockTags.BANANA_LOGS,
                        SDTags.BlockTags.MANGO_LOGS,
                        SDTags.BlockTags.ORANGE_LOGS,
                        SDTags.BlockTags.PEACH_LOGS,
                        SDTags.BlockTags.APPLE_LOGS,
                        SDTags.BlockTags.POMEGRANATE_LOGS
                );

        tag(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE)
                .addTags(
                        SDTags.BlockTags.APRICOT_LOGS,
                        SDTags.BlockTags.BANANA_LOGS,
                        SDTags.BlockTags.MANGO_LOGS,
                        SDTags.BlockTags.ORANGE_LOGS,
                        SDTags.BlockTags.PEACH_LOGS,
                        SDTags.BlockTags.APPLE_LOGS,
                        SDTags.BlockTags.POMEGRANATE_LOGS
                );

        tag(BlockTags.COMPLETES_FIND_TREE_TUTORIAL)
                .addTags(
                        SDTags.BlockTags.APRICOT_LOGS,
                        SDTags.BlockTags.BANANA_LOGS,
                        SDTags.BlockTags.MANGO_LOGS,
                        SDTags.BlockTags.ORANGE_LOGS,
                        SDTags.BlockTags.PEACH_LOGS,
                        SDTags.BlockTags.APPLE_LOGS,
                        SDTags.BlockTags.POMEGRANATE_LOGS
                );

        tag(BlockTags.MINEABLE_WITH_AXE)
                .addTags(
                        SDTags.BlockTags.APRICOT_LOGS,
                        SDTags.BlockTags.BANANA_LOGS,
                        SDTags.BlockTags.MANGO_LOGS,
                        SDTags.BlockTags.ORANGE_LOGS,
                        SDTags.BlockTags.PEACH_LOGS,
                        SDTags.BlockTags.APPLE_LOGS,
                        SDTags.BlockTags.POMEGRANATE_LOGS
                );

        /*----- LOG BLOCK TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_LOGS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.LOG).getBlock().get());

        tag(BlockTags.OVERWORLD_NATURAL_LOGS).addTag(SDTags.BlockTags.FRUIT_TREE_LOGS);
        tag(BlockTags.SNAPS_GOAT_HORN).addTag(SDTags.BlockTags.FRUIT_TREE_LOGS);


        /*----- WOOD BLOCK TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_WOOD)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get());


        /*----- STRIPPED LOG TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_STRIPPED_LOGS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get());

        tag(Tags.Blocks.STRIPPED_LOGS).addTag(SDTags.BlockTags.FRUIT_TREE_STRIPPED_LOGS);


        /*----- STRIPPED WOOD TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_STRIPPED_WOOD)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get());

        tag(Tags.Blocks.STRIPPED_WOODS).addTag(SDTags.BlockTags.FRUIT_TREE_STRIPPED_WOOD);


        /*----- PLANK TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_PLANKS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_PLANKS);
        tag(BlockTags.PLANKS).addTag(SDTags.BlockTags.FRUIT_TREE_PLANKS);


        /*----- STAIR TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_STAIRS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_STAIRS);
        tag(BlockTags.WOODEN_STAIRS).addTag(SDTags.BlockTags.FRUIT_TREE_STAIRS);
        tag(BlockTags.STAIRS).addTag(SDTags.BlockTags.FRUIT_TREE_STAIRS);


        /*----- SLAB TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_SLABS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_SLABS);
        tag(BlockTags.WOODEN_SLABS).addTag(SDTags.BlockTags.FRUIT_TREE_SLABS);
        tag(BlockTags.SLABS).addTag(SDTags.BlockTags.FRUIT_TREE_SLABS);


        /*----- FENCE TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_FENCES)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get());

        tag(Tags.Blocks.FENCES_WOODEN).addTag(SDTags.BlockTags.FRUIT_TREE_FENCES);
        tag(BlockTags.WOODEN_FENCES).addTag(SDTags.BlockTags.FRUIT_TREE_FENCES);
        tag(Tags.Blocks.FENCES).addTag(SDTags.BlockTags.FRUIT_TREE_FENCES);
        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_FENCES);
        tag(BlockTags.FENCES).addTag(SDTags.BlockTags.FRUIT_TREE_FENCES);


        /*----- FENCE GATE TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get());

        tag(BlockTags.FENCE_GATES).addTag(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES);
        tag(Tags.Blocks.FENCE_GATES_WOODEN).addTag(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES);
        tag(BlockTags.UNSTABLE_BOTTOM_CENTER).addTag(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES);
        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES);
        tag(Tags.Blocks.FENCE_GATES).addTag(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES);


        /*----- DOOR TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_DOORS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get());

        tag(BlockTags.WOODEN_DOORS).addTag(SDTags.BlockTags.FRUIT_TREE_DOORS);
        tag(BlockTags.DOORS).addTag(SDTags.BlockTags.FRUIT_TREE_DOORS);
        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_DOORS);
        tag(BlockTags.MOB_INTERACTABLE_DOORS).addTag(SDTags.BlockTags.FRUIT_TREE_DOORS);


        /*----- TRAPDOOR TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_TRAPDOORS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_TRAPDOORS);
        tag(BlockTags.TRAPDOORS).addTag(SDTags.BlockTags.FRUIT_TREE_TRAPDOORS);
        tag(BlockTags.WOODEN_TRAPDOORS).addTag(SDTags.BlockTags.FRUIT_TREE_TRAPDOORS);


        /*----- PRESSURE PLATE TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES);
        tag(BlockTags.PRESSURE_PLATES).addTag(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES);
        tag(BlockTags.WALL_POST_OVERRIDE).addTag(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES);
        tag(BlockTags.WOODEN_PRESSURE_PLATES).addTag(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES);


        /*----- BUTTON TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_BUTTONS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get());

        tag(BlockTags.WOODEN_BUTTONS).addTag(SDTags.BlockTags.FRUIT_TREE_BUTTONS);
        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_BUTTONS);
        tag(BlockTags.BUTTONS).addTag(SDTags.BlockTags.FRUIT_TREE_BUTTONS);


        /*----- LEAVES TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_LEAVES)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.FRUITING_CHERRY_LEAVES.getBlock().get());

        tag(BlockTags.REPLACEABLE_BY_TREES).addTag(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.PARROTS_SPAWNABLE_ON).addTag(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.MINEABLE_WITH_HOE).addTag(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.SWORD_EFFICIENT).addTag(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE).addTag(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.LEAVES).addTag(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.COMPLETES_FIND_TREE_TUTORIAL).addTag(SDTags.BlockTags.FRUIT_TREE_LEAVES);


        /*----- SIGN TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_SIGNS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get());

        tag(BlockTags.SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_SIGNS);
        tag(BlockTags.WALL_POST_OVERRIDE).addTag(SDTags.BlockTags.FRUIT_TREE_SIGNS);
        tag(BlockTags.ALL_SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_SIGNS);
        tag(BlockTags.STANDING_SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_SIGNS);
        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_SIGNS);


        tag(SDTags.BlockTags.FRUIT_TREE_WALL_SIGNS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get());

        tag(BlockTags.WALL_SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_WALL_SIGNS);
        tag(BlockTags.SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_WALL_SIGNS);
        tag(BlockTags.WALL_POST_OVERRIDE).addTag(SDTags.BlockTags.FRUIT_TREE_WALL_SIGNS);
        tag(BlockTags.ALL_SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_WALL_SIGNS);
        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_WALL_SIGNS);


        /*----- HANGING SIGN TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_HANGING_SIGNS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_HANGING_SIGNS);
        tag(BlockTags.ALL_HANGING_SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_HANGING_SIGNS);
        tag(BlockTags.ALL_SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_HANGING_SIGNS);
        tag(BlockTags.CEILING_HANGING_SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_HANGING_SIGNS);


        tag(SDTags.BlockTags.FRUIT_TREE_WALL_HANGING_SIGNS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_WALL_HANGING_SIGNS);
        tag(BlockTags.WALL_HANGING_SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_WALL_HANGING_SIGNS);
        tag(BlockTags.ALL_HANGING_SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_WALL_HANGING_SIGNS);
        tag(BlockTags.ALL_SIGNS).addTag(SDTags.BlockTags.FRUIT_TREE_WALL_HANGING_SIGNS);


        /*----- CRATE TAGS -----*/
        tag(ModTags.STRAW_BLOCKS).add(SDBlocks.COFFEE_BAG.getBlock().get());
        tag(ModTags.MINEABLE_WITH_KNIFE).add(SDBlocks.COFFEE_BAG.getBlock().get());

        tag(ModTags.CAMPFIRE_SIGNAL_SMOKE).add(SDBlocks.AMARANTH_BALE.getBlock().get());
        tag(BlockTags.MINEABLE_WITH_HOE).add(SDBlocks.AMARANTH_BALE.getBlock().get());

        tag(SDTags.BlockTags.SD_STORAGE_BLOCKS)
                .add(SDBlocks.BLUE_JAZZ_BOX.getBlock().get())
                .add(SDBlocks.CAULIFLOWER_CRATE.getBlock().get())
                .add(SDBlocks.COFFEE_BAG.getBlock().get())
                .add(SDBlocks.GARLIC_CRATE.getBlock().get())
                .add(SDBlocks.GREEN_BEAN_CRATE.getBlock().get())
                .add(SDBlocks.KALE_CRATE.getBlock().get())
                .add(SDBlocks.PARSNIP_CRATE.getBlock().get())
                .add(SDBlocks.RHUBARB_CRATE.getBlock().get())
                .add(SDBlocks.STRAWBERRY_PUNNET_CRATE.getBlock().get())
                .add(SDBlocks.BLUEBERRY_PUNNET_CRATE.getBlock().get())
                .add(SDBlocks.CORN_CRATE.getBlock().get())
                .add(SDBlocks.HOPS_CRATE.getBlock().get())
                .add(SDBlocks.HOT_PEPPER_CRATE.getBlock().get())
                .add(SDBlocks.PINK_MELON_CRATE.getBlock().get())
                .add(SDBlocks.RADISH_CRATE.getBlock().get())
                .add(SDBlocks.RED_CABBAGE_CRATE.getBlock().get())
                .add(SDBlocks.STARFRUIT_CRATE.getBlock().get())
                .add(SDBlocks.SUMMER_SPANGLE_BOX.getBlock().get())
                .add(SDBlocks.AMARANTH_BALE.getBlock().get())
                .add(SDBlocks.ARTICHOKE_CRATE.getBlock().get())
                .add(SDBlocks.BOK_CHOY_CRATE.getBlock().get())
                .add(SDBlocks.BROCCOLI_CRATE.getBlock().get())
                .add(SDBlocks.CRANBERRY_PUNNET_CRATE.getBlock().get())
                .add(SDBlocks.EGGPLANT_CRATE.getBlock().get())
                .add(SDBlocks.FAIRY_ROSE_BOX.getBlock().get())
                .add(SDBlocks.GRAPE_CRATE.getBlock().get())
                .add(SDBlocks.SUGAR_PUMPKIN_CRATE.getBlock().get())
                .add(SDBlocks.YAM_CRATE.getBlock().get())
                .add(SDBlocks.POWDERMELON_CRATE.getBlock().get())
                .add(SDBlocks.ANCIENT_FRUIT_CRATE.getBlock().get())
                .add(SDBlocks.QI_FRUIT_CRATE.getBlock().get())
                .add(SDBlocks.SWEET_GEM_BERRY_CRATE.getBlock().get())
                .add(SDBlocks.PINEAPPLE_CRATE.getBlock().get())
                .add(SDBlocks.TARO_ROOT_CRATE.getBlock().get())
                .add(SDBlocks.TEA_CRATE.getBlock().get())
                .add(SDBlocks.APRICOT_CRATE.getBlock().get())
                .add(SDBlocks.CHERRY_CRATE.getBlock().get())
                .add(SDBlocks.BANANA_CRATE.getBlock().get())
                .add(SDBlocks.MANGO_CRATE.getBlock().get())
                .add(SDBlocks.ORANGE_CRATE.getBlock().get())
                .add(SDBlocks.PEACH_CRATE.getBlock().get())
                .add(SDBlocks.APPLE_CRATE.getBlock().get())
                .add(SDBlocks.POMEGRANATE_CRATE.getBlock().get());

        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(SDTags.BlockTags.SD_STORAGE_BLOCKS);

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(SDBlocks.BLUE_JAZZ_BOX.getBlock().get())
                .add(SDBlocks.CAULIFLOWER_CRATE.getBlock().get())
                .add(SDBlocks.GARLIC_CRATE.getBlock().get())
                .add(SDBlocks.GREEN_BEAN_CRATE.getBlock().get())
                .add(SDBlocks.KALE_CRATE.getBlock().get())
                .add(SDBlocks.PARSNIP_CRATE.getBlock().get())
                .add(SDBlocks.RHUBARB_CRATE.getBlock().get())
                .add(SDBlocks.STRAWBERRY_PUNNET_CRATE.getBlock().get())
                .add(SDBlocks.BLUEBERRY_PUNNET_CRATE.getBlock().get())
                .add(SDBlocks.CORN_CRATE.getBlock().get())
                .add(SDBlocks.HOPS_CRATE.getBlock().get())
                .add(SDBlocks.HOT_PEPPER_CRATE.getBlock().get())
                .add(SDBlocks.PINK_MELON_CRATE.getBlock().get())
                .add(SDBlocks.RADISH_CRATE.getBlock().get())
                .add(SDBlocks.RED_CABBAGE_CRATE.getBlock().get())
                .add(SDBlocks.STARFRUIT_CRATE.getBlock().get())
                .add(SDBlocks.SUMMER_SPANGLE_BOX.getBlock().get())
                .add(SDBlocks.ARTICHOKE_CRATE.getBlock().get())
                .add(SDBlocks.BOK_CHOY_CRATE.getBlock().get())
                .add(SDBlocks.BROCCOLI_CRATE.getBlock().get())
                .add(SDBlocks.CRANBERRY_PUNNET_CRATE.getBlock().get())
                .add(SDBlocks.EGGPLANT_CRATE.getBlock().get())
                .add(SDBlocks.FAIRY_ROSE_BOX.getBlock().get())
                .add(SDBlocks.GRAPE_CRATE.getBlock().get())
                .add(SDBlocks.SUGAR_PUMPKIN_CRATE.getBlock().get())
                .add(SDBlocks.YAM_CRATE.getBlock().get())
                .add(SDBlocks.POWDERMELON_CRATE.getBlock().get())
                .add(SDBlocks.ANCIENT_FRUIT_CRATE.getBlock().get())
                .add(SDBlocks.QI_FRUIT_CRATE.getBlock().get())
                .add(SDBlocks.SWEET_GEM_BERRY_CRATE.getBlock().get())
                .add(SDBlocks.PINEAPPLE_CRATE.getBlock().get())
                .add(SDBlocks.TARO_ROOT_CRATE.getBlock().get())
                .add(SDBlocks.TEA_CRATE.getBlock().get())
                .add(SDBlocks.APRICOT_CRATE.getBlock().get())
                .add(SDBlocks.CHERRY_CRATE.getBlock().get())
                .add(SDBlocks.BANANA_CRATE.getBlock().get())
                .add(SDBlocks.MANGO_CRATE.getBlock().get())
                .add(SDBlocks.ORANGE_CRATE.getBlock().get())
                .add(SDBlocks.PEACH_CRATE.getBlock().get())
                .add(SDBlocks.APPLE_CRATE.getBlock().get())
                .add(SDBlocks.POMEGRANATE_CRATE.getBlock().get());

        tag(SDTags.BlockTags.STORAGE_BLOCKS_BLUE_JAZZ).add(SDBlocks.BLUE_JAZZ_BOX.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_CAULIFLOWER).add(SDBlocks.CAULIFLOWER_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_COFFEE).add(SDBlocks.COFFEE_BAG.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_GARLIC).add(SDBlocks.GARLIC_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_GREEN_BEAN).add(SDBlocks.GREEN_BEAN_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_KALE).add(SDBlocks.KALE_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_PARSNIP).add(SDBlocks.PARSNIP_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_RHUBARB).add(SDBlocks.RHUBARB_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_STRAWBERRY_PUNNET).add(SDBlocks.STRAWBERRY_PUNNET_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_BLUEBERRY_PUNNET).add(SDBlocks.BLUEBERRY_PUNNET_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_CORN).add(SDBlocks.CORN_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_HOPS).add(SDBlocks.HOPS_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_HOT_PEPPER).add(SDBlocks.HOT_PEPPER_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_PINK_MELON).add(SDBlocks.PINK_MELON_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_RADISH).add(SDBlocks.RADISH_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_RED_CABBAGE).add(SDBlocks.RED_CABBAGE_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_STARFRUIT).add(SDBlocks.STARFRUIT_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_SUMMER_SPANGLE).add(SDBlocks.SUMMER_SPANGLE_BOX.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_AMARANTH).add(SDBlocks.AMARANTH_BALE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_ARTICHOKE).add(SDBlocks.ARTICHOKE_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_BOK_CHOY).add(SDBlocks.BOK_CHOY_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_BROCCOLI).add(SDBlocks.BROCCOLI_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_CRANBERRY_PUNNET).add(SDBlocks.CRANBERRY_PUNNET_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_EGGPLANT).add(SDBlocks.EGGPLANT_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_FAIRY_ROSE).add(SDBlocks.FAIRY_ROSE_BOX.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_GRAPE).add(SDBlocks.GRAPE_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_SUGAR_PUMPKIN).add(SDBlocks.SUGAR_PUMPKIN_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_YAM).add(SDBlocks.YAM_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_POWDERMELON).add(SDBlocks.POWDERMELON_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_ANCIENT_FRUIT).add(SDBlocks.ANCIENT_FRUIT_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_QI_FRUIT).add(SDBlocks.QI_FRUIT_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_SWEET_GEM_BERRY).add(SDBlocks.SWEET_GEM_BERRY_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_PINEAPPLE).add(SDBlocks.PINEAPPLE_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_TARO_ROOT).add(SDBlocks.TARO_ROOT_CRATE.getBlock().get());

        tag(SDTags.BlockTags.STORAGE_BLOCKS_TEA).add(SDBlocks.TEA_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_APRICOT).add(SDBlocks.APRICOT_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_CHERRY).add(SDBlocks.CHERRY_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_BANANA).add(SDBlocks.BANANA_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_MANGO).add(SDBlocks.MANGO_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_ORANGE).add(SDBlocks.ORANGE_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_PEACH).add(SDBlocks.PEACH_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_APPLE).add(SDBlocks.APPLE_CRATE.getBlock().get());
        tag(SDTags.BlockTags.STORAGE_BLOCKS_POMEGRANATE).add(SDBlocks.POMEGRANATE_CRATE.getBlock().get());


        /*----- SAPLING TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_SAPLINGS)
                .add(SDBlocks.TEA_SAPLING.getBlock().get())
                .add(SDBlocks.APRICOT_SAPLING.getBlock().get())
                .add(SDBlocks.FRUITING_CHERRY_SAPLING.getBlock().get())
                .add(SDBlocks.BANANA_SAPLING.getBlock().get())
                .add(SDBlocks.MANGO_SAPLING.getBlock().get())
                .add(SDBlocks.ORANGE_SAPLING.getBlock().get())
                .add(SDBlocks.PEACH_SAPLING.getBlock().get())
                .add(SDBlocks.APPLE_SAPLING.getBlock().get())
                .add(SDBlocks.POMEGRANATE_SAPLING.getBlock().get());

        tag(BlockTags.SWORD_EFFICIENT).addTag(SDTags.BlockTags.FRUIT_TREE_SAPLINGS);
        tag(BlockTags.MINEABLE_WITH_AXE).addTag(SDTags.BlockTags.FRUIT_TREE_SAPLINGS);
        tag(BlockTags.SAPLINGS).addTag(SDTags.BlockTags.FRUIT_TREE_SAPLINGS);


        /*----- FLOWER TAGS -----*/
        tag(SDTags.BlockTags.SMALL_FLOWERS)
                .add(SDBlocks.GROWN_BLUE_JAZZ.getBlock().get())
                .add(SDBlocks.GROWN_SUMMER_SPANGLE.getBlock().get());

        tag(BlockTags.SMALL_FLOWERS).addTag(SDTags.BlockTags.SMALL_FLOWERS);
        tag(BlockTags.FLOWERS).addTag(SDTags.BlockTags.SMALL_FLOWERS);
        tag(BlockTags.SWORD_EFFICIENT).addTag(SDTags.BlockTags.SMALL_FLOWERS);
        tag(BlockTags.ENDERMAN_HOLDABLE).addTag(SDTags.BlockTags.SMALL_FLOWERS);


        tag(SDTags.BlockTags.TALL_FLOWERS)
                .add(SDBlocks.GROWN_FAIRY_ROSE.getBlock().get());

        tag(ModTags.UNAFFECTED_BY_RICH_SOIL).addTag(SDTags.BlockTags.TALL_FLOWERS);
        tag(BlockTags.TALL_FLOWERS).addTag(SDTags.BlockTags.TALL_FLOWERS);
        tag(BlockTags.FLOWERS).addTag(SDTags.BlockTags.TALL_FLOWERS);
        tag(BlockTags.SWORD_EFFICIENT).addTag(SDTags.BlockTags.TALL_FLOWERS);
        tag(BlockTags.REPLACEABLE_BY_TREES).addTag(SDTags.BlockTags.TALL_FLOWERS);


        /*----- CROP TAGS -----*/
        tag(SDTags.BlockTags.CROPS)
                .add(SDBlocks.BLUE_JAZZ_CROP.get())
                .add(SDBlocks.CAULIFLOWER_CROP.get())
                .add(SDBlocks.COFFEE_BUSH.get())
                .add(SDBlocks.GARLIC_CROP.get())
                .add(SDBlocks.GREEN_BEANS_CROP.get())
                .add(SDBlocks.KALE_CROP.get())
                .add(SDBlocks.PARSNIP_CROP.get())
                .add(SDBlocks.RHUBARB_CROP.get())
                .add(SDBlocks.STRAWBERRY_BUSH.get())
                .add(SDBlocks.BLUEBERRY_BUSH.get())
                .add(SDBlocks.CORN_CROP.get())
                .add(SDBlocks.HOPS_CROP.get())
                .add(SDBlocks.HOT_PEPPERS_CROP.get())
                .add(SDBlocks.PINK_MELON_CROP.get())
                .add(SDBlocks.RADISH_CROP.get())
                .add(SDBlocks.RED_CABBAGE_CROP.get())
                .add(SDBlocks.STARFRUIT_CROP.get())
                .add(SDBlocks.SUMMER_SPANGLE_CROP.get())
                .add(SDBlocks.SUMMER_SQUASH_CROP.get())
                .add(SDBlocks.AMARANTH_CROP.get())
                .add(SDBlocks.ARTICHOKE_CROP.get())
                .add(SDBlocks.BOK_CHOY_CROP.get())
                .add(SDBlocks.BROCCOLI_CROP.get())
                .add(SDBlocks.CRANBERRY_BUSH.get())
                .add(SDBlocks.EGGPLANT_CROP.get())
                .add(SDBlocks.FAIRY_ROSE_CROP.get())
                .add(SDBlocks.GRAPES_CROP.get())
                .add(SDBlocks.SUGAR_PUMPKIN_CROP.get())
                .add(SDBlocks.YAM_CROP.get())
                .add(SDBlocks.POWDERMELON_CROP.get())
                .add(SDBlocks.ANCIENT_FRUIT_CROP.get())
                .add(SDBlocks.QI_FRUIT_CROP.get())
                .add(SDBlocks.SWEET_GEM_BERRY_CROP.get())
                .add(SDBlocks.PINEAPPLE_CROP.get())
                .add(SDBlocks.TARO_ROOT_CROP.get());

        tag(BlockTags.SWORD_EFFICIENT).addTag(SDTags.BlockTags.CROPS);
        tag(BlockTags.BEE_GROWABLES).addTag(SDTags.BlockTags.CROPS);
        tag(BlockTags.MAINTAINS_FARMLAND).addTag(SDTags.BlockTags.CROPS);
        tag(BlockTags.CROPS).addTag(SDTags.BlockTags.CROPS);


        /*----- WILD CROPS -----*/
        tag(SDTags.BlockTags.SD_WILD_CROPS)
                .add(SDBlocks.CAULIFLOWER_CROP_WILD.getBlock().get())
                .add(SDBlocks.COFFEE_BUSH_WILD.getBlock().get())
                .add(SDBlocks.GARLIC_CROP_WILD.getBlock().get())
                .add(SDBlocks.GREEN_BEANS_CROP_WILD.getBlock().get())
                .add(SDBlocks.KALE_CROP_WILD.getBlock().get())
                .add(SDBlocks.PARSNIP_CROP_WILD.getBlock().get())
                .add(SDBlocks.RHUBARB_CROP_WILD.getBlock().get())
                .add(SDBlocks.STRAWBERRY_BUSH_WILD.getBlock().get())
                .add(SDBlocks.BLUEBERRY_BUSH_WILD.getBlock().get())
                .add(SDBlocks.CORN_CROP_WILD.getBlock().get())
                .add(SDBlocks.HOPS_CROP_WILD.getBlock().get())
                .add(SDBlocks.HOT_PEPPERS_CROP_WILD.getBlock().get())
                .add(SDBlocks.PINK_MELON_CROP_WILD.getBlock().get())
                .add(SDBlocks.RADISH_CROP_WILD.getBlock().get())
                .add(SDBlocks.RED_CABBAGE_CROP_WILD.getBlock().get())
                .add(SDBlocks.STARFRUIT_CROP_WILD.getBlock().get())
                .add(SDBlocks.SUMMER_SQUASH_CROP_WILD.getBlock().get())
                .add(SDBlocks.AMARANTH_CROP_WILD.getBlock().get())
                .add(SDBlocks.ARTICHOKE_CROP_WILD.getBlock().get())
                .add(SDBlocks.BOK_CHOY_CROP_WILD.getBlock().get())
                .add(SDBlocks.BROCCOLI_CROP_WILD.getBlock().get())
                .add(SDBlocks.CRANBERRY_BUSH_WILD.getBlock().get())
                .add(SDBlocks.EGGPLANT_CROP_WILD.getBlock().get())
                .add(SDBlocks.GRAPES_CROP_WILD.getBlock().get())
                .add(SDBlocks.SUGAR_PUMPKIN_CROP_WILD.getBlock().get())
                .add(SDBlocks.YAM_CROP_WILD.getBlock().get())
                .add(SDBlocks.POWDERMELON_CROP_WILD.getBlock().get())
                .add(SDBlocks.PINEAPPLE_CROP_WILD.getBlock().get())
                .add(SDBlocks.TARO_ROOT_CROP_WILD.getBlock().get());

        tag(BlockTags.SWORD_EFFICIENT).addTag(SDTags.BlockTags.SD_WILD_CROPS);
        tag(BlockTags.FLOWERS).addTag(SDTags.BlockTags.SD_WILD_CROPS);
        tag(ModTags.UNAFFECTED_BY_RICH_SOIL).addTag(SDTags.BlockTags.SD_WILD_CROPS);
        tag(BlockTags.ENDERMAN_HOLDABLE).addTag(SDTags.BlockTags.SD_WILD_CROPS);
        tag(BlockTags.SMALL_FLOWERS).addTag(SDTags.BlockTags.SD_WILD_CROPS);
        tag(ModTags.WILD_CROPS).addTag(SDTags.BlockTags.SD_WILD_CROPS);
    }
}
