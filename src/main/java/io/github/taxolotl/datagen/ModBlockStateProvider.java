package io.github.taxolotl.datagen;

import io.github.taxolotl.Wands;
import io.github.taxolotl.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Wands.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(ModBlocks.MAGIC_BRICKS);

        stairsBlock(((StairBlock) ModBlocks.MAGIC_BRICK_STAIRS.get()), blockTexture(Blocks.BRICKS));
        slabBlock(((SlabBlock) ModBlocks.MAGIC_BRICK_SLAB.get()), blockTexture(Blocks.BRICKS), blockTexture(Blocks.BRICKS));
        wallBlock(((WallBlock) ModBlocks.MAGIC_BRICK_WALL.get()), blockTexture(Blocks.BRICKS));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
