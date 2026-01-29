package net.riotzero.arbitrarydelight.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.riotzero.arbitrarydelight.ArbitraryDelight;
import vectorwing.farmersdelight.common.block.PieBlock;

public class BlockRegistry {

    private static Identifier id(String path) {
        return new Identifier(ArbitraryDelight.MOD_ID, path);
    }

    public static void register() {

    }

    public static final Block PEPPERONI_PIZZA = Registry.register(
            Registries.BLOCK,
            id("pepperoni_pizza"),
            new PieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), () -> ItemRegistry.PEPPERONI_PIZZA_SLICE)
    );

    public static final Block CHEESE_PIZZA = Registry.register(
            Registries.BLOCK,
            id("cheese_pizza"),
            new PieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), () -> ItemRegistry.CHEESE_PIZZA_SLICE)
    );

    public static final Block VEGGIE_PIZZA = Registry.register(
            Registries.BLOCK,
            id("veggie_pizza"),
            new PieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), () -> ItemRegistry.VEGGIE_PIZZA_SLICE)
    );

    public static final Block SUPREME_PIZZA = Registry.register(
            Registries.BLOCK,
            id("supreme_pizza"),
            new PieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), () -> ItemRegistry.SUPREME_PIZZA_SLICE)
    );

    public static final Block GLOW_BERRY_CHEESECAKE = Registry.register(
            Registries.BLOCK,
            id("glow_berry_cheesecake"),
            new PieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), () -> ItemRegistry.GLOW_BERRY_CHEESECAKE_SLICE)
    );

    public static final Block HONEY_PIE = Registry.register(
            Registries.BLOCK,
            id("honey_pie"),
            new PieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), () -> ItemRegistry.HONEY_PIE_SLICE)
    );

    public static final Block HONEY_GLAZED_CHOCOLATE_PIE = Registry.register(
            Registries.BLOCK,
            id("honey_glazed_chocolate_pie"),
            new PieBlock(AbstractBlock.Settings.copy(Blocks.CAKE), () -> ItemRegistry.HONEY_GLAZED_CHOCOLATE_PIE_SLICE)
    );

    public static final Block SHREDDED_CHEESE_BAG = Registry.register(
            Registries.BLOCK,
            id("shredded_cheese_bag"),
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL))
    );

}
