package net.riotzero.arbitrarydelight.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import net.riotzero.arbitrarydelight.ArbitraryDelight;
import net.riotzero.arbitrarydelight.util.FoodValues.FoodValuesExtra;
import net.riotzero.arbitrarydelight.util.item.*;

import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.*;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.registry.ModItems.*;

public class ItemRegistry {

    // ---- Registry helper ----
    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ArbitraryDelight.MOD_ID, id), item);
    }

    public static void register() {

    }

    // ---- Items ----

    public static final Item AMETHYST_KNIFE = register("amethyst_knife",
            new KnifeItem(
                    MaterialRegistry.AMETHYST, // you may need to port this to Fabric ToolMaterial if it’s Forge Tier
                    2,
                    -2.0F,
                    basicItem()
            )
    );

    public static final Item PASTA = register("pasta",
            new ConsumableItem(bowlFoodItem(new FoodComponent.Builder()
                    .hunger(10)
                    .saturationModifier(0.6f)
                    .statusEffect(
                            new StatusEffectInstance(
                                    ModEffects.NOURISHMENT.get(), // if Refabricated exposes it differently, change this line
                                    FoodValuesExtra.MEDIUM_DURATION,
                                    0
                            ),
                            1.0f
                    )
                    .build()), true)
    );

    public static final Item SCRAMBLED_EGGS = register("scrambled_eggs",
            new ConsumableItem(bowlFoodItem(new FoodComponent.Builder()
                    .hunger(10)
                    .saturationModifier(0.6f)
                    .statusEffect(
                            new StatusEffectInstance(
                                    ModEffects.NOURISHMENT.get(),
                                    FoodValuesExtra.SHORT_DURATION,
                                    0
                            ),
                            1.0f
                    )
                    .build()), true)
    );

    public static final Item GLOW_SQUID_INK_PASTA = register("glow_squid_ink_pasta",
            new ConsumableItem(bowlFoodItem(FoodValuesExtra.GLOW_SQUID_INK_PASTA), true)
    );

    public static final Item EGGS_AND_POTATOES = register("eggs_and_potatoes",
            new ConsumableItem(bowlFoodItem(new FoodComponent.Builder()
                    .hunger(11)
                    .saturationModifier(0.6f)
                    .statusEffect(
                            new StatusEffectInstance(
                                    ModEffects.NOURISHMENT.get(),
                                    FoodValuesExtra.SHORT_DURATION,
                                    0
                            ),
                            1.0f
                    )
                    .build()), true)
    );

    public static final Item CHICKEN_NOODLE_SOUP = register("chicken_noodle_soup",
            new ConsumableItem(bowlFoodItem(new FoodComponent.Builder()
                    .hunger(16)
                    .saturationModifier(0.9f)
                    .statusEffect(
                            new StatusEffectInstance(
                                    ModEffects.COMFORT.get(),
                                    FoodValuesExtra.LONG_DURATION,
                                    0
                            ),
                            1.0f
                    )
                    .build()), true)
    );

    public static final Item POTATO_FRIES = register("potato_fries",
            new ConsumableItem(foodItem(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.3f)
                    .snack()
                    .build()))
    );

    public static final Item EGG_YOLK = register("egg_yolk",
            new ConsumableItem(foodItem(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.3f)
                    .snack()
                    .build()))
    );

    public static final Item BAKED_POTATO_FRIES = register("baked_potato_fries",
            new ConsumableItem(foodItem(new FoodComponent.Builder()
                    .hunger(3)
                    .saturationModifier(0.2f)
                    .snack()
                    .build()))
    );

    public static final Item CHICKEN_NUGGETS = register("chicken_nuggets",
            new ConsumableItem(foodItem(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.3f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3f)
                    .snack()
                    .build()))
    );

    public static final Item COOKED_CHICKEN_NUGGETS = register("cooked_chicken_nuggets",
            new ConsumableItem(foodItem(new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(0.6f)
                    .snack()
                    .build()))
    );

    public static final Item DARK_COCOA_BEANS = register("dark_cocoa_beans",
            new Item(basicItem())
    );

    public static final Item NUGGETS_AND_FRIES = register("nuggets_and_fries",
            new ConsumableItem(bowlFoodItem(new FoodComponent.Builder()
                    .hunger(10)
                    .saturationModifier(0.8f)
                    .statusEffect(
                            new StatusEffectInstance(ModEffects.NOURISHMENT.get(), FoodValuesExtra.MEDIUM_DURATION, 0),
                            1.0f
                    )
                    .build()), true)
    );

    public static final Item BERRY_MILK = register("berry_milk",
            new DrinkableItem(drinkItem().food(FoodValuesExtra.BERRY_MILK), true, false)
    );

    public static final Item HOT_DARK_COCOA = register("hot_dark_cocoa",
            new HotCocoaItem(drinkItem())
    );

    public static final Item GLISTERING_MELON_JUICE = register("glistering_melon_juice",
            new DrinkableItem(drinkItem().food(FoodValuesExtra.GLISTERING_MELON_JUICE), true, false)
    );

    public static final Item SWEET_BERRY_CUSTARD = register("sweet_berry_custard",
            new ConsumableItem(foodItem(FoodValuesExtra.SWEET_BERRY_CUSTARD)
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(16))
    );

    public static final Item CHOCOLATE_CUSTARD = register("chocolate_custard",
            new ConsumableItem(foodItem(FoodValuesExtra.SWEET_BERRY_CUSTARD)
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(16))
    );

    public static final Item DARK_CHOCOLATE_CUSTARD = register("dark_chocolate_custard",
            new ConsumableItem(foodItem(FoodValuesExtra.SWEET_BERRY_CUSTARD)
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(16))
    );

    public static final Item CHORUS_FRUIT_CUSTARD = register("chorus_fruit_custard",
            new ChorusFruitCustardItem(new Item.Settings().food(FoodValuesExtra.CHORUS_FRUIT_CUSTARD))
    );

    public static final Item CHORUS_FRUIT_COOKIE = register("chorus_fruit_cookie",
            new ChorusFruitCookieItem(new Item.Settings().food(FoodValuesExtra.CHORUS_FRUIT_COOKIE))
    );

    public static final Item MELON_CUSTARD = register("melon_custard",
            new ConsumableItem(foodItem(FoodValuesExtra.MELON_CUSTARD)
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(16))
    );

    public static final Item GLISTERING_MELON_CUSTARD = register("glistering_melon_custard",
            new ConsumableItem(foodItem(FoodValuesExtra.GLISTERING_MELON_CUSTARD)
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(16))
    );

    public static final Item SWEET_BERRY_POPSICLE = register("sweet_berry_popsicle",
            new PopsicleItem(foodItem(FoodValues.POPSICLE))
    );

    public static final Item CHOCOLATE_POPSICLE = register("chocolate_popsicle",
            new PopsicleItem(foodItem(FoodValues.POPSICLE))
    );

    public static final Item CHORUS_FRUIT_POPSICLE = register("chorus_fruit_popsicle",
            new ChorusFruitPopsicleItem(new Item.Settings().food(FoodValuesExtra.CHORUS_FRUIT_POPSICLE))
    );

    public static final Item CHORUS_FRUIT_JUICE = register("chorus_fruit_juice",
            new DrinkableItem(drinkItem().food(FoodValuesExtra.CHORUS_FRUIT_JUICE), true, false)
    );

    public static final Item GLISTERING_MELON_POPSICLE = register("glistering_melon_popsicle",
            new PopsicleItem(foodItem(FoodValuesExtra.GLISTERING_MELON_POPSICLE))
    );

    public static final Item GLOW_BERRY_MILK = register("glow_berry_milk",
            new DrinkableItem(drinkItem().food(FoodValuesExtra.GLOW_MILK), true, false)
    );

    public static final Item GLOW_BERRY_POPSICLE = register("glow_berry_popsicle",
            new PopsicleItem(foodItem(FoodValuesExtra.GLOW_POPSICLE))
    );

    public static final Item GLOW_BERRY_COOKIE = register("glow_berry_cookie",
            new Item(foodItem(FoodValuesExtra.GLOW_COOKIES))
    );

    public static final Item HONEY_GLAZED_CHOCOLATE_CHIP_COOKIE = register("honey_glazed_chocolate_chip_cookie",
            new Item(foodItem(FoodValuesExtra.COOKIES))
    );

    public static final Item DARK_CHOCOLATE_COOKIE = register("dark_chocolate_cookie",
            new Item(foodItem(FoodValuesExtra.COOKIES))
    );

    public static final Item HONEY_GLAZED_CHOCOLATE_POPSICLE = register("honey_glazed_chocolate_popsicle",
            new PopsicleItem(foodItem(FoodValues.POPSICLE))
    );

    public static final Item DARK_CHOCOLATE_POPSICLE = register("dark_chocolate_popsicle",
            new PopsicleItem(foodItem(FoodValues.POPSICLE))
    );

    public static final Item HONEY_PIE = register("honey_pie",
            new BlockItem(BlockRegistry.HONEY_PIE, basicItem())
    );

    public static final Item HONEY_PIE_SLICE = register("honey_pie_slice",
            new Item(foodItem(FoodValues.PIE_SLICE))
    );

    public static final Item HONEY_GLAZED_CHOCOLATE_PIE = register("honey_glazed_chocolate_pie",
            new BlockItem(BlockRegistry.HONEY_GLAZED_CHOCOLATE_PIE, basicItem())
    );

    public static final Item HONEY_GLAZED_CHOCOLATE_PIE_SLICE = register("honey_glazed_chocolate_pie_slice",
            new Item(foodItem(FoodValues.PIE_SLICE))
    );

    public static final Item HONEY_POPSICLE = register("honey_popsicle",
            new PopsicleItem(foodItem(FoodValues.POPSICLE))
    );

    public static final Item HONEY_CUSTARD = register("honey_custard",
            new ConsumableItem(foodItem(FoodValuesExtra.SWEET_BERRY_CUSTARD))
    );

    public static final Item GOLDEN_APPLE_CIDER = register("golden_apple_cider",
            new DrinkableItem(drinkItem().food(FoodValuesExtra.GOLDEN_APPLE_CIDER).rarity(Rarity.RARE), true, false)
    );

    public static final Item ENCHANTED_GOLDEN_APPLE_CIDER = register("enchanted_golden_apple_cider",
            new DrinkableItemExtra(drinkItem().food(FoodValuesExtra.ENCHANTED_GOLDEN_APPLE_CIDER).rarity(Rarity.EPIC), true, false)
    );

    public static final Item PEPPERONI_PIZZA = register("pepperoni_pizza",
            new BlockItem(BlockRegistry.PEPPERONI_PIZZA, basicItem())
    );

    public static final Item PEPPERONI_PIZZA_SLICE = register("pepperoni_pizza_slice",
            new Item(foodItem(FoodValues.PIE_SLICE))
    );

    public static final Item CHEESE_PIZZA = register("cheese_pizza",
            new BlockItem(BlockRegistry.CHEESE_PIZZA, basicItem())
    );

    public static final Item CHEESE_PIZZA_SLICE = register("cheese_pizza_slice",
            new Item(foodItem(FoodValues.PIE_SLICE))
    );

    public static final Item GLOW_BERRY_CHEESECAKE = register("glow_berry_cheesecake",
            new BlockItem(BlockRegistry.GLOW_BERRY_CHEESECAKE, basicItem())
    );

    public static final Item GLOW_BERRY_CHEESECAKE_SLICE = register("glow_berry_cheesecake_slice",
            new Item(foodItem(FoodValuesExtra.GLOW_PIE_SLICE))
    );

    public static final Item CHEESE_BLOCK = register("cheese_block",
            new Item(foodItem(FoodValues.WHEAT_DOUGH))
    );

    public static final Item PEPPERONIS = register("pepperonis",
            new Item(foodItem(FoodValues.MINCED_BEEF))
    );

    public static final Item PIZZA_CRUST = register("pizza_crust",
            new Item(foodItem(FoodValues.PIE_CRUST))
    );

    public static final Item SHREDDED_CHEESE = register("shredded_cheese",
            new Item(foodItem(FoodValues.WHEAT_DOUGH))
    );

    public static final Item SHREDDED_CHEESE_BAG = register("shredded_cheese_bag",
            new BlockItem(BlockRegistry.SHREDDED_CHEESE_BAG, basicItem())
    );
}
