package net.riotzero.arbitrarydelight.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.riotzero.arbitrarydelight.ArbitraryDelight;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArbitraryDelight.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ARBITRARYDELIGHT_TAB = CREATIVE_MODE_TABS.register("arbitrarydelight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.arbitrarydelight"))
            .icon(() -> ItemRegistry.CHICKEN_NOODLE_SOUP.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                // Blocks
                output.accept(ItemRegistry.SHREDDED_CHEESE_BAG.get());
                // Tools
                output.accept(ItemRegistry.AMETHYST_KNIFE.get());
                // Ingredients
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
                output.accept(ItemRegistry.GOLDEN_APPLE_CIDER.get());
                output.accept(ItemRegistry.ENCHANTED_GOLDEN_APPLE_CIDER.get());
                output.accept(ItemRegistry.GLISTERING_MELON_JUICE.get());
                output.accept(ItemRegistry.BERRY_MILK.get());
                output.accept(ItemRegistry.GLOW_BERRY_MILK.get());
                // Sweets
                output.accept(ItemRegistry.MELON_CUSTARD.get());
                output.accept(ItemRegistry.GLISTERING_MELON_CUSTARD.get());
                output.accept(ItemRegistry.SWEET_BERRY_CUSTARD.get());
                output.accept(ItemRegistry.GLISTERING_MELON_POPSICLE.get());
                output.accept(ItemRegistry.SWEET_BERRY_POPSICLE.get());
                output.accept(ItemRegistry.GLOW_BERRY_POPSICLE.get());
                output.accept(ItemRegistry.GLOW_BERRY_COOKIE.get());
                output.accept(ItemRegistry.GLOW_BERRY_CHEESECAKE.get());
                output.accept(ItemRegistry.GLOW_BERRY_CHEESECAKE_SLICE.get());
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

            })
            .build());
}