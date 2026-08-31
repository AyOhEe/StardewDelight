package io.github.ayohee.stardewdelight.content.seedbag;

import io.github.ayohee.stardewdelight.register.SDDataComponents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.component.BundleContents;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.items.IItemHandler;
import org.apache.commons.lang3.math.Fraction;

import java.util.Optional;

public class SeedBagItem extends Item {
    private static final int BAR_COLOR = Mth.color(0.4F, 0.4F, 1.0F);

    protected final TagKey<Item> filter;
    protected final Fraction capacity;
    protected final int maxStacks;

    public SeedBagItem(Properties properties, TagKey<Item> acceptableItems, Fraction capacity, int maxStacks) {
        super(properties);

        this.filter = acceptableItems;
        this.capacity = capacity;
        this.maxStacks = maxStacks;
    }


    public static IItemHandler getCapability(ItemStack stack, Void _context) {
        SeedBagItem stackItem = (SeedBagItem) stack.getItem();
        SeedBagContents contents = stack.get(SDDataComponents.SEED_BAG_CONTENTS);

        if (contents == null) {
            return null;
        }

        return new ContentsWrapper(contents, stackItem);
    }


    @Override
    public boolean overrideStackedOnOther(ItemStack stack, Slot slot, ClickAction action, Player player) {
        if (stack.getCount() != 1 || action != ClickAction.SECONDARY) {
            return false;
        }

        SeedBagContents contents = stack.get(SDDataComponents.SEED_BAG_CONTENTS);
        if (contents == null) {
            return false;
        }

        ItemStack slotItem = slot.getItem();
        SeedBagContents.Mutable mutable = new SeedBagContents.Mutable(contents, capacity, maxStacks);
        if (slotItem.isEmpty()) {
            this.playRemoveOneSound(player);
            ItemStack removed = mutable.removeOne();

            if (removed != null) {
                ItemStack remainder = slot.safeInsert(removed);
                mutable.tryInsert(remainder);
            }
        } else if (slotItem.canFitInsideContainerItems()) {
            if (!canAddToContents(slotItem)) {
                this.playRemoveOneSound(player);
                return true;
            }

            int insertedCount = mutable.tryTransfer(slot, player);
            if (insertedCount > 0) {
                this.playInsertSound(player);
            }
        }

        stack.set(SDDataComponents.SEED_BAG_CONTENTS, mutable.toImmutable());
        return true;
    }

    @Override
    public boolean overrideOtherStackedOnMe(ItemStack stack, ItemStack other, Slot slot, ClickAction action, Player player, SlotAccess access) {
        if (stack.getCount() != 1) {
            return false;
        }

        if (action != ClickAction.SECONDARY || !slot.allowModification(player)) {
            return false;
        }

        SeedBagContents contents = stack.get(SDDataComponents.SEED_BAG_CONTENTS);
        if (contents == null) {
            return false;
        }



        SeedBagContents.Mutable mutable = new SeedBagContents.Mutable(contents, capacity, maxStacks);
        if (other.isEmpty()) {
            ItemStack removed = mutable.removeOne();
            if (removed != null) {
                this.playRemoveOneSound(player);
                access.set(removed);
            }
        } else {
            if (!canAddToContents(other)) {
                this.playRemoveOneSound(player);
                return true;
            }

            int insertedCount = mutable.tryInsert(other);
            if (insertedCount > 0) {
                this.playInsertSound(player);
            }
        }

        stack.set(SDDataComponents.SEED_BAG_CONTENTS, mutable.toImmutable());
        return true;
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemstack = player.getItemInHand(usedHand);
        if (dropContents(itemstack, player)) {
            this.playDropContentsSound(player);
            player.awardStat(Stats.ITEM_USED.get(this));
            return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
        } else {
            return InteractionResultHolder.fail(itemstack);
        }
    }

