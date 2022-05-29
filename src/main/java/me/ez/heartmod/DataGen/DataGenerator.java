package me.ez.heartmod.DataGen;

import me.ez.heartmod.Main;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator {
    @SubscribeEvent
    public static void onGatheringData(final GatherDataEvent e){
        net.minecraft.data.DataGenerator dataGenerator = e.getGenerator();
        ExistingFileHelper helper = e.getExistingFileHelper();

        //Providers
        //TODO
    }
}
