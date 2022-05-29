package me.ez.heartmod.DataGen;

import me.ez.heartmod.Init;
import me.ez.heartmod.Main;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {

    public ItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        Init.HEARTS.getEntries().forEach(itemRegistryObject -> {
            simpleItem(itemRegistryObject.get());
        });
    }

    private ItemModelBuilder simpleItem(Item item){
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated"))
                .texture(Main.MOD_ID, "item/" + item.getRegistryName().getPath());
    }
}
