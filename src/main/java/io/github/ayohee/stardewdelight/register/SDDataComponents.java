package io.github.ayohee.stardewdelight.register;

import io.github.ayohee.stardewdelight.content.seedbag.SeedBagContents;
import net.minecraft.core.component.DataComponentType;

import java.util.function.UnaryOperator;

import static io.github.ayohee.stardewdelight.register.SDRegistries.DATA_COMPONENT_TYPES;

public class SDDataComponents {
    public static final DataComponentType<SeedBagContents> SEED_BAG_CONTENTS = register(
            "seed_bag_contents",
            builder -> builder.persistent(SeedBagContents.CODEC).networkSynchronized(SeedBagContents.STREAM_CODEC)
    );

    private static <T> DataComponentType<T> register(String name, UnaryOperator<DataComponentType.Builder<T>> builder) {
        DataComponentType<T> type = builder.apply(DataComponentType.builder()).build();
        DATA_COMPONENT_TYPES.register(name, () -> type);
        return type;
    }

    public static void register() { }
}
