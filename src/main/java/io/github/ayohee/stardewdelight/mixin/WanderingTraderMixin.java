package io.github.ayohee.stardewdelight.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.item.trading.MerchantOffers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Supplier;

@Mixin(WanderingTrader.class)
public class WanderingTraderMixin {
    @Unique private static final double stardewdelight$UNIQUE_SEEDS_CHANCE = 0.5f;
    @Unique private static final Supplier<VillagerTrades.ItemListing>[] stardewdelight$ADDITIONAL_TRADES = new Supplier[] {
            () -> new VillagerTrades.ItemsForEmeralds(SDItems.RARE_SEED.asItem(), 5, 1, 1),
            () -> new VillagerTrades.ItemsForEmeralds(SDItems.QI_BEAN.asItem(), 5, 1, 1)
    };

    @Inject(
            method = "updateTrades",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/world/entity/npc/VillagerTrades$ItemListing;getOffer(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/item/trading/MerchantOffer;",
                    shift = At.Shift.AFTER
            )
    )
    private void stardewdelight$injectTrades(CallbackInfo ci, @Local MerchantOffers merchantoffers) {
        // TODO gross. why did @Shadow not work?
        RandomSource random = ((Entity)(Object)this).getRandom();

        if (random.nextDouble() < stardewdelight$UNIQUE_SEEDS_CHANCE) {
            int listingIndex = random.nextInt(stardewdelight$ADDITIONAL_TRADES.length);
            VillagerTrades.ItemListing listing = stardewdelight$ADDITIONAL_TRADES[listingIndex].get();
            merchantoffers.add(listing.getOffer((Entity)(Object)this, random));
        }
    }
}
