package io.github.ayohee.stardewdelight.register.lib;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.annotation.Nullable;

public class DeferredBlockItem<B extends Block> implements ItemLike {
    protected DeferredBlock<B> block;
    protected @Nullable DeferredItem<? extends Item> item;

    public DeferredBlockItem(DeferredBlock<B> block, DeferredRegister.Items itemRegistry) {
        this.block = block;
        this.item = itemRegistry.registerSimpleBlockItem(block);
    }

    public DeferredBlockItem(DeferredBlock<B> block) {
        this.block = block;
        this.item = null;
    }

    public DeferredBlock<B> getBlock() {
        return block;
    }

    public DeferredItem<? extends Item> getItem() {
        if (item == null) {
            throw new IllegalStateException("DeferredBlockItem has not yet been assigned an item, and did not create one");
        }
        return item;
    }

    public void provideItem(DeferredItem<? extends Item> item) {
        if (this.item == null) {
            this.item = item;
        } else {
            throw new IllegalStateException("DeferredBlockItem already has non-null item field when trying to provide item");
        }
    }

    @Override
    public Item asItem() {
        return getItem().asItem();
    }
}
