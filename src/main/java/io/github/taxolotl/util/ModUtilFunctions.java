package io.github.taxolotl.util;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ModUtilFunctions {
    public static final Random RNG = new Random();

    public class Math {
        public static int secondsToTicks(int seconds) {
            return seconds * 20;
        }
        public static int ticksToSeconds(int ticks) {
            return ticks / 20;
        }

        public static float secondsToTicks(float seconds) {
            return seconds * 20.0f;
        }
        public static float ticksToSeconds(float ticks) {
            return ticks / 20.0f;
        }

        public static float blocksToYards(float blocks) {
            return blocks * 1.0936132983377f;
        }

        public static float blocksToFeet(float blocks) {
            return blocksToYards(blocks) / 3;
        }

        public static float blocksToInches(float blocks) {
            return blocksToFeet(blocks) / 12;
        }

        public static float inchesToBlocks(float inches) {
            return inches * 0.0254f;
        }

        public static float feetToBlocks(float feet) {
            return inchesToBlocks(feet * 12);
        }

        public static float yardsToBlocks(float yards) {
            return feetToBlocks(yards * 3);
        }

        public static int feetToBlocks(int feet) {
            return java.lang.Math.round(feetToBlocks((float) feet));
        }

        public static int yardsToBlocks(int yards) {
            return java.lang.Math.round(yardsToBlocks((float) yards));
        }
    }

    public class Effects {
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
        private static final List<MobEffect> NEGATIVE_EFFECTS = ALL_EFFECTS.stream().filter(mobEffect -> !mobEffect.isBeneficial()).collect(Collectors.toList());
        private static final List<MobEffect> POSITIVE_EFFECTS = ALL_EFFECTS.stream().filter(mobEffect -> mobEffect.isBeneficial()).collect(Collectors.toList());

        /*public static void setupEffects() {
            for (MobEffect effect : BuiltInRegistries.MOB_EFFECT) {
                ALL_EFFECTS.add(effect);
                if(effect.isBeneficial()) {
                    POSITIVE_EFFECTS.add(effect);
                } else {
                    NEGATIVE_EFFECTS.add(effect);
                }
            }
        }*/

        public static MobEffectInstance randomEffect() {
            return randomEffect(5);
        }

        public static MobEffectInstance randomPositiveEffect() {
            return randomPositiveEffect(5);
        }

        public static MobEffectInstance randomNegativeEffect() {
            return randomNegativeEffect(5);
        }

        public static MobEffectInstance randomEffect(int durationInSeconds) {
            return new MobEffectInstance(ALL_EFFECTS.get(RNG.nextInt(ALL_EFFECTS.size()-1)), Math.secondsToTicks(durationInSeconds));
        }

        public static MobEffectInstance randomPositiveEffect(int durationInSeconds) {
            return new MobEffectInstance(POSITIVE_EFFECTS.get(RNG.nextInt(POSITIVE_EFFECTS.size()-1)), Math.secondsToTicks(durationInSeconds));
        }

        public static MobEffectInstance randomNegativeEffect(int durationInSeconds) {
            return new MobEffectInstance(NEGATIVE_EFFECTS.get(RNG.nextInt(NEGATIVE_EFFECTS.size()-1)), Math.secondsToTicks(durationInSeconds));
        }
    }
}
