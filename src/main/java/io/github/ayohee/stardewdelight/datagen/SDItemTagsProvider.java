package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.SDTags;
import io.github.ayohee.stardewdelight.StardewDelight;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class SDItemTagsProvider extends ItemTagsProvider {
    public SDItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTagProvider, StardewDelight.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.copy(SDTags.BlockTags.APRICOT_LOGS, SDTags.ItemTags.APRICOT_LOGS);
        this.copy(SDTags.BlockTags.BANANA_LOGS, SDTags.ItemTags.BANANA_LOGS);
        this.copy(SDTags.BlockTags.MANGO_LOGS, SDTags.ItemTags.MANGO_LOGS);
        this.copy(SDTags.BlockTags.ORANGE_LOGS, SDTags.ItemTags.ORANGE_LOGS);
        this.copy(SDTags.BlockTags.PEACH_LOGS, SDTags.ItemTags.PEACH_LOGS);
        this.copy(SDTags.BlockTags.APPLE_LOGS, SDTags.ItemTags.APPLE_LOGS);
        this.copy(SDTags.BlockTags.POMEGRANATE_LOGS, SDTags.ItemTags.POMEGRANATE_LOGS);
    }
}
