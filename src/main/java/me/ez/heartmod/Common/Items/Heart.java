package me.ez.heartmod.Common.Items;

import me.ez.heartmod.Main;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

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
            entity.addEffect(new MobEffectInstance(effect, 1, (int) (minuteEffect * sec * tick))); // min
        }
        if (customEffect) {
            addCustomEffect(itemStack, level, entity);
        }
    }

    private void addCustomEffect(ItemStack itemStack, Level level, LivingEntity entity) {
        //TODO
    }
}
