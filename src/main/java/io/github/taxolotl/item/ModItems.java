package io.github.taxolotl.item;

import io.github.taxolotl.Wands;
import io.github.taxolotl.item.custom.WandItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Wands.MOD_ID);

    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().food(ModFoods.LEMON)));

    public static final RegistryObject<Item> LEMON_DROP = ITEMS.register("lemon_drop",
            () -> new Item(new Item.Properties().food(ModFoods.LEMON_DROP)));

    public static final RegistryObject<Item> WAND = ITEMS.register("wand",
            () -> new WandItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
