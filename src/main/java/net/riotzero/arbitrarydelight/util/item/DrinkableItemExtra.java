package net.riotzero.arbitrarydelight.util.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.util.UseAction;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import vectorwing.farmersdelight.common.item.ConsumableItem;

public class DrinkableItemExtra extends ConsumableItem {

    public DrinkableItemExtra(Settings settings) {
        super(settings);
    }

    public DrinkableItemExtra(Settings settings, boolean hasFoodEffectTooltip) {
        super(settings, hasFoodEffectTooltip);
    }

    public DrinkableItemExtra(Settings settings, boolean hasPotionEffectTooltip, boolean hasCustomTooltip) {
        super(settings, hasPotionEffectTooltip, hasCustomTooltip);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack held = user.getStackInHand(hand);

        FoodComponent food = held.getItem().getFoodComponent();
        if (food != null) {
            if (user.canConsume(food.isAlwaysEdible())) {
                user.setCurrentHand(hand);
                return TypedActionResult.consume(held);
            }
            return TypedActionResult.fail(held);
        }

        return ItemUsage.consumeHeldItem(world, user, hand);
    }

}
