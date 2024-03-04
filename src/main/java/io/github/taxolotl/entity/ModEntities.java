package io.github.taxolotl.entity;

import io.github.taxolotl.Wands;
import io.github.taxolotl.entity.custom.HornedSlugEntity;
import io.github.taxolotl.entity.custom.MountainTrollEntity;
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
                    .sized(2f, 3.658f).build("mountain_troll"));

    public static final RegistryObject<EntityType<HornedSlugEntity>> HORNED_SLUG =
            ENTITY_TYPES.register("horned_slug", () -> EntityType.Builder.of(HornedSlugEntity::new, MobCategory.CREATURE)
                    .sized(0.4375f, 0.1875f).build("horned_slug"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
