package io.github.taxolotl.datagen.loot;

import io.github.taxolotl.blocks.ModBlocks;
import io.github.taxolotl.item.ModItems;
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
                this.createOakLeavesDrops(block, ModBlocks.MAHOGANY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.MAHOGANY_SAPLING.get());

        this.dropSelf(ModBlocks.WILLOW_LOG.get());
        this.dropSelf(ModBlocks.WILLOW_PLANKS.get());
        this.dropSelf(ModBlocks.WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_WOOD.get());
        this.add(ModBlocks.WILLOW_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, ModBlocks.WILLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.WILLOW_SAPLING.get());

        this.dropSelf(ModBlocks.YEW_LOG.get());
        this.dropSelf(ModBlocks.YEW_PLANKS.get());
        this.dropSelf(ModBlocks.YEW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_YEW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_YEW_WOOD.get());
        this.add(ModBlocks.YEW_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, ModBlocks.YEW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.YEW_SAPLING.get());

        this.dropSelf(ModBlocks.BEECHWOOD_LOG.get());
        this.dropSelf(ModBlocks.BEECHWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.BEECHWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BEECHWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BEECHWOOD_WOOD.get());
        this.add(ModBlocks.BEECHWOOD_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, ModBlocks.BEECHWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.BEECHWOOD_SAPLING.get());

        this.dropSelf(ModBlocks.MAPLE_LOG.get());
        this.dropSelf(ModBlocks.MAPLE_PLANKS.get());
        this.dropSelf(ModBlocks.MAPLE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MAPLE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAPLE_WOOD.get());
        this.add(ModBlocks.MAPLE_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, ModBlocks.MAPLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.MAPLE_SAPLING.get());

        this.dropSelf(ModBlocks.EBONY_LOG.get());
        this.dropSelf(ModBlocks.EBONY_PLANKS.get());
        this.dropSelf(ModBlocks.EBONY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_WOOD.get());
        this.add(ModBlocks.EBONY_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, ModBlocks.EBONY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.EBONY_SAPLING.get());

        this.dropSelf(ModBlocks.HOLLY_LOG.get());
        this.dropSelf(ModBlocks.HOLLY_PLANKS.get());
        this.dropSelf(ModBlocks.HOLLY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_HOLLY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_HOLLY_WOOD.get());
        this.add(ModBlocks.HOLLY_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, ModBlocks.HOLLY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.HOLLY_SAPLING.get());

        this.add(ModBlocks.MAHOGANY_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAHOGANY_SIGN.get()));
        this.add(ModBlocks.MAHOGANY_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAHOGANY_SIGN.get()));
        this.add(ModBlocks.MAHOGANY_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAHOGANY_HANGING_SIGN.get()));
        this.add(ModBlocks.MAHOGANY_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAHOGANY_HANGING_SIGN.get()));

        this.add(ModBlocks.YEW_SIGN.get(), block ->
                createSingleItemTable(ModItems.YEW_SIGN.get()));
        this.add(ModBlocks.YEW_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.YEW_SIGN.get()));
        this.add(ModBlocks.YEW_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.YEW_HANGING_SIGN.get()));
        this.add(ModBlocks.YEW_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.YEW_HANGING_SIGN.get()));

        this.add(ModBlocks.BEECHWOOD_SIGN.get(), block ->
                createSingleItemTable(ModItems.BEECHWOOD_SIGN.get()));
        this.add(ModBlocks.BEECHWOOD_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.BEECHWOOD_SIGN.get()));
        this.add(ModBlocks.BEECHWOOD_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.BEECHWOOD_HANGING_SIGN.get()));
        this.add(ModBlocks.BEECHWOOD_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.BEECHWOOD_HANGING_SIGN.get()));

        this.add(ModBlocks.WILLOW_SIGN.get(), block ->
                createSingleItemTable(ModItems.WILLOW_SIGN.get()));
        this.add(ModBlocks.WILLOW_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.WILLOW_SIGN.get()));
        this.add(ModBlocks.WILLOW_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.WILLOW_HANGING_SIGN.get()));
        this.add(ModBlocks.WILLOW_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.WILLOW_HANGING_SIGN.get()));

        this.add(ModBlocks.MAPLE_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAPLE_SIGN.get()));
        this.add(ModBlocks.MAPLE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAPLE_SIGN.get()));
        this.add(ModBlocks.MAPLE_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAPLE_HANGING_SIGN.get()));
        this.add(ModBlocks.MAPLE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.MAPLE_HANGING_SIGN.get()));

        this.add(ModBlocks.EBONY_SIGN.get(), block ->
                createSingleItemTable(ModItems.EBONY_SIGN.get()));
        this.add(ModBlocks.EBONY_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.EBONY_SIGN.get()));
        this.add(ModBlocks.EBONY_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.EBONY_HANGING_SIGN.get()));
        this.add(ModBlocks.EBONY_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.EBONY_HANGING_SIGN.get()));

        this.add(ModBlocks.HOLLY_SIGN.get(), block ->
                createSingleItemTable(ModItems.HOLLY_SIGN.get()));
        this.add(ModBlocks.HOLLY_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.HOLLY_SIGN.get()));
        this.add(ModBlocks.HOLLY_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.HOLLY_HANGING_SIGN.get()));
        this.add(ModBlocks.HOLLY_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.HOLLY_HANGING_SIGN.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
