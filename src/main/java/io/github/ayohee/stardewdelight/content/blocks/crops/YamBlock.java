package io.github.ayohee.stardewdelight.content.blocks.crops;

import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class YamBlock extends CropBlock {
    private static final IntegerProperty AGE = BlockStateProperties.AGE_4;


    public YamBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState().setValue(AGE, 0));
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return SDItems.YAM_SEEDS;
    }

    @Override
    protected IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 4;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}