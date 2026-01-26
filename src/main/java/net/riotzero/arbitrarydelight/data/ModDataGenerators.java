package net.riotzero.arbitrarydelight.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.riotzero.arbitrarydelight.ArbitraryDelight;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = ArbitraryDelight.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class ModDataGenerators {
    private ModDataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        PackOutput output = event.getGenerator().getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        DataProvider.Factory<ModLootTableProvider> lootFactory =
                (PackOutput out) -> new ModLootTableProvider(out, lookupProvider);

        event.getGenerator().addProvider(event.includeServer(), lootFactory);
    }
}
