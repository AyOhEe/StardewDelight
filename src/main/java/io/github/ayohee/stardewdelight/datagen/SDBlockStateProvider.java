package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.register.SDBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.FarmersDelight;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;

public class SDBlockStateProvider extends BlockStateProvider {
    public SDBlockStateProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, MODID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /*----- CROP BLOCKS -----*/
        /*----- SPRING CROPS -----*/
        new BlockModelPair(SDBlocks.BLUE_JAZZ_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.CAULIFLOWER_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.COFFEE_BUSH.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.GARLIC_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.GREEN_BEANS_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.KALE_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.PARSNIP_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.RHUBARB_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.STRAWBERRY_BUSH.get(), this::crop)
                .makeBlockModel();

        /*----- SUMMER CROPS -----*/
        new BlockModelPair(SDBlocks.BLUEBERRY_BUSH.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.CORN_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.HOPS_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.HOT_PEPPERS_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.PINK_MELON_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.RADISH_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.RED_CABBAGE_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.STARFRUIT_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.SUMMER_SPANGLE_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.SUMMER_SQUASH_CROP.get(), this::crop)
                .makeBlockModel();

        /*----- FALL CROPS -----*/
        new BlockModelPair(SDBlocks.AMARANTH_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.ARTICHOKE_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.BOK_CHOY_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.BROCCOLI_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.CRANBERRY_BUSH.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.EGGPLANT_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.FAIRY_ROSE_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.GRAPES_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.SUGAR_PUMPKIN_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.YAM_CROP.get(), this::crop)
                .makeBlockModel();


        /*----- WINTER CROPS -----*/
        new BlockModelPair(SDBlocks.POWDERMELON_CROP.get(), this::crop)
                .makeBlockModel();

        /*----- SPECIAL CROPS -----*/
        new BlockModelPair(SDBlocks.ANCIENT_FRUIT_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.QI_FRUIT_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.SWEET_GEM_BERRY_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.PINEAPPLE_CROP.get(), this::crop)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.TARO_ROOT_CROP.get(), this::crop)
                .makeBlockModel();

        /*----- FRUIT TREES -----*/
        new BlockModelPair(SDBlocks.TEA_SAPLING.getBlock().get(), this::sapling)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.APRICOT_SAPLING.getBlock().get(), this::sapling)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.CHERRY_SAPLING.getBlock().get(), this::sapling)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.BANANA_SAPLING.getBlock().get(), this::sapling)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.MANGO_SAPLING.getBlock().get(), this::sapling)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.ORANGE_SAPLING.getBlock().get(), this::sapling)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.PEACH_SAPLING.getBlock().get(), this::sapling)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.APPLE_SAPLING.getBlock().get(), this::sapling)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.POMEGRANATE_SAPLING.getBlock().get(), this::sapling)
                .makeBlockModel();


        /*----- CRATES -----*/
        /*----- SPRING CROPS -----*/
        new BlockModelPair(SDBlocks.BLUE_JAZZ_BOX.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.CAULIFLOWER_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.COFFEE_BAG.getBlock().get(), this::bag)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.GARLIC_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.GREEN_BEAN_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.KALE_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.PARSNIP_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.RHUBARB_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.STRAWBERRY_PUNNET_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();

        /*----- SUMMER CROPS -----*/
        new BlockModelPair(SDBlocks.BLUEBERRY_PUNNET_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.CORN_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.HOPS_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.HOT_PEPPER_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.PINK_MELON_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.RADISH_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.RED_CABBAGE_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.STARFRUIT_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.SUMMER_SPANGLE_BOX.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.SUMMER_SQUASH_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();

        /*----- FALL CROPS -----*/
        new BlockModelPair(SDBlocks.AMARANTH_BALE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.ARTICHOKE_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.BOK_CHOY_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.BROCCOLI_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.CRANBERRY_PUNNET_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.EGGPLANT_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.FAIRY_ROSE_BOX.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.GRAPE_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.SUGAR_PUMPKIN_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.YAM_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();


        /*----- WINTER CROPS -----*/
        new BlockModelPair(SDBlocks.POWDERMELON_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();

        /*----- SPECIAL CROPS -----*/
        new BlockModelPair(SDBlocks.ANCIENT_FRUIT_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.QI_FRUIT_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.SWEET_GEM_BERRY_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.PINEAPPLE_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.TARO_ROOT_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();

        /*----- FRUIT TREES -----*/
        new BlockModelPair(SDBlocks.TEA_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.APRICOT_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.CHERRY_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.BANANA_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.MANGO_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.ORANGE_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.PEACH_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.APPLE_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
        new BlockModelPair(SDBlocks.POMEGRANATE_CRATE.getBlock().get(), this::crate)
                .makeBlockModel()
                .makeItemModel();
    }


    /*----- UTILITY METHODS -----*/
    private class BlockModelPair {
        public final ModelFile model;
        public final Block block;

        public BlockModelPair(Block block, Function<Block, ModelFile> modelFunc) {
            this.block = block;
            this.model = modelFunc.apply(block);
        }

        public BlockModelPair makeBlockModel() {
            simpleBlock(block, model);
            return this;
        }

        public BlockModelPair makeItemModel() {
            simpleBlockItem(block, model);
            return this;
        }
    }

    private ModelFile sapling(Block b) {
        return this.models().cross(this.name(b), this.blockTexture(b)).renderType(mcLoc("cutout"));
    }

    private ModelFile crop(Block b) {
        return this.models().crop(this.name(b), this.blockTexture(b)).renderType(mcLoc("cutout"));
    }

    private ModelFile crate(Block b) {
        return this.models()
                .cubeBottomTop(
                        this.name(b),
                        modLoc("block/" + this.name(b) + "_side"),
                        ResourceLocation.fromNamespaceAndPath(FarmersDelight.MODID, "block/crate_bottom"),
                        modLoc("block/" + this.name(b) + "_top"));
    }

    private ModelFile bag(Block b) {
        return this.models()
                .cube(
                        this.name(b),
                        ResourceLocation.fromNamespaceAndPath(FarmersDelight.MODID, "block/rice_bag_bottom"),
                        modLoc("block/" + this.name(b) + "_top"),
                        ResourceLocation.fromNamespaceAndPath(FarmersDelight.MODID, "block/rice_bag_side_tied"),
                        ResourceLocation.fromNamespaceAndPath(FarmersDelight.MODID, "block/rice_bag_side_tied"),
                        ResourceLocation.fromNamespaceAndPath(FarmersDelight.MODID, "block/rice_bag_side"),
                        ResourceLocation.fromNamespaceAndPath(FarmersDelight.MODID, "block/rice_bag_side"))
                .texture("particle", modLoc("block/" + this.name(b) + "_top"));
    }


    /*----- SHAMELESSLY STOLEN FROM SUPERCLASS -----*/
    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    private String name(Block block) {
        return this.key(block).getPath();
    }


    /*----- NAMED WRAPPER FOR DataProvider -----*/
    public DataProvider namedWrapper() {
        return new DataProvider() {
            @Override
            public CompletableFuture<?> run(CachedOutput cachedOutput) {
                return SDBlockStateProvider.this.run(cachedOutput);
            }

            @Override
            public String getName() {
                return "Stardew's Delight's BlockStates";
            }
        };
    }
}
