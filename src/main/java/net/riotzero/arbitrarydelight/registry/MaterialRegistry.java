package net.riotzero.arbitrarydelight.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class MaterialRegistry {

    public static final Tier AMETHYST = new Tier()
    {
        @Override
        public int getUses() {
            return 951;
        }

        @Override
        public float getSpeed() {
            return 2.0f;
        }

        @Override
        public float getAttackDamageBonus() {
            return 1.2f;
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops() {
            return BlockTags.INCORRECT_FOR_IRON_TOOL;
        }

        @Override
        public int getEnchantmentValue() {
            return 12;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.AMETHYST_SHARD);
        }
    };
}
