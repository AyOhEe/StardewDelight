package io.github.ayohee.stardewdelight;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class SDBlockStateProperties {
    public static final IntegerProperty AGE_6 = IntegerProperty.create("age", 0, 6);
    public static final BooleanProperty FRUIT = BooleanProperty.create("fruit");
}
