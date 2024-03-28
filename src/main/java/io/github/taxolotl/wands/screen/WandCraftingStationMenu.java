package io.github.taxolotl.wands.screen;

import io.github.taxolotl.wands.block.ModBlocks;
import io.github.taxolotl.wands.item.ModItems;
import io.github.taxolotl.wands.tags.ModItemTags;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;

public class WandCraftingStationMenu extends AbstractContainerMenu {
    public static final int WOOD_SLOT = 0;
    public static final int CORE_SLOT = 1;
    public static final int OUTPUT_SLOT = 2;
    private final ContainerLevelAccess access;
    private final Level level;
    private ItemStack input = ItemStack.EMPTY;
    final Slot coreSlot;
    final Slot woodSlot;
    final Slot resultSlot;
    Runnable slotUpdateListener = () -> {
    };
    public final Container container = new SimpleContainer(1) {
        /**
         * For block entities, ensures the chunk containing the block entity is saved to disk later - the game won't think
         * it hasn't changed and skip it.
         */
        public void setChanged() {
            super.setChanged();
            WandCraftingStationMenu.this.slotsChanged(this);
            WandCraftingStationMenu.this.slotUpdateListener.run();
        }
    };
    final ResultContainer resultContainer = new ResultContainer();

    public WandCraftingStationMenu(int pContainerId, Inventory pPlayerInventory) {
        this(pContainerId, pPlayerInventory, ContainerLevelAccess.NULL);
    }

    public WandCraftingStationMenu(int pContainerId, Inventory pPlayerInventory, final ContainerLevelAccess pAccess) {
        super(ModMenuTypes.WAND_CRAFTING_MENU.get(), pContainerId);
        this.access = pAccess;
        this.level = pPlayerInventory.player.level();
        this.woodSlot = this.addSlot(new Slot(this.container, WOOD_SLOT, 62, 21) {
            @Override
            public boolean mayPlace(ItemStack pStack) {
                return WandCraftingStationMenu.this.isWandWood(pStack);
            }
        });

        this.coreSlot = this.addSlot(new Slot(this.container, CORE_SLOT, 98, 21) {
            @Override
            public boolean mayPlace(ItemStack pStack) {
                return WandCraftingStationMenu.this.isWandCore(pStack);
            }
        });

        this.resultSlot = this.addSlot(new Slot(this.container, OUTPUT_SLOT, 80, 54) {
            @Override
            public boolean mayPlace(ItemStack pStack) {
                return false;
            }

            public void onTake(Player p_150672_, ItemStack p_150673_) {
                p_150673_.onCraftedBy(p_150672_.level(), p_150672_, p_150673_.getCount());
                WandCraftingStationMenu.this.resultContainer.awardUsedRecipes(p_150672_, this.getRelevantItems());
                ItemStack woodStack = WandCraftingStationMenu.this.woodSlot.remove(1);
                ItemStack coreStack = WandCraftingStationMenu.this.coreSlot.remove(1);
                if (!woodStack.isEmpty() && !coreStack.isEmpty()) {
                    WandCraftingStationMenu.this.setupResultSlot();
                }

                super.onTake(p_150672_, p_150673_);
            }

            private List<ItemStack> getRelevantItems() {
                return List.of(WandCraftingStationMenu.this.woodSlot.getItem(), WandCraftingStationMenu.this.coreSlot.getItem());
            }
        });

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(pPlayerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for(int k = 0; k < 9; ++k) {
            this.addSlot(new Slot(pPlayerInventory, k, 8 + k * 18, 142));
        }

        //this.addDataSlot(this.selectedRecipeIndex);
    }

    public boolean isWandWood(ItemStack pStack) {
        return pStack.is(ModItemTags.WAND_WOODS);
    }

    public boolean isWandCore(ItemStack pStack) {
        return pStack.is(ModItemTags.WAND_CORES);
    }

    // CREDIT GOES TO: diesieben07 | https://github.com/diesieben07/SevenCommons
    @Override
    public ItemStack quickMoveStack(Player playerIn, int pIndex) {
        Slot sourceSlot = slots.get(pIndex);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (pIndex < 36) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, 36, 39, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (pIndex < 36 + 3) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, 0, 36, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + pIndex);
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    void setupResultSlot() {
        if (this.woodSlot.hasItem() && this.coreSlot.hasItem() && !this.resultSlot.hasItem()) {
            ItemStack itemstack = new ItemStack(ModItems.WAND.get(), 1);
            // Add tags to the itemstack
            this.resultSlot.set(itemstack);
        }

        this.broadcastChanges();
    }

    public void registerUpdateListener(Runnable pListener) {
        this.slotUpdateListener = pListener;
    }

    public boolean canTakeItemForPickAll(ItemStack pStack, Slot pSlot) {
        return pSlot.container != this.resultContainer && super.canTakeItemForPickAll(pStack, pSlot);
    }

    public void removed(Player pPlayer) {
        super.removed(pPlayer);
        this.resultContainer.removeItemNoUpdate(1);
        this.access.execute((p_40313_, p_40314_) -> {
            this.clearContainer(pPlayer, this.container);
        });
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(this.access, pPlayer, ModBlocks.WAND_CRAFTING_STATION.get());
    }
}
