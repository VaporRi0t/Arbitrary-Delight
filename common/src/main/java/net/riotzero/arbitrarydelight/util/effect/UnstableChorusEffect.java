package net.riotzero.arbitrarydelight.util.effect;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.riotzero.arbitrarydelight.registry.EffectRegistry;

public class UnstableChorusEffect extends MobEffect {
    public UnstableChorusEffect() {
        super(MobEffectCategory.NEUTRAL, 0x9A32CD);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (!entity.level().isClientSide && entity instanceof ServerPlayer player) {
            MobEffectInstance effect = player.getEffect(EffectRegistry.UNSTABLE_CHORUS.get());
            if (effect != null && effect.getDuration() == 1) {
                chorusFruitTeleport(player);
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }

    private void chorusFruitTeleport(ServerPlayer player) {
        RandomSource random = player.getRandom();
        double startX = player.getX();
        double startY = player.getY();
        double startZ = player.getZ();

        for (int i = 0; i < 16; ++i) {
            double targetX = startX + (random.nextDouble() - 0.5D) * 16.0D;
            double targetY = Mth.clamp(startY + (random.nextInt(16) - 8),
                    player.level().getMinBuildHeight(),
                    player.level().getMaxBuildHeight() - 1);
            double targetZ = startZ + (random.nextDouble() - 0.5D) * 16.0D;

            if (player.randomTeleport(targetX, targetY, targetZ, true)) {
                player.level().playSound(null, player.getX(), player.getY(), player.getZ(),
                        SoundEvents.CHORUS_FRUIT_TELEPORT,
                        SoundSource.PLAYERS,
                        1.0F,
                        player.getRandom().nextFloat() * 0.4F + 0.8F);
                break;
            }
        }
    }
}