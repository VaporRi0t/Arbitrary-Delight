package net.riotzero.arbitrarydelight.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.riotzero.arbitrarydelight.ArbitraryDelight;
import net.riotzero.arbitrarydelight.util.effect.UnstableChorusEffect;

public class EffectRegistry {
    // Architectury's multi-platform registry
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(ArbitraryDelight.MOD_ID, Registries.MOB_EFFECT);

    // RegistrySupplier replaces DeferredHolder
    public static final RegistrySupplier<MobEffect> UNSTABLE_CHORUS =
            EFFECTS.register("unstable_chorus", UnstableChorusEffect::new);

    // Call this in ArbitraryDelight.init()
    public static void init() {
        EFFECTS.register();
    }
}