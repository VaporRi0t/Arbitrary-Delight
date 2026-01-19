package net.riotzero.arbitrarydelight.registry;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MaterialRegistry {

    public static final Tier AMETHYST = new Tier() {
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
        public int getLevel() {
            // Roughly equivalent to iron-tier mining level. The knife isn't a mining tool,
            // but Tier requires a level in 1.20.1.
            return 2;
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
