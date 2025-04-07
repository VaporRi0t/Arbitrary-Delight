package net.riotzero.arbitrarydelight.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.riotzero.arbitrarydelight.ArbitraryDelight;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.ToIntFunction;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ArbitraryDelight.MOD_ID);

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (state) -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }

    public static final DeferredBlock<Block> PEPPERONI_PIZZA = BLOCKS.register("pepperoni_pizza",
            () -> new PieBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemRegistry.PEPPERONI_PIZZA_SLICE));
    public static final DeferredBlock<Block> CHEESE_PIZZA = BLOCKS.register("cheese_pizza",
            () -> new PieBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemRegistry.CHEESE_PIZZA_SLICE));
    public static final DeferredBlock<Block> GLOW_BERRY_CHEESECAKE = BLOCKS.register("glow_berry_cheesecake",
            () -> new PieBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemRegistry.GLOW_BERRY_CHEESECAKE_SLICE));

}
