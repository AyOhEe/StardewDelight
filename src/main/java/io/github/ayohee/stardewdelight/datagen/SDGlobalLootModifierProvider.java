package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.SDLootTables;
import io.github.ayohee.stardewdelight.StardewDelight;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.predicates.AnyOfCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.AddTableLootModifier;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class SDGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public SDGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, StardewDelight.MODID);
    }

    @Override
    protected void start() {
        add(
                "add_ancient_seed",
                new AddTableLootModifier(
                        new LootItemCondition[]{
                                AnyOfCondition.anyOf(
                                        LootTableIdCondition.builder(BuiltInLootTables.ABANDONED_MINESHAFT.location()),
                                        LootTableIdCondition.builder(BuiltInLootTables.DESERT_PYRAMID.location()),
                                        LootTableIdCondition.builder(BuiltInLootTables.JUNGLE_TEMPLE.location()),
                                        LootTableIdCondition.builder(BuiltInLootTables.STRONGHOLD_CORRIDOR.location()),
                                        LootTableIdCondition.builder(BuiltInLootTables.STRONGHOLD_CROSSING.location())
                                ).build()
                        },
                        SDLootTables.PARTIAL_ANCIENT_SEED
                )
        );

        add(
                "add_seeds_or_produce",
                new AddTableLootModifier(
                        new LootItemCondition[]{
                                AnyOfCondition.anyOf(
                                        LootTableIdCondition.builder(BuiltInLootTables.VILLAGE_PLAINS_HOUSE.location()),
                                        LootTableIdCondition.builder(BuiltInLootTables.VILLAGE_SNOWY_HOUSE.location()),
                                        LootTableIdCondition.builder(BuiltInLootTables.VILLAGE_TAIGA_HOUSE.location()),
                                        LootTableIdCondition.builder(BuiltInLootTables.VILLAGE_DESERT_HOUSE.location()),
                                        LootTableIdCondition.builder(BuiltInLootTables.VILLAGE_SAVANNA_HOUSE.location())
                                ).build()
                        },
                        SDLootTables.PARTIAL_SEEDS_OR_PRODUCE
                )
        );
    }
}
