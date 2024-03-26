package io.github.taxolotl.wands.tags;

import io.github.taxolotl.wands.Wands;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> BRICKS_TAG = tag("bricks_tag");
    public static final TagKey<Block> MAHOGANY_LOGS = tag("mahogany_logs");
    public static final TagKey<Block> WILLOW_LOGS = tag("willow_logs");
    public static final TagKey<Block> YEW_LOGS = tag("yew_logs");
    public static final TagKey<Block> BEECHWOOD_LOGS = tag("beechwood_logs");
    public static final TagKey<Block> MAPLE_LOGS = tag("maple_logs");
    public static final TagKey<Block> EBONY_LOGS = tag("ebony_logs");
    public static final TagKey<Block> HOLLY_LOGS = tag("holly_logs");

    private static TagKey<Block> tag(String name) {
        return net.minecraft.tags.BlockTags.create(new ResourceLocation(Wands.MOD_ID, name));
    }
}

