package net.riotzero.arbitrarydelight.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.riotzero.arbitrarydelight.ArbitraryDelight;
import net.riotzero.arbitrarydelight.util.effect.UnstableChorusEffect;

public class EffectRegistry {
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(ArbitraryDelight.MOD_ID, Registries.MOB_EFFECT);

    public static final RegistrySupplier<MobEffect> UNSTABLE_CHORUS =
            EFFECTS.register("unstable_chorus", UnstableChorusEffect::new);

    public static final RegistrySupplier<MobEffect> NOURISHMENT = EFFECTS.register("nourishment",
            () -> new SimpleEffect(MobEffectCategory.BENEFICIAL, 0xFFAA00));

    public static final RegistrySupplier<MobEffect> COMFORT = EFFECTS.register("comfort",
            () -> new SimpleEffect(MobEffectCategory.BENEFICIAL, 0x00FFAA));

    public static void init() {
        EFFECTS.register();
    }

    private static class SimpleEffect extends MobEffect {
        public SimpleEffect(MobEffectCategory category, int color) {
            super(category, color);
        }
    }
}