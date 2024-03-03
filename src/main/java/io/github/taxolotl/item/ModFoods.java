package io.github.taxolotl.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.List;
import java.util.Random;

public class ModFoods {
    private static final Random RNG = new Random();
    private static final List<MobEffect> ALL_EFFECTS = List.of(
            MobEffects.MOVEMENT_SPEED,
            MobEffects.MOVEMENT_SLOWDOWN,
            MobEffects.DIG_SPEED,
            MobEffects.DIG_SLOWDOWN,
            MobEffects.DAMAGE_BOOST,
            MobEffects.HEAL,
            MobEffects.HARM,
            MobEffects.JUMP,
            MobEffects.CONFUSION,
            MobEffects.REGENERATION,
            MobEffects.DAMAGE_RESISTANCE,
            MobEffects.FIRE_RESISTANCE,
            MobEffects.WATER_BREATHING,
            MobEffects.INVISIBILITY,
            MobEffects.BLINDNESS,
            MobEffects.NIGHT_VISION,
            MobEffects.HUNGER,
            MobEffects.WEAKNESS,
            MobEffects.POISON,
            MobEffects.WITHER,
            MobEffects.HEALTH_BOOST,
            MobEffects.ABSORPTION,
            MobEffects.SATURATION,
            MobEffects.GLOWING,
            MobEffects.LEVITATION,
            MobEffects.LUCK,
            MobEffects.UNLUCK,
            MobEffects.SLOW_FALLING,
            MobEffects.CONDUIT_POWER,
            MobEffects.DOLPHINS_GRACE,
            MobEffects.BAD_OMEN,
            MobEffects.HERO_OF_THE_VILLAGE,
            MobEffects.DARKNESS
    );

    private static final List<MobEffect> NEGATIVE_EFFECTS = List.of(
            MobEffects.MOVEMENT_SLOWDOWN,
            MobEffects.DIG_SLOWDOWN,
            MobEffects.HARM,
            MobEffects.CONFUSION,
            MobEffects.BLINDNESS,
            MobEffects.HUNGER,
            MobEffects.WEAKNESS,
            MobEffects.POISON,
            MobEffects.WITHER,
            MobEffects.GLOWING,
            MobEffects.LEVITATION,
            MobEffects.UNLUCK,
            MobEffects.BAD_OMEN,
            MobEffects.DARKNESS
    );

    private static final List<MobEffect> POSITIVE_EFFECTS = List.of(
            MobEffects.MOVEMENT_SPEED,
            MobEffects.DIG_SPEED,
            MobEffects.DAMAGE_BOOST,
            MobEffects.HEAL,
            MobEffects.JUMP,
            MobEffects.REGENERATION,
            MobEffects.DAMAGE_RESISTANCE,
            MobEffects.FIRE_RESISTANCE,
            MobEffects.WATER_BREATHING,
            MobEffects.INVISIBILITY,
            MobEffects.NIGHT_VISION,
            MobEffects.HEALTH_BOOST,
            MobEffects.ABSORPTION,
            MobEffects.SATURATION,
            MobEffects.LUCK,
            MobEffects.SLOW_FALLING,
            MobEffects.CONDUIT_POWER,
            MobEffects.DOLPHINS_GRACE,
            MobEffects.HERO_OF_THE_VILLAGE
    );

    public static final FoodProperties LEMON_DROP = new FoodProperties.Builder()
            .nutrition(0)
            .saturationMod(10)
            .build();

    public static final FoodProperties EVERY_FLAVOUR_BEANS = new FoodProperties.Builder()
            .nutrition(0)
            .effect(ModFoods::randomEffect, 1.0f)
            .build();

    private static MobEffectInstance randomEffect() {
        return new MobEffectInstance(ALL_EFFECTS.get(RNG.nextInt(ALL_EFFECTS.size()-1)), 200);
    }

    private static MobEffectInstance randomPositiveEffect() {
        return new MobEffectInstance(POSITIVE_EFFECTS.get(RNG.nextInt(POSITIVE_EFFECTS.size()-1)), 200);
    }

    private static MobEffectInstance randomNegativeEffect() {
        return new MobEffectInstance(NEGATIVE_EFFECTS.get(RNG.nextInt(NEGATIVE_EFFECTS.size()-1)), 200);
    }
}
