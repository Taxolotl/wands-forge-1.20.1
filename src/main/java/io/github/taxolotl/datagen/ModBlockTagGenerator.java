package io.github.taxolotl.datagen;

import io.github.taxolotl.Wands;
import io.github.taxolotl.blocks.ModBlocks;
import io.github.taxolotl.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Wands.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.WAND_WOODS)
                .add(Blocks.OAK_PLANKS);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MAGIC_BRICKS.get())
                .add(ModBlocks.MAGIC_BRICK_STAIRS.get())
                .add(ModBlocks.MAGIC_BRICK_SLAB.get())
                .add(ModBlocks.MAGIC_BRICK_WALL.get());
    }
}
