package io.github.taxolotl.wands.event;

import io.github.taxolotl.wands.Wands;
import io.github.taxolotl.wands.entity.ModEntities;
import io.github.taxolotl.wands.entity.custom.HornedSlugEntity;
import io.github.taxolotl.wands.entity.custom.MountainTrollEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Wands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.MOUNTAIN_TROLL.get(), MountainTrollEntity.createAttributes().build());
        event.put(ModEntities.HORNED_SLUG.get(), HornedSlugEntity.createAttributes().build());
    }
}
