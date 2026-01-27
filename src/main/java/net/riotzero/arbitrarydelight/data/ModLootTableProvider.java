package net.riotzero.arbitrarydelight.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.riotzero.arbitrarydelight.registry.BlockRegistry;

public final class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate() {
        addDrop(BlockRegistry.SHREDDED_CHEESE_BAG);
    }
}
