package io.github.taxolotl.entity;

import io.github.taxolotl.Wands;
import io.github.taxolotl.entity.custom.HornedSlugEntity;
import io.github.taxolotl.entity.custom.ModBoatEntity;
import io.github.taxolotl.entity.custom.ModChestBoatEntity;
import io.github.taxolotl.entity.custom.MountainTrollEntity;
import io.github.taxolotl.util.ModUtilFunctions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Wands.MOD_ID);

    public static final RegistryObject<EntityType<MountainTrollEntity>> MOUNTAIN_TROLL =
            ENTITY_TYPES.register("mountain_troll", () -> EntityType.Builder.of(MountainTrollEntity::new, MobCategory.MONSTER)
                    .sized(2f, ModUtilFunctions.Math.yardsToBlocks(3)).build("mountain_troll"));

    public static final RegistryObject<EntityType<HornedSlugEntity>> HORNED_SLUG =
            ENTITY_TYPES.register("horned_slug", () -> EntityType.Builder.of(HornedSlugEntity::new, MobCategory.CREATURE)
                    .sized(0.4375f, 0.1875f).build("horned_slug"));

    public static final RegistryObject<EntityType<ModBoatEntity>> MOD_BOAT =
            ENTITY_TYPES.register("mod_boat", () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_boat"));
    public static final RegistryObject<EntityType<ModChestBoatEntity>> MOD_CHEST_BOAT =
            ENTITY_TYPES.register("mod_chest_boat", () -> EntityType.Builder.<ModChestBoatEntity>of(ModChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_chest_boat"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
