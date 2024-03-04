package io.github.taxolotl.event;

import io.github.taxolotl.Wands;
import io.github.taxolotl.entity.client.HornedSlugModel;
import io.github.taxolotl.entity.client.ModModelLayers;
import io.github.taxolotl.entity.client.MountainTrollModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Wands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.MOUNTAIN_TROLL_LAYER, MountainTrollModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HORNED_SLUG_LAYER, HornedSlugModel::createBodyLayer);
    }
}