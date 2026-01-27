package net.riotzero.arbitrarydelight.util.FoodValues;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.FoodComponent;
import net.riotzero.arbitrarydelight.registry.EffectRegistry;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.Map;

public class FoodValuesExtra {

    public static final int BRIEF_DURATION = 600;
    public static final int SHORT_DURATION = 1200;
    public static final int MEDIUM_DURATION = 3600;
    public static final int LONG_DURATION = 6000;

    public static final FoodComponent SWEET_BERRY_CUSTARD =
            new FoodComponent.Builder()
                    .hunger(7)
                    .saturationModifier(0.6F)
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0F)
                    .build();

    public static final FoodComponent GLISTERING_MELON_CUSTARD =
            new FoodComponent.Builder()
                    .hunger(7)
                    .saturationModifier(0.6F)
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0), 1.0F)
                    .build();

    public static final FoodComponent MELON_CUSTARD =
            new FoodComponent.Builder()
                    .hunger(7)
                    .saturationModifier(0.6F)
                    .alwaysEdible()
                    .build();

    public static final FoodComponent BERRY_MILK =
            new FoodComponent.Builder()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1.0F)
                    .build();

    public static final FoodComponent GLISTERING_MELON_JUICE =
            new FoodComponent.Builder()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0), 1.0F)
                    .build();

    public static final Map<Item, FoodComponent> VANILLA_SOUP_EFFECTS;
    public static final FoodComponent RABBIT_STEW_BUFF;

    public static final FoodComponent GLOW_POPSICLE =
            new FoodComponent.Builder()
                    .hunger(3)
                    .saturationModifier(0.2F)
                    .snack()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0), 1.0F)
                    .build();

    public static final FoodComponent GLISTERING_MELON_POPSICLE =
            new FoodComponent.Builder()
                    .hunger(3)
                    .saturationModifier(0.2F)
                    .snack()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0), 1.0F)
                    .build();

    public static final FoodComponent GLOW_COOKIES =
            new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(0.1F)
                    .snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0), 1.0F)
                    .build();

    public static final FoodComponent GLOW_MILK =
            new FoodComponent.Builder()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0), 1.0F)
                    .build();

    public static final FoodComponent GLOW_PIE_SLICE =
            new FoodComponent.Builder()
                    .hunger(3)
                    .saturationModifier(0.3F)
                    .snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600, 0, false, false), 1.0F)
                    .build();

    public static final FoodComponent GLOW_SQUID_INK_PASTA =
            new FoodComponent.Builder()
                    .hunger(14)
                    .saturationModifier(0.75F)
                    .statusEffect(nourishment(6000), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0), 1.0F)
                    .build();

    public static final FoodComponent GOLDEN_APPLE_CIDER =
            new FoodComponent.Builder()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 0), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F)
                    .build();

    public static final FoodComponent ENCHANTED_GOLDEN_APPLE_CIDER =
            new FoodComponent.Builder()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 3), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 1), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 7200, 0), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 7200, 0), 1.0F)
                    .build();

    public static final FoodComponent COOKIES =
            new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(0.1F)
                    .snack()
                    .build();

    public static final FoodComponent CHORUS_FRUIT_POPSICLE =
            new FoodComponent.Builder()
                    .hunger(3)
                    .saturationModifier(0.2F)
                    .snack()
                    .alwaysEdible()
                    .build();

    public static final FoodComponent CHORUS_FRUIT_CUSTARD =
            new FoodComponent.Builder()
                    .hunger(7)
                    .saturationModifier(0.6F)
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0F)
                    .build();

    public static final FoodComponent CHORUS_FRUIT_COOKIE =
            new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(0.1F)
                    .snack()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(EffectRegistry.UNSTABLE_CHORUS, 100, 0), 1.0F)
                    .build();

    public static final FoodComponent CHORUS_FRUIT_JUICE =
            new FoodComponent.Builder()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(EffectRegistry.UNSTABLE_CHORUS, 200, 0), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0), 1.0F)
                    .build();

    public static StatusEffectInstance comfort(int duration) {
        return new StatusEffectInstance(ModEffects.COMFORT.get(), duration, 0, false, false);
    }

    public static StatusEffectInstance nourishment(int duration) {
        return new StatusEffectInstance(ModEffects.NOURISHMENT.get(), duration, 0, false, false);
    }

    static {
        VANILLA_SOUP_EFFECTS = new ImmutableMap.Builder<Item, FoodComponent>()
                .put(Items.MUSHROOM_STEW, new FoodComponent.Builder().statusEffect(comfort(3600), 1.0F).build())
                .put(Items.BEETROOT_SOUP, new FoodComponent.Builder().statusEffect(comfort(3600), 1.0F).build())
                .put(Items.RABBIT_STEW, new FoodComponent.Builder().statusEffect(comfort(6000), 1.0F).build())
                .build();

        RABBIT_STEW_BUFF = new FoodComponent.Builder()
                .hunger(14)
                .saturationModifier(0.75F)
                .statusEffect(comfort(6000), 1.0F)
                .build();
    }
}
