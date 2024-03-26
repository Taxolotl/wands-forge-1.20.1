package io.github.taxolotl.wands.screen.slot;

import io.github.taxolotl.wands.screen.WandCraftingStationMenu;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class WandCraftingStationWoodSlot extends Slot {
    private final WandCraftingStationMenu menu;

    public WandCraftingStationWoodSlot(WandCraftingStationMenu pMenu, Container pContainer, int pSlot, int pX, int pY) {
        super(pContainer, pSlot, pX, pY);
        this.menu = pMenu;
    }

    @Override
    public boolean mayPlace(ItemStack pStack) {
        return this.menu.isWandWood(pStack);
    }
}
