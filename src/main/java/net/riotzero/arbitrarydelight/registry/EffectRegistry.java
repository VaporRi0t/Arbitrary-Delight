package net.riotzero.arbitrarydelight.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.riotzero.arbitrarydelight.ArbitraryDelight;
import net.riotzero.arbitrarydelight.util.effect.UnstableChorusEffect;

public class EffectRegistry {
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, ArbitraryDelight.MOD_ID);

    public static final RegistryObject<MobEffect> UNSTABLE_CHORUS =
            EFFECTS.register("unstable_chorus", UnstableChorusEffect::new);
}
