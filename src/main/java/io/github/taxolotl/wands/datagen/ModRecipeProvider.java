package io.github.taxolotl.wands.datagen;

import io.github.taxolotl.wands.block.ModBlocks;
import io.github.taxolotl.wands.item.ModItems;
import io.github.taxolotl.wands.tags.ModItemTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WAND.get())
                .pattern(" C")
                .pattern("W ")
                .define('W', ModItemTags.WAND_WOODS)
                .define('C', ModItemTags.WAND_CORES)
                .unlockedBy(getHasName(ModItems.LEMON_DROP.get()), has(ModItems.LEMON_DROP.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PUMPKIN_PASTY.get(), 10)
                .pattern("HSH")
                .pattern("SPS")
                .pattern("HWH")
                .define('P', Items.PUMPKIN)
                .define('W', Items.WATER_BUCKET)
                .define('S', Items.SUGAR)
                .define('H', Items.WHEAT)
                .unlockedBy(getHasName(Items.PUMPKIN), has(Items.PUMPKIN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PEPPERMINT_HUMBUG.get(), 2)
                .pattern("SP")
                .pattern("PS")
                .define('P', Items.FLOWERING_AZALEA_LEAVES) // Please remember to change this to something else
                .define('S', Items.SUGAR)
                .unlockedBy(getHasName(Items.FLOWERING_AZALEA_LEAVES), has(Items.FLOWERING_AZALEA_LEAVES))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.TREACLE_TART.get(), 1)
                .pattern("TWT")
                .pattern("HTH")
                .pattern("HHH")
                .define('T', Items.SUGAR)
                .define('H', Items.WHEAT)
                .define('W', Items.WATER_BUCKET)
                .unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR))
                .save(pWriter);

        planksFromLog(pWriter, ModBlocks.BEECHWOOD_PLANKS.get(), ModItemTags.BEECHWOOD_LOGS, 4);
        woodFromLogs(pWriter, ModBlocks.BEECHWOOD_WOOD.get(), ModBlocks.BEECHWOOD_LOG.get());

        planksFromLog(pWriter, ModBlocks.EBONY_PLANKS.get(), ModItemTags.EBONY_LOGS, 4);
        woodFromLogs(pWriter, ModBlocks.EBONY_WOOD.get(), ModBlocks.EBONY_LOG.get());

        planksFromLog(pWriter, ModBlocks.HOLLY_PLANKS.get(), ModItemTags.HOLLY_LOGS, 4);
        woodFromLogs(pWriter, ModBlocks.HOLLY_WOOD.get(), ModBlocks.HOLLY_LOG.get());

        planksFromLog(pWriter, ModBlocks.MAHOGANY_PLANKS.get(), ModItemTags.MAHOGANY_LOGS, 4);
        woodFromLogs(pWriter, ModBlocks.MAHOGANY_WOOD.get(), ModBlocks.MAHOGANY_LOG.get());

        planksFromLog(pWriter, ModBlocks.MAPLE_PLANKS.get(), ModItemTags.MAPLE_LOGS, 4);
        woodFromLogs(pWriter, ModBlocks.MAPLE_WOOD.get(), ModBlocks.MAPLE_LOG.get());

        planksFromLog(pWriter, ModBlocks.WILLOW_PLANKS.get(), ModItemTags.WILLOW_LOGS, 4);
        woodFromLogs(pWriter, ModBlocks.WILLOW_WOOD.get(), ModBlocks.WILLOW_LOG.get());

        planksFromLog(pWriter, ModBlocks.YEW_PLANKS.get(), ModItemTags.YEW_LOGS, 4);
        woodFromLogs(pWriter, ModBlocks.YEW_WOOD.get(), ModBlocks.YEW_LOG.get());
    }
}
