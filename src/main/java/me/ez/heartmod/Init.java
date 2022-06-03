package me.ez.heartmod;

import me.ez.heartmod.Common.Effects.*;
import me.ez.heartmod.Common.Items.Heart;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Init {
    public static final DeferredRegister<Item> HEARTS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> NORMAL_HEART = HEARTS.register("normal_heart", () -> new Heart(1.0F, null, 0 ,false));

    public static final RegistryObject<Item> CHICKEN_HEART = HEARTS.register("chicken_heart", () -> new Heart(1.0F, MobEffects.SLOW_FALLING, 2F, false));
    public static final RegistryObject<Item> COW_HEART = HEARTS.register("cow_heart", () -> new Heart(1.5F, null, 0, true));
    public static final RegistryObject<Item> SHEEP_HEART = HEARTS.register("sheep_heart", () -> new Heart(1.5F, null, 0, true));
    public static final RegistryObject<Item> PIG_HEART = HEARTS.register("pig_heart", () -> new Heart(2.0F, null, 0, false));
    public static final RegistryObject<Item> VILLGER_HEART = HEARTS.register("villger_heart", () -> new Heart(2.0F, null, 0, false));
    public static final RegistryObject<Item> AXOLOTL_HEART = HEARTS.register("axolotl_heart", () -> new Heart(0.5F, MobEffects.WATER_BREATHING, 2F, false));
    public static final RegistryObject<Item> CAT_HEART = HEARTS.register("cat_heart", () -> new Heart(1.0F, MobEffects.SLOW_FALLING, 2F, false));
    public static final RegistryObject<Item> HORSE_HEART = HEARTS.register("horse_heart", () -> new Heart(2.0F, MobEffects.MOVEMENT_SPEED, 2F, false));
    public static final RegistryObject<Item> FOX_HEART = HEARTS.register("fox_heart", () -> new Heart(1.0F, null, 0, false));
    public static final RegistryObject<Item> GOAT_HEART = HEARTS.register("goat_heart", () -> new Heart(2.0F, null, 0, false));
    public static final RegistryObject<Item> PANDA_HEART = HEARTS.register("panda_heart", () -> new Heart(2.0F, null, 0, false));
    public static final RegistryObject<Item> RABBIT_HEART = HEARTS.register("rabbit_heart", () -> new Heart(1.0F, MobEffects.JUMP, 1F, false));
    public static final RegistryObject<Item> SHULKER_HEART = HEARTS.register("shulker_heart", () -> new Heart(1.0F, MobEffects.LEVITATION, 0.1F, false));
    public static final RegistryObject<Item> SQUID_HEART = HEARTS.register("squid_heart", () -> new Heart(1.5F, MobEffects.WATER_BREATHING, 2F, false));
    public static final RegistryObject<Item> STRIDER_HEART = HEARTS.register("strider_heart", () -> new Heart(1.5F, MobEffects.FIRE_RESISTANCE, 3F,false));
    public static final RegistryObject<Item> TURTLE_HEART = HEARTS.register("turtle_heart", () -> new Heart(2.0F, MobEffects.WATER_BREATHING, 2F, false));
    public static final RegistryObject<Item> IRON_GOLEM_HEART = HEARTS.register("iron_golem_heart", () -> new Heart(4.0F, MobEffects.DAMAGE_RESISTANCE, 5F, false));
    public static final RegistryObject<Item> SLIME_HEART = HEARTS.register("slime_heart", () -> new Heart(1.5F, MobEffects.JUMP, 2f, true));
    public static final RegistryObject<Item> PIGLIN_HEART = HEARTS.register("piglin_heart", () -> new Heart(3.0F, null, 0f, true));
    public static final RegistryObject<Item> WOLF_HEART = HEARTS.register("wolf_heart", () -> new Heart(2.0F, null, 0f, false));
    public static final RegistryObject<Item> DOLPHIN_HEART = HEARTS.register("dolphin_heart", () -> new Heart(3.0F, MobEffects.DOLPHINS_GRACE, 4, false));
    public static final RegistryObject<Item> BEE_HEART = HEARTS.register("bee_heart", () -> new Heart(0.5F, null, 0, true));


    public static final RegistryObject<Item> ZOMPIE_HEART = HEARTS.register("zombie_heart", () -> new Heart(2.0F, null, 0 ,true));
    public static final RegistryObject<Item> SPIDER_HEART = HEARTS.register("spider_heart", () -> new Heart(2.0F, null, 0 , true));
    public static final RegistryObject<Item> CREEPER_HEART = HEARTS.register("creeper_heart", () -> new Heart(3.0F, null, 0, true));
    public static final RegistryObject<Item> PHANTOM_HEART = HEARTS.register("phantom_heart", () -> new Heart(3.0F, null ,0, true));
    public static final RegistryObject<Item> GHAST_HEART = HEARTS.register("ghast_heart", () -> new Heart(5.0F, null, 0, true));
    public static final RegistryObject<Item> ENDERMAN_HEART = HEARTS.register("enderman_heart", () -> new Heart(5.0F, null, 0, true));
    public static final RegistryObject<Item> HOGLIN_HEART = HEARTS.register("hoglin_heart", () -> new Heart(4.0F, null, 0, false));
    public static final RegistryObject<Item> PILLAGER_HEART = HEARTS.register("pillager_heart", () -> new Heart(2.0F, null, 0, false));
//    public static final RegistryObject<Item> ILLAGER_HEART = HEARTS.register("illager_heart", () -> new Heart(2.0F,null, 0,false));
    public static final RegistryObject<Item> WITHER_HEART = HEARTS.register("wither_heart", () -> new Heart(15.0F, null, 0, false));
    public static final RegistryObject<Item> ELDER_GUARDIAN_HEART = HEARTS.register("elder_guardian_heart", () -> new Heart(10.0F, MobEffects.WATER_BREATHING, 6 ,false));
    public static final RegistryObject<Item> WITCH_HEART = HEARTS.register("witch_heart", () -> new Heart(4.0F, null, 0 , true));


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final RegistryObject<Item> TEST_ITEM = HEARTS.register("test_item", () -> new Heart(4.0F, null, 0 , true));

    //Effects
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Main.MOD_ID);
    public static final RegistryObject<BoomEffect> BOOM_EFFECT_REGISTRY_OBJECT = EFFECTS.register("boom_effect", () -> new BoomEffect(MobEffectCategory.BENEFICIAL, 8171462));
    public static final RegistryObject<EnderEffect> ENDER_EFFECT_REGISTRY_OBJECT = EFFECTS.register("ender_effect", () -> new EnderEffect(MobEffectCategory.BENEFICIAL, 8171462));
    public static final RegistryObject<GiveMeSomeHoney> GIVE_ME_SOME_HONEY_REGISTRY_OBJECT = EFFECTS.register("givemesomehoney_effect", GiveMeSomeHoney::new);
    public static final RegistryObject<ItsHotOutThereEffect> ITS_HOT_OUT_THERE_EFFECT_REGISTRY_OBJECT = EFFECTS.register("itshotoutthere_effect", ItsHotOutThereEffect::new);
    public static final RegistryObject<ShearMeEffect> SHEAR_ME_EFFECT_REGISTRY_OBJECT = EFFECTS.register("shearme_effect", ShearMeEffect::new);

}
