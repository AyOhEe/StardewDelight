package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.StardewDelight;
import io.github.ayohee.stardewdelight.register.SDBlocks;
import io.github.ayohee.stardewdelight.register.lib.DeferredBlockItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.VariantBlockStateBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.FarmersDelight;

import java.util.Map;
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
        new BlockModelPair(SDBlocks.TEA_SAPLING.getBlock().get(), this::cross_cutout)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.APRICOT_SAPLING.getBlock().get(), this::cross_cutout)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.FRUITING_CHERRY_SAPLING.getBlock().get(), this::cross_cutout)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.BANANA_SAPLING.getBlock().get(), this::cross_cutout)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.MANGO_SAPLING.getBlock().get(), this::cross_cutout)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.ORANGE_SAPLING.getBlock().get(), this::cross_cutout)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.PEACH_SAPLING.getBlock().get(), this::cross_cutout)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.APPLE_SAPLING.getBlock().get(), this::cross_cutout)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.POMEGRANATE_SAPLING.getBlock().get(), this::cross_cutout)
                .makeBlockModel();

        /*----- WOOD/TREE BLOCKS -----*/
        for (Map.Entry<WoodType, Map<SDBlocks.WoodBlockTypes, DeferredBlockItem<?>>> entry : SDBlocks.WOOD_BLOCKS.entrySet()) {
            Map<SDBlocks.WoodBlockTypes, DeferredBlockItem<?>> blocks = entry.getValue();
            WoodType woodType = entry.getKey();

            ResourceLocation planksTexture = blockTexture(blocks.get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get());
            ResourceLocation logTexture = StardewDelight.modLoc("block/" + woodType.name() + "_log");
            ResourceLocation strippedLogTexture = StardewDelight.modLoc("block/stripped_" + woodType.name() + "_log");
            ResourceLocation doubleSlabModel = StardewDelight.modLoc("block/" + woodType.name() + "_planks");
            ResourceLocation doorBottomTexture = StardewDelight.modLoc("block/" + woodType.name() + "_door_bottom");
            ResourceLocation doorTopTexture = StardewDelight.modLoc("block/" + woodType.name() + "_door_top");
            ResourceLocation trapdoorTexture = StardewDelight.modLoc("block/" + woodType.name() + "_trapdoor");

            logBlock((RotatedPillarBlock) blocks.get(SDBlocks.WoodBlockTypes.LOG).getBlock().get());
            axisBlock((RotatedPillarBlock) blocks.get(SDBlocks.WoodBlockTypes.WOOD).getBlock().get(), logTexture, logTexture);
            logBlock((RotatedPillarBlock) blocks.get(SDBlocks.WoodBlockTypes.STRIPPED_LOG).getBlock().get());
            axisBlock((RotatedPillarBlock) blocks.get(SDBlocks.WoodBlockTypes.STRIPPED_WOOD).getBlock().get(), strippedLogTexture, strippedLogTexture);
            simpleBlock(blocks.get(SDBlocks.WoodBlockTypes.PLANKS).getBlock().get());
            stairsBlock((StairBlock) blocks.get(SDBlocks.WoodBlockTypes.STAIRS).getBlock().get(), planksTexture);
            slabBlock((SlabBlock) blocks.get(SDBlocks.WoodBlockTypes.SLAB).getBlock().get(), doubleSlabModel, planksTexture);
            fenceBlock((FenceBlock) blocks.get(SDBlocks.WoodBlockTypes.FENCE).getBlock().get(), planksTexture);
            fenceGateBlock((FenceGateBlock) blocks.get(SDBlocks.WoodBlockTypes.FENCE_GATE).getBlock().get(), planksTexture);
            doorBlockWithRenderType((DoorBlock) blocks.get(SDBlocks.WoodBlockTypes.DOOR).getBlock().get(), doorBottomTexture, doorTopTexture, mcLoc("cutout"));
            trapdoorBlockWithRenderType((TrapDoorBlock) blocks.get(SDBlocks.WoodBlockTypes.TRAPDOOR).getBlock().get(), trapdoorTexture, true, mcLoc("cutout"));
            pressurePlateBlock((PressurePlateBlock) blocks.get(SDBlocks.WoodBlockTypes.PRESSURE_PLATE).getBlock().get(), planksTexture);
            buttonBlock((ButtonBlock) blocks.get(SDBlocks.WoodBlockTypes.BUTTON).getBlock().get(), planksTexture);

            Block leavesBlock = blocks.get(SDBlocks.WoodBlockTypes.LEAVES).getBlock().get();
            this.simpleBlock(leavesBlock, this.models().cubeAll(this.name(leavesBlock), this.blockTexture(leavesBlock)).renderType(mcLoc("cutout")));

            signBlock((StandingSignBlock) blocks.get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get(), (WallSignBlock) blocks.get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get(), planksTexture);
            hangingSignBlock((CeilingHangingSignBlock) blocks.get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get(), (WallHangingSignBlock) blocks.get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get(), strippedLogTexture);

            // Inventory models
            this.models().withExistingParent(woodType.name() + "_fence_inventory", "block/fence_inventory").texture("texture", planksTexture);
            this.models().withExistingParent(woodType.name() + "_button_inventory", "block/button_inventory").texture("texture", planksTexture);
        }

        /*----- GROWN FLOWERS -----*/
        new BlockModelPair(SDBlocks.GROWN_BLUE_JAZZ.getBlock().get(), this::cross_cutout)
                .makeBlockModel();
        new BlockModelPair(SDBlocks.GROWN_SUMMER_SPANGLE.getBlock().get(), this::cross_cutout)
                .makeBlockModel();

        ModelFile fairyRoseBottom = cross_cutout(SDBlocks.GROWN_FAIRY_ROSE.getBlock().get(), "_bottom");
        ModelFile fairyRoseTop = cross_cutout(SDBlocks.GROWN_FAIRY_ROSE.getBlock().get(), "_top");
        VariantBlockStateBuilder fairyRoseVariant = getVariantBuilder(SDBlocks.GROWN_FAIRY_ROSE.getBlock().get())
                .partialState().with(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER).modelForState().modelFile(fairyRoseBottom).addModel()
                .partialState().with(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER).modelForState().modelFile(fairyRoseTop).addModel();


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

    private ModelFile cross_cutout(Block b) {
        return this.models().cross(this.name(b), this.blockTexture(b)).renderType(mcLoc("cutout"));
    }

    private ModelFile cross_cutout(Block b, String suffix) {
        return this.models().cross(this.name(b) + suffix, this.blockTexture(b).withSuffix(suffix)).renderType(mcLoc("cutout"));
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
