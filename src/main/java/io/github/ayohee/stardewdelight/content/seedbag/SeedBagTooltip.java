package io.github.ayohee.stardewdelight.content.seedbag;

import net.minecraft.world.inventory.tooltip.TooltipComponent;
import org.apache.commons.lang3.math.Fraction;

public record SeedBagTooltip(SeedBagContents contents, Fraction maxWeight, int maxStacks) implements TooltipComponent {
}
