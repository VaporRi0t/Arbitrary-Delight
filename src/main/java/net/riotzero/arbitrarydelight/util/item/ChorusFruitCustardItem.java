package net.riotzero.arbitrarydelight.util.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ChorusFruitCustardItem extends Item {

    public ChorusFruitCustardItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient) {
            double startX = user.getX();
            double startY = user.getY();
            double startZ = user.getZ();

            for (int i = 0; i < 16; i++) {
                double newX = startX + (user.getRandom().nextDouble() - 0.5D) * 16.0D;
                double newY = MathHelper.clamp(
                        startY + (user.getRandom().nextInt(16) - 8),
                        world.getBottomY(),
                        world.getTopY() - 1
                );
                double newZ = startZ + (user.getRandom().nextDouble() - 0.5D) * 16.0D;

                if (user.hasVehicle()) {
                    user.stopRiding();
                }

                // Yarn teleport method (chorus-style boolean flag)
                if (user.teleport(newX, newY, newZ, true)) {
                    world.playSound(
                            null,
                            startX, startY, startZ,
                            SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT,
                            SoundCategory.PLAYERS,
                            1.0F,
                            1.0F
                    );
                    break;
                }
            }

            if (user instanceof PlayerEntity player) {
                player.getItemCooldownManager().set(this, 10); // 0.5 seconds
            }
        }

        return result;
    }
}
