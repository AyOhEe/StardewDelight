package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.concurrent.CompletableFuture;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;

public class SDItemModelProvider extends ItemModelProvider {
    public SDItemModelProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, MODID, fileHelper);
    }

    @Override
    protected void registerModels() {
        /*----- SEEDS -----*/
        /*----- SPRING CROPS -----*/
        basicItem(SDItems.JAZZ_SEEDS.get());
        basicItem(SDItems.CAULIFLOWER_SEEDS.get());
        basicItem(SDItems.COFFEE_BEAN.get());
        basicItem(SDItems.GARLIC_SEEDS.get());
        basicItem(SDItems.BEAN_STARTER.get());
        basicItem(SDItems.KALE_SEEDS.get());
        basicItem(SDItems.PARSNIP_SEEDS.get());
        basicItem(SDItems.RHUBARB_SEEDS.get());
        basicItem(SDItems.STRAWBERRY_SEEDS.get());

        /*----- SUMMER CROPS -----*/
        basicItem(SDItems.BLUEBERRY_SEEDS.get());
        basicItem(SDItems.CORN_SEEDS.get());
        basicItem(SDItems.HOPS_STARTER.get());
        basicItem(SDItems.PEPPER_SEEDS.get());
        basicItem(SDItems.PINK_MELON_SEEDS.get());
        basicItem(SDItems.RADISH_SEEDS.get());
        basicItem(SDItems.RED_CABBAGE_SEEDS.get());
        basicItem(SDItems.STARFRUIT_SEEDS.get());
        basicItem(SDItems.SPANGLE_SEEDS.get());
        basicItem(SDItems.SUMMER_SQUASH_SEEDS.get());

        /*----- FALL CROPS -----*/
        basicItem(SDItems.AMARANTH_SEEDS.get());
        basicItem(SDItems.ARTICHOKE_SEEDS.get());
        basicItem(SDItems.BOK_CHOY_SEEDS.get());
        basicItem(SDItems.BROCCOLI_SEEDS.get());
        basicItem(SDItems.CRANBERRY_SEEDS.get());
        basicItem(SDItems.EGGPLANT_SEEDS.get());
        basicItem(SDItems.FAIRY_SEEDS.get());
        basicItem(SDItems.GRAPE_STARTER.get());
        basicItem(SDItems.SUGAR_PUMPKIN_SEEDS.get());
        basicItem(SDItems.YAM_SEEDS.get());

        /*----- WINTER CROPS -----*/
        basicItem(SDItems.POWDERMELON_SEEDS.get());

        /*----- SPECIAL CROPS -----*/
        basicItem(SDItems.ANCIENT_SEEDS.get());
        basicItem(SDItems.QI_BEAN.get());
        basicItem(SDItems.RARE_SEED.get());
        basicItem(SDItems.PINEAPPLE_SEEDS.get());
        basicItem(SDItems.TARO_TUBER.get());

        /*----- FRUIT TREES -----*/
        sapling(SDBlocks.TEA_SAPLING.getItem());
        sapling(SDBlocks.APRICOT_SAPLING.getItem());
        sapling(SDBlocks.CHERRY_SAPLING.getItem());
        sapling(SDBlocks.BANANA_SAPLING.getItem());
        sapling(SDBlocks.MANGO_SAPLING.getItem());
        sapling(SDBlocks.ORANGE_SAPLING.getItem());
        sapling(SDBlocks.PEACH_SAPLING.getItem());
        sapling(SDBlocks.POMEGRANATE_SAPLING.getItem());




        /*----- CROP ITEMS -----*/
        /*----- SPRING CROPS -----*/
        basicItem(SDItems.BLUE_JAZZ.get());
        basicItem(SDItems.CAULIFLOWER.get());
        // Coffee beans are both seeds and a usable crop.
        basicItem(SDItems.GARLIC.get());
        basicItem(SDItems.GREEN_BEAN.get());
        basicItem(SDItems.KALE.get());
        basicItem(SDItems.PARSNIP.get());
        basicItem(SDItems.RHUBARB.get());
        basicItem(SDItems.STRAWBERRY.get());

        /*----- SUMMER CROPS -----*/
        basicItem(SDItems.BLUEBERRY.get());
        basicItem(SDItems.CORN.get());
        basicItem(SDItems.HOPS.get());
        basicItem(SDItems.HOT_PEPPER.get());
        basicItem(SDItems.PINK_MELON.get());
        basicItem(SDItems.RADISH.get());
        basicItem(SDItems.RED_CABBAGE.get());
        basicItem(SDItems.STARFRUIT.get());
        basicItem(SDItems.SUMMER_SPANGLE.get());
        basicItem(SDItems.SUMMER_SQUASH.get());

        /*----- FALL CROPS -----*/
        basicItem(SDItems.AMARANTH.get());
        basicItem(SDItems.ARTICHOKE.get());
        basicItem(SDItems.BOK_CHOY.get());
        basicItem(SDItems.BROCCOLI.get());
        basicItem(SDItems.CRANBERRY.get());
        basicItem(SDItems.EGGPLANT.get());
        basicItem(SDItems.FAIRY_ROSE.get());
        basicItem(SDItems.GRAPES.get());
        basicItem(SDItems.SUGAR_PUMPKIN.get());
        basicItem(SDItems.YAM.get());

        /*----- WINTER CROPS -----*/
        basicItem(SDItems.POWDERMELON.get());

        /*----- SPECIAL CROPS -----*/
        basicItem(SDItems.ANCIENT_FRUIT.get());
        basicItem(SDItems.QI_FRUIT.get());
        basicItem(SDItems.SWEET_GEM_BERRY.get());
        basicItem(SDItems.PINEAPPLE.get());
        basicItem(SDItems.TARO_ROOT.get());

        /*----- FRUIT TREES -----*/
        basicItem(SDItems.TEA_LEAVES.get());
        basicItem(SDItems.APRICOT.get());
        basicItem(SDItems.CHERRY.get());
        basicItem(SDItems.BANANA.get());
        basicItem(SDItems.MANGO.get());
        basicItem(SDItems.ORANGE.get());
        basicItem(SDItems.PEACH.get());
        basicItem(SDItems.POMEGRANATE.get());
    }

    private void sapling(DeferredItem<? extends Item> i) {
        withExistingParent(i.getId().toString(), mcLoc("item/generated")).texture("layer0", StardewDelight.modLoc("block/" + i.getId().getPath()));
    }

    /*----- NAMED WRAPPER FOR DataProvider -----*/
    public DataProvider namedWrapper() {
        return new DataProvider() {
            @Override
            public CompletableFuture<?> run(CachedOutput cachedOutput) {
                return SDItemModelProvider.this.run(cachedOutput);
            }

            @Override
            public String getName() {
                return "Stardew's Delight's Item Models";
            }
        };
    }
}
