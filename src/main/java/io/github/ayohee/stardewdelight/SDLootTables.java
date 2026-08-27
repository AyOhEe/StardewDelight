package io.github.ayohee.stardewdelight;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

public class SDLootTables {
    public static final ResourceKey<LootTable> PARTIAL_ANCIENT_SEED = key("partial_ancient_seed");
    public static final ResourceKey<LootTable> PARTIAL_SEEDS_OR_PRODUCE = key("partial_seeds_or_produce");

    private static ResourceKey<LootTable> key(String name) {
        return ResourceKey.create(Registries.LOOT_TABLE, StardewDelight.modLoc(name));
    }
}
