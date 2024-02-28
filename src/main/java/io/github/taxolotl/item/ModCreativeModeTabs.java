package io.github.taxolotl.item;

import io.github.taxolotl.Wands;
import io.github.taxolotl.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Wands.MOD_ID);

    public static final RegistryObject WANDS_TAB = CREATIVE_MODE_TABS.register("wands_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WAND.get()))
                    .title(Component.translatable("creativetab.wands_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LEMON.get());
                        pOutput.accept(ModItems.LEMON_DROP.get());
                        pOutput.accept(ModItems.WAND.get());
                        pOutput.accept(ModBlocks.MAGIC_BRICKS.get());
                        pOutput.accept(ModBlocks.MAGIC_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.MAGIC_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.MAGIC_BRICK_WALL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
