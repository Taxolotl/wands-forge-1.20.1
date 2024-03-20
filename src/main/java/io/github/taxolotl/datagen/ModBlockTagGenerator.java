package io.github.taxolotl.datagen;

import io.github.taxolotl.Wands;
import io.github.taxolotl.blocks.ModBlocks;
import io.github.taxolotl.util.ModTags;
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
        this.tag(ModTags.Blocks.BRICKS_TAG)
                .add(Blocks.BRICK_SLAB)
                .add(Blocks.BRICK_STAIRS)
                .add(Blocks.BRICK_WALL)
                .add(Blocks.BRICKS);

        this.tag(ModTags.Blocks.MAHOGANY_LOGS)
                .add(ModBlocks.MAHOGANY_LOG.get())
                .add(ModBlocks.MAHOGANY_WOOD.get())
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG.get())
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD.get());

        this.tag(ModTags.Blocks.WILLOW_LOGS)
                .add(ModBlocks.WILLOW_LOG.get())
                .add(ModBlocks.WILLOW_WOOD.get())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.get())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.get());

        this.tag(ModTags.Blocks.YEW_LOGS)
                .add(ModBlocks.YEW_LOG.get())
                .add(ModBlocks.YEW_WOOD.get())
                .add(ModBlocks.STRIPPED_YEW_LOG.get())
                .add(ModBlocks.STRIPPED_YEW_WOOD.get());

        this.tag(ModTags.Blocks.BEECHWOOD_LOGS)
                .add(ModBlocks.BEECHWOOD_LOG.get())
                .add(ModBlocks.BEECHWOOD_WOOD.get())
                .add(ModBlocks.STRIPPED_BEECHWOOD_LOG.get())
                .add(ModBlocks.STRIPPED_BEECHWOOD_WOOD.get());

        this.tag(ModTags.Blocks.MAPLE_LOGS)
                .add(ModBlocks.MAPLE_LOG.get())
                .add(ModBlocks.MAPLE_WOOD.get())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.get())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.get());

        this.tag(ModTags.Blocks.EBONY_LOGS)
                .add(ModBlocks.EBONY_LOG.get())
                .add(ModBlocks.EBONY_WOOD.get())
                .add(ModBlocks.STRIPPED_EBONY_LOG.get())
                .add(ModBlocks.STRIPPED_EBONY_WOOD.get());

        this.tag(ModTags.Blocks.HOLLY_LOGS)
                .add(ModBlocks.HOLLY_LOG.get())
                .add(ModBlocks.HOLLY_WOOD.get())
                .add(ModBlocks.STRIPPED_HOLLY_LOG.get())
                .add(ModBlocks.STRIPPED_HOLLY_WOOD.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MAGIC_BRICKS.get())
                .add(ModBlocks.MAGIC_BRICK_STAIRS.get())
                .add(ModBlocks.MAGIC_BRICK_SLAB.get())
                .add(ModBlocks.MAGIC_BRICK_WALL.get());

        this.tag(BlockTags.WALLS)
            .add(ModBlocks.MAGIC_BRICK_WALL.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAHOGANY_LOG.get())
                .add(ModBlocks.MAHOGANY_WOOD.get())
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG.get())
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD.get())
                .add(ModBlocks.WILLOW_LOG.get())
                .add(ModBlocks.WILLOW_WOOD.get())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.get())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.get())
                .add(ModBlocks.YEW_LOG.get())
                .add(ModBlocks.YEW_WOOD.get())
                .add(ModBlocks.STRIPPED_YEW_LOG.get())
                .add(ModBlocks.STRIPPED_YEW_WOOD.get())
                .add(ModBlocks.BEECHWOOD_LOG.get())
                .add(ModBlocks.BEECHWOOD_WOOD.get())
                .add(ModBlocks.STRIPPED_BEECHWOOD_LOG.get())
                .add(ModBlocks.STRIPPED_BEECHWOOD_WOOD.get())
                .add(ModBlocks.MAPLE_LOG.get())
                .add(ModBlocks.MAPLE_WOOD.get())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.get())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.get())
                .add(ModBlocks.EBONY_LOG.get())
                .add(ModBlocks.EBONY_WOOD.get())
                .add(ModBlocks.STRIPPED_EBONY_LOG.get())
                .add(ModBlocks.STRIPPED_EBONY_WOOD.get())
                .add(ModBlocks.HOLLY_LOG.get())
                .add(ModBlocks.HOLLY_WOOD.get())
                .add(ModBlocks.STRIPPED_HOLLY_LOG.get())
                .add(ModBlocks.STRIPPED_HOLLY_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.MAHOGANY_PLANKS.get())
                .add(ModBlocks.YEW_PLANKS.get())
                .add(ModBlocks.BEECHWOOD_PLANKS.get())
                .add(ModBlocks.MAPLE_PLANKS.get())
                .add(ModBlocks.EBONY_PLANKS.get())
                .add(ModBlocks.HOLLY_PLANKS.get())
                .add(ModBlocks.WILLOW_PLANKS.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.BEECHWOOD_FENCE.get())
                .add(ModBlocks.EBONY_FENCE.get())
                .add(ModBlocks.HOLLY_FENCE.get())
                .add(ModBlocks.MAHOGANY_FENCE.get())
                .add(ModBlocks.MAPLE_FENCE.get())
                .add(ModBlocks.WILLOW_FENCE.get())
                .add(ModBlocks.YEW_FENCE.get());

        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.BEECHWOOD_FENCE.get())
                .add(ModBlocks.EBONY_FENCE.get())
                .add(ModBlocks.HOLLY_FENCE.get())
                .add(ModBlocks.MAHOGANY_FENCE.get())
                .add(ModBlocks.MAPLE_FENCE.get())
                .add(ModBlocks.WILLOW_FENCE.get())
                .add(ModBlocks.YEW_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.BEECHWOOD_FENCE_GATE.get())
                .add(ModBlocks.EBONY_FENCE_GATE.get())
                .add(ModBlocks.HOLLY_FENCE_GATE.get())
                .add(ModBlocks.MAHOGANY_FENCE_GATE.get())
                .add(ModBlocks.MAPLE_FENCE_GATE.get())
                .add(ModBlocks.WILLOW_FENCE_GATE.get())
                .add(ModBlocks.YEW_FENCE_GATE.get());
    }
}
