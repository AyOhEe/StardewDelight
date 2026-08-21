package io.github.ayohee.stardewdelight.register;

import io.github.ayohee.stardewdelight.content.signs.FruitTreeHangingSignBlockEntity;
import io.github.ayohee.stardewdelight.content.signs.FruitTreeSignBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Arrays;

import static io.github.ayohee.stardewdelight.register.SDRegistries.BLOCK_ENTITY_TYPES;

public class SDBlockEntityTypes {
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FruitTreeSignBlockEntity>> SIGN = BLOCK_ENTITY_TYPES.register(
            "sign",
            () -> BlockEntityType.Builder.of(
                    FruitTreeSignBlockEntity::new,
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.WALL_SIGN).getBlock().get()
            ).build(null)
    );

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FruitTreeHangingSignBlockEntity>> HANGING_SIGN = BLOCK_ENTITY_TYPES.register(
            "hanging_sign",
            () -> BlockEntityType.Builder.of(
                    FruitTreeHangingSignBlockEntity::new,
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APRICOT).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.BANANA).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.MANGO).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.ORANGE).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.PEACH).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.APPLE).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get(),
                    SDBlocks.WOOD_BLOCKS.get(SDBlocks.SDWoodTypes.POMEGRANATE).get(SDBlocks.WoodBlockTypes.WALL_HANGING_SIGN).getBlock().get()
            ).build(null)
    );

    /*----- STATIC INITIALIZER -----*/
    public static void register() { }
}
