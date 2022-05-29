package me.ez.heartmod;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityDeathEvent {
    @SubscribeEvent
    public static void entityHeartDropEvent(LivingDeathEvent e){
        if (e.getSource().getEntity() instanceof Player || e.getSource().isProjectile() || e.getSource().isFire()){
            System.out.println(e.getEntity() + " is Dead");
        }
    }
}

