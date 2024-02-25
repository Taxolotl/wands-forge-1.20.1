package io.github.taxolotl.item;

import io.github.taxolotl.Wands;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LEMON.get()))
                    .title(Component.translatable("creativetab.wands_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LEMON.get());
                        pOutput.accept(ModItems.LEMON_DROP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
