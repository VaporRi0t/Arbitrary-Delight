package net.riotzero.arbitrarydelight.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.riotzero.arbitrarydelight.registry.BlockRegistry;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends LootTableProvider {

    public ModLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(
                output,
                Set.of(),
                List.of(
                        new LootTableProvider.SubProviderEntry(
                                (HolderLookup.Provider lookup) -> new ModBlockLoot(lookup),
                                LootContextParamSets.BLOCK
                        )
                ),
                registries
        );
    }

    private static final class ModBlockLoot extends BlockLootSubProvider {

        private ModBlockLoot(HolderLookup.Provider lookup) {
            super(Set.<Item>of(), FeatureFlags.REGISTRY.allFlags(), lookup);
        }

        @Override
        protected void generate() {
            dropSelf(BlockRegistry.SHREDDED_CHEESE_BAG.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return Collections.singletonList(BlockRegistry.SHREDDED_CHEESE_BAG.get());
        }
    }
}
