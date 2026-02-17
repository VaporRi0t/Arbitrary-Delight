package net.riotzero.arbitrarydelight.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.riotzero.arbitrarydelight.ArbitraryDelight;

public class CreativeTabRegistry {
    // Use Architectury's DeferredRegister
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(ArbitraryDelight.MOD_ID, Registries.CREATIVE_MODE_TAB);

    // Use RegistrySupplier instead of DeferredHolder
    public static final RegistrySupplier<CreativeModeTab> ARBITRARYDELIGHT_TAB = CREATIVE_MODE_TABS.register("arbitrarydelight_tab",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemGroup.arbitrarydelight"))
                    .icon(() -> new ItemStack(ItemRegistry.CHICKEN_NOODLE_SOUP.get()))
                    .displayItems((parameters, output) -> {
                // Blocks
                output.accept(ItemRegistry.SHREDDED_CHEESE_BAG.get());
                // Tools
                output.accept(ItemRegistry.AMETHYST_KNIFE.get());
                // Ingredients
                output.accept(ItemRegistry.DARK_COCOA_BEANS.get());
                output.accept(ItemRegistry.EGG_YOLK.get());
                output.accept(ItemRegistry.CHEESE_BLOCK.get());
                output.accept(ItemRegistry.SHREDDED_CHEESE.get());
                output.accept(ItemRegistry.PEPPERONIS.get());
                output.accept(ItemRegistry.PIZZA_CRUST.get());
                output.accept(ItemRegistry.POTATO_FRIES.get());
                output.accept(ItemRegistry.BAKED_POTATO_FRIES.get());
                output.accept(ItemRegistry.CHICKEN_NUGGETS.get());
                output.accept(ItemRegistry.COOKED_CHICKEN_NUGGETS.get());
                // Drinks
                output.accept(ItemRegistry.HOT_DARK_COCOA.get());
                output.accept(ItemRegistry.GOLDEN_APPLE_CIDER.get());
                output.accept(ItemRegistry.ENCHANTED_GOLDEN_APPLE_CIDER.get());
                output.accept(ItemRegistry.CHORUS_FRUIT_JUICE.get());
                output.accept(ItemRegistry.GLISTERING_MELON_JUICE.get());
                output.accept(ItemRegistry.BERRY_MILK.get());
                output.accept(ItemRegistry.GLOW_BERRY_MILK.get());
                // Sweets
                output.accept(ItemRegistry.CHOCOLATE_CUSTARD.get());
                output.accept(ItemRegistry.DARK_CHOCOLATE_CUSTARD.get());
                output.accept(ItemRegistry.CHORUS_FRUIT_CUSTARD.get());
                output.accept(ItemRegistry.MELON_CUSTARD.get());
                output.accept(ItemRegistry.GLISTERING_MELON_CUSTARD.get());
                output.accept(ItemRegistry.SWEET_BERRY_CUSTARD.get());
                output.accept(ItemRegistry.HONEY_CUSTARD.get());
                output.accept(ItemRegistry.CHOCOLATE_POPSICLE.get());
                output.accept(ItemRegistry.DARK_CHOCOLATE_POPSICLE.get());
                output.accept(ItemRegistry.CHORUS_FRUIT_POPSICLE.get());
                output.accept(ItemRegistry.GLISTERING_MELON_POPSICLE.get());
                output.accept(ItemRegistry.SWEET_BERRY_POPSICLE.get());
                output.accept(ItemRegistry.GLOW_BERRY_POPSICLE.get());
                output.accept(ItemRegistry.HONEY_POPSICLE.get());
                output.accept(ItemRegistry.HONEY_GLAZED_CHOCOLATE_POPSICLE.get());
                output.accept(ItemRegistry.DARK_CHOCOLATE_COOKIE.get());
                output.accept(ItemRegistry.CHORUS_FRUIT_COOKIE.get());
                output.accept(ItemRegistry.GLOW_BERRY_COOKIE.get());
                output.accept(ItemRegistry.GLOW_BERRY_CHEESECAKE.get());
                output.accept(ItemRegistry.GLOW_BERRY_CHEESECAKE_SLICE.get());
                output.accept(ItemRegistry.HONEY_PIE.get());
                output.accept(ItemRegistry.HONEY_PIE_SLICE.get());
                output.accept(ItemRegistry.HONEY_GLAZED_CHOCOLATE_CHIP_COOKIE.get());
                output.accept(ItemRegistry.HONEY_GLAZED_CHOCOLATE_PIE.get());
                output.accept(ItemRegistry.HONEY_GLAZED_CHOCOLATE_PIE_SLICE.get());
                // Meals
                output.accept(ItemRegistry.CHICKEN_NOODLE_SOUP.get());
                output.accept(ItemRegistry.PASTA.get());
                output.accept(ItemRegistry.GLOW_SQUID_INK_PASTA.get());
                output.accept(ItemRegistry.SCRAMBLED_EGGS.get());
                output.accept(ItemRegistry.EGGS_AND_POTATOES.get());
                output.accept(ItemRegistry.NUGGETS_AND_FRIES.get());
                output.accept(ItemRegistry.PEPPERONI_PIZZA.get());
                output.accept(ItemRegistry.PEPPERONI_PIZZA_SLICE.get());
                output.accept(ItemRegistry.CHEESE_PIZZA.get());
                output.accept(ItemRegistry.CHEESE_PIZZA_SLICE.get());
                output.accept(ItemRegistry.VEGGIE_PIZZA.get());
                output.accept(ItemRegistry.VEGGIE_PIZZA_SLICE.get());
                output.accept(ItemRegistry.SUPREME_PIZZA.get());
                output.accept(ItemRegistry.SUPREME_PIZZA_SLICE.get());
            })
            .build());

    public static void init() {
        CREATIVE_MODE_TABS.register();
    }
}