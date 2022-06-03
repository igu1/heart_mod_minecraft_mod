package me.ez.heartmod.Common.Effects;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class ItsHotOutThereEffect extends MobEffect {

    public ItsHotOutThereEffect() {
        super(MobEffectCategory.HARMFUL, 8171462);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int i) {
        Level level = entity.getLevel();
        if (level.isDay()){
            BlockPos pos = entity.getOnPos();
            if (level.getRawBrightness(pos.above(), 0) > 12F){
                if (!entity.isOnFire()){
                    entity.setSecondsOnFire(8);
                }
            }else {
                System.out.println("Darkness");
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        return p_19455_ % 5 == 0;
    }
}
