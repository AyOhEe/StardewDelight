package io.github.ayohee.stardewdelight.content.crops;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;

public abstract class TallUpperBushCropBlock extends TallBushCropBlock {
    protected TallUpperBushCropBlock(Properties properties, int maxAge, ItemLike seed, int doubleAge, ItemLike result, int baseDrops, int bonusDrops) {
        super(properties, maxAge, seed, doubleAge, result, baseDrops, bonusDrops);
    }

    // We do it this way because providing it in the constructor doesn't give us a way to
    // have it *not* be null in createBlockStateDefinition
    public static TallUpperBushCropBlock create(Properties properties, IntegerProperty ageProperty, int maxAge, ItemLike seed, int doubleAge, ItemLike result, int baseDrops, int bonusDrops) {
        return new TallUpperBushCropBlock(properties, maxAge, seed, doubleAge, result, baseDrops, bonusDrops) {
            @Override
            public IntegerProperty getAgeProperty() {
                return ageProperty;
            }
        };
    }

    @Override
    protected boolean isRandomlyTicking(BlockState blockstate) {
        return super.isRandomlyTicking(blockstate) || (blockstate.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER && blockstate.getValue(getAgeProperty()) == getMaxAge() - 1);
    }

    @Override
    protected void growToAge(int age, BlockPos pos, LevelAccessor level) {
        BlockState state = level.getBlockState(pos);
        if (state.is(this) && state.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER) {
            level.setBlock(pos, this.getStateForAge(age).setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), Block.UPDATE_CLIENTS);
        } else {
            super.growToAge(age, pos, level);
        }
    }

    public InteractionResult useWithoutItem(BlockState blockstate, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (blockstate.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER) {
            return super.useWithoutItem(blockstate, level, pos, player, hit);
        } else {
            return InteractionResult.PASS;
        }
    }
}
