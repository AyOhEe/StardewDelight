package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.SDTags;
import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import io.github.ayohee.stardewdelight.register.SDItems;
import io.github.ayohee.stardewdelight.register.lib.DeferredBlockItem;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.properties.WoodType;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class SDRecipeProvider extends RecipeProvider {
    public SDRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.MISC, SDBlocks.GROWN_BLUE_JAZZ.getItem(), RecipeCategory.BUILDING_BLOCKS, SDBlocks.BLUE_JAZZ_BOX.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.CAULIFLOWER, RecipeCategory.BUILDING_BLOCKS, SDBlocks.CAULIFLOWER_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.COFFEE_BEAN, RecipeCategory.BUILDING_BLOCKS, SDBlocks.COFFEE_BAG.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.GARLIC, RecipeCategory.BUILDING_BLOCKS, SDBlocks.GARLIC_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.GREEN_BEAN, RecipeCategory.BUILDING_BLOCKS, SDBlocks.GREEN_BEAN_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.KALE, RecipeCategory.BUILDING_BLOCKS, SDBlocks.KALE_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.PARSNIP, RecipeCategory.BUILDING_BLOCKS, SDBlocks.PARSNIP_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.RHUBARB, RecipeCategory.BUILDING_BLOCKS, SDBlocks.RHUBARB_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.STRAWBERRY_PUNNET, RecipeCategory.BUILDING_BLOCKS, SDBlocks.STRAWBERRY_PUNNET_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.BLUEBERRY_PUNNET, RecipeCategory.BUILDING_BLOCKS, SDBlocks.BLUEBERRY_PUNNET_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.CORN, RecipeCategory.BUILDING_BLOCKS, SDBlocks.CORN_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.HOPS, RecipeCategory.BUILDING_BLOCKS, SDBlocks.HOPS_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.HOT_PEPPER, RecipeCategory.BUILDING_BLOCKS, SDBlocks.HOT_PEPPER_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.PINK_MELON, RecipeCategory.BUILDING_BLOCKS, SDBlocks.PINK_MELON_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.RADISH, RecipeCategory.BUILDING_BLOCKS, SDBlocks.RADISH_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.RED_CABBAGE, RecipeCategory.BUILDING_BLOCKS, SDBlocks.RED_CABBAGE_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.STARFRUIT, RecipeCategory.BUILDING_BLOCKS, SDBlocks.STARFRUIT_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.MISC, SDBlocks.GROWN_SUMMER_SPANGLE.getItem(), RecipeCategory.BUILDING_BLOCKS, SDBlocks.SUMMER_SPANGLE_BOX.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.SUMMER_SQUASH, RecipeCategory.BUILDING_BLOCKS, SDBlocks.SUMMER_SQUASH_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.AMARANTH, RecipeCategory.BUILDING_BLOCKS, SDBlocks.AMARANTH_BALE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.ARTICHOKE, RecipeCategory.BUILDING_BLOCKS, SDBlocks.ARTICHOKE_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.BOK_CHOY, RecipeCategory.BUILDING_BLOCKS, SDBlocks.BOK_CHOY_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.BROCCOLI, RecipeCategory.BUILDING_BLOCKS, SDBlocks.BROCCOLI_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.CRANBERRY_PUNNET, RecipeCategory.BUILDING_BLOCKS, SDBlocks.CRANBERRY_PUNNET_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.EGGPLANT, RecipeCategory.BUILDING_BLOCKS, SDBlocks.EGGPLANT_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.MISC, SDBlocks.GROWN_FAIRY_ROSE.getItem(), RecipeCategory.BUILDING_BLOCKS, SDBlocks.FAIRY_ROSE_BOX.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.GRAPES, RecipeCategory.BUILDING_BLOCKS, SDBlocks.GRAPE_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.SUGAR_PUMPKIN, RecipeCategory.BUILDING_BLOCKS, SDBlocks.SUGAR_PUMPKIN_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.YAM, RecipeCategory.BUILDING_BLOCKS, SDBlocks.YAM_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.POWDERMELON, RecipeCategory.BUILDING_BLOCKS, SDBlocks.POWDERMELON_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.ANCIENT_FRUIT, RecipeCategory.BUILDING_BLOCKS, SDBlocks.ANCIENT_FRUIT_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.QI_FRUIT, RecipeCategory.BUILDING_BLOCKS, SDBlocks.QI_FRUIT_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.SWEET_GEM_BERRY, RecipeCategory.BUILDING_BLOCKS, SDBlocks.SWEET_GEM_BERRY_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.PINEAPPLE, RecipeCategory.BUILDING_BLOCKS, SDBlocks.PINEAPPLE_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.TARO_ROOT, RecipeCategory.BUILDING_BLOCKS, SDBlocks.TARO_ROOT_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.TEA_LEAVES, RecipeCategory.BUILDING_BLOCKS, SDBlocks.TEA_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.APRICOT, RecipeCategory.BUILDING_BLOCKS, SDBlocks.APRICOT_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.CHERRY, RecipeCategory.BUILDING_BLOCKS, SDBlocks.CHERRY_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.BANANA, RecipeCategory.BUILDING_BLOCKS, SDBlocks.BANANA_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.MANGO, RecipeCategory.BUILDING_BLOCKS, SDBlocks.MANGO_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.ORANGE, RecipeCategory.BUILDING_BLOCKS, SDBlocks.ORANGE_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.PEACH, RecipeCategory.BUILDING_BLOCKS, SDBlocks.PEACH_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, Items.APPLE, RecipeCategory.BUILDING_BLOCKS, SDBlocks.APPLE_CRATE.getItem());
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.POMEGRANATE, RecipeCategory.BUILDING_BLOCKS, SDBlocks.POMEGRANATE_CRATE.getItem());

        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.STRAWBERRY, RecipeCategory.FOOD, SDItems.STRAWBERRY_PUNNET);
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.BLUEBERRY, RecipeCategory.FOOD, SDItems.BLUEBERRY_PUNNET);
        modNineBlockStorageRecipes(recipeOutput, RecipeCategory.FOOD, SDItems.CRANBERRY, RecipeCategory.FOOD, SDItems.CRANBERRY_PUNNET);


        for (Map.Entry<WoodType, Map<SDBlocks.WoodBlockTypes, DeferredBlockItem<?>>> entry : SDBlocks.WOOD_BLOCKS.entrySet()) {
            WoodType woodtype = entry.getKey();
            Map<SDBlocks.WoodBlockTypes, DeferredBlockItem<?>> blocks = entry.getValue();
            Criterion<?> hasPlanks = has(blocks.get(SDBlocks.WoodBlockTypes.PLANKS));

            woodFromLogs(recipeOutput, blocks.get(SDBlocks.WoodBlockTypes.WOOD), blocks.get(SDBlocks.WoodBlockTypes.LOG));
            woodFromLogs(recipeOutput, blocks.get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD), blocks.get(SDBlocks.WoodBlockTypes.STRIPPED_LOG));
            planksFromLogs(recipeOutput, blocks.get(SDBlocks.WoodBlockTypes.PLANKS), SDTags.ItemTags.LOG_TAGS.get(woodtype), 4);
            stairBuilder(blocks.get(SDBlocks.WoodBlockTypes.STAIRS), Ingredient.of(blocks.get(SDBlocks.WoodBlockTypes.PLANKS))).unlockedBy("has_planks", hasPlanks).save(recipeOutput);
            slabBuilder(RecipeCategory.BUILDING_BLOCKS, blocks.get(SDBlocks.WoodBlockTypes.SLAB), Ingredient.of(blocks.get(SDBlocks.WoodBlockTypes.PLANKS))).unlockedBy("has_planks", hasPlanks).save(recipeOutput);
            fenceBuilder(blocks.get(SDBlocks.WoodBlockTypes.FENCE), Ingredient.of(blocks.get(SDBlocks.WoodBlockTypes.PLANKS))).unlockedBy("has_planks", hasPlanks).save(recipeOutput);
            fenceGateBuilder(blocks.get(SDBlocks.WoodBlockTypes.FENCE_GATE), Ingredient.of(blocks.get(SDBlocks.WoodBlockTypes.PLANKS))).unlockedBy("has_planks", hasPlanks).save(recipeOutput);
            doorBuilder(blocks.get(SDBlocks.WoodBlockTypes.DOOR), Ingredient.of(blocks.get(SDBlocks.WoodBlockTypes.PLANKS))).unlockedBy("has_planks", hasPlanks).save(recipeOutput);
            trapdoorBuilder(blocks.get(SDBlocks.WoodBlockTypes.TRAPDOOR), Ingredient.of(blocks.get(SDBlocks.WoodBlockTypes.PLANKS))).unlockedBy("has_planks", hasPlanks).save(recipeOutput);
            pressurePlateBuilder(RecipeCategory.REDSTONE, blocks.get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE), Ingredient.of(blocks.get(SDBlocks.WoodBlockTypes.PLANKS))).unlockedBy("has_planks", hasPlanks).save(recipeOutput);
            buttonBuilder(blocks.get(SDBlocks.WoodBlockTypes.BUTTON), Ingredient.of(blocks.get(SDBlocks.WoodBlockTypes.PLANKS))).unlockedBy("has_planks", hasPlanks).save(recipeOutput);

            signBuilder(blocks.get(SDBlocks.WoodBlockTypes.SIGN), Ingredient.of(blocks.get(SDBlocks.WoodBlockTypes.PLANKS))).unlockedBy("has_planks", hasPlanks).save(recipeOutput);
            hangingSign(recipeOutput, blocks.get(SDBlocks.WoodBlockTypes.HANGING_SIGN), blocks.get(SDBlocks.WoodBlockTypes.STRIPPED_LOG));
        }

        bushProduceSeeds(recipeOutput, SDItems.STRAWBERRY, SDItems.STRAWBERRY_SEEDS, 2);
        bushProduceSeeds(recipeOutput, SDItems.BROCCOLI, SDItems.BROCCOLI_SEEDS, 2);
        bushProduceSeeds(recipeOutput, SDItems.EGGPLANT, SDItems.EGGPLANT_SEEDS, 2);
        bushProduceSeeds(recipeOutput, SDItems.PINEAPPLE, SDItems.PINEAPPLE_SEEDS, 2);
        bushProduceSeeds(recipeOutput, SDItems.BLUEBERRY, SDItems.BLUEBERRY_SEEDS, 2);
        bushProduceSeeds(recipeOutput, SDItems.HOT_PEPPER, SDItems.PEPPER_SEEDS, 2);
        bushProduceSeeds(recipeOutput, SDItems.SUMMER_SQUASH, SDItems.SUMMER_SQUASH_SEEDS, 2);
        bushProduceSeeds(recipeOutput, SDItems.CRANBERRY, SDItems.CRANBERRY_SEEDS, 2);
        bushProduceSeeds(recipeOutput, SDItems.CORN, SDItems.CORN_SEEDS, 2);
        bushProduceSeeds(recipeOutput, SDItems.ANCIENT_FRUIT, SDItems.ANCIENT_SEEDS, 2);

        starterRecipe(recipeOutput, SDItems.GREEN_BEAN, SDItems.BEAN_STARTER);
        starterRecipe(recipeOutput, SDItems.HOPS, SDItems.HOPS_STARTER);
        starterRecipe(recipeOutput, SDItems.GRAPES, SDItems.GRAPE_STARTER);

        flowerSeedsRecipe(recipeOutput, SDBlocks.GROWN_BLUE_JAZZ.getItem(), SDItems.JAZZ_SEEDS, 4);
        flowerSeedsRecipe(recipeOutput, SDBlocks.GROWN_SUMMER_SPANGLE.getItem(), SDItems.SPANGLE_SEEDS, 4);
        flowerSeedsRecipe(recipeOutput, SDBlocks.GROWN_FAIRY_ROSE.getItem(), SDItems.FAIRY_SEEDS, 4);
    }

    private static void modNineBlockStorageRecipes(RecipeOutput output, RecipeCategory breakingCategory, ItemLike item, RecipeCategory compactingCategory, ItemLike compacted) {
        String itemName = getItemName(item);
        String compactedName = getItemName(compacted);
        ShapedRecipeBuilder.shaped(compactingCategory, compacted, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', item)
                .unlockedBy("has_" + itemName, hasItems(item))
                .save(output, StardewDelight.modLoc(compactedName + "_from_" + itemName));
        ShapelessRecipeBuilder.shapeless(breakingCategory, item, 9)
                .requires(compacted)
                .unlockedBy("has_" + compactedName, hasItems(compacted))
                .save(output, StardewDelight.modLoc(itemName + "_from_" + compactedName));
    }

    private static void bushProduceSeeds(RecipeOutput output, ItemLike produce, ItemLike seeds, int count) {
        String produceName = getItemName(produce);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, seeds, count)
                .requires(produce)
                .unlockedBy("has_" + produceName, hasItems(produce))
                .save(output, StardewDelight.modLoc("seeds_from_" + produceName));
    }

    private static void starterRecipe(RecipeOutput output, ItemLike produce, ItemLike starter) {
        String produceName = getItemName(produce);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, starter)
                .define('/', Items.STICK)
                .define('#', produce)
                .pattern("/ /")
                .pattern(" # ")
                .pattern("/ /")
                .unlockedBy("has_" + produceName, hasItems(produce))
                .save(output, StardewDelight.modLoc("starter_from_" + produceName));
    }

    private static void flowerSeedsRecipe(RecipeOutput output, ItemLike flower, ItemLike seeds, int count) {
        String flowerName = getItemName(flower);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, seeds, count)
                .requires(flower)
                .unlockedBy("has_" + flowerName, hasItems(flower))
                .save(output, StardewDelight.modLoc("seeds_from_" + flowerName));
    }


    /*----- UTILITY METHODS -----*/
    public static Criterion<InventoryChangeTrigger.TriggerInstance> hasItems(ItemLike item) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(item);
    }


    /*----- NAMED WRAPPER FOR DataProvider -----*/
    public DataProvider namedWrapper() {
        return new DataProvider() {
            @Override
            public CompletableFuture<?> run(CachedOutput cachedOutput) {
                return SDRecipeProvider.this.run(cachedOutput);
            }

            @Override
            public String getName() {
                return "Stardew's Delight's Standard Recipes";
            }
        };
    }
}
