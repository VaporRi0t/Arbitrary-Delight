package net.riotzero.arbitrarydelight.util.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;

public class UnstableChorusEffect extends StatusEffect {

    public UnstableChorusEffect() {
        super(StatusEffectCategory.NEUTRAL, 0x9A32CD);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!(entity instanceof ServerPlayerEntity player)) return;

        if (player.getStatusEffect(this) != null && player.getStatusEffect(this).getDuration() == 1) {
            chorusFruitTeleport(player);
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    private void chorusFruitTeleport(ServerPlayerEntity player) {
        Random random = player.getRandom();

        double startX = player.getX();
        double startY = player.getY();
        double startZ = player.getZ();

        for (int i = 0; i < 16; i++) {
            double targetX = startX + (random.nextDouble() - 0.5D) * 16.0D;
            double targetY = MathHelper.clamp(
                    startY + (random.nextInt(16) - 8),
                    player.getWorld().getBottomY(),
                    player.getWorld().getTopY() - 1
            );
            double targetZ = startZ + (random.nextDouble() - 0.5D) * 16.0D;

            if (player.teleport(targetX, targetY, targetZ, true)) {
                player.getWorld().playSound(
                        null,
                        player.getX(), player.getY(), player.getZ(),
                        SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT,
                        SoundCategory.PLAYERS,
                        1.0F,
                        random.nextFloat() * 0.4F + 0.8F
                );
                break;
            }
        }
    }
}
