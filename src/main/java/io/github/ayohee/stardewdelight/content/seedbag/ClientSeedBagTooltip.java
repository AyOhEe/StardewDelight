package io.github.ayohee.stardewdelight.content.seedbag;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.apache.commons.lang3.math.Fraction;

public class ClientSeedBagTooltip implements ClientTooltipComponent {
    private static final ResourceLocation BACKGROUND_SPRITE = ResourceLocation.withDefaultNamespace("container/bundle/background");
    private static final int MARGIN_Y = 4;
    private static final int SLOT_SIZE_X = 18;
    private static final int SLOT_SIZE_Y = 20;
    private final SeedBagContents contents;
    private final Fraction maxWeight;
    private final int maxStacks;

    public ClientSeedBagTooltip(SeedBagContents contents, Fraction maxWeight, int maxStacks) {
        this.contents = contents;
        this.maxWeight = maxWeight;
        this.maxStacks = maxStacks;
    }


    public int getHeight() {
        return this.backgroundHeight() + MARGIN_Y;
    }

    public int getWidth(Font font) {
        return this.backgroundWidth();
    }

    private int backgroundWidth() {
        return this.gridSizeX() * SLOT_SIZE_X + 2;
    }

    private int backgroundHeight() {
        return this.gridSizeY() * SLOT_SIZE_Y + 2;
    }


    public void renderImage(Font font, int x, int y, GuiGraphics guiGraphics) {
        int i = this.gridSizeX();
        int j = this.gridSizeY();
        guiGraphics.blitSprite(BACKGROUND_SPRITE, x, y, this.backgroundWidth(), this.backgroundHeight());
        boolean flag = this.contents.weight().compareTo(maxWeight) >= 0 || this.contents.size() >= maxStacks;
        int k = 0;

        for(int l = 0; l < j; ++l) {
            for(int i1 = 0; i1 < i; ++i1) {
                int j1 = x + i1 * SLOT_SIZE_X + 1;
                int k1 = y + l * SLOT_SIZE_Y + 1;
                this.renderSlot(j1, k1, k++, flag, guiGraphics, font);
            }
        }

    }

    private void renderSlot(int x, int y, int itemIndex, boolean isBundleFull, GuiGraphics guiGraphics, Font font) {
        if (itemIndex >= this.contents.size()) {
            this.blit(guiGraphics, x, y, isBundleFull ? Texture.BLOCKED_SLOT : Texture.SLOT);
        } else {
            ItemStack itemstack = this.contents.getItemUnsafe(itemIndex);
            this.blit(guiGraphics, x, y, Texture.SLOT);
            guiGraphics.renderItem(itemstack, x + 1, y + 1, itemIndex);
            guiGraphics.renderItemDecorations(font, itemstack, x + 1, y + 1);
            if (itemIndex == 0) {
                AbstractContainerScreen.renderSlotHighlight(guiGraphics, x + 1, y + 1, 0);
            }
        }

    }

    private void blit(GuiGraphics guiGraphics, int x, int y, Texture texture) {
        guiGraphics.blitSprite(texture.sprite, x, y, 0, texture.w, texture.h);
    }

    private int gridSizeX() {
        return Math.max(2, (int)Math.ceil(Math.sqrt((double)this.contents.size() + (double)1.0F)));
    }

    private int gridSizeY() {
        return (int)Math.ceil(((double)this.contents.size() + (double)1.0F) / (double)this.gridSizeX());
    }

    @OnlyIn(Dist.CLIENT)
    enum Texture {
        BLOCKED_SLOT(ResourceLocation.withDefaultNamespace("container/bundle/blocked_slot"), SLOT_SIZE_X, SLOT_SIZE_Y),
        SLOT(ResourceLocation.withDefaultNamespace("container/bundle/slot"), SLOT_SIZE_X, SLOT_SIZE_Y);

        public final ResourceLocation sprite;
        public final int w;
        public final int h;

        Texture(ResourceLocation sprite, int w, int h) {
            this.sprite = sprite;
            this.w = w;
            this.h = h;
        }
    }
}
