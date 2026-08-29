package io.github.ayohee.stardewdelight.content;

import io.github.ayohee.stardewdelight.SDBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;

import java.util.function.Supplier;

public class FruitTreeLeavesBlock extends LeavesBlock {
    public static final int SPACE_THRESHOLD = 1;

    public final Supplier<ItemLike> result;

    public FruitTreeLeavesBlock(Properties properties, Supplier<ItemLike> result) {
        super(properties);
        registerDefaultState(
                defaultBlockState()
                        .setValue(SDBlockStateProperties.FRUIT, false)
        );

        this.result = result;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(SDBlockStateProperties.FRUIT);
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        int fruitingNeighbours = 0;
        for (Direction d : Direction.values()) {
            BlockState neighbour = level.getBlockState(pos.relative(d, 1));
            if (neighbour.is(this) && neighbour.getValue(SDBlockStateProperties.FRUIT)) {
                fruitingNeighbours += 1;
            }
        }

        if (fruitingNeighbours <= SPACE_THRESHOLD && !decaying(state)) {
            level.setBlock(pos, state.setValue(SDBlockStateProperties.FRUIT, true), Block.UPDATE_ALL);
        }

        super.randomTick(state, level, pos, random);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return (!state.getValue(SDBlockStateProperties.FRUIT) || state.getValue(DISTANCE) == 7) && !state.getValue(PERSISTENT);
    }

    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (!state.getValue(SDBlockStateProperties.FRUIT)) {
            return InteractionResult.PASS;
        }

        popResource(level, pos, new ItemStack(result.get(), 1));

        level.playSound(null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + level.random.nextFloat() * 0.4F);
        level.setBlock(pos, state.setValue(SDBlockStateProperties.FRUIT, false), Block.UPDATE_CLIENTS);
        return InteractionResult.SUCCESS;
    }
}
