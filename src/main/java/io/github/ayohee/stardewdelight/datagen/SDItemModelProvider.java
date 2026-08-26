package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import io.github.ayohee.stardewdelight.register.SDItems;
import io.github.ayohee.stardewdelight.register.lib.DeferredBlockItem;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;

public class SDItemModelProvider extends ItemModelProvider {
    public SDItemModelProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, MODID, fileHelper);
    }

    @Override
    protected void registerModels() {
        /*----- UTILITY ITEMS -----*/
        basicItem(SDItems.SEED_PACKET.asItem());


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
        blockTexture(SDBlocks.TEA_SAPLING.getItem());
        blockTexture(SDBlocks.APRICOT_SAPLING.getItem());
        blockTexture(SDBlocks.FRUITING_CHERRY_SAPLING.getItem());
        blockTexture(SDBlocks.BANANA_SAPLING.getItem());
        blockTexture(SDBlocks.MANGO_SAPLING.getItem());
        blockTexture(SDBlocks.ORANGE_SAPLING.getItem());
        blockTexture(SDBlocks.PEACH_SAPLING.getItem());
        blockTexture(SDBlocks.APPLE_SAPLING.getItem());
        blockTexture(SDBlocks.POMEGRANATE_SAPLING.getItem());

        /*----- WOOD/TREE BLOCKS -----*/
        for (Map.Entry<WoodType, Map<SDBlocks.WoodBlockTypes, DeferredBlockItem<?>>> entry : SDBlocks.WOOD_BLOCKS.entrySet()) {
            Map<SDBlocks.WoodBlockTypes, DeferredBlockItem<?>> blocks = entry.getValue();
            WoodType woodType = entry.getKey();

            simpleBlockItem(blocks.get(SDBlocks.WoodBlockTypes.LOG).getBlock().get());
            simpleBlockItem(blocks.get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get());
            simpleBlockItem(blocks.get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get());
            simpleBlockItem(blocks.get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get());
            simpleBlockItem(blocks.get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get());
            simpleBlockItem(blocks.get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get());
            simpleBlockItem(blocks.get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get());

            withExistingParent(StardewDelight.modLoc(woodType.name() + "_fence").toString(), StardewDelight.modLoc("block/" + woodType.name() + "_fence_inventory"));

            simpleBlockItem(blocks.get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get());
            basicItem(blocks.get(SDBlocks.WoodBlockTypes.DOOR).getItem().get());
            withExistingParent(StardewDelight.modLoc(woodType.name() + "_trapdoor").toString(), StardewDelight.modLoc("block/" + woodType.name() + "_trapdoor_bottom"));
            simpleBlockItem(blocks.get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get());
            withExistingParent(StardewDelight.modLoc(woodType.name() + "_button").toString(), StardewDelight.modLoc("block/" + woodType.name() + "_button_inventory"));
            simpleBlockItem(blocks.get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get());

            basicItem(blocks.get(SDBlocks.WoodBlockTypes.SIGN).getItem().get());
            basicItem(blocks.get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getItem().get());
        }

        simpleBlockItem(SDBlocks.FRUITING_CHERRY_LEAVES.getBlock().get());

        /*----- CROP ITEMS -----*/
        /*----- SPRING CROPS -----*/
        blockTexture(SDBlocks.GROWN_BLUE_JAZZ.getItem());
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
        blockTexture(SDBlocks.GROWN_SUMMER_SPANGLE.getItem());
        basicItem(SDItems.SUMMER_SQUASH.get());

        /*----- FALL CROPS -----*/
        basicItem(SDItems.AMARANTH.get());
        basicItem(SDItems.ARTICHOKE.get());
        basicItem(SDItems.BOK_CHOY.get());
        basicItem(SDItems.BROCCOLI.get());
        basicItem(SDItems.CRANBERRY.get());
        basicItem(SDItems.EGGPLANT.get());
        blockTexture(SDBlocks.GROWN_FAIRY_ROSE.getItem(), "_top");
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

        /*----- BERRY PUNNETS -----*/
        basicItem(SDItems.STRAWBERRY_PUNNET.get());
        basicItem(SDItems.BLUEBERRY_PUNNET.get());
        basicItem(SDItems.CRANBERRY_PUNNET.get());
    }

    private void blockTexture(DeferredItem<? extends Item> i) {
        withExistingParent(i.getId().toString(), mcLoc("item/generated")).texture("layer0", StardewDelight.modLoc("block/" + i.getId().getPath()));
    }

    private void blockTexture(DeferredItem<? extends Item> i, String suffix) {
        withExistingParent(i.getId().toString(), mcLoc("item/generated")).texture("layer0", StardewDelight.modLoc("block/" + i.getId().withSuffix(suffix).getPath()));
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
                return "Stardew's Delight's ItemTags Models";
            }
        };
    }
}
