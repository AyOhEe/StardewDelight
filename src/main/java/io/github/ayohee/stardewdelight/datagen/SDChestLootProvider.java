package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.SDLootTables;
import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;

import java.util.function.BiConsumer;

public class SDChestLootProvider implements LootTableSubProvider {
    private final HolderLookup.Provider registries;

    public SDChestLootProvider(HolderLookup.Provider registries) {
        this.registries = registries;
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> output) {
        output.accept(
                SDLootTables.PARTIAL_ANCIENT_SEED,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool().add(LootItem.lootTableItem(SDItems.ANCIENT_SEED)).when(LootItemRandomChanceCondition.randomChance(0.3f)))
        );
    }
}
