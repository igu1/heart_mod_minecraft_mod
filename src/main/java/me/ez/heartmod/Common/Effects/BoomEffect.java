package me.ez.heartmod.Common.Effects;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class BoomEffect extends MobEffect {

    public BoomEffect(MobEffectCategory mobEffectCategory, int i) {
        super(mobEffectCategory, i);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amp) {
        AABB aabb = entity.getBoundingBox().inflate(10.0D,10.0D,10.0D);
        List<Monster> entityList = entity.level.getEntitiesOfClass(Monster.class, aabb);
        for (Monster monster: entityList) {
            if (!monster.isOnFire()) {
                BlockPos pos = monster.getOnPos();
                entity.level.explode(monster, pos.getX(), pos.getY(), pos.getZ(), 1F, Explosion.BlockInteraction.DESTROY);
//                LightningBolt lightningbolt = EntityType.LIGHTNING_BOLT.create(entity.level);
//                assert lightningbolt != null;
//                lightningbolt.moveTo(Vec3.atBottomCenterOf(pos));
//                entity.level.addFreshEntity(lightningbolt);
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amp) {
        return duration % 5 == 0;
    }
}
