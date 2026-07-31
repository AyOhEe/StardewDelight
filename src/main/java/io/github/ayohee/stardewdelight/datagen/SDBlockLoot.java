package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.content.blocks.crops.*;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
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

        dropSelf(SDBlocks.GROWN_BLUE_JAZZ.getBlock().get());
        dropSelf(SDBlocks.GROWN_SUMMER_SPANGLE.getBlock().get());
        add(SDBlocks.GROWN_FAIRY_ROSE.getBlock().get(), createSinglePropConditionTable(SDBlocks.GROWN_FAIRY_ROSE.getBlock().get(), BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));


        dropOther(SDBlocks.BLUE_JAZZ_CROP.get(), SDItems.JAZZ_SEEDS);
        dropOther(SDBlocks.SUMMER_SPANGLE_CROP.get(), SDItems.SPANGLE_SEEDS);
        add(SDBlocks.FAIRY_ROSE_CROP.get(), createSinglePropConditionTable(SDItems.FAIRY_SEEDS, BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));

        // TODO some of these should drop bigger stacks
        stardewCropDrops(SDBlocks.GARLIC_CROP.get(), SDItems.GARLIC.asItem(), SDItems.GARLIC_SEEDS.asItem());
        stardewCropDrops(SDBlocks.PARSNIP_CROP.get(), SDItems.PARSNIP.asItem(), SDItems.PARSNIP_SEEDS.asItem());
        stardewCropDrops(SDBlocks.RADISH_CROP.get(), SDItems.RADISH.asItem(), SDItems.RADISH_SEEDS.asItem());
        stardewCropDrops(SDBlocks.RHUBARB_CROP.get(), SDItems.RHUBARB.asItem(), SDItems.RHUBARB_SEEDS.asItem());
        stardewCropDrops(SDBlocks.YAM_CROP.get(), SDItems.YAM.asItem(), SDItems.YAM_SEEDS.asItem());
        stardewCropDrops(SDBlocks.KALE_CROP.get(), SDItems.KALE.asItem(), SDItems.KALE_SEEDS.asItem());
        stardewCropDrops(SDBlocks.CAULIFLOWER_CROP.get(), SDItems.CAULIFLOWER.asItem(), SDItems.CAULIFLOWER_SEEDS.asItem());
        stardewCropDrops(SDBlocks.RED_CABBAGE_CROP.get(), SDItems.RED_CABBAGE.asItem(), SDItems.RED_CABBAGE_SEEDS.asItem());
        stardewCropDrops(SDBlocks.BOK_CHOY_CROP.get(), SDItems.BOK_CHOY.asItem(), SDItems.BOK_CHOY_SEEDS.asItem());
        stardewCropDrops(SDBlocks.TARO_ROOT_CROP.get(), SDItems.TARO_ROOT.asItem(), SDItems.TARO_TUBER.asItem());

        tallCropDrops(SDBlocks.AMARANTH_CROP.get(), SDItems.AMARANTH.asItem(), SDItems.AMARANTH_SEEDS.asItem());

        bushCropDrops(SDBlocks.STRAWBERRY_BUSH.get(), SDItems.STRAWBERRY.asItem(), SDItems.STRAWBERRY_SEEDS.asItem());
        bushCropDrops(SDBlocks.BROCCOLI_CROP.get(), SDItems.BROCCOLI.asItem(), SDItems.BROCCOLI_SEEDS.asItem());
        bushCropDrops(SDBlocks.EGGPLANT_CROP.get(), SDItems.EGGPLANT.asItem(), SDItems.EGGPLANT_SEEDS.asItem());
        bushCropDrops(SDBlocks.PINEAPPLE_CROP.get(), SDItems.PINEAPPLE.asItem(), SDItems.PINEAPPLE_SEEDS.asItem());
        bushCropDrops(SDBlocks.BLUEBERRY_BUSH.get(), SDItems.BLUEBERRY.asItem(), SDItems.BLUEBERRY_SEEDS.asItem());
        bushCropDrops(SDBlocks.HOT_PEPPERS_CROP.get(), SDItems.HOT_PEPPER.asItem(), SDItems.PEPPER_SEEDS.asItem());
        bushCropDrops(SDBlocks.SUMMER_SQUASH_CROP.get(), SDItems.SUMMER_SQUASH.asItem(), SDItems.SUMMER_SQUASH_SEEDS.asItem());

        tallBushCropDrops(SDBlocks.COFFEE_BUSH.get(), SDItems.COFFEE_BEAN.asItem(), SDItems.COFFEE_BEAN.asItem());
        tallBushCropDrops(SDBlocks.CRANBERRY_BUSH.get(), SDItems.CRANBERRY.asItem(), SDItems.CRANBERRY_SEEDS.asItem());

        tallUpperBushCropDrops(SDBlocks.CORN_CROP.get(), SDItems.CORN.asItem(), SDItems.CORN_SEEDS.asItem());
        tallUpperBushCropDrops(SDBlocks.ANCIENT_FRUIT_CROP.get(), SDItems.ANCIENT_FRUIT.asItem(), SDItems.ANCIENT_SEEDS.asItem());
    }

    protected void add(Block block, LootTable.Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    private void stardewCropDrops(BaseCropBlock crop, Item item, Item seed) {
        add(crop, createCropDrops(crop, item, seed, LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(crop.getAgeProperty(), crop.getMaxAge()))));
    }

    private void bushCropDrops(BushCropBlock crop, Item item, Item seed) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        LootItemCondition.Builder isMature = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(crop.getAgeProperty(), crop.getMaxAge()));
        LootTable.Builder table = LootTable.lootTable()
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(isMature)).setRolls(ConstantValue.exactly(crop.getBaseDrops())))
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(isMature)).setRolls(ConstantValue.exactly(crop.getBonusDrops())).when(LootItemRandomChanceCondition.randomChance(0.5f)))
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(seed).when(isMature).apply(ApplyBonusCount.addBonusBinomialDistributionCount(registrylookup.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))).add(LootItem.lootTableItem(seed)));
        add(crop, this.applyExplosionDecay(crop, table));
    }


    private void tallCropDrops(BaseCropBlock crop, Item item, Item seed) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        LootItemCondition.Builder isMature = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(crop.getAgeProperty(), crop.getMaxAge()).hasProperty(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));
        LootItemCondition.Builder isLower = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));
        LootTable.Builder table = LootTable.lootTable()
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(isMature)))
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(seed).when(isMature).apply(ApplyBonusCount.addBonusBinomialDistributionCount(registrylookup.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))).add(LootItem.lootTableItem(seed).when(isLower)));
        add(crop, this.applyExplosionDecay(crop, table));
    }


    private void tallBushCropDrops(TallBushCropBlock crop, Item item, Item seed) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        LootItemCondition.Builder isMature = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(crop.getAgeProperty(), crop.getMaxAge()));
        LootItemCondition.Builder isMatureAndLower = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(crop.getAgeProperty(), crop.getMaxAge()).hasProperty(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));
        LootItemCondition.Builder isLower = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));
        LootTable.Builder table = LootTable.lootTable()
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(isMature)).setRolls(ConstantValue.exactly(crop.getBaseDrops())))
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(isMature)).setRolls(ConstantValue.exactly(crop.getBonusDrops())).when(LootItemRandomChanceCondition.randomChance(0.5f)))
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(seed).when(isMatureAndLower).apply(ApplyBonusCount.addBonusBinomialDistributionCount(registrylookup.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))).add(LootItem.lootTableItem(seed).when(isLower)));
        add(crop, this.applyExplosionDecay(crop, table));
    }

    private void tallUpperBushCropDrops(TallUpperBushCropBlock crop, Item item, Item seed) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        LootItemCondition.Builder isMatureAndUpper = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(crop.getAgeProperty(), crop.getMaxAge()).hasProperty(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER));
        LootItemCondition.Builder isMatureAndLower = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(crop.getAgeProperty(), crop.getMaxAge()).hasProperty(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));
        LootItemCondition.Builder isLower = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));
        LootTable.Builder table = LootTable.lootTable()
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(isMatureAndUpper)).setRolls(ConstantValue.exactly(crop.getBaseDrops())))
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(isMatureAndUpper)).setRolls(ConstantValue.exactly(crop.getBonusDrops())).when(LootItemRandomChanceCondition.randomChance(0.5f)))
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(seed).when(isMatureAndLower).apply(ApplyBonusCount.addBonusBinomialDistributionCount(registrylookup.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))).add(LootItem.lootTableItem(seed).when(isLower)));
        add(crop, this.applyExplosionDecay(crop, table));
    }

    private <T extends Comparable<T> & StringRepresentable> LootTable.Builder createSinglePropConditionTable(ItemLike drop, Property<T> property, T value) {
        return LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(drop).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(SDBlocks.FAIRY_ROSE_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(property, value)))));
    }

    protected Iterable<Block> getKnownBlocks() {
        return this.generatedLootTables;
    }
}
