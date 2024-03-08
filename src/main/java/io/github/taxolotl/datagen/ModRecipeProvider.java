package io.github.taxolotl.datagen;

import io.github.taxolotl.blocks.ModBlocks;
import io.github.taxolotl.item.ModItems;
import io.github.taxolotl.util.ModTags;
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
                .define('W', ModTags.Items.WAND_WOODS)
                .define('C', ModTags.Items.WAND_CORES)
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

        //Cauldron cakes will have a custom recipe within a wizard's cauldron

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

        planksFromLog(pWriter, ModBlocks.MAHOGANY_PLANKS.get(), ModTags.Items.MAHOGANY_LOGS, 4);
        woodFromLogs(pWriter, ModBlocks.MAHOGANY_WOOD.get(), ModBlocks.MAHOGANY_LOG.get());
    }
}
