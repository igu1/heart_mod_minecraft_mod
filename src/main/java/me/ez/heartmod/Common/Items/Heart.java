package me.ez.heartmod.Common.Items;

import me.ez.heartmod.Init;
import me.ez.heartmod.Main;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.Random;

public class Heart extends Item {

    private final float healthAmount;
    private final float minuteEffect;
    private final @Nullable MobEffect effect;
    private final boolean customEffect;

    public Heart(float healthAmount, @Nullable MobEffect effect, float minuteEffect, boolean customEffect) {
        super(new Item.Properties()
                .tab(Main.TAP)
                .stacksTo(128)
                .food(new FoodProperties.Builder()
                        .fast()
                        .alwaysEat()
                        .build()));
        this.effect = effect;
        this.minuteEffect = minuteEffect;
        this.healthAmount = healthAmount;
        this.customEffect = customEffect;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        if (!level.isClientSide){
            if (entity instanceof Player player){
              if (!player.getAbilities().instabuild){
                    entity.setHealth(entity.getHealth() + healthAmount);
                }
                giveItemAbilityToPlayer(itemStack, level, entity);
            }
        }
        return super.finishUsingItem(itemStack, level, entity);
    }

    private void giveItemAbilityToPlayer(ItemStack itemStack, Level level, LivingEntity entity) {
        int tick = 20;
        int sec  = 60;
        if (effect != null) {
            entity.addEffect(new MobEffectInstance(effect, 1, (int) minuteEffect * sec * tick)); // min
        }
        if (customEffect) {
            addCustomEffect(itemStack, level, entity);
        }
    }

    private void addCustomEffect(ItemStack itemStack, Level level, LivingEntity entity) {
        if (itemStack == getStack(Init.CREEPER_HEART)) {
            explosiveEffectRand(level, entity);
        } else if (itemStack == getStack(Init.ENDERMAN_HEART)) {
            randTeleEffect(level, entity);
        } else if (itemStack == getStack(Init.GHAST_HEART)) {
            spawnFireBall(level, entity);
        } else if (itemStack == getStack(Init.PANDA_HEART)) {

        } else if (itemStack == getStack(Init.PIG_HEART)) {

        } else if (itemStack == getStack(Init.PHANTOM_HEART)) {

        } else if (itemStack == getStack(Init.PIGLIN_HEART)) {

        } else if (itemStack == getStack(Init.PILLAGER_HEART)) {

        } else if (itemStack == getStack(Init.RABBIT_HEART)) {

        } else if (itemStack == getStack(Init.SHEEP_HEART)) {

        } else if (itemStack == getStack(Init.SHULKER_HEART)) {

        } else if (itemStack == getStack(Init.SLIME_HEART)) {

        } else if (itemStack == getStack(Init.SPIDER_HEART)) {

        } else if (itemStack == getStack(Init.SQUID_HEART)) {

        } else if (itemStack == getStack(Init.STRIDER_HEART)) {

        } else if (itemStack == getStack(Init.TURTLE_HEART)) {

        } else if (itemStack == getStack(Init.VILLGER_HEART)) {

        } else if (itemStack == getStack(Init.WITCH_HEART)) {

        } else if (itemStack == getStack(Init.WITHER_HEART)) {

        } else if (itemStack == getStack(Init.WOLF_HEART)) {

        } else if (itemStack == getStack(Init.ZOMPIE_HEART)) {

        }
    }

    private void spawnFireBall(Level level, LivingEntity entity) {
        BlockPos blockpos = entity.getOnPos();
        if (BaseFireBlock.canBePlacedAt(level, blockpos, entity.getDirection())) {
            this.playFireChargeSound(level, blockpos);
            level.setBlockAndUpdate(blockpos, BaseFireBlock.getState(level, blockpos));
            level.gameEvent(entity, GameEvent.BLOCK_PLACE, blockpos);
        }
    }
    private
    void playFireChargeSound(Level p_41206_, BlockPos p_41207_) {
        Random random = p_41206_.getRandom();
        p_41206_.playSound(null, p_41207_, SoundEvents.FIRECHARGE_USE, SoundSource.BLOCKS, 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
    }

    private void randTeleEffect(Level level, LivingEntity entity) {
        BlockPos pos = entity.getOnPos();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        for (int i = 0; i < 5; i++) {
            Random r = new Random();
            x = x + i + r.nextInt(6);
            y = y + i + r.nextInt(2);
            z = z + i + r.nextInt(6);
            entity.teleportTo(x, y ,z);
        }
    }

    private void explosiveEffectRand(Level level, LivingEntity entity) {
        if (!level.isClientSide) {
            BlockPos pos = entity.getOnPos();
            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();
            for (int i = 0; i < 5; i++) {
                Random r = new Random();
                level.explode(entity, x + i + r.nextInt(10), y, z + i + r.nextInt(10), i + 2, Explosion.BlockInteraction.DESTROY);
            }
        }
    }

    private ItemStack getStack(RegistryObject<Item> itemRegistryObject){
        return itemRegistryObject.get().getDefaultInstance();
    }
}
