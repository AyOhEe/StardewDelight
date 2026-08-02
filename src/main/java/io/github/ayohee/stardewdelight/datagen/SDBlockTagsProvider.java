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

import java.util.concurrent.CompletableFuture;

public class SDBlockTagsProvider extends BlockTagsProvider {
    public SDBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, StardewDelight.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
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


        tag(BlockTags.FENCES)
                .addAll(SDBlocks.WOOD_BLOCKS.values().stream().map(m -> m.get(SDBlocks.WoodBlockTypes.FENCE).getBlock().getKey()).toList());

        tag(BlockTags.WOODEN_FENCES)
                .addAll(SDBlocks.WOOD_BLOCKS.values().stream().map(m -> m.get(SDBlocks.WoodBlockTypes.FENCE).getBlock().getKey()).toList());

        tag(Tags.Blocks.FENCES)
                .addAll(SDBlocks.WOOD_BLOCKS.values().stream().map(m -> m.get(SDBlocks.WoodBlockTypes.FENCE).getBlock().getKey()).toList());

        tag(Tags.Blocks.FENCES_WOODEN)
                .addAll(SDBlocks.WOOD_BLOCKS.values().stream().map(m -> m.get(SDBlocks.WoodBlockTypes.FENCE).getBlock().getKey()).toList());

        tag(BlockTags.FENCE_GATES)
                .addAll(SDBlocks.WOOD_BLOCKS.values().stream().map(m -> m.get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().getKey()).toList());

        tag(Tags.Blocks.FENCE_GATES)
                .addAll(SDBlocks.WOOD_BLOCKS.values().stream().map(m -> m.get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().getKey()).toList());

        tag(Tags.Blocks.FENCE_GATES_WOODEN)
                .addAll(SDBlocks.WOOD_BLOCKS.values().stream().map(m -> m.get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().getKey()).toList());

        tag(BlockTags.UNSTABLE_BOTTOM_CENTER)
                .addAll(SDBlocks.WOOD_BLOCKS.values().stream().map(m -> m.get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().getKey()).toList());
    }
}
