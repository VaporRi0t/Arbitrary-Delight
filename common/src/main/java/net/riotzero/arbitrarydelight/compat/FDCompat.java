package net.riotzero.arbitrarydelight.compat;

import net.minecraft.world.inventory.RecipeBookType;

public class FDCompat {
    private static RecipeBookType fdCooking;

    public static RecipeBookType getFDCooking() {
        if (fdCooking == null) {
            try {
                fdCooking = RecipeBookType.valueOf("FARMERSDELIGHT_COOKING");
            } catch (IllegalArgumentException e) {
                // fallback so it doesn't crash
                fdCooking = RecipeBookType.CRAFTING;
            }
        }
        return fdCooking;
    }
}
