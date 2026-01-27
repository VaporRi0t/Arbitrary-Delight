package net.riotzero.arbitrarydelight.registry;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.riotzero.arbitrarydelight.ArbitraryDelight;
import net.riotzero.arbitrarydelight.util.effect.UnstableChorusEffect;

public class EffectRegistry {

    private static StatusEffect register(String id, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(ArbitraryDelight.MOD_ID, id), effect);
    }

    public static void register() {
    }

    public static final StatusEffect UNSTABLE_CHORUS =
            register("unstable_chorus", new UnstableChorusEffect());
}
