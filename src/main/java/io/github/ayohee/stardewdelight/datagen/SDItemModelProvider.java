package io.github.ayohee.stardewdelight.datagen;

import io.github.ayohee.stardewdelight.register.SDItems;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

import static io.github.ayohee.stardewdelight.StardewDelight.MODID;

public class SDItemModelProvider extends ItemModelProvider {
    public SDItemModelProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, MODID, fileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(SDItems.EXAMPLE_ITEM.get());
    }

    /*----- NAMED WRAPPER FOR DataProvider -----*/
    public DataProvider namedWrapper() {
        return new DataProvider() {
            @Override
            public CompletableFuture<?> run(CachedOutput cachedOutput) {
                return SDItemModelProvider.this.run(cachedOutput);
            }

            @Override
            public String getName() {
                return "Stardew's Delight's Item Models";
            }
        };
    }
}
