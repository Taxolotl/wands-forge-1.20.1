package io.github.taxolotl.blocks;

import io.github.taxolotl.Wands;
import io.github.taxolotl.blocks.custom.MagicBrickBlock;
import io.github.taxolotl.blocks.custom.MagicBrickSlabBlock;
import io.github.taxolotl.blocks.custom.MagicBrickStairBlock;
import io.github.taxolotl.blocks.custom.MagicBrickWallBlock;
import io.github.taxolotl.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Wands.MOD_ID);

    public static final RegistryObject<Block> MAGIC_BRICKS = registerBlock("magic_bricks",
            () -> new MagicBrickBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)
                    .isViewBlocking((something1, something2, something3) -> false)
                    .isSuffocating((something1, something2, something3) -> false)
                    .noOcclusion()));

    public static final RegistryObject<Block> MAGIC_BRICK_STAIRS = registerBlock("magic_brick_stairs",
            () -> new MagicBrickStairBlock(() -> ModBlocks.MAGIC_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModBlocks.MAGIC_BRICKS.get())));
    public static final RegistryObject<Block> MAGIC_BRICK_SLAB = registerBlock("magic_brick_slab",
            () -> new MagicBrickSlabBlock(BlockBehaviour.Properties.copy(ModBlocks.MAGIC_BRICKS.get())));
    public static final RegistryObject<Block> MAGIC_BRICK_WALL = registerBlock("magic_brick_wall",
            () -> new MagicBrickWallBlock(BlockBehaviour.Properties.copy(ModBlocks.MAGIC_BRICKS.get())));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
