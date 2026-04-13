package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.StardewDelight;
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

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;

public class SDBlockStateProvider extends BlockStateProvider {
    public SDBlockStateProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, MODID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        new BlockModelPair(SDBlocks.EXAMPLE_BLOCK.getBlock().get(), this::cubeAll)
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
