package io.github.taxolotl.datagen;

import io.github.taxolotl.Wands;
import io.github.taxolotl.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Wands.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.LEMON);
        simpleItem(ModItems.LEMON_DROP);
        simpleItem(ModItems.WAND);

        wallItem(ModBlocks.MAGIC_BRICK_WALL, Blocks.BRICKS);
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
            .texture("wall", new ResourceLocation(Wands.MOD_ID, "block/" ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath());
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Wands.MOD_ID, "item/" + item.getId().getPath()));
    }
}
