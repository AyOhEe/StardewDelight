package io.github.ayohee.stardewdelight.content.crops;

import net.minecraft.core.BlockPos;
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.CommonHooks;

public abstract class TallBushCropBlock extends TallCropBlock {
    protected ItemLike result;
    protected int baseDrops;
    protected int bonusDrops;

    protected TallBushCropBlock(Properties properties, int maxAge, ItemLike seed, int doubleAge, ItemLike result, int baseDrops, int bonusDrops) {
        super(properties, maxAge, seed, doubleAge);
        this.result = result;
        this.baseDrops = baseDrops;
        this.bonusDrops = bonusDrops;
    }

    // We do it this way because providing it in the constructor doesn't give us a way to
    // have it *not* be null in createBlockStateDefinition
    public static TallBushCropBlock create(Properties properties, IntegerProperty ageProperty, int maxAge, ItemLike seed, int doubleAge, ItemLike result, int baseDrops, int bonusDrops) {
        return new TallBushCropBlock(properties, maxAge, seed, doubleAge, result, baseDrops, bonusDrops) {
            @Override
            public IntegerProperty getAgeProperty() {
                return ageProperty;
            }
        };
    }

    @Override
    protected void randomTick(BlockState blockstate, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isAreaLoaded(pos, 1)) {
            return;
        }

        if (level.getRawBrightness(pos, 0) < 9) {
            return;
        }

        int age = this.getAge(blockstate);
        if (age == this.getMaxAge()) {
            return;
        }

        if (age + 1 == this.doubleAge && !level.isEmptyBlock(pos.above())) {
            return;
        }

        int newAge = age + 1;
        if (newAge == getMaxAge() - 1) {
            newAge = getMaxAge();
        }

        float f = getGrowthSpeed(blockstate, level, pos);
        if (CommonHooks.canCropGrow(level, pos, blockstate, random.nextInt((int)(25.0F / f) + 1) == 0)) {
            growToAge(newAge, pos, level);
            CommonHooks.fireCropGrowPost(level, pos, blockstate);
        }
    }

    public InteractionResult useWithoutItem(BlockState blockstate, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        int age = getAge(blockstate);
        if (age != this.getMaxAge()) {
            return super.useWithoutItem(blockstate, level, pos, player, hit);
        }

        popResource(level, pos, new ItemStack(result, baseDrops + level.random.nextInt(bonusDrops + 1)));

        level.playSound(null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + level.random.nextFloat() * 0.4F);
        level.setBlock(pos, blockstate.setValue(this.getAgeProperty(), this.getMaxAge() - 1), Block.UPDATE_CLIENTS);
        return InteractionResult.SUCCESS;
    }

    @Override
    public void growCrops(Level level, BlockPos pos, BlockState blockstate) {
        int age = Math.min(this.getAge(blockstate) + this.getBonemealAgeIncrease(level), this.getMaxAge());

        if (age == this.getMaxAge() - 1) {
            age = this.getMaxAge();
        }
        if (!(level.isEmptyBlock(pos.above()) || level.getBlockState(pos.above()).is(this))) {
            age = Math.min(age, this.doubleAge - 1);
        }

        growToAge(age, pos, level);
    }

    public int getBaseDrops() {
        return baseDrops;
    }

    public int getBonusDrops() {
        return bonusDrops;
    }
}
