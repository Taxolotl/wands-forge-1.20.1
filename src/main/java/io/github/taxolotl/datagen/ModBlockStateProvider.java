package io.github.taxolotl.datagen;

import io.github.taxolotl.Wands;
import io.github.taxolotl.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Wands.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.DITTANY.get(), models().cross(blockTexture(ModBlocks.DITTANY.get()).getPath(),
                blockTexture(ModBlocks.DITTANY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_DITTANY.get(), models().singleTexture("potted_dittany", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.DITTANY.get())).renderType("cutout"));

        stairsBlock(((StairBlock) ModBlocks.MAGIC_BRICK_STAIRS.get()), blockTexture(Blocks.BRICKS));
        slabBlock(((SlabBlock) ModBlocks.MAGIC_BRICK_SLAB.get()), blockTexture(Blocks.BRICKS), blockTexture(Blocks.BRICKS));
        wallBlock(((WallBlock) ModBlocks.MAGIC_BRICK_WALL.get()), blockTexture(Blocks.BRICKS));

        logBlock(((RotatedPillarBlock) ModBlocks.MAHOGANY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MAHOGANY_WOOD.get()),
                blockTexture(ModBlocks.MAHOGANY_LOG.get()),
                blockTexture(ModBlocks.MAHOGANY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAHOGANY_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_MAHOGANY_LOG.get()),
                new ResourceLocation(Wands.MOD_ID, "block/stripped_mahogany_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAHOGANY_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_MAHOGANY_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_MAHOGANY_LOG.get()));
        blockItem(ModBlocks.MAHOGANY_LOG);
        blockItem(ModBlocks.MAHOGANY_WOOD);
        blockItem(ModBlocks.STRIPPED_MAHOGANY_LOG);
        blockItem(ModBlocks.STRIPPED_MAHOGANY_WOOD);
        blockWithItem(ModBlocks.MAHOGANY_PLANKS);
        leavesBlock(ModBlocks.MAHOGANY_LEAVES);

        logBlock(((RotatedPillarBlock) ModBlocks.WILLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.WILLOW_WOOD.get()),
                blockTexture(ModBlocks.WILLOW_LOG.get()),
                blockTexture(ModBlocks.WILLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WILLOW_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()),
                new ResourceLocation(Wands.MOD_ID, "block/stripped_willow_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WILLOW_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()));
        blockItem(ModBlocks.WILLOW_LOG);
        blockItem(ModBlocks.WILLOW_WOOD);
        blockItem(ModBlocks.STRIPPED_WILLOW_LOG);
        blockItem(ModBlocks.STRIPPED_WILLOW_WOOD);
        blockWithItem(ModBlocks.WILLOW_PLANKS);
        leavesBlock(ModBlocks.WILLOW_LEAVES);

        logBlock(((RotatedPillarBlock) ModBlocks.YEW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.YEW_WOOD.get()),
                blockTexture(ModBlocks.YEW_LOG.get()),
                blockTexture(ModBlocks.YEW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_YEW_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_YEW_LOG.get()),
                new ResourceLocation(Wands.MOD_ID, "block/stripped_yew_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_YEW_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_YEW_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_YEW_LOG.get()));
        blockItem(ModBlocks.YEW_LOG);
        blockItem(ModBlocks.YEW_WOOD);
        blockItem(ModBlocks.STRIPPED_YEW_LOG);
        blockItem(ModBlocks.STRIPPED_YEW_WOOD);
        blockWithItem(ModBlocks.YEW_PLANKS);
        leavesBlock(ModBlocks.YEW_LEAVES);

        logBlock(((RotatedPillarBlock) ModBlocks.BEECHWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BEECHWOOD_WOOD.get()),
                blockTexture(ModBlocks.BEECHWOOD_LOG.get()),
                blockTexture(ModBlocks.BEECHWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BEECHWOOD_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_BEECHWOOD_LOG.get()),
                new ResourceLocation(Wands.MOD_ID, "block/stripped_beechwood_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BEECHWOOD_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_BEECHWOOD_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_BEECHWOOD_LOG.get()));
        blockItem(ModBlocks.BEECHWOOD_LOG);
        blockItem(ModBlocks.BEECHWOOD_WOOD);
        blockItem(ModBlocks.STRIPPED_BEECHWOOD_LOG);
        blockItem(ModBlocks.STRIPPED_BEECHWOOD_WOOD);
        blockWithItem(ModBlocks.BEECHWOOD_PLANKS);
        leavesBlock(ModBlocks.BEECHWOOD_LEAVES);

        logBlock(((RotatedPillarBlock) ModBlocks.MAPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MAPLE_WOOD.get()),
                blockTexture(ModBlocks.MAPLE_LOG.get()),
                blockTexture(ModBlocks.MAPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAPLE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_MAPLE_LOG.get()),
                new ResourceLocation(Wands.MOD_ID, "block/stripped_maple_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAPLE_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_MAPLE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_MAPLE_LOG.get()));
        blockItem(ModBlocks.MAPLE_LOG);
        blockItem(ModBlocks.MAPLE_WOOD);
        blockItem(ModBlocks.STRIPPED_MAPLE_LOG);
        blockItem(ModBlocks.STRIPPED_MAPLE_WOOD);
        blockWithItem(ModBlocks.MAPLE_PLANKS);
        leavesBlock(ModBlocks.MAPLE_LEAVES);

        logBlock(((RotatedPillarBlock) ModBlocks.EBONY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.EBONY_WOOD.get()),
                blockTexture(ModBlocks.EBONY_LOG.get()),
                blockTexture(ModBlocks.EBONY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_EBONY_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()),
                new ResourceLocation(Wands.MOD_ID, "block/stripped_ebony_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_EBONY_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()));
        blockItem(ModBlocks.EBONY_LOG);
        blockItem(ModBlocks.EBONY_WOOD);
        blockItem(ModBlocks.STRIPPED_EBONY_LOG);
        blockItem(ModBlocks.STRIPPED_EBONY_WOOD);
        blockWithItem(ModBlocks.EBONY_PLANKS);
        leavesBlock(ModBlocks.EBONY_LEAVES);

        logBlock(((RotatedPillarBlock) ModBlocks.HOLLY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.HOLLY_WOOD.get()),
                blockTexture(ModBlocks.HOLLY_LOG.get()),
                blockTexture(ModBlocks.HOLLY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HOLLY_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_HOLLY_LOG.get()),
                new ResourceLocation(Wands.MOD_ID, "block/stripped_holly_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HOLLY_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_HOLLY_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_HOLLY_LOG.get()));
        blockItem(ModBlocks.HOLLY_LOG);
        blockItem(ModBlocks.HOLLY_WOOD);
        blockItem(ModBlocks.STRIPPED_HOLLY_LOG);
        blockItem(ModBlocks.STRIPPED_HOLLY_WOOD);
        blockWithItem(ModBlocks.HOLLY_PLANKS);
        leavesBlock(ModBlocks.HOLLY_LEAVES);

        signBlock(((StandingSignBlock) ModBlocks.MAHOGANY_SIGN.get()), ((WallSignBlock) ModBlocks.MAHOGANY_WALL_SIGN.get()),
                blockTexture(ModBlocks.MAHOGANY_PLANKS.get()));
        hangingSignBlock(ModBlocks.MAHOGANY_HANGING_SIGN.get(), ModBlocks.MAHOGANY_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.MAHOGANY_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.YEW_SIGN.get()), ((WallSignBlock) ModBlocks.YEW_WALL_SIGN.get()),
                blockTexture(ModBlocks.YEW_PLANKS.get()));
        hangingSignBlock(ModBlocks.YEW_HANGING_SIGN.get(), ModBlocks.YEW_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.YEW_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.WILLOW_SIGN.get()), ((WallSignBlock) ModBlocks.WILLOW_WALL_SIGN.get()),
                blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        hangingSignBlock(ModBlocks.WILLOW_HANGING_SIGN.get(), ModBlocks.WILLOW_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.WILLOW_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.MAPLE_SIGN.get()), ((WallSignBlock) ModBlocks.MAPLE_WALL_SIGN.get()),
                blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        hangingSignBlock(ModBlocks.MAPLE_HANGING_SIGN.get(), ModBlocks.MAPLE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.EBONY_SIGN.get()), ((WallSignBlock) ModBlocks.EBONY_WALL_SIGN.get()),
                blockTexture(ModBlocks.EBONY_PLANKS.get()));
        hangingSignBlock(ModBlocks.EBONY_HANGING_SIGN.get(), ModBlocks.EBONY_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.EBONY_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.HOLLY_SIGN.get()), ((WallSignBlock) ModBlocks.HOLLY_WALL_SIGN.get()),
                blockTexture(ModBlocks.HOLLY_PLANKS.get()));
        hangingSignBlock(ModBlocks.HOLLY_HANGING_SIGN.get(), ModBlocks.HOLLY_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.HOLLY_PLANKS.get()));
    }

    private String name(Block block) {
        return key(block).getPath();
    }
    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Wands.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
