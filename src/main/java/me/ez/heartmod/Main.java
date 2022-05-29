package me.ez.heartmod;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(Main.MOD_ID)
public class Main
{
    public static final String MOD_ID = "heartmod";
    public static final CreativeModeTab TAP = new Hearts("hearts");
    public Main()
    {
        Init.HEARTS.register(FMLJavaModLoadingContext.get().getModEventBus());
        Init.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }


    public static class Hearts extends CreativeModeTab{

        public Hearts(String label) {
            super(label);
        }

        @Override
        public @NotNull ItemStack makeIcon() {
            return Init.NORMAL_HEART.get().getDefaultInstance();
        }
    }
}
