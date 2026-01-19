package net.riotzero.arbitrarydelight.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.riotzero.arbitrarydelight.ArbitraryDelight;
import net.riotzero.arbitrarydelight.util.FoodValues.FoodValuesExtra;

import net.riotzero.arbitrarydelight.util.item.*;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.*;
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
    public static final DeferredItem<Item> SCRAMBLED_EGGS = ITEMS.register("scrambled_eggs",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.6f)
                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValuesExtra.SHORT_DURATION, 0), 1.0F)
                    .build()), true));
    public static final DeferredItem<Item> GLOW_SQUID_INK_PASTA = ITEMS.register("glow_squid_ink_pasta",
            () -> new ConsumableItem(bowlFoodItem(FoodValuesExtra.GLOW_SQUID_INK_PASTA), true));
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
    public static final DeferredItem<Item> EGG_YOLK = ITEMS.register("egg_yolk",
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
    public static final DeferredItem<Item> DARK_COCOA_BEANS = ITEMS.register("dark_cocoa_beans",
            () -> new Item(basicItem()));
    public static final DeferredItem<Item> NUGGETS_AND_FRIES = ITEMS.register("nuggets_and_fries",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.8f)
                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValuesExtra.MEDIUM_DURATION, 0), 1.0F)
                    .build()), true));
    public static final DeferredItem<Item> BERRY_MILK = ITEMS.register("berry_milk",
            () -> new DrinkableItem(drinkItem()
                    .food(FoodValuesExtra.BERRY_MILK), true, false));
    public static final DeferredItem<Item> HOT_DARK_COCOA = ITEMS.register("hot_dark_cocoa",
            () -> new HotCocoaItem(drinkItem()));
