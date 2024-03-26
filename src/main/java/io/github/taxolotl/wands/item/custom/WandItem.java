package io.github.taxolotl.wands.item.custom;

import io.github.taxolotl.wands.block.ModBlocks;
import io.github.taxolotl.wands.tags.ModBlockTags;
import io.github.taxolotl.wands.util.ModUtilFunctions;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WandItem extends Item {
    private final WoodType woodType;

    public WandItem(Properties pProperties, WoodType woodType) {
        super(pProperties);
        this.woodType = woodType;
    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        return ModUtilFunctions.Math.secondsToTicks(5);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.BLOCK;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            Player player = pContext.getPlayer();
            FoodData food = player.getFoodData();
            BlockState state = pContext.getLevel().getBlockState(pContext.getClickedPos());
            BlockState result;


            if(state.is(ModBlockTags.BRICKS_TAG)) {
                if(state.is(BlockTags.WALLS)) {
                    result = ModBlocks.MAGIC_BRICK_WALL.get().withPropertiesOf(state);
                } else if(state.is(BlockTags.SLABS)) {
                    result = ModBlocks.MAGIC_BRICK_SLAB.get().withPropertiesOf(state);
                } else if(state.is(BlockTags.STAIRS)){
                    result = ModBlocks.MAGIC_BRICK_STAIRS.get().withPropertiesOf(state);
                } else {
                    result = ModBlocks.MAGIC_BRICKS.get().withPropertiesOf(state);
                }


                if(food.getFoodLevel() >= 2) {
                    player.sendSystemMessage(Component.literal("Successfully magicified!"));
                    pContext.getLevel().setBlock(pContext.getClickedPos(), result, 1);
                    food.setFoodLevel(food.getFoodLevel() - 2);
                } else {
                    player.sendSystemMessage(Component.literal("You are too hungry to do this spell right now"));
                    food.setFoodLevel(0);
                }
            } else {
                player.sendSystemMessage(Component.literal("Block is not bricks, could not magicify"));
                if(food.getFoodLevel() >= 1) {
                    food.setFoodLevel(food.getFoodLevel() - 1);
                } else {
                    food.setFoodLevel(0);
                }
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.wands.wand.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }
}
