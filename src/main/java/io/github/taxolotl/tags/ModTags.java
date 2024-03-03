package io.github.taxolotl.tags;

import io.github.taxolotl.Wands;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BRICKS_TAG = tag("bricks_tag");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Wands.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> WAND_WOODS = tag("wand_woods");
        public static final TagKey<Item> WAND_CORES = tag("wand_cores");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Wands.MOD_ID, name));
        }
    }
}
