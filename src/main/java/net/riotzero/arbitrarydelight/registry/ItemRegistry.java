package net.riotzero.arbitrarydelight.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.riotzero.arbitrarydelight.ArbitraryDelight;
import net.riotzero.arbitrarydelight.util.FoodValues.FoodValuesExtra;

import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.registry.ModItems.*;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArbitraryDelight.MOD_ID);

    public static final DeferredItem<Item> AMETHYST_KNIFE = ITEMS.register("amethyst_knife",
            () -> new KnifeItem(
                    MaterialRegistry.AMETHYST,
                    new Item.Properties()
                            .attributes(KnifeItem.createAttributes(
                                    MaterialRegistry.AMETHYST,
                                    1.8F,
                                    -2
                            ))));
    public static final DeferredItem<Item> PASTA = ITEMS.register("pasta",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.6f)
                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValuesExtra.MEDIUM_DURATION, 0), 1.0F)
                    .build()), true));
    public static final DeferredItem<Item> EGGS_AND_POTATOES = ITEMS.register("eggs_and_potatoes",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(11)
                    .saturationModifier(0.6f)
                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValuesExtra.SHORT_DURATION, 0), 1.0F)
                    .build()), true));
    public static final DeferredItem<Item> CHICKEN_NOODLE_SOUP = ITEMS.register("chicken_noodle_soup",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(16)
                    .saturationModifier(0.9f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValuesExtra.LONG_DURATION, 0), 1.0F)
                    .build()), true));
    public static final DeferredItem<Item> POTATO_FRIES = ITEMS.register("potato_fries",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(1)
                    .saturationModifier(0.3f)
                    .fast()
                    .build())));
    public static final DeferredItem<Item> BAKED_POTATO_FRIES = ITEMS.register("baked_potato_fries",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(3)
                    .saturationModifier(0.2f)
                    .fast()
                    .build())));
    public static final DeferredItem<Item> CHICKEN_NUGGETS = ITEMS.register("chicken_nuggets",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(1)
                    .saturationModifier(0.3f)
                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F)
                    .fast()
                    .build())));
    public static final DeferredItem<Item> COOKED_CHICKEN_NUGGETS = ITEMS.register("cooked_chicken_nuggets",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(2)
                    .saturationModifier(0.6f)
                    .fast()
                    .build())));
    public static final DeferredItem<Item> NUGGETS_AND_FRIES = ITEMS.register("nuggets_and_fries",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.8f)
                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValuesExtra.MEDIUM_DURATION, 0), 1.0F)
                    .build()), true));
    public static final DeferredItem<Item> BERRY_MILK = ITEMS.register("berry_milk",
            () -> new DrinkableItem(drinkItem()
                    .food(FoodValuesExtra.BERRY_MILK), true, false));
    public static final DeferredItem<Item> SWEET_BERRY_CUSTARD = ITEMS.register("sweet_berry_custard",
            () -> new ConsumableItem(foodItem(FoodValuesExtra.SWEET_BERRY_CUSTARD)
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(16)));

    public static final DeferredItem<Item> PEPPERONI_PIZZA = ITEMS.register("pepperoni_pizza",
            () -> new BlockItem(BlockRegistry.PEPPERONI_PIZZA.get(), basicItem()));
    public static final DeferredItem<Item> PEPPERONI_PIZZA_SLICE = ITEMS.register("pepperoni_pizza_slice",
            () -> new Item(foodItem(FoodValues.PIE_SLICE)));
    public static final DeferredItem<Item> CHEESE_PIZZA = ITEMS.register("cheese_pizza",
            () -> new BlockItem(BlockRegistry.CHEESE_PIZZA.get(), basicItem()));
    public static final DeferredItem<Item> CHEESE_PIZZA_SLICE = ITEMS.register("cheese_pizza_slice",
            () -> new Item(foodItem(FoodValues.PIE_SLICE)));

    public static final DeferredItem<Item> CHEESE_BLOCK = ITEMS.register("cheese_block",
            () -> new Item(foodItem(FoodValues.WHEAT_DOUGH)));
    public static final DeferredItem<Item> PEPPERONIS = ITEMS.register("pepperonis",
            () -> new Item(foodItem(FoodValues.MINCED_BEEF)));
    public static final DeferredItem<Item> PIZZA_CRUST = ITEMS.register("pizza_crust",
            () -> new Item(foodItem(FoodValues.PIE_CRUST)));
    public static final DeferredItem<Item> SHREDDED_CHEESE = ITEMS.register("shredded_cheese",
            () -> new Item(foodItem(FoodValues.WHEAT_DOUGH)));

}
