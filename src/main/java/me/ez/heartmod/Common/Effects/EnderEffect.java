package me.ez.heartmod.Common.Effects;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class EnderEffect extends MobEffect {

    public EnderEffect(MobEffectCategory category, int i) {
        super(category, i);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int p_19468_) {
        AABB aabb = entity.getBoundingBox().inflate(10.0D,10.0D,10.0D);
        List<LivingEntity> entityList = entity.level.getEntitiesOfClass(LivingEntity.class, aabb);
        for (LivingEntity monster: entityList){
            if (!(monster instanceof Player)){
                BlockPos pos = monster.getOnPos();
                monster.setPos(pos.getX() + entity.level.random.nextInt(10, 20),
                        pos.getY() + entity.level.random.nextInt(0, 10),
                        pos.getZ() + entity.level.random.nextInt(10, 20));
                entity.level.playSound(null,
                        entity,
                        SoundEvents.ENDERMAN_TELEPORT,
                        SoundSource.HOSTILE,
                        1f,
                        1f);
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int i, int i1) {
        return i % 5 == 0;
    }
}
