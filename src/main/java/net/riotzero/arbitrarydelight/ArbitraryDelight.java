package net.riotzero.arbitrarydelight;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.riotzero.arbitrarydelight.registry.*;
import org.slf4j.Logger;

public class ArbitraryDelight implements ModInitializer {
    public static final String MOD_ID = "arbitrarydelight";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        BlockRegistry.register();
        ItemRegistry.register();
        EffectRegistry.register();
        CreativeTabRegistry.register();

        LOGGER.info("Arbitrary Delight initialized.");
    }
}
