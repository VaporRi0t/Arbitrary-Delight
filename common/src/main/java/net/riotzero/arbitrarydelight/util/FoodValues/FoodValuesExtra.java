package net.riotzero.arbitrarydelight.util.FoodValues;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.riotzero.arbitrarydelight.ArbitraryDelight;
import net.riotzero.arbitrarydelight.registry.EffectRegistry;

public class FoodValuesExtra {
    public static final int BRIEF_DURATION = 600;
    public static final int SHORT_DURATION = 1200;
    public static final int MEDIUM_DURATION = 3600;
    public static final int LONG_DURATION = 6000;

    public static final FoodProperties SWEET_BERRY_CUSTARD = new FoodProperties.Builder()
            .nutrition(7).saturationMod(0.6F).alwaysEat()
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F).build();

    public static final FoodProperties GLISTERING_MELON_CUSTARD = new FoodProperties.Builder()
            .nutrition(7).saturationMod(0.6F).alwaysEat()
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0), 1.0F).build();

    public static final FoodProperties MELON_CUSTARD = new FoodProperties.Builder()
            .nutrition(7).saturationMod(0.6F).alwaysEat().build();

    public static final FoodProperties BERRY_MILK = new FoodProperties.Builder()
            .alwaysEat().effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 0), 1.0F).build();

    public static final FoodProperties GLISTERING_MELON_JUICE = new FoodProperties.Builder()
            .alwaysEat().effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0), 1.0F).build();

    public static final FoodProperties GLOW_POPSICLE = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.2F).fast().alwaysEat()
            .effect(new MobEffectInstance(MobEffects.GLOWING, 100, 0), 1.0F).build();

    public static final FoodProperties GLISTERING_MELON_POPSICLE = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.2F).fast().alwaysEat()
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1.0F).build();

    public static final FoodProperties GLOW_COOKIES = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.1F).fast()
            .effect(new MobEffectInstance(MobEffects.GLOWING, 100, 0), 1.0F).build();

    public static final FoodProperties GLOW_MILK = new FoodProperties.Builder()
            .alwaysEat().effect(new MobEffectInstance(MobEffects.GLOWING, 1200, 0), 1.0F).build();

    public static final FoodProperties GLOW_PIE_SLICE = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3F).fast()
            .effect(new MobEffectInstance(MobEffects.GLOWING, 600, 0, false, false), 1.0F).build();

    public static FoodProperties getGlowSquidPasta() {
        return new FoodProperties.Builder()
                .nutrition(14)
                .saturationMod(0.75F)
                .effect(new MobEffectInstance(EffectRegistry.NOURISHMENT.get(), 6000, 0), 1.0F)
                .effect(new MobEffectInstance(MobEffects.GLOWING, 1200, 0), 1.0F)
                .build();
    }

    public static final FoodProperties GOLDEN_APPLE_CIDER = new FoodProperties.Builder()
            .alwaysEat()
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 3600, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F).build();

    public static final FoodProperties ENCHANTED_GOLDEN_APPLE_CIDER = new FoodProperties.Builder()
            .alwaysEat()
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 3600, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 7200, 0), 1.0F).build();

    public static final FoodProperties COOKIES = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.1f).fast().build();

    public static final FoodProperties CHORUS_FRUIT_POPSICLE = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.2F).fast().alwaysEat().build();

    public static final FoodProperties CHORUS_FRUIT_CUSTARD = new FoodProperties.Builder()
            .nutrition(7).saturationMod(0.6F).alwaysEat()
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F).build();

    public static FoodProperties getChorusCookieProperties() {
        return new FoodProperties.Builder()
                .nutrition(2).saturationMod(0.1F).fast().alwaysEat()
                .effect(new MobEffectInstance(EffectRegistry.UNSTABLE_CHORUS.get(), 100, 0), 1.0F)
                .build();
    }

    public static FoodProperties getChorusJuiceProperties() {
        return new FoodProperties.Builder()
                .alwaysEat()
                .effect(new MobEffectInstance(EffectRegistry.UNSTABLE_CHORUS.get(), 200, 0), 1.0F)
                .effect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 0), 1.0F).build();
    }

    public static FoodProperties getSoupProperties(int duration) {
        return new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.6f)
                .effect(new MobEffectInstance(EffectRegistry.COMFORT.get(), duration, 0), 1.0F)
                .build();
    }

    public static FoodProperties getVanillaSoupEffect(Item item) {
        if (item == Items.MUSHROOM_STEW || item == Items.BEETROOT_SOUP) {
            return new FoodProperties.Builder()
                    .effect(new MobEffectInstance(EffectRegistry.COMFORT.get(), 3600, 0), 1.0F)
                    .build();
        }
        if (item == Items.RABBIT_STEW) {
            return new FoodProperties.Builder()
                    .effect(new MobEffectInstance(EffectRegistry.COMFORT.get(), 6000, 0), 1.0F)
                    .build();
        }
        return null;
    }
}