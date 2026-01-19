package net.riotzero.arbitrarydelight;

import com.mojang.logging.LogUtils;
import net.riotzero.arbitrarydelight.registry.BlockRegistry;
import net.riotzero.arbitrarydelight.registry.CreativeTabRegistry;
import net.riotzero.arbitrarydelight.registry.EffectRegistry;
import net.riotzero.arbitrarydelight.registry.ItemRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ArbitraryDelight.MOD_ID)
public class ArbitraryDelight {
    public static final String MOD_ID = "arbitrarydelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ArbitraryDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ItemRegistry.ITEMS.register(modEventBus);
        BlockRegistry.BLOCKS.register(modEventBus);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modEventBus);
        EffectRegistry.EFFECTS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Nothing yet
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Nothing yet
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Nothing yet
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Nothing yet
        }
    }
}
