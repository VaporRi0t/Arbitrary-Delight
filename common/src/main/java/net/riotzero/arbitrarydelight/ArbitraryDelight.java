package net.riotzero.arbitrarydelight;

import net.riotzero.arbitrarydelight.registry.*;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

public class ArbitraryDelight {
    public static final String MOD_ID = "arbitrarydelight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void init() {
        BlockRegistry.init();
        ItemRegistry.init();
        CreativeTabRegistry.init();
        EffectRegistry.init();
    }
}