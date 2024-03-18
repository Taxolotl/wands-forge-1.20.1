package io.github.taxolotl.item;

import io.github.taxolotl.util.ModUtilFunctions;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.List;
import java.util.Random;

public class ModFoods {
    public static final FoodProperties LEMON_DROP = new FoodProperties.Builder()
            .nutrition(0)
            .saturationMod(10)
            .build();

    public static final FoodProperties EVERY_FLAVOUR_BEANS = new FoodProperties.Builder()
            .nutrition(0)
            .saturationMod(0)
            .effect(ModUtilFunctions.Effects.randomEffect(), 1.0f)
            .build();

    public static final FoodProperties BLOWING_GUM = new FoodProperties.Builder()
            .nutrition(0)
            .saturationMod(1)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 20), 0.75f)
            .alwaysEat()
            .build();

    public static final FoodProperties CHOCOLATE_FROG = new FoodProperties.Builder()
            .nutrition(0)
            .saturationMod(4)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 40, 5), 0.01f)
            .build();

    public static final FoodProperties PUMPKIN_PASTY = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(3)
            .build();

    public static final FoodProperties LICORICE_WAND = new FoodProperties.Builder()
            .nutrition(0)
            .saturationMod(2)
            // .effect(() -> new MobEffectInstance(ModMobEffects.MANA_BOOST), 0.75f)
            .build();

    public static final FoodProperties CAULDRON_CAKE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(2)
            .build();

    public static final FoodProperties PEPPERMINT_HUMBUG = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(3)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, ModUtilFunctions.Math.secondsToTicks(1)), 0.1f)
            .build();

    public static final FoodProperties WIZARD_CRACKER = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(1)
            .effect(ModUtilFunctions.Effects.randomPositiveEffect(), 0.9f)
            .build();

    public static final FoodProperties TREACLE_TART = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(4)
            .build();
}
