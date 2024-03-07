package io.github.taxolotl.datagen.loot;

import io.github.taxolotl.blocks.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropOther(ModBlocks.MAGIC_BRICKS.get(), Blocks.BRICKS);
        this.dropOther(ModBlocks.MAGIC_BRICK_STAIRS.get(), Blocks.BRICK_STAIRS);
        this.dropOther(ModBlocks.MAGIC_BRICK_SLAB.get(), Blocks.BRICK_SLAB);
        this.dropOther(ModBlocks.MAGIC_BRICK_WALL.get(), Blocks.BRICK_WALL);

        this.dropSelf(ModBlocks.DITTANY.get());
        this.add(ModBlocks.POTTED_DITTANY.get(), createPotFlowerItemTable(ModBlocks.DITTANY.get()));

        this.dropSelf(ModBlocks.MAHOGANY_LOG.get());
        this.dropSelf(ModBlocks.MAHOGANY_PLANKS.get());
        this.dropSelf(ModBlocks.MAHOGANY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MAHOGANY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAHOGANY_WOOD.get());
        this.add(ModBlocks.MAHOGANY_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, Blocks.SAND, NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.WILLOW_LOG.get());
        this.dropSelf(ModBlocks.WILLOW_PLANKS.get());
        this.dropSelf(ModBlocks.WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_WOOD.get());
        this.add(ModBlocks.WILLOW_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, Blocks.SAND, NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.YEW_LOG.get());
        this.dropSelf(ModBlocks.YEW_PLANKS.get());
        this.dropSelf(ModBlocks.YEW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_YEW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_YEW_WOOD.get());
        this.add(ModBlocks.YEW_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, Blocks.SAND, NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.BEECHWOOD_LOG.get());
        this.dropSelf(ModBlocks.BEECHWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.BEECHWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BEECHWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BEECHWOOD_WOOD.get());
        this.add(ModBlocks.BEECHWOOD_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, Blocks.SAND, NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.MAPLE_LOG.get());
        this.dropSelf(ModBlocks.MAPLE_PLANKS.get());
        this.dropSelf(ModBlocks.MAPLE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MAPLE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAPLE_WOOD.get());
        this.add(ModBlocks.MAPLE_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, Blocks.SAND, NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.EBONY_LOG.get());
        this.dropSelf(ModBlocks.EBONY_PLANKS.get());
        this.dropSelf(ModBlocks.EBONY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_WOOD.get());
        this.add(ModBlocks.EBONY_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, Blocks.SAND, NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.HOLLY_LOG.get());
        this.dropSelf(ModBlocks.HOLLY_PLANKS.get());
        this.dropSelf(ModBlocks.HOLLY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_HOLLY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_HOLLY_WOOD.get());
        this.add(ModBlocks.HOLLY_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, Blocks.SAND, NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
