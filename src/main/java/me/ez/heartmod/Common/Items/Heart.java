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
            System.out.println("-----> Client Side");
            if (entity instanceof Player player){
              if (!player.getAbilities().instabuild){
                    entity.setHealth(entity.getHealth() + healthAmount);
                    System.out.println("-----> Health Increased By " + entity.getHealth() + healthAmount);
              }
                giveItemAbilityToPlayer(itemStack, level, entity);
            }
        }else {
            System.out.println("-----> Server Side");
        }
        return super.finishUsingItem(itemStack, level, entity);
    }

    private void giveItemAbilityToPlayer(ItemStack itemStack, Level level, LivingEntity entity) {
        int tick = 20;
        int sec  = 60;
        if (effect != null) {
            System.out.println("-----> Effect Added");
            entity.addEffect(new MobEffectInstance(effect, 1, (int) minuteEffect * sec * tick)); // min
        }
        if (customEffect) {
            System.out.println("-----> Custom Effect Adding");
            addCustomEffect(itemStack, level, entity);
        }
    }

    private void addCustomEffect(ItemStack itemStack, Level level, LivingEntity entity) {
        if (itemStack == getStack(Init.CREEPER_HEART)) {
            //Boom Effect
        } else if (itemStack == getStack(Init.ENDERMAN_HEART)) {
            //EnderEffect
        } else if (itemStack == getStack(Init.GHAST_HEART)) {
            //GhastEffect
        } else if (itemStack == getStack(Init.PHANTOM_HEART)) {
            //ItsHotOutThereEffect
        } else if (itemStack == getStack(Init.PIGLIN_HEART)) {
            //OhShinyEffect
        } else if (itemStack == getStack(Init.SHEEP_HEART)) {
            //ShearMeEffect
        } else if (itemStack == getStack(Init.SLIME_HEART)) {
            //SlimyEffect
        } else if (itemStack == getStack(Init.SPIDER_HEART)) {
            //ShootTheWebEffect
        } else if (itemStack == getStack(Init.SQUID_HEART)) {
            //CanIBorrowSomeInkEffect
        } else if (itemStack == getStack(Init.WITCH_HEART)) {
            //IamImmortalEffect
        } else if (itemStack == getStack(Init.ZOMPIE_HEART)) {
            //ItsHotOutThereEffect
        } else if (itemStack == getStack(Init.COW_HEART)) {
            //MilkMeEffect
        } else if (itemStack == getStack(Init.BEE_HEART)) {
            //GiveMeSomeHoney
        }
    }

    private ItemStack getStack(RegistryObject<Item> itemRegistryObject){
        return itemRegistryObject.get().getDefaultInstance();
    }
}
