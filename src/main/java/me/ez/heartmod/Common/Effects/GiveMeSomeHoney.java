package me.ez.heartmod.Common.Effects;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class GiveMeSomeHoney extends MobEffect {

    public GiveMeSomeHoney() {
        super(MobEffectCategory.BENEFICIAL, 8171462);
    }

    @Override
    public void applyEffectTick(LivingEntity livingEntity, int i) {
        BlockPos pos = livingEntity.getOnPos();
        Level level = livingEntity.getLevel();
        Direction direction = livingEntity.getDirection().getOpposite();
        BlockPos pos1 = pos.relative(direction, 1);
        level.setBlock(pos1, Blocks.HONEY_BLOCK.defaultBlockState(), 1);
    }

    @Override
    public boolean isDurationEffectTick(int i, int i1) {
        return i % 5 == 0;
    }
}
