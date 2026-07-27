package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.content.blocks.crops.BaseCropBlock;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
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

        stardewCropDrops(SDBlocks.GARLIC_CROP.get(), SDItems.GARLIC.asItem(), SDItems.GARLIC_SEEDS.asItem());
        stardewCropDrops(SDBlocks.PARSNIP_CROP.get(), SDItems.PARSNIP.asItem(), SDItems.PARSNIP_SEEDS.asItem());
        stardewCropDrops(SDBlocks.RADISH_CROP.get(), SDItems.RADISH.asItem(), SDItems.RADISH_SEEDS.asItem());
        stardewCropDrops(SDBlocks.RHUBARB_CROP.get(), SDItems.RHUBARB.asItem(), SDItems.RHUBARB_SEEDS.asItem());
        stardewCropDrops(SDBlocks.YAM_CROP.get(), SDItems.YAM.asItem(), SDItems.YAM_SEEDS.asItem());
    }

    protected void add(Block block, LootTable.Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    private <B extends BaseCropBlock> void stardewCropDrops(B crop, Item item, Item seed) {
        add(crop, createCropDrops(crop, item, seed, LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(crop.getAgeProperty(), crop.getMaxAge()))));
    }

    protected Iterable<Block> getKnownBlocks() {
        return this.generatedLootTables;
    }
}
