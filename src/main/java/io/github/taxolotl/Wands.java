package io.github.taxolotl;

import com.mojang.logging.LogUtils;
import io.github.taxolotl.blocks.ModBlocks;
import io.github.taxolotl.entity.ModEntities;
import io.github.taxolotl.entity.client.HornedSlugRenderer;
import io.github.taxolotl.entity.client.MountainTrollRenderer;
import io.github.taxolotl.item.ModCreativeModeTabs;
import io.github.taxolotl.item.ModItems;
import io.github.taxolotl.villagers.ModVillagers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Wands.MOD_ID)
public class Wands {
    public static final String MOD_ID = "wands";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Wands() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModVillagers.register(modEventBus);

        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DITTANY.getId(), ModBlocks.POTTED_DITTANY);
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.LEMON_DROP);
            event.accept(ModItems.EVERY_FLAVOUR_BEANS);
        } else if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.WAND);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.MOUNTAIN_TROLL.get(), MountainTrollRenderer::new);
            EntityRenderers.register(ModEntities.HORNED_SLUG.get(), HornedSlugRenderer::new);
        }
    }
}
