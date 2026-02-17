package net.riotzero.arbitrarydelight.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.riotzero.arbitrarydelight.ArbitraryDelight;

@Mod(ArbitraryDelight.MOD_ID)
public final class ArbitraryDelightForge {
    public ArbitraryDelightForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(ArbitraryDelight.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        ArbitraryDelight.init();
    }
}
