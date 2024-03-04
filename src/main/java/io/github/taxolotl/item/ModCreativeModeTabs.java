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
                        pOutput.accept(ModItems.WAND.get());

                        pOutput.accept(ModItems.MOUNTAIN_TROLL_SPAWN_EGG.get());
                        pOutput.accept(ModItems.MOUNTAIN_TROLL_BOOGERS.get());

                        pOutput.accept(ModItems.HORNED_SLUG_SPAWN_EGG.get());

                        pOutput.accept(ModItems.DRAGON_LIVER.get());
                        pOutput.accept(ModItems.DRAGON_HEARTSTRING.get());
                        pOutput.accept(ModItems.BAT_SPLEEN.get());
                        pOutput.accept(ModItems.HORNED_SLUG.get());

                        pOutput.accept(ModItems.KNUT.get());
                        pOutput.accept(ModItems.SICKLE.get());
                        pOutput.accept(ModItems.GALLEON.get());

                        pOutput.accept(ModItems.LEMON_DROP.get());
                        pOutput.accept(ModItems.EVERY_FLAVOUR_BEANS.get());
                        pOutput.accept(ModItems.BLOWING_GUM.get());
                        pOutput.accept(ModItems.CHOCOLATE_FROG.get());
                        pOutput.accept(ModItems.PUMPKIN_PASTY.get());
                        pOutput.accept(ModItems.LICORICE_WAND.get());
                        pOutput.accept(ModItems.CAULDRON_CAKE.get());
                        pOutput.accept(ModItems.PEPPERMINT_HUMBUG.get());
                        pOutput.accept(ModItems.WIZARD_CRACKER.get());
                        pOutput.accept(ModItems.TREACLE_TART.get());

                        pOutput.accept(ModItems.BEZOAR.get());

                        pOutput.accept(ModBlocks.MAGIC_BRICKS.get());
                        pOutput.accept(ModBlocks.MAGIC_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.MAGIC_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.MAGIC_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.DITTANY.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
