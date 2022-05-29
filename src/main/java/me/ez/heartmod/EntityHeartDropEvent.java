package me.ez.heartmod;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class EntityHeartDropEvent {

    public static void entityHeartDropEvent(LivingDeathEvent e){
        if (e.getSource().getEntity() instanceof Player || e.getSource().isProjectile() || e.getSource().isFire()){
            System.out.println(e.getEntity() + " is Dead");
        }
    }
}
