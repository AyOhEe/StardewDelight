package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.content.blocks.crops.BaseCropBlock;
import io.github.ayohee.stardewdelight.content.blocks.crops.BushCropBlock;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditions;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
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
        dropOther(SDBlocks.FAIRY_ROSE_CROP.get(), SDItems.FAIRY_SEEDS);

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
        stardewCropDrops(SDBlocks.AMARANTH_CROP.get(), SDItems.AMARANTH.asItem(), SDItems.AMARANTH_SEEDS.asItem());

        bushCropDrops(SDBlocks.STRAWBERRY_BUSH.get(), SDItems.STRAWBERRY.asItem(), SDItems.STRAWBERRY_SEEDS.asItem());
        bushCropDrops(SDBlocks.BROCCOLI_CROP.get(), SDItems.BROCCOLI.asItem(), SDItems.BROCCOLI_SEEDS.asItem());
        bushCropDrops(SDBlocks.EGGPLANT_CROP.get(), SDItems.EGGPLANT.asItem(), SDItems.EGGPLANT_SEEDS.asItem());
        bushCropDrops(SDBlocks.PINEAPPLE_CROP.get(), SDItems.PINEAPPLE.asItem(), SDItems.PINEAPPLE_SEEDS.asItem());
    }

    protected void add(Block block, LootTable.Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    private <B extends BaseCropBlock> void stardewCropDrops(B crop, Item item, Item seed) {
        add(crop, createCropDrops(crop, item, seed, LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(crop.getAgeProperty(), crop.getMaxAge()))));
    }

    private <B extends BushCropBlock> void bushCropDrops(B crop, Item item, Item seed) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        LootItemCondition.Builder isMature = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(crop.getAgeProperty(), crop.getMaxAge()));
        LootTable.Builder table = LootTable.lootTable()
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(isMature)).setRolls(ConstantValue.exactly(crop.getBaseDrops())))
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(item).when(isMature)).setRolls(ConstantValue.exactly(crop.getBonusDrops())).when(LootItemRandomChanceCondition.randomChance(0.5f)))
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(seed).when(isMature).apply(ApplyBonusCount.addBonusBinomialDistributionCount(registrylookup.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))).add(LootItem.lootTableItem(seed)));
        add(crop, this.applyExplosionDecay(crop, table));
    }

    protected Iterable<Block> getKnownBlocks() {
        return this.generatedLootTables;
    }
}
