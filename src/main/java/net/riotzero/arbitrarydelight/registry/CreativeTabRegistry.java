package net.riotzero.arbitrarydelight.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.riotzero.arbitrarydelight.ArbitraryDelight;

public class CreativeTabRegistry {

    public static final ItemGroup ARBITRARYDELIGHT_TAB = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(ArbitraryDelight.MOD_ID, "arbitrarydelight_tab"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.arbitrarydelight"))
                    .icon(() -> new ItemStack(ItemRegistry.CHICKEN_NOODLE_SOUP))
                    .entries((context, entries) -> {

                        // Blocks
                        entries.add(ItemRegistry.SHREDDED_CHEESE_BAG);

                        // Tools
                        entries.add(ItemRegistry.AMETHYST_KNIFE);

                        // Ingredients
                        entries.add(ItemRegistry.DARK_COCOA_BEANS);
                        entries.add(ItemRegistry.EGG_YOLK);
                        entries.add(ItemRegistry.CHEESE_BLOCK);
                        entries.add(ItemRegistry.SHREDDED_CHEESE);
                        entries.add(ItemRegistry.PEPPERONIS);
                        entries.add(ItemRegistry.PIZZA_CRUST);
                        entries.add(ItemRegistry.POTATO_FRIES);
                        entries.add(ItemRegistry.BAKED_POTATO_FRIES);
                        entries.add(ItemRegistry.CHICKEN_NUGGETS);
                        entries.add(ItemRegistry.COOKED_CHICKEN_NUGGETS);

                        // Drinks
                        entries.add(ItemRegistry.HOT_DARK_COCOA);
                        entries.add(ItemRegistry.GOLDEN_APPLE_CIDER);
                        entries.add(ItemRegistry.ENCHANTED_GOLDEN_APPLE_CIDER);
                        entries.add(ItemRegistry.CHORUS_FRUIT_JUICE);
                        entries.add(ItemRegistry.GLISTERING_MELON_JUICE);
                        entries.add(ItemRegistry.BERRY_MILK);
                        entries.add(ItemRegistry.GLOW_BERRY_MILK);

                        // Sweets
                        entries.add(ItemRegistry.CHOCOLATE_CUSTARD);
                        entries.add(ItemRegistry.DARK_CHOCOLATE_CUSTARD);
                        entries.add(ItemRegistry.CHORUS_FRUIT_CUSTARD);
                        entries.add(ItemRegistry.MELON_CUSTARD);
                        entries.add(ItemRegistry.GLISTERING_MELON_CUSTARD);
                        entries.add(ItemRegistry.SWEET_BERRY_CUSTARD);
                        entries.add(ItemRegistry.HONEY_CUSTARD);
                        entries.add(ItemRegistry.CHOCOLATE_POPSICLE);
                        entries.add(ItemRegistry.DARK_CHOCOLATE_POPSICLE);
                        entries.add(ItemRegistry.CHORUS_FRUIT_POPSICLE);
                        entries.add(ItemRegistry.GLISTERING_MELON_POPSICLE);
                        entries.add(ItemRegistry.SWEET_BERRY_POPSICLE);
                        entries.add(ItemRegistry.GLOW_BERRY_POPSICLE);
                        entries.add(ItemRegistry.HONEY_POPSICLE);
                        entries.add(ItemRegistry.HONEY_GLAZED_CHOCOLATE_POPSICLE);
                        entries.add(ItemRegistry.DARK_CHOCOLATE_COOKIE);
                        entries.add(ItemRegistry.CHORUS_FRUIT_COOKIE);
                        entries.add(ItemRegistry.GLOW_BERRY_COOKIE);
                        entries.add(ItemRegistry.GLOW_BERRY_CHEESECAKE);
                        entries.add(ItemRegistry.GLOW_BERRY_CHEESECAKE_SLICE);
                        entries.add(ItemRegistry.HONEY_PIE);
                        entries.add(ItemRegistry.HONEY_PIE_SLICE);
                        entries.add(ItemRegistry.HONEY_GLAZED_CHOCOLATE_CHIP_COOKIE);
                        entries.add(ItemRegistry.HONEY_GLAZED_CHOCOLATE_PIE);
                        entries.add(ItemRegistry.HONEY_GLAZED_CHOCOLATE_PIE_SLICE);

                        // Meals
                        entries.add(ItemRegistry.CHICKEN_NOODLE_SOUP);
                        entries.add(ItemRegistry.PASTA);
                        entries.add(ItemRegistry.GLOW_SQUID_INK_PASTA);
                        entries.add(ItemRegistry.SCRAMBLED_EGGS);
                        entries.add(ItemRegistry.EGGS_AND_POTATOES);
                        entries.add(ItemRegistry.NUGGETS_AND_FRIES);
                        entries.add(ItemRegistry.PEPPERONI_PIZZA);
                        entries.add(ItemRegistry.PEPPERONI_PIZZA_SLICE);
                        entries.add(ItemRegistry.CHEESE_PIZZA);
                        entries.add(ItemRegistry.CHEESE_PIZZA_SLICE);
                    })
                    .build()
    );

    public static void register() {
    }
}
