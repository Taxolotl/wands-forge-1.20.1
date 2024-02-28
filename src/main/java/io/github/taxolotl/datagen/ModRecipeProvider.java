package io.github.taxolotl.datagen;

import io.github.taxolotl.item.ModItems;
import io.github.taxolotl.tags.ModTags;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.LEMON_DROP.get())
                .pattern(" SS")
                .pattern("SLS")
                .pattern("SS ")
                .define('S', Items.SUGAR)
                .define('L', ModItems.LEMON.get())
                .unlockedBy(getHasName(ModItems.LEMON.get()), has(ModItems.LEMON.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WAND.get())
                .pattern("  W")
                .pattern(" C ")
                .pattern("W  ")
                .define('W', ModTags.Items.WAND_WOODS)
                .define('C', ModTags.Items.WAND_CORES)
                .unlockedBy(getHasName(ModItems.LEMON.get()), has(ModItems.LEMON.get()))
                .save(pWriter);
    }
}
