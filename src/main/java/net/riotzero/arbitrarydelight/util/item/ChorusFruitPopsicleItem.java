package net.riotzero.arbitrarydelight.util.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ChorusFruitPopsicleItem extends Item {

    public ChorusFruitPopsicleItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, level, entity);

        if (!level.isClientSide) {
            double startX = entity.getX();
            double startY = entity.getY();
            double startZ = entity.getZ();

            for (int i = 0; i < 16; ++i) {
                double newX = startX + (entity.getRandom().nextDouble() - 0.5D) * 16.0D;
                double newY = Mth.clamp(
                        startY + (entity.getRandom().nextInt(16) - 8),
                        level.getMinBuildHeight(),
                        level.getMaxBuildHeight() - 1
                );
                double newZ = startZ + (entity.getRandom().nextDouble() - 0.5D) * 16.0D;

                if (entity.isPassenger()) {
                    entity.stopRiding();
                }

                if (entity.randomTeleport(newX, newY, newZ, true)) {
                    level.playSound(null, startX, startY, startZ,
                            SoundEvents.CHORUS_FRUIT_TELEPORT,
                            SoundSource.PLAYERS, 1.0F, 1.0F);
                    break;
                }
            }


            //if (entity instanceof Player player) {
            //    player.getCooldowns().addCooldown(this, 10); // 0.5 seconds
            //}
        }

        return result;
    }
}
