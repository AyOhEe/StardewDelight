package io.github.ayohee.stardewdelight.content;

import io.github.ayohee.stardewdelight.SDTags;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SeedPacketItem extends Item {
    public static final int SEED_PACKET_ROLLS = 5;

    public SeedPacketItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!player.hasInfiniteMaterials()) {
            stack.shrink(1);
        }

        if (!(player instanceof ServerPlayer)) {
            return InteractionResultHolder.consume(stack);
        }

        for (int i = 0; i < SEED_PACKET_ROLLS; i++) {
            Holder<Item> seed = BuiltInRegistries.ITEM.getRandomElementOf(SDTags.ItemTags.SEED_PACKET_OPTIONS, level.getRandom()).orElseThrow();
            ItemStack asStack = new ItemStack(seed.value());
            if (!player.addItem(asStack)) {
                player.drop(asStack, false);
            }

            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.COMPOSTER_READY, SoundSource.PLAYERS, 0.2F, (player.getRandom().nextFloat() * 0.7F + 1.0F) * 2.0F);
        }

        return InteractionResultHolder.consume(stack);
    }
}
