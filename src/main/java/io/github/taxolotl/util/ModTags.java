package io.github.taxolotl.util;

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
        public static final TagKey<Block> MAHOGANY_LOGS = tag("mahogany_logs");
        public static final TagKey<Block> WILLOW_LOGS = tag("willow_logs");
        public static final TagKey<Block> YEW_LOGS = tag("yew_logs");
        public static final TagKey<Block> BEECHWOOD_LOGS = tag("beechwood_logs");
        public static final TagKey<Block> MAPLE_LOGS = tag("maple_logs");
        public static final TagKey<Block> EBONY_LOGS = tag("ebony_logs");
        public static final TagKey<Block> HOLLY_LOGS = tag("holly_logs");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Wands.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> WAND_WOODS = tag("wand_woods");
        public static final TagKey<Item> WAND_CORES = tag("wand_cores");
        public static final TagKey<Item> MAHOGANY_LOGS = tag("mahogany_logs");
        public static final TagKey<Item> WILLOW_LOGS = tag("willow_logs");
        public static final TagKey<Item> YEW_LOGS = tag("yew_logs");
        public static final TagKey<Item> BEECHWOOD_LOGS = tag("beechwood_logs");
        public static final TagKey<Item> MAPLE_LOGS = tag("maple_logs");
        public static final TagKey<Item> EBONY_LOGS = tag("ebony_logs");
        public static final TagKey<Item> HOLLY_LOGS = tag("holly_logs");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Wands.MOD_ID, name));
        }
    }
}
