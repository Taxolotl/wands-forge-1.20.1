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

                        pOutput.accept(ModBlocks.MAHOGANY_LEAVES.get());
                        pOutput.accept(ModBlocks.MAHOGANY_PLANKS.get());
                        pOutput.accept(ModBlocks.MAHOGANY_WOOD.get());
                        pOutput.accept(ModBlocks.MAHOGANY_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAHOGANY_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAHOGANY_LOG.get());
                        pOutput.accept(ModItems.MAHOGANY_SIGN.get());
                        pOutput.accept(ModItems.MAHOGANY_HANGING_SIGN.get());

                        pOutput.accept(ModBlocks.WILLOW_LEAVES.get());
                        pOutput.accept(ModBlocks.WILLOW_PLANKS.get());
                        pOutput.accept(ModBlocks.WILLOW_WOOD.get());
                        pOutput.accept(ModBlocks.WILLOW_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_WILLOW_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_WILLOW_LOG.get());
                        pOutput.accept(ModItems.WILLOW_SIGN.get());
                        pOutput.accept(ModItems.WILLOW_HANGING_SIGN.get());

                        pOutput.accept(ModBlocks.YEW_LEAVES.get());
                        pOutput.accept(ModBlocks.YEW_PLANKS.get());
                        pOutput.accept(ModBlocks.YEW_WOOD.get());
                        pOutput.accept(ModBlocks.YEW_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_YEW_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_YEW_LOG.get());
                        pOutput.accept(ModItems.YEW_SIGN.get());
                        pOutput.accept(ModItems.YEW_HANGING_SIGN.get());

                        pOutput.accept(ModBlocks.BEECHWOOD_LEAVES.get());
                        pOutput.accept(ModBlocks.BEECHWOOD_PLANKS.get());
                        pOutput.accept(ModBlocks.BEECHWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.BEECHWOOD_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BEECHWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_BEECHWOOD_LOG.get());
                        pOutput.accept(ModItems.BEECHWOOD_SIGN.get());
                        pOutput.accept(ModItems.BEECHWOOD_HANGING_SIGN.get());

                        pOutput.accept(ModBlocks.MAPLE_LEAVES.get());
                        pOutput.accept(ModBlocks.MAPLE_PLANKS.get());
                        pOutput.accept(ModBlocks.MAPLE_WOOD.get());
                        pOutput.accept(ModBlocks.MAPLE_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAPLE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAPLE_LOG.get());
                        pOutput.accept(ModItems.MAPLE_SIGN.get());
                        pOutput.accept(ModItems.MAPLE_HANGING_SIGN.get());

                        pOutput.accept(ModBlocks.EBONY_LEAVES.get());
                        pOutput.accept(ModBlocks.EBONY_PLANKS.get());
                        pOutput.accept(ModBlocks.EBONY_WOOD.get());
                        pOutput.accept(ModBlocks.EBONY_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_EBONY_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_EBONY_LOG.get());
                        pOutput.accept(ModItems.EBONY_SIGN.get());
                        pOutput.accept(ModItems.EBONY_HANGING_SIGN.get());

                        pOutput.accept(ModBlocks.HOLLY_LEAVES.get());
                        pOutput.accept(ModBlocks.HOLLY_PLANKS.get());
                        pOutput.accept(ModBlocks.HOLLY_WOOD.get());
                        pOutput.accept(ModBlocks.HOLLY_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_HOLLY_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_HOLLY_LOG.get());
                        pOutput.accept(ModItems.HOLLY_SIGN.get());
                        pOutput.accept(ModItems.HOLLY_HANGING_SIGN.get());

                        pOutput.accept(ModItems.MAHOGANY_BOAT.get());
                        pOutput.accept(ModItems.MAHOGANY_CHEST_BOAT.get());

                        pOutput.accept(ModItems.WILLOW_BOAT.get());
                        pOutput.accept(ModItems.WILLOW_CHEST_BOAT.get());

                        pOutput.accept(ModItems.YEW_BOAT.get());
                        pOutput.accept(ModItems.YEW_CHEST_BOAT.get());

                        pOutput.accept(ModItems.BEECHWOOD_BOAT.get());
                        pOutput.accept(ModItems.BEECHWOOD_CHEST_BOAT.get());

                        pOutput.accept(ModItems.MAPLE_BOAT.get());
                        pOutput.accept(ModItems.MAPLE_CHEST_BOAT.get());

                        pOutput.accept(ModItems.EBONY_BOAT.get());
                        pOutput.accept(ModItems.EBONY_CHEST_BOAT.get());

                        pOutput.accept(ModItems.HOLLY_BOAT.get());
                        pOutput.accept(ModItems.HOLLY_CHEST_BOAT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
