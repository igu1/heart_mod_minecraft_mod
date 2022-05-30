package me.ez.heartmod;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EntityDeathEvent {
    @SubscribeEvent
    public static void entityHeartDropEvent(LivingDeathEvent e){
        if (e.getSource().getEntity() instanceof Player player) {
            if (!e.getEntity().is(player)){
                Entity entity = e.getEntity();
                if (e.getEntity() instanceof Sheep){
                    dropHeart(e, Init.SHEEP_HEART);
                } else if (entity instanceof Cow){
                    dropHeart(e, Init.COW_HEART);
                } else if (entity instanceof Chicken){
                    dropHeart(e, Init.CHICKEN_HEART);
                } else if (entity instanceof Creeper){
                    dropHeart(e, Init.CREEPER_HEART);
                } else if (entity instanceof EnderMan){
                    dropHeart(e, Init.ENDERMAN_HEART);
                } else if (entity instanceof Squid){
                    dropHeart(e, Init.SQUID_HEART);
                } else if (entity instanceof Bee){
                    dropHeart(e, Init.BEE_HEART);
                } else if (entity instanceof Ghast){
                    dropHeart(e, Init.GHAST_HEART);
                } else if (entity instanceof Witch){
                    dropHeart(e, Init.WITCH_HEART);
                } else if (entity instanceof Phantom){
                    dropHeart(e, Init.PHANTOM_HEART);
                } else if (entity instanceof Zombie){
                    dropHeart(e, Init.ZOMPIE_HEART);
                } else if (entity instanceof Piglin){
                    dropHeart(e, Init.PIGLIN_HEART);
                } else if (entity instanceof Spider){
                    dropHeart(e, Init.SPIDER_HEART);
                } else if (entity instanceof Slime){
                    dropHeart(e, Init.SLIME_HEART);
                } else if (entity instanceof Pig){
                    dropHeart(e, Init.PIG_HEART);
                } else if (entity instanceof Villager){
                    dropHeart(e, Init.VILLGER_HEART);
                } else if (entity instanceof Axolotl){
                    dropHeart(e, Init.AXOLOTL_HEART);
                } else if (entity instanceof Cat){
                    dropHeart(e, Init.CAT_HEART);
                } else if (entity instanceof Horse){
                    dropHeart(e, Init.HORSE_HEART);
                } else if (entity instanceof Fox){
                    dropHeart(e, Init.FOX_HEART);
                } else if (entity instanceof Goat){
                    dropHeart(e, Init.GOAT_HEART);
                } else if (entity instanceof Panda){
                    dropHeart(e, Init.PANDA_HEART);
                } else if (entity instanceof Rabbit){
                    dropHeart(e, Init.RABBIT_HEART);
                } else if (entity instanceof Shulker){
                    dropHeart(e, Init.SHULKER_HEART);
                } else if (entity instanceof Strider){
                    dropHeart(e, Init.STRIDER_HEART);
                } else if (entity instanceof Turtle){
                    dropHeart(e, Init.TURTLE_HEART);
                } else if (entity instanceof IronGolem){
                    dropHeart(e, Init.IRON_GOLEM_HEART);
                } else if (entity instanceof Wolf){
                    dropHeart(e, Init.WOLF_HEART);
                } else if (entity instanceof Dolphin){
                    dropHeart(e, Init.DOLPHIN_HEART);
                } else if (entity instanceof Hoglin){
                    dropHeart(e, Init.HOGLIN_HEART);
                } else if (entity instanceof Pillager){
                    dropHeart(e, Init.PILLAGER_HEART);
                } else if (entity instanceof WitherBoss){
                    dropHeart(e, Init.WITHER_HEART);
                } else if (entity instanceof ElderGuardian){
                    dropHeart(e, Init.ELDER_GUARDIAN_HEART);
                }
            }
        }
    }

    private static void dropHeart(LivingDeathEvent e, RegistryObject<Item> itemRegistryObject){
        Entity entity = e.getEntity();
        Player player = (Player) e.getSource().getEntity();
        Level level = player != null ? player.level : entity.level;
        BlockPos dropPos = entity.getOnPos();
        Block.popResource(level, dropPos, new ItemStack(itemRegistryObject.get()));
    }

}

