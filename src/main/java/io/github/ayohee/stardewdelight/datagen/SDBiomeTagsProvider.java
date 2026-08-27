package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.SDTags;
import io.github.ayohee.stardewdelight.StardewDelight;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class SDBiomeTagsProvider extends BiomeTagsProvider {
    public SDBiomeTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, StardewDelight.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(SDTags.BiomeTags.FRUIT_TREE_FOREST_SPAWNS)
                .addTag(BiomeTags.IS_FOREST)
                .addTag(BiomeTags.IS_JUNGLE);

        tag(SDTags.BiomeTags.FRUIT_TREE_PLAINS_SPAWNS)
                .addTag(BiomeTags.IS_HILL)
                .addTag(BiomeTags.HAS_VILLAGE_PLAINS);
    }
}
