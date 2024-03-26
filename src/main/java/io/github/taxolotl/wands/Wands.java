package io.github.taxolotl.wands;

import com.mojang.logging.LogUtils;
import io.github.taxolotl.wands.block.ModBlocks;
import io.github.taxolotl.wands.block.entity.ModBlockEntities;
import io.github.taxolotl.wands.entity.ModEntities;
import io.github.taxolotl.wands.entity.client.HornedSlugRenderer;
import io.github.taxolotl.wands.entity.client.ModBoatRenderer;
import io.github.taxolotl.wands.entity.client.MountainTrollRenderer;
import io.github.taxolotl.wands.item.ModCreativeModeTabs;
import io.github.taxolotl.wands.item.ModItems;
import io.github.taxolotl.wands.recipe.ModRecipes;
import io.github.taxolotl.wands.screen.ModMenuTypes;
import io.github.taxolotl.wands.screen.WandCraftingStationScreen;
import io.github.taxolotl.wands.util.ModWoodTypes;
import io.github.taxolotl.wands.villagers.ModVillagers;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
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

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

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
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.WAND);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.MAHOGANY);
            Sheets.addWoodType(ModWoodTypes.BEECHWOOD);
            Sheets.addWoodType(ModWoodTypes.YEW);
            Sheets.addWoodType(ModWoodTypes.MAPLE);
            Sheets.addWoodType(ModWoodTypes.EBONY);
            Sheets.addWoodType(ModWoodTypes.WILLOW);
            Sheets.addWoodType(ModWoodTypes.HOLLY);

            EntityRenderers.register(ModEntities.MOUNTAIN_TROLL.get(), MountainTrollRenderer::new);
            EntityRenderers.register(ModEntities.HORNED_SLUG.get(), HornedSlugRenderer::new);
            EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));

            MenuScreens.register(ModMenuTypes.WAND_CRAFTING_MENU.get(), WandCraftingStationScreen::new);
        }
    }
}
