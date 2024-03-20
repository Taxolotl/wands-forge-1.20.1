package io.github.taxolotl.datagen;

import io.github.taxolotl.Wands;
import io.github.taxolotl.blocks.ModBlocks;
import io.github.taxolotl.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Wands.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BEECHWOOD_SIGN);
        simpleItem(ModItems.BEECHWOOD_HANGING_SIGN);
        simpleItem(ModItems.BEECHWOOD_BOAT);
        simpleItem(ModItems.BEECHWOOD_CHEST_BOAT);
        saplingItem(ModBlocks.BEECHWOOD_SAPLING);
        evenSimplerBlockItem(ModBlocks.BEECHWOOD_STAIRS);
        evenSimplerBlockItem(ModBlocks.BEECHWOOD_SLAB);
        evenSimplerBlockItem(ModBlocks.BEECHWOOD_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.BEECHWOOD_PRESSURE_PLATE);
        simpleBlockItem(ModBlocks.BEECHWOOD_DOOR);
        trapdoorItem(ModBlocks.BEECHWOOD_TRAPDOOR);
        fenceItem(ModBlocks.BEECHWOOD_FENCE, ModBlocks.BEECHWOOD_PLANKS);
        buttonItem(ModBlocks.BEECHWOOD_BUTTON, ModBlocks.BEECHWOOD_PLANKS);

        simpleItem(ModItems.EBONY_SIGN);
        simpleItem(ModItems.EBONY_HANGING_SIGN);
        simpleItem(ModItems.EBONY_BOAT);
        simpleItem(ModItems.EBONY_CHEST_BOAT);
        saplingItem(ModBlocks.EBONY_SAPLING);
        evenSimplerBlockItem(ModBlocks.EBONY_STAIRS);
        evenSimplerBlockItem(ModBlocks.EBONY_SLAB);
        evenSimplerBlockItem(ModBlocks.EBONY_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.EBONY_PRESSURE_PLATE);
        simpleBlockItem(ModBlocks.EBONY_DOOR);
        trapdoorItem(ModBlocks.EBONY_TRAPDOOR);
        fenceItem(ModBlocks.EBONY_FENCE, ModBlocks.EBONY_PLANKS);
        buttonItem(ModBlocks.EBONY_BUTTON, ModBlocks.EBONY_PLANKS);

        simpleItem(ModItems.HOLLY_SIGN);
        simpleItem(ModItems.HOLLY_HANGING_SIGN);
        simpleItem(ModItems.HOLLY_BOAT);
        simpleItem(ModItems.HOLLY_CHEST_BOAT);
        saplingItem(ModBlocks.HOLLY_SAPLING);
        evenSimplerBlockItem(ModBlocks.HOLLY_STAIRS);
        evenSimplerBlockItem(ModBlocks.HOLLY_SLAB);
        evenSimplerBlockItem(ModBlocks.HOLLY_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.HOLLY_PRESSURE_PLATE);
        simpleBlockItem(ModBlocks.HOLLY_DOOR);
        trapdoorItem(ModBlocks.HOLLY_TRAPDOOR);
        fenceItem(ModBlocks.HOLLY_FENCE, ModBlocks.HOLLY_PLANKS);
        buttonItem(ModBlocks.HOLLY_BUTTON, ModBlocks.HOLLY_PLANKS);

        simpleItem(ModItems.MAHOGANY_SIGN);
        simpleItem(ModItems.MAHOGANY_HANGING_SIGN);
        simpleItem(ModItems.MAHOGANY_BOAT);
        simpleItem(ModItems.MAHOGANY_CHEST_BOAT);
        saplingItem(ModBlocks.MAHOGANY_SAPLING);
        evenSimplerBlockItem(ModBlocks.MAHOGANY_STAIRS);
        evenSimplerBlockItem(ModBlocks.MAHOGANY_SLAB);
        evenSimplerBlockItem(ModBlocks.MAHOGANY_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.MAHOGANY_PRESSURE_PLATE);
        simpleBlockItem(ModBlocks.MAHOGANY_DOOR);
        trapdoorItem(ModBlocks.MAHOGANY_TRAPDOOR);
        fenceItem(ModBlocks.MAHOGANY_FENCE, ModBlocks.MAHOGANY_PLANKS);
        buttonItem(ModBlocks.MAHOGANY_BUTTON, ModBlocks.MAHOGANY_PLANKS);

        simpleItem(ModItems.MAPLE_SIGN);
        simpleItem(ModItems.MAPLE_HANGING_SIGN);
        simpleItem(ModItems.MAPLE_BOAT);
        simpleItem(ModItems.MAPLE_CHEST_BOAT);
        saplingItem(ModBlocks.MAPLE_SAPLING);
        evenSimplerBlockItem(ModBlocks.MAPLE_STAIRS);
        evenSimplerBlockItem(ModBlocks.MAPLE_SLAB);
        evenSimplerBlockItem(ModBlocks.MAPLE_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.MAPLE_PRESSURE_PLATE);
        simpleBlockItem(ModBlocks.MAPLE_DOOR);
        trapdoorItem(ModBlocks.MAPLE_TRAPDOOR);
        fenceItem(ModBlocks.MAPLE_FENCE, ModBlocks.MAPLE_PLANKS);
        buttonItem(ModBlocks.MAPLE_BUTTON, ModBlocks.MAPLE_PLANKS);

        simpleItem(ModItems.WILLOW_SIGN);
        simpleItem(ModItems.WILLOW_HANGING_SIGN);
        simpleItem(ModItems.WILLOW_BOAT);
        simpleItem(ModItems.WILLOW_CHEST_BOAT);
        saplingItem(ModBlocks.WILLOW_SAPLING);
        evenSimplerBlockItem(ModBlocks.WILLOW_STAIRS);
        evenSimplerBlockItem(ModBlocks.WILLOW_SLAB);
        evenSimplerBlockItem(ModBlocks.WILLOW_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.WILLOW_PRESSURE_PLATE);
        simpleBlockItem(ModBlocks.WILLOW_DOOR);
        trapdoorItem(ModBlocks.WILLOW_TRAPDOOR);
        fenceItem(ModBlocks.WILLOW_FENCE, ModBlocks.WILLOW_PLANKS);
        buttonItem(ModBlocks.WILLOW_BUTTON, ModBlocks.WILLOW_PLANKS);

        simpleItem(ModItems.YEW_SIGN);
        simpleItem(ModItems.YEW_HANGING_SIGN);
        simpleItem(ModItems.YEW_BOAT);
        simpleItem(ModItems.YEW_CHEST_BOAT);
        saplingItem(ModBlocks.YEW_SAPLING);
        evenSimplerBlockItem(ModBlocks.YEW_STAIRS);
        evenSimplerBlockItem(ModBlocks.YEW_SLAB);
        evenSimplerBlockItem(ModBlocks.YEW_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.YEW_PRESSURE_PLATE);
        simpleBlockItem(ModBlocks.YEW_DOOR);
        trapdoorItem(ModBlocks.YEW_TRAPDOOR);
        fenceItem(ModBlocks.YEW_FENCE, ModBlocks.YEW_PLANKS);
        buttonItem(ModBlocks.YEW_BUTTON, ModBlocks.YEW_PLANKS);

        simpleItem(ModItems.LEMON_DROP);
        simpleItem(ModItems.EVERY_FLAVOUR_BEANS);
        simpleItem(ModItems.BLOWING_GUM);
        simpleItem(ModItems.CHOCOLATE_FROG);
        simpleItem(ModItems.PUMPKIN_PASTY);
        simpleItem(ModItems.LICORICE_WAND);
        simpleItem(ModItems.CAULDRON_CAKE);
        simpleItem(ModItems.PEPPERMINT_HUMBUG);
        simpleItem(ModItems.WIZARD_CRACKER);
        simpleItem(ModItems.TREACLE_TART);

        simpleItem(ModItems.BEZOAR);
        simpleItem(ModItems.DRAGON_HEARTSTRING);
        simpleItem(ModItems.DRAGON_LIVER);
        simpleItem(ModItems.BAT_SPLEEN);
        simpleItem(ModItems.HORNED_SLUG);

        simpleItem(ModItems.KNUT);
        simpleItem(ModItems.SICKLE);
        simpleItem(ModItems.GALLEON);

        brickWallItem(ModBlocks.MAGIC_BRICK_WALL);
        evenSimplerBlockItem(ModBlocks.MAGIC_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.MAGIC_BRICK_SLAB);

        withExistingParent(ModItems.MOUNTAIN_TROLL_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        simpleItem(ModItems.MOUNTAIN_TROLL_BOOGERS);

        withExistingParent(ModItems.HORNED_SLUG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        simpleBlockItemBlockTexture(ModBlocks.DITTANY);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Wands.MOD_ID, "block/" + item.getId().getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Wands.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Wands.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void brickWallItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
            .texture("wall", new ResourceLocation("minecraft:block/bricks"));
    }

     public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Wands.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Wands.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Wands.MOD_ID, "block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Wands.MOD_ID,"item/" + item.getId().getPath()));
    }
}
