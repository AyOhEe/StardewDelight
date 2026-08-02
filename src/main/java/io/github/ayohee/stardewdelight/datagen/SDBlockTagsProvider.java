package io.github.ayohee.stardewdelight.datagen;

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
