package io.github.taxolotl.wands.block.entity;

import io.github.taxolotl.wands.item.ModItems;
import io.github.taxolotl.wands.screen.WandCraftingStationMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WandCraftingStationBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(3) ;

    private static final int WOOD_SLOT = 0;
    private static final int CORE_SLOT = 1;
    private static final int OUTPUT_SLOT = 2;
    private boolean hasCrafted;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    public WandCraftingStationBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.WAND_CRAFTING_BE.get(), pPos, pBlockState);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == ForgeCapabilities.ITEM_HANDLER) {
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for(int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(1, itemHandler.getStackInSlot(i));
        }
        assert this.level != null;
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public @NotNull Component getDisplayName() {
        return Component.translatable("block.wands.wand_crafting_station");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, @NotNull Inventory pPlayerInventory, @NotNull Player pPlayer) {
        return new WandCraftingStationMenu(pContainerId, pPlayerInventory, this, new SimpleContainer(3));
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());

        super.saveAdditional(pTag);
    }

    @Override
    public void load(@NotNull CompoundTag pTag) {
        super.load(pTag);
        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
    }

    public void tick(Level pLevel, BlockPos pPos, BlockState pState) {
        if(canCraft()) {
            //setChanged(pLevel, pPos, pState);
            craftItem();
        }/*
        if(hasCrafted && itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty()) {
            clearCraftingContent();
        }*/
    }

    private boolean canCraft() {
        return !this.itemHandler.getStackInSlot(WOOD_SLOT).isEmpty() &&
                !this.itemHandler.getStackInSlot(CORE_SLOT).isEmpty() &&
                !this.itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty();
    }

    private void craftItem() {
        ItemStack result = new ItemStack(ModItems.WAND.get());
        CompoundTag nbtData = new CompoundTag();
        nbtData.putString("wands.wood_type", itemHandler.getStackInSlot(WOOD_SLOT).getItem().toString());
        result.setTag(nbtData);

        hasCrafted = true;

        this.itemHandler.setStackInSlot(OUTPUT_SLOT, result);
    }

    public void clearCraftingContent() {
        this.itemHandler.extractItem(WOOD_SLOT, 1, false);
        this.itemHandler.extractItem(CORE_SLOT, 1, false);
        this.itemHandler.extractItem(OUTPUT_SLOT, 1, false);
        hasCrafted = false;
    }
}
