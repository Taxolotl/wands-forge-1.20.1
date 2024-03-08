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
        simpleItem(ModItems.MAHOGANY_SIGN);
        simpleItem(ModItems.MAHOGANY_HANGING_SIGN);
        simpleItem(ModItems.YEW_SIGN);
        simpleItem(ModItems.YEW_HANGING_SIGN);
        simpleItem(ModItems.BEECHWOOD_SIGN);
        simpleItem(ModItems.BEECHWOOD_HANGING_SIGN);
        simpleItem(ModItems.WILLOW_SIGN);
        simpleItem(ModItems.WILLOW_HANGING_SIGN);
        simpleItem(ModItems.MAPLE_SIGN);
        simpleItem(ModItems.MAPLE_HANGING_SIGN);
        simpleItem(ModItems.EBONY_SIGN);
        simpleItem(ModItems.EBONY_HANGING_SIGN);
        simpleItem(ModItems.HOLLY_SIGN);
        simpleItem(ModItems.HOLLY_HANGING_SIGN);


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

        simpleItem(ModItems.MAHOGANY_BOAT);
        simpleItem(ModItems.MAHOGANY_CHEST_BOAT);

        simpleItem(ModItems.WILLOW_BOAT);
        simpleItem(ModItems.WILLOW_CHEST_BOAT);

        simpleItem(ModItems.YEW_BOAT);
        simpleItem(ModItems.YEW_CHEST_BOAT);

        simpleItem(ModItems.BEECHWOOD_BOAT);
        simpleItem(ModItems.BEECHWOOD_CHEST_BOAT);

        simpleItem(ModItems.MAPLE_BOAT);
        simpleItem(ModItems.MAPLE_CHEST_BOAT);

        simpleItem(ModItems.EBONY_BOAT);
        simpleItem(ModItems.EBONY_CHEST_BOAT);

        simpleItem(ModItems.HOLLY_BOAT);
        simpleItem(ModItems.HOLLY_CHEST_BOAT);
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
}