public static final DeferredItem<Item> GLISTERING_MELON_JUICE = ITEMS.register("glistering_melon_juice",
            () -> new DrinkableItem(drinkItem()
                    .food(FoodValuesExtra.GLISTERING_MELON_JUICE), true, false));
    public static final DeferredItem<Item> SWEET_BERRY_CUSTARD = ITEMS.register("sweet_berry_custard",
            () -> new ConsumableItem(foodItem(FoodValuesExtra.SWEET_BERRY_CUSTARD)
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(16)));
    public static final DeferredItem<Item> CHOCOLATE_CUSTARD = ITEMS.register("chocolate_custard",
            () -> new ConsumableItem(foodItem(FoodValuesExtra.SWEET_BERRY_CUSTARD)
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(16)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_CUSTARD = ITEMS.register("dark_chocolate_custard",
            () -> new ConsumableItem(foodItem(FoodValuesExtra.SWEET_BERRY_CUSTARD)
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(16)));
    public static final DeferredItem<Item> CHORUS_FRUIT_CUSTARD = ITEMS.register("chorus_fruit_custard",
            () -> new ChorusFruitCustardItem(
                    new Item.Properties().food(FoodValuesExtra.CHORUS_FRUIT_CUSTARD)
            ));
    public static final DeferredItem<Item> CHORUS_FRUIT_COOKIE = ITEMS.register("chorus_fruit_cookie",
            () -> new ChorusFruitCookieItem(
                    new Item.Properties().food(FoodValuesExtra.CHORUS_FRUIT_COOKIE)
            ));
    public static final DeferredItem<Item> MELON_CUSTARD = ITEMS.register("melon_custard",
            () -> new ConsumableItem(foodItem(FoodValuesExtra.MELON_CUSTARD)
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(16)));
    public static final DeferredItem<Item> GLISTERING_MELON_CUSTARD = ITEMS.register("glistering_melon_custard",
            () -> new ConsumableItem(foodItem(FoodValuesExtra.GLISTERING_MELON_CUSTARD)
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(16)));
    public static final DeferredItem<Item> SWEET_BERRY_POPSICLE = ITEMS.register("sweet_berry_popsicle",
            () -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    public static final DeferredItem<Item> CHOCOLATE_POPSICLE = ITEMS.register("chocolate_popsicle",
            () -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    public static final DeferredItem<Item> CHORUS_FRUIT_POPSICLE = ITEMS.register("chorus_fruit_popsicle",
            () -> new ChorusFruitPopsicleItem(
                    new Item.Properties().food(FoodValuesExtra.CHORUS_FRUIT_POPSICLE)
            ));
    public static final DeferredItem<Item> CHORUS_FRUIT_JUICE = ITEMS.register("chorus_fruit_juice",
            () -> new DrinkableItem(drinkItem()
                    .food(FoodValuesExtra.CHORUS_FRUIT_JUICE), true, false));
    public static final DeferredItem<Item> GLISTERING_MELON_POPSICLE = ITEMS.register("glistering_melon_popsicle",
            () -> new PopsicleItem(foodItem(FoodValuesExtra.GLISTERING_MELON_POPSICLE)));
    public static final DeferredItem<Item> GLOW_BERRY_MILK = ITEMS.register("glow_berry_milk",
            () -> new DrinkableItem(drinkItem()
                    .food(FoodValuesExtra.GLOW_MILK), true, false));
    public static final DeferredItem<Item> GLOW_BERRY_POPSICLE = ITEMS.register("glow_berry_popsicle",
            () -> new PopsicleItem(foodItem(FoodValuesExtra.GLOW_POPSICLE)));
    public static final DeferredItem<Item> GLOW_BERRY_COOKIE = ITEMS.register("glow_berry_cookie",
            () -> new Item(foodItem(FoodValuesExtra.GLOW_COOKIES)));

    public static final DeferredItem<Item> HONEY_GLAZED_CHOCOLATE_CHIP_COOKIE = ITEMS.register(
            "honey_glazed_chocolate_chip_cookie",
            () -> new Item(foodItem(FoodValuesExtra.COOKIES)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_COOKIE = ITEMS.register(
            "dark_chocolate_cookie",
            () -> new Item(foodItem(FoodValuesExtra.COOKIES)));
    public static final DeferredItem<Item> HONEY_GLAZED_CHOCOLATE_POPSICLE = ITEMS.register(
            "honey_glazed_chocolate_popsicle",
            () -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    public static final DeferredItem<Item> DARK_CHOCOLATE_POPSICLE = ITEMS.register(
            "dark_chocolate_popsicle",
            () -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));

    public static final DeferredItem<Item> HONEY_PIE = ITEMS.register("honey_pie",
            () -> new BlockItem(BlockRegistry.HONEY_PIE.get(), basicItem()));
    public static final DeferredItem<Item> HONEY_PIE_SLICE = ITEMS.register("honey_pie_slice",
            () -> new Item(foodItem(FoodValues.PIE_SLICE)));

    public static final DeferredItem<Item> HONEY_GLAZED_CHOCOLATE_PIE = ITEMS.register("honey_glazed_chocolate_pie",
            () -> new BlockItem(BlockRegistry.HONEY_GLAZED_CHOCOLATE_PIE.get(), basicItem()));
    public static final DeferredItem<Item> HONEY_GLAZED_CHOCOLATE_PIE_SLICE = ITEMS.register("honey_glazed_chocolate_pie_slice",
            () -> new Item(foodItem(FoodValues.PIE_SLICE)));

    public static final DeferredItem<Item> HONEY_POPSICLE = ITEMS.register("honey_popsicle",
            () -> new PopsicleItem(foodItem(FoodValues.POPSICLE)));
    public static final DeferredItem<Item> HONEY_CUSTARD = ITEMS.register("honey_custard",
            () -> new ConsumableItem(foodItem(FoodValuesExtra.SWEET_BERRY_CUSTARD)));

    public static final DeferredItem<Item> GOLDEN_APPLE_CIDER = ITEMS.register("golden_apple_cider",
            () -> new DrinkableItem(drinkItem().food(FoodValuesExtra.GOLDEN_APPLE_CIDER).rarity(Rarity.RARE), true,
                    false));
    public static final DeferredItem<Item> ENCHANTED_GOLDEN_APPLE_CIDER = ITEMS.register("enchanted_golden_apple_cider",
            () -> new DrinkableItemExtra(drinkItem().food(FoodValuesExtra.ENCHANTED_GOLDEN_APPLE_CIDER).rarity(Rarity.EPIC),
                    true,
                    false));

    public static final DeferredItem<Item> PEPPERONI_PIZZA = ITEMS.register("pepperoni_pizza",
            () -> new BlockItem(BlockRegistry.PEPPERONI_PIZZA.get(), basicItem()));
    public static final DeferredItem<Item> PEPPERONI_PIZZA_SLICE = ITEMS.register("pepperoni_pizza_slice",
            () -> new Item(foodItem(FoodValues.PIE_SLICE)));
    public static final DeferredItem<Item> CHEESE_PIZZA = ITEMS.register("cheese_pizza",
            () -> new BlockItem(BlockRegistry.CHEESE_PIZZA.get(), basicItem()));
    public static final DeferredItem<Item> CHEESE_PIZZA_SLICE = ITEMS.register("cheese_pizza_slice",
            () -> new Item(foodItem(FoodValues.PIE_SLICE)));
    public static final DeferredItem<Item> GLOW_BERRY_CHEESECAKE = ITEMS.register("glow_berry_cheesecake",
            () -> new BlockItem(BlockRegistry.GLOW_BERRY_CHEESECAKE.get(), basicItem()));
    public static final DeferredItem<Item> GLOW_BERRY_CHEESECAKE_SLICE = ITEMS.register("glow_berry_cheesecake_slice",
            () -> new Item(foodItem(FoodValuesExtra.GLOW_PIE_SLICE)));

    public static final DeferredItem<Item> CHEESE_BLOCK = ITEMS.register("cheese_block",
            () -> new Item(foodItem(FoodValues.WHEAT_DOUGH)));
    public static final DeferredItem<Item> PEPPERONIS = ITEMS.register("pepperonis",
            () -> new Item(foodItem(FoodValues.MINCED_BEEF)));
    public static final DeferredItem<Item> PIZZA_CRUST = ITEMS.register("pizza_crust",
            () -> new Item(foodItem(FoodValues.PIE_CRUST)));
    public static final DeferredItem<Item> SHREDDED_CHEESE = ITEMS.register("shredded_cheese",
            () -> new Item(foodItem(FoodValues.WHEAT_DOUGH)));

    public static final DeferredItem<Item> SHREDDED_CHEESE_BAG = ITEMS.register("shredded_cheese_bag",
            () -> new BlockItem(BlockRegistry.SHREDDED_CHEESE_BAG.get(), basicItem()));

}
