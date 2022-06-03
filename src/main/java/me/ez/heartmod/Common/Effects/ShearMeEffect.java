package me.ez.heartmod.Common.Effects;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class ShearMeEffect extends MobEffect {

    public ShearMeEffect() {
        super(MobEffectCategory.BENEFICIAL, 8171462);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int i) {
        Block.popResource(entity.level, entity.getOnPos(), new ItemStack(Items.WHITE_WOOL));
        entity.level.playSound(null,
                entity,
                SoundEvents.SHEEP_SHEAR,
                SoundSource.NEUTRAL,
                1f,
                1f);
    }

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        return p_19455_ % 10 == 0;
    }
}
