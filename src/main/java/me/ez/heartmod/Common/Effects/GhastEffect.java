package me.ez.heartmod.Common.Effects;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;

import java.util.Random;

public class GhastEffect {

    //    BlockPos blockpos = entity.getOnPos();
//        if (BaseFireBlock.canBePlacedAt(level, blockpos, entity.getDirection())) {
//        this.playFireChargeSound(level, blockpos);
//        level.setBlockAndUpdate(blockpos, BaseFireBlock.getState(level, blockpos));
//        level.gameEvent(entity, GameEvent.BLOCK_PLACE, blockpos);

    void playFireChargeSound(Level p_41206_, BlockPos p_41207_) {
        Random random = p_41206_.getRandom();
        p_41206_.playSound(null, p_41207_, SoundEvents.FIRECHARGE_USE, SoundSource.BLOCKS, 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
    }
}
