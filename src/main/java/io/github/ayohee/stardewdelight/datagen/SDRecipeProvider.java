package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;

public class SDRecipeProvider extends RecipeProvider {
    public SDRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SDItems.EXAMPLE_ITEM)
                .requires(SDItems.EXAMPLE_ITEM)
                .unlockedBy("get_item", hasItems(SDItems.EXAMPLE_ITEM))
                .save(recipeOutput, StardewDelight.modLoc("test"));
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
