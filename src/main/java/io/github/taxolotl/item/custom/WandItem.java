package io.github.taxolotl.item.custom;

import io.github.taxolotl.blocks.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WandItem extends Item {
    public WandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            Level level = pContext.getLevel();
            Player player = pContext.getPlayer();
            FoodData food = player.getFoodData();


            // For now, take hunger, may remove entirely or replace with custom mana
            if(pContext.getLevel().getBlockState(positionClicked).is(Blocks.BRICKS)) {
                level.setBlock(positionClicked, ModBlocks.MAGIC_BRICKS.get().defaultBlockState(), 1);
                food.setFoodLevel(food.getFoodLevel()-2);
                player.sendSystemMessage(Component.literal("Successfully magicified!"));
            } else {
                food.setFoodLevel(food.getFoodLevel()-1);
                player.sendSystemMessage(Component.literal("Block is not bricks, could not magicify"));
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.wands.wand.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
