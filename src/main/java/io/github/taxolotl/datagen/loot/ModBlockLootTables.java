package io.github.taxolotl.datagen.loot;

import io.github.taxolotl.blocks.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
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
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
