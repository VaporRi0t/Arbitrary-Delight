package net.riotzero.arbitrarydelight.util.FoodValues;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class FoodValuesExtra {
    public static final int BRIEF_DURATION = 600;
    public static final int SHORT_DURATION = 1200;
    public static final int MEDIUM_DURATION = 3600;
    public static final int LONG_DURATION = 6000;
    public static final FoodProperties SWEET_BERRY_CUSTARD =
            (new FoodProperties.Builder()).nutrition(7).saturationModifier(0.6F).alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F).build();
    public static final FoodProperties BERRY_MILK = (new FoodProperties.Builder()).alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 0), 1.0F).build();
    public static final Map<Item, FoodProperties> VANILLA_SOUP_EFFECTS;
    public static final FoodProperties RABBIT_STEW_BUFF;
    public static final FoodProperties GLOW_POPSICLE = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.2F).fast().alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.GLOWING, 100, 0), 1.0F).build();
    public static final FoodProperties GLOW_COOKIES = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).fast().effect(() -> new MobEffectInstance(MobEffects.GLOWING, 100, 0), 1.0F).build();
    public static final FoodProperties GLOW_MILK =
            (new FoodProperties.Builder()).alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.GLOWING, 1200, 0), 1.0F).build();

    public FoodValuesExtra() {
    }

    public static MobEffectInstance comfort(int duration) {
        return new MobEffectInstance(ModEffects.COMFORT, duration, 0, false, false);
    }

    public static MobEffectInstance nourishment(int duration) {
        return new MobEffectInstance(ModEffects.NOURISHMENT, duration, 0, false, false);
    }

    static {
        VANILLA_SOUP_EFFECTS = (new ImmutableMap.Builder()).put(Items.MUSHROOM_STEW, (new FoodProperties.Builder()).effect(() -> comfort(3600), 1.0F).build()).put(Items.BEETROOT_SOUP, (new FoodProperties.Builder()).effect(() -> comfort(3600), 1.0F).build()).put(Items.RABBIT_STEW, (new FoodProperties.Builder()).effect(() -> comfort(6000), 1.0F).build()).build();
        RABBIT_STEW_BUFF = (new FoodProperties.Builder()).nutrition(14).saturationModifier(0.75F).effect(() -> comfort(6000), 1.0F).build();
    }
}
