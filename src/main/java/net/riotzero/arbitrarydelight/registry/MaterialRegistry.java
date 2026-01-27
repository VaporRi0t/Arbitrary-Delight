package net.riotzero.arbitrarydelight.registry;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MaterialRegistry {

    public static final ToolMaterial AMETHYST = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 951;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 2.0f;
        }

        @Override
        public float getAttackDamage() {
            return 1.2f;
        }

        @Override
        public int getMiningLevel() {
            // roughly iron
            return 2;
        }

        @Override
        public int getEnchantability() {
            return 12;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.AMETHYST_SHARD);
        }
    };
}
