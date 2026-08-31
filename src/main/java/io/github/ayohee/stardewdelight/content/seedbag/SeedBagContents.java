package io.github.ayohee.stardewdelight.content.seedbag;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.apache.commons.lang3.math.Fraction;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public record SeedBagContents(List<ItemStack> stacks, Fraction weight) {
    public static final int MAX_STACKS = 12;
    public static final SeedBagContents EMPTY = new SeedBagContents(List.of());
    public static final Codec<SeedBagContents> CODEC = ItemStack.CODEC
            .sizeLimitedListOf(MAX_STACKS)
            .xmap(SeedBagContents::new, SeedBagContents::stacks);
    public static final StreamCodec<RegistryFriendlyByteBuf, SeedBagContents> STREAM_CODEC = ItemStack.STREAM_CODEC
            .apply(ByteBufCodecs.list())
            .map(SeedBagContents::new, SeedBagContents::stacks);

    public SeedBagContents(List<ItemStack> items) {
        this(items, computeContentWeight(items));
    }

    private static Fraction computeContentWeight(List<ItemStack> content) {
        Fraction fraction = Fraction.ZERO;

        for(ItemStack itemstack : content) {
            fraction = fraction.add(Fraction.getFraction(itemstack.getCount(), itemstack.getMaxStackSize()));
        }

        return fraction;
    }


    public ItemStack getItemUnsafe(int index) {
        return this.stacks.get(index);
    }

    public Stream<ItemStack> itemCopyStream() {
        return this.stacks.stream().map(ItemStack::copy);
    }

    public List<ItemStack> stacksCopy() {
        return Lists.transform(this.stacks, ItemStack::copy);
    }

    public int size() {
        return this.stacks.size();
    }

    public Fraction weight() {
        return this.weight;
    }

    public boolean isEmpty() {
        return this.stacks.isEmpty();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof SeedBagContents)) {
            return false;
        }

        SeedBagContents otherContents = (SeedBagContents) other;
        return ItemStack.listMatches(this.stacks, otherContents.stacks);
    }


    public int hashCode() {
        return ItemStack.hashStackList(this.stacks);
    }

    public String toString() {
        return "SeedBagContents" + this.stacks;
    }


    public static class Mutable {
        private final List<ItemStack> items;
        private Fraction weight;
        private final Fraction maxWeight;
        private final int maxStacks;

        public Mutable(SeedBagContents contents, Fraction maxWeight, int maxStacks) {
            this.items = new ArrayList<>(contents.stacks());
            this.weight = contents.weight;
            this.maxWeight = maxWeight;
            this.maxStacks = maxStacks;
        }

        public Mutable clearItems() {
            this.items.clear();
            this.weight = Fraction.ZERO;
            return this;
        }

        private int findStackIndex(ItemStack stack) {
            if (!stack.isStackable()) {
                return -1;
            }

            for(int i = 0; i < this.items.size(); ++i) {
                if (ItemStack.isSameItemSameComponents(this.items.get(i), stack)) {
                    return i;
                }
            }

            return -1;
        }

        private int getMaxAmountToAdd(ItemStack stack) {
            ItemStack existing = ItemStack.EMPTY;
            int existingIndex = findStackIndex(stack);
            if (existingIndex != -1) {
                existing = items.get(existingIndex);
            }

            Fraction space = maxWeight.subtract(this.weight);
            return Math.max(space.divideBy(Fraction.getFraction(1, stack.getMaxStackSize())).intValue(), 0) - existing.getCount();
        }

        public int tryInsert(ItemStack stack) {
            if (this.items.size() == maxStacks) {
                return 0;
            }

            if (stack.isEmpty() || !stack.canFitInsideContainerItems()) {
                return 0;
            }

            int usableAmount = Math.min(stack.getCount(), this.getMaxAmountToAdd(stack));
            if (usableAmount == 0) {
                return 0;
            }

            int existingStackIndex = this.findStackIndex(stack);
            int used = 0;
            if (existingStackIndex != -1) {
                ItemStack existingStack = this.items.remove(existingStackIndex);
                int newCount = Math.min(existingStack.getCount() + usableAmount, existingStack.getMaxStackSize());
                ItemStack newStack = existingStack.copyWithCount(newCount);
                used = newCount - existingStack.getCount();

                stack.shrink(used);
                this.items.addFirst(newStack);
            } else {
                this.items.addFirst(stack.split(usableAmount));
                used = usableAmount;
            }
            this.weight = this.weight.add(Fraction.getFraction(used, stack.getMaxStackSize()));

            return used;
        }

        public int tryTransfer(Slot slot, Player player) {
            ItemStack stack = slot.getItem();
            int maxRoom = this.getMaxAmountToAdd(stack);
            return this.tryInsert(slot.safeTake(stack.getCount(), maxRoom, player));
        }

        @Nullable
        public ItemStack removeOne() {
            if (this.items.isEmpty()) {
                return null;
            } else {
                ItemStack stack = this.items.removeFirst().copy();
                this.weight = this.weight.subtract(Fraction.getFraction(stack.getCount(), stack.getMaxStackSize()));
                return stack;
            }
        }

        public Fraction weight() {
            return this.weight;
        }

        public SeedBagContents toImmutable() {
            return new SeedBagContents(List.copyOf(this.items));
        }
    }
}
