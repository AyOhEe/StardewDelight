package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.SDLootTables;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProviders;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

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
        output.accept(
                SDLootTables.PARTIAL_SEEDS_OR_PRODUCE,
                LootTable.lootTable().withPool(
                        LootPool.lootPool().setRolls(UniformGenerator.between(3, 6))
                                .add(produceChance(SDItems.JAZZ_SEEDS, 0.75f, SDBlocks.GROWN_BLUE_JAZZ))
                                .add(produceChance(SDItems.CAULIFLOWER_SEEDS, 0.75f, SDItems.CAULIFLOWER))
                                .add(LootItem.lootTableItem(SDItems.COFFEE_BEAN))
                                .add(produceChance(SDItems.GARLIC_SEEDS, 0.75f, SDItems.GARLIC))
                                .add(produceChance(SDItems.BEAN_STARTER, 0.75f, SDItems.GREEN_BEAN))
                                .add(produceChance(SDItems.KALE_SEEDS, 0.75f, SDItems.KALE))
                                .add(produceChance(SDItems.PARSNIP_SEEDS, 0.75f, SDItems.PARSNIP))
                                .add(produceChance(SDItems.RHUBARB_SEEDS, 0.75f, SDItems.RHUBARB))
                                .add(produceChance(SDItems.STRAWBERRY_SEEDS, 0.75f, SDItems.STRAWBERRY))
                                .add(produceChance(SDItems.BLUEBERRY_SEEDS, 0.75f, SDItems.BLUEBERRY))
                                .add(produceChance(SDItems.CORN_SEEDS, 0.75f, SDItems.CORN))
                                .add(produceChance(SDItems.HOPS_STARTER, 0.75f, SDItems.HOPS))
                                .add(produceChance(SDItems.PEPPER_SEEDS, 0.75f, SDItems.HOT_PEPPER))
                                .add(produceChance(SDItems.PINK_MELON_SEEDS, 0.75f, SDItems.PINK_MELON))
                                .add(produceChance(SDItems.RADISH_SEEDS, 0.75f, SDItems.RADISH))
                                .add(produceChance(SDItems.RED_CABBAGE_SEEDS, 0.75f, SDItems.RED_CABBAGE))
                                .add(produceChance(SDItems.STARFRUIT_SEEDS, 0.75f, SDItems.STARFRUIT))
                                .add(produceChance(SDItems.SPANGLE_SEEDS, 0.75f, SDBlocks.GROWN_SUMMER_SPANGLE))
                                .add(produceChance(SDItems.SUMMER_SQUASH_SEEDS, 0.75f, SDItems.SUMMER_SQUASH))
                                .add(produceChance(SDItems.AMARANTH_SEEDS, 0.75f, SDItems.AMARANTH))
                                .add(produceChance(SDItems.ARTICHOKE_SEEDS, 0.75f, SDItems.ARTICHOKE))
                                .add(produceChance(SDItems.BOK_CHOY_SEEDS, 0.75f, SDItems.BOK_CHOY))
                                .add(produceChance(SDItems.BROCCOLI_SEEDS, 0.75f, SDItems.BROCCOLI))
                                .add(produceChance(SDItems.CRANBERRY_SEEDS, 0.75f, SDItems.CRANBERRY))
                                .add(produceChance(SDItems.EGGPLANT_SEEDS, 0.75f, SDItems.EGGPLANT))
                                .add(produceChance(SDItems.FAIRY_SEEDS, 0.75f, SDBlocks.GROWN_FAIRY_ROSE))
                                .add(produceChance(SDItems.GRAPE_STARTER, 0.75f, SDItems.GRAPES))
                                .add(produceChance(SDItems.SUGAR_PUMPKIN_SEEDS, 0.75f, SDItems.SUGAR_PUMPKIN))
                                .add(produceChance(SDItems.YAM_SEEDS, 0.75f, SDItems.YAM))
                                .add(produceChance(SDItems.POWDERMELON_SEEDS, 0.75f, SDItems.POWDERMELON))
                                .add(produceChance(SDItems.PINEAPPLE_SEEDS, 0.75f, SDItems.PINEAPPLE))
                                .add(produceChance(SDItems.TARO_TUBER, 0.75f, SDItems.TARO_ROOT))
                )
        );
        output.accept(
                SDLootTables.PARTIAL_SEED_PACKET,
                LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool().add(LootItem.lootTableItem(SDItems.SEED_PACKET))
                                        .setRolls(UniformGenerator.between(0, 2))
                        )
        );
    }

    private static AlternativesEntry.Builder produceChance(ItemLike seeds, float chance, ItemLike produce) {
        return AlternativesEntry.alternatives(
                LootItem.lootTableItem(seeds).when(LootItemRandomChanceCondition.randomChance(chance)),
                LootItem.lootTableItem(produce)
        );
    }
}
