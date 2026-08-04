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
import net.neoforged.neoforge.common.data.internal.NeoForgeBlockTagsProvider;
import org.jetbrains.annotations.Nullable;

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

        tag(BlockTags.OVERWORLD_NATURAL_LOGS).addTags(SDTags.BlockTags.FRUIT_TREE_LOGS);
        tag(BlockTags.SNAPS_GOAT_HORN).addTags(SDTags.BlockTags.FRUIT_TREE_LOGS);


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

        tag(Tags.Blocks.STRIPPED_LOGS).addTags(SDTags.BlockTags.FRUIT_TREE_STRIPPED_LOGS);


        /*----- STRIPPED WOOD TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_STRIPPED_WOOD)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get());

        tag(Tags.Blocks.STRIPPED_WOODS).addTags(SDTags.BlockTags.FRUIT_TREE_STRIPPED_WOOD);


        /*----- PLANK TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_PLANKS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTags(SDTags.BlockTags.FRUIT_TREE_PLANKS);
        tag(BlockTags.PLANKS).addTags(SDTags.BlockTags.FRUIT_TREE_PLANKS);


        /*----- STAIR TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_STAIRS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTags(SDTags.BlockTags.FRUIT_TREE_STAIRS);
        tag(BlockTags.WOODEN_STAIRS).addTags(SDTags.BlockTags.FRUIT_TREE_STAIRS);
        tag(BlockTags.STAIRS).addTags(SDTags.BlockTags.FRUIT_TREE_STAIRS);


        /*----- SLAB TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_SLABS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTags(SDTags.BlockTags.FRUIT_TREE_SLABS);
        tag(BlockTags.WOODEN_SLABS).addTags(SDTags.BlockTags.FRUIT_TREE_SLABS);
        tag(BlockTags.SLABS).addTags(SDTags.BlockTags.FRUIT_TREE_SLABS);


        /*----- FENCE TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_FENCES)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get());

        tag(Tags.Blocks.FENCES_WOODEN).addTags(SDTags.BlockTags.FRUIT_TREE_FENCES);
        tag(BlockTags.WOODEN_FENCES).addTags(SDTags.BlockTags.FRUIT_TREE_FENCES);
        tag(Tags.Blocks.FENCES).addTags(SDTags.BlockTags.FRUIT_TREE_FENCES);
        tag(BlockTags.MINEABLE_WITH_AXE).addTags(SDTags.BlockTags.FRUIT_TREE_FENCES);
        tag(BlockTags.FENCES).addTags(SDTags.BlockTags.FRUIT_TREE_FENCES);


        /*----- FENCE GATE TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get());

        tag(BlockTags.FENCE_GATES).addTags(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES);
        tag(Tags.Blocks.FENCE_GATES_WOODEN).addTags(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES);
        tag(BlockTags.UNSTABLE_BOTTOM_CENTER).addTags(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES);
        tag(BlockTags.MINEABLE_WITH_AXE).addTags(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES);
        tag(Tags.Blocks.FENCE_GATES).addTags(SDTags.BlockTags.FRUIT_TREE_FENCE_GATES);


        /*----- DOOR TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_DOORS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get());

        tag(BlockTags.WOODEN_DOORS).addTags(SDTags.BlockTags.FRUIT_TREE_DOORS);
        tag(BlockTags.DOORS).addTags(SDTags.BlockTags.FRUIT_TREE_DOORS);
        tag(BlockTags.MINEABLE_WITH_AXE).addTags(SDTags.BlockTags.FRUIT_TREE_DOORS);
        tag(BlockTags.MOB_INTERACTABLE_DOORS).addTags(SDTags.BlockTags.FRUIT_TREE_DOORS);


        /*----- TRAPDOOR TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_TRAPDOORS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTags(SDTags.BlockTags.FRUIT_TREE_TRAPDOORS);
        tag(BlockTags.TRAPDOORS).addTags(SDTags.BlockTags.FRUIT_TREE_TRAPDOORS);
        tag(BlockTags.WOODEN_TRAPDOORS).addTags(SDTags.BlockTags.FRUIT_TREE_TRAPDOORS);


        /*----- PRESSURE PLATE TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get());

        tag(BlockTags.MINEABLE_WITH_AXE).addTags(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES);
        tag(BlockTags.PRESSURE_PLATES).addTags(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES);
        tag(BlockTags.WALL_POST_OVERRIDE).addTags(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES);
        tag(BlockTags.WOODEN_PRESSURE_PLATES).addTags(SDTags.BlockTags.FRUIT_TREE_PRESSURE_PLATES);


        /*----- BUTTON TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_BUTTONS)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get());

        tag(BlockTags.WOODEN_BUTTONS).addTags(SDTags.BlockTags.FRUIT_TREE_BUTTONS);
        tag(BlockTags.MINEABLE_WITH_AXE).addTags(SDTags.BlockTags.FRUIT_TREE_BUTTONS);
        tag(BlockTags.BUTTONS).addTags(SDTags.BlockTags.FRUIT_TREE_BUTTONS);


        /*----- LEAVES TAGS -----*/
        tag(SDTags.BlockTags.FRUIT_TREE_LEAVES)
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get())
                .add(SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get());

        tag(BlockTags.REPLACEABLE_BY_TREES).addTags(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.PARROTS_SPAWNABLE_ON).addTags(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.MINEABLE_WITH_HOE).addTags(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.SWORD_EFFICIENT).addTags(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE).addTags(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.LEAVES).addTags(SDTags.BlockTags.FRUIT_TREE_LEAVES);
        tag(BlockTags.COMPLETES_FIND_TREE_TUTORIAL).addTags(SDTags.BlockTags.FRUIT_TREE_LEAVES);
    }
}