    private static boolean dropContents(ItemStack stack, Player player) {
        SeedBagContents contents = stack.get(SDDataComponents.SEED_BAG_CONTENTS);
        if (contents == null || contents.isEmpty()) {
            return false;
        }

        stack.set(SDDataComponents.SEED_BAG_CONTENTS, SeedBagContents.EMPTY);
        if (player instanceof ServerPlayer) {
            contents.stacksCopy().forEach(s -> player.drop(s, true));
        }

        return true;
    }


    @Override
    public boolean isBarVisible(ItemStack stack) {
        SeedBagContents contents = stack.getOrDefault(SDDataComponents.SEED_BAG_CONTENTS, SeedBagContents.EMPTY);
        return contents.weight().compareTo(Fraction.ZERO) > 0;
    }

    @Override
    public int getBarWidth(ItemStack stack) {
        SeedBagContents contents = stack.getOrDefault(SDDataComponents.SEED_BAG_CONTENTS, SeedBagContents.EMPTY);
        return Math.min(1 + Mth.mulAndTruncate(contents.weight().divideBy(capacity), 12), 13);
    }

    @Override
    public int getBarColor(ItemStack stack) {
        return BAR_COLOR;
    }


    @Override
    public Optional<TooltipComponent> getTooltipImage(ItemStack stack) {
        boolean shouldHide = stack.has(DataComponents.HIDE_TOOLTIP) || stack.has(DataComponents.HIDE_ADDITIONAL_TOOLTIP);
        return shouldHide
                ? Optional.empty()
                : Optional.ofNullable(stack.get(SDDataComponents.SEED_BAG_CONTENTS)).map(c -> new SeedBagTooltip(c, capacity, maxStacks));
    }


    @Override
    public void onDestroyed(ItemEntity itemEntity, DamageSource damageSource) {
        SeedBagContents contents = itemEntity.getItem().get(SDDataComponents.SEED_BAG_CONTENTS);
        if (contents != null) {
            itemEntity.getItem().set(SDDataComponents.SEED_BAG_CONTENTS, SeedBagContents.EMPTY);
            ItemUtils.onContainerDestroyed(itemEntity, contents.stacksCopy());
        }
    }


    private boolean canAddToContents(ItemStack stack) {
        return BuiltInRegistries.ITEM.asLookup().getOrThrow(filter).contains(stack.getItemHolder());
    }


    // SFX helpers
    private void playRemoveOneSound(Entity entity) {
        entity.playSound(SoundEvents.BUNDLE_REMOVE_ONE, 0.8F, 0.8F + entity.level().getRandom().nextFloat() * 0.4F);
    }

    private void playInsertSound(Entity entity) {
        entity.playSound(SoundEvents.BUNDLE_INSERT, 0.8F, 0.8F + entity.level().getRandom().nextFloat() * 0.4F);
    }

    private void playDropContentsSound(Entity entity) {
        entity.playSound(SoundEvents.BUNDLE_DROP_CONTENTS, 0.8F, 0.8F + entity.level().getRandom().nextFloat() * 0.4F);
    }


    private static class ContentsWrapper implements IItemHandler {
        private final SeedBagContents contents;
        private final SeedBagItem item;

        public ContentsWrapper(SeedBagContents contents, SeedBagItem item) {
            this.contents = contents;
            this.item = item;
        }

        @Override
        public int getSlots() {
            return contents.size();
        }

        @Override
        public ItemStack getStackInSlot(int i) {
            return contents.getItemUnsafe(i);
        }

        // TODO when Mutable is implemented
        @Override
        public ItemStack insertItem(int i, ItemStack itemStack, boolean b) {
            return null;
        }

        // TODO when Mutable is implemented
        @Override
        public ItemStack extractItem(int i, int i1, boolean b) {
            return null;
        }

        @Override
        public int getSlotLimit(int i) {
            return contents.getItemUnsafe(i).getMaxStackSize();
        }

        @Override
        public boolean isItemValid(int i, ItemStack stack) {
            return BuiltInRegistries.ITEM.asLookup().getOrThrow(item.filter).contains(stack.getItemHolder());
        }
    }
}
