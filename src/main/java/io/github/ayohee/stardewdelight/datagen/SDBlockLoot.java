package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.HashSet;
import java.util.Set;

public class SDBlockLoot extends BlockLootSubProvider {
    private final Set<Block> generatedLootTables = new HashSet();

    public SDBlockLoot(HolderLookup.Provider holder) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), holder);
    }

    @Override
    protected void generate() {
        for (DeferredBlock<? extends Block> b : SDBlocks.CRATES) {
            dropSelf(b.get());
        }
        for (DeferredBlock<? extends Block> b : SDBlocks.SAPLINGS) {
            dropSelf(b.get());
        }
    }

    protected void add(Block block, LootTable.Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    protected Iterable<Block> getKnownBlocks() {
        return this.generatedLootTables;
    }
}
