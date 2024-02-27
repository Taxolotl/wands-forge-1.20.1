package io.github.taxolotl.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties LEMON = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(10)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 40), 0.5f)
            .build();

    public static final FoodProperties LEMON_DROP = new FoodProperties.Builder()
            .nutrition(0)
            .saturationMod(10)
            .build();
}
