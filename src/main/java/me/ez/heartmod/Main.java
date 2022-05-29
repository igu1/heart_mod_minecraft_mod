package me.ez.heartmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Main.MOD_ID)
public class Main
{
    public static final String MOD_ID = "heartmod";
    public static final CreativeModeTab TAP = new Hearts("hearts");
    public Main()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents{
    }

    public static class Hearts extends CreativeModeTab{

        public Hearts(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return Init.NORMAL_HEART.get().getDefaultInstance();
        }
    }
}
