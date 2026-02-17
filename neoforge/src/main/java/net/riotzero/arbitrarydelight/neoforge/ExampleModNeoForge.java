package net.riotzero.arbitrarydelight.neoforge;

import net.neoforged.fml.common.Mod;

import net.riotzero.arbitrarydelight.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
