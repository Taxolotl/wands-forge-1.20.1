package io.github.taxolotl.wands.datagen;

import io.github.taxolotl.wands.Wands;
import io.github.taxolotl.wands.block.ModBlocks;
import io.github.taxolotl.wands.item.ModItems;
import io.github.taxolotl.wands.tags.ModBlockTags;
import io.github.taxolotl.wands.tags.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, Wands.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModItemTags.WAND_CORES)
                .add(ModItems.DRAGON_HEARTSTRING.get());

        this.tag(ModItemTags.WAND_WOODS)
                .add(ModBlocks.MAHOGANY_PLANKS.get().asItem())
                .add(ModBlocks.WILLOW_PLANKS.get().asItem())
                .add(ModBlocks.YEW_PLANKS.get().asItem())
                .add(ModBlocks.BEECHWOOD_PLANKS.get().asItem())
                .add(ModBlocks.MAPLE_PLANKS.get().asItem())
                .add(ModBlocks.EBONY_PLANKS.get().asItem())
                .add(ModBlocks.HOLLY_PLANKS.get().asItem())
                .add(Items.OAK_PLANKS);

        this.copy(ModBlockTags.MAHOGANY_LOGS, ModItemTags.MAHOGANY_LOGS);
        this.copy(ModBlockTags.WILLOW_LOGS, ModItemTags.WILLOW_LOGS);
        this.copy(ModBlockTags.YEW_LOGS, ModItemTags.YEW_LOGS);
        this.copy(ModBlockTags.BEECHWOOD_LOGS, ModItemTags.BEECHWOOD_LOGS);
        this.copy(ModBlockTags.MAPLE_LOGS, ModItemTags.MAPLE_LOGS);
        this.copy(ModBlockTags.EBONY_LOGS, ModItemTags.EBONY_LOGS);
        this.copy(ModBlockTags.HOLLY_LOGS, ModItemTags.HOLLY_LOGS);

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAHOGANY_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG.get().asItem())
                .add(ModBlocks.MAHOGANY_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD.get().asItem())
                .add(ModBlocks.YEW_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_YEW_LOG.get().asItem())
                .add(ModBlocks.YEW_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_YEW_WOOD.get().asItem())
                .add(ModBlocks.BEECHWOOD_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BEECHWOOD_LOG.get().asItem())
                .add(ModBlocks.BEECHWOOD_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BEECHWOOD_WOOD.get().asItem())
                .add(ModBlocks.MAPLE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.get().asItem())
                .add(ModBlocks.MAPLE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.get().asItem())
                .add(ModBlocks.EBONY_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_EBONY_LOG.get().asItem())
                .add(ModBlocks.EBONY_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_EBONY_WOOD.get().asItem())
                .add(ModBlocks.HOLLY_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_HOLLY_LOG.get().asItem())
                .add(ModBlocks.HOLLY_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_HOLLY_WOOD.get().asItem())
                .add(ModBlocks.WILLOW_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.get().asItem())
                .add(ModBlocks.WILLOW_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.WILLOW_PLANKS.get().asItem())
                .add(ModBlocks.YEW_PLANKS.get().asItem())
                .add(ModBlocks.BEECHWOOD_PLANKS.get().asItem())
                .add(ModBlocks.MAPLE_PLANKS.get().asItem())
                .add(ModBlocks.EBONY_PLANKS.get().asItem())
                .add(ModBlocks.HOLLY_PLANKS.get().asItem())
                .add(ModBlocks.MAHOGANY_PLANKS.get().asItem());
    }
}
