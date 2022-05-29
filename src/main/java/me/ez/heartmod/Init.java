package me.ez.heartmod;

import me.ez.heartmod.Common.Items.Heart;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Init {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> NORMAL_HEART = ITEMS.register("normal_heart", () -> new Heart(1.0F, null, 0 ,false));

    public static final RegistryObject<Item> CHICKEN_HEART = ITEMS.register("chicken_heart", () -> new Heart(1.0F, MobEffects.SLOW_FALLING, 2F, false));
    public static final RegistryObject<Item> COW_HEART = ITEMS.register("cow_heart", () -> new Heart(1.5F, null, 0, true));
    public static final RegistryObject<Item> SHEEP_HEART = ITEMS.register("sheep_heart", () -> new Heart(1.5F, null, 0, true));
    public static final RegistryObject<Item> PIG_HEART = ITEMS.register("pig_heart", () -> new Heart(2.0F, null, 0, true));
    public static final RegistryObject<Item> VILLGER_HEART = ITEMS.register("villger_heart", () -> new Heart(2.0F, null, 0, true));
    public static final RegistryObject<Item> AXOLOTL_HEART = ITEMS.register("axolotl_heart", () -> new Heart(0.5F, MobEffects.WATER_BREATHING, 2F, false));
    public static final RegistryObject<Item> CAT_HEART = ITEMS.register("cat_heart", () -> new Heart(1.0F, MobEffects.SLOW_FALLING, 2F, false));
    public static final RegistryObject<Item> HORSE_HEART = ITEMS.register("horse_heart", () -> new Heart(2.0F, MobEffects.MOVEMENT_SPEED, 2F, false));
    public static final RegistryObject<Item> FOX_HEART = ITEMS.register("fox_heart", () -> new Heart(1.0F, null, 0, true));
    public static final RegistryObject<Item> GOAT_HEART = ITEMS.register("goat_heart", () -> new Heart(2.0F, null, 0, false));
    public static final RegistryObject<Item> PANDA_HEART = ITEMS.register("panda_heart", () -> new Heart(2.0F, null, 0, false));
    public static final RegistryObject<Item> RABBIT_HEART = ITEMS.register("rabbit_heart", () -> new Heart(1.0F, MobEffects.JUMP, 1F, false));
    public static final RegistryObject<Item> SHULKER_HEART = ITEMS.register("shulker_heart", () -> new Heart(1.0F, MobEffects.LEVITATION, 0.1F, false));
    public static final RegistryObject<Item> SQUID_HEART = ITEMS.register("squid_heart", () -> new Heart(1.5F, MobEffects.WATER_BREATHING, 2F, false));
    public static final RegistryObject<Item> STRIDER_HEART = ITEMS.register("strider_heart", () -> new Heart(1.5F, MobEffects.FIRE_RESISTANCE, 3F,false));
    public static final RegistryObject<Item> TURTLE_HEART = ITEMS.register("turtle_heart", () -> new Heart(2.0F, MobEffects.WATER_BREATHING, 2F, false));
    public static final RegistryObject<Item> IRON_GOLEM_HEART = ITEMS.register("iron_golem_heart", () -> new Heart(4.0F, MobEffects.DAMAGE_RESISTANCE, 5F, false));
    public static final RegistryObject<Item> SLIME_HEART = ITEMS.register("slime_heart", () -> new Heart(1.5F, MobEffects.JUMP, 2f, true));
    public static final RegistryObject<Item> PIGLIN_HEART = ITEMS.register("piglin_heart", () -> new Heart(3.0F, null, 0f, true));
    public static final RegistryObject<Item> WOLF_HEART = ITEMS.register("wolf_heart", () -> new Heart(2.0F, null, 0f, true));
    public static final RegistryObject<Item> DOLPHIN_HEART = ITEMS.register("dolphin_heart", () -> new Heart(3.0F, MobEffects.DOLPHINS_GRACE, 4, false));
    public static final RegistryObject<Item> BEE_HEART = ITEMS.register("bee_heart", () -> new Heart(0.5F, null, 0, true));


    public static final RegistryObject<Item> ZOMPIE_HEART = ITEMS.register("zombie_heart", () -> new Heart(2.0F, null, 0 ,true));
    public static final RegistryObject<Item> SPIDER_HEART = ITEMS.register("spider_heart", () -> new Heart(2.0F, null, 0 , true));
    public static final RegistryObject<Item> CREEPER_HEART = ITEMS.register("creeper_heart", () -> new Heart(3.0F, null, 0, true));
    public static final RegistryObject<Item> PHANTOM_HEART = ITEMS.register("phantom_heart", () -> new Heart(3.0F, null ,0, true));
    public static final RegistryObject<Item> GHAST_HEART = ITEMS.register("ghast_heart", () -> new Heart(5.0F, null, 0, true));
    public static final RegistryObject<Item> ENDERMAN_HEART = ITEMS.register("enderman_heart", () -> new Heart(5.0F, null, 0, true));
    public static final RegistryObject<Item> HOGLIN_HEART = ITEMS.register("hoglin_heart", () -> new Heart(4.0F, null, 0, false));
    public static final RegistryObject<Item> PILLAGER_HEART = ITEMS.register("pillager_heart", () -> new Heart(2.0F, null, 0, false));
    public static final RegistryObject<Item> ILLAGER_HEART = ITEMS.register("illager_heart", () -> new Heart(2.0F,null, 0,false));
    public static final RegistryObject<Item> WITHER_HEART = ITEMS.register("wither_heart", () -> new Heart(15.0F, null, 0, true));
    public static final RegistryObject<Item> ELDER_GUARDIAN_HEART = ITEMS.register("elder_guardian_heart", () -> new Heart(10.0F, MobEffects.WATER_BREATHING, 6 ,true));
    public static final RegistryObject<Item> WITCH_HEART = ITEMS.register("witch_heart", () -> new Heart(4.0F, null, 0 , true));




}
