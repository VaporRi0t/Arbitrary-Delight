package net.riotzero.arbitrarydelight.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.riotzero.arbitrarydelight.ArbitraryDelight;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.ToIntFunction;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ArbitraryDelight.MOD_ID, Registries.BLOCK);

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (state) -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }

    // 1.20.1 uses BlockBehaviour.Properties.copy() instead of ofFullCopy()
    public static final RegistrySupplier<Block> PEPPERONI_PIZZA = BLOCKS.register("pepperoni_pizza",
            () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ItemRegistry.PEPPERONI_PIZZA_SLICE));

    public static final RegistrySupplier<Block> CHEESE_PIZZA = BLOCKS.register("cheese_pizza",
            () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ItemRegistry.CHEESE_PIZZA_SLICE));

    public static final RegistrySupplier<Block> VEGGIE_PIZZA = BLOCKS.register("veggie_pizza",
            () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ItemRegistry.VEGGIE_PIZZA_SLICE));

    public static final RegistrySupplier<Block> SUPREME_PIZZA = BLOCKS.register("supreme_pizza",
            () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ItemRegistry.SUPREME_PIZZA_SLICE));

    public static final RegistrySupplier<Block> GLOW_BERRY_CHEESECAKE = BLOCKS.register("glow_berry_cheesecake",
            () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ItemRegistry.GLOW_BERRY_CHEESECAKE_SLICE));

    public static final RegistrySupplier<Block> SHREDDED_CHEESE_BAG = BLOCKS.register("shredded_cheese_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistrySupplier<Block> HONEY_PIE = BLOCKS.register("honey_pie",
            () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ItemRegistry.HONEY_PIE_SLICE));

    public static final RegistrySupplier<Block> HONEY_GLAZED_CHOCOLATE_PIE = BLOCKS.register("honey_glazed_chocolate_pie",
            () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), ItemRegistry.HONEY_GLAZED_CHOCOLATE_PIE_SLICE));

    public static void init() {
        BLOCKS.register();
    }
}