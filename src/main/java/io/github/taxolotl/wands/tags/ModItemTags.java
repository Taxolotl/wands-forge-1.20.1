package io.github.taxolotl.wands.tags;

import io.github.taxolotl.wands.Wands;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
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
        return net.minecraft.tags.ItemTags.create(new ResourceLocation(Wands.MOD_ID, name));
    }
}