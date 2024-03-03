package io.github.taxolotl.item;

import io.github.taxolotl.Wands;
import io.github.taxolotl.entity.ModEntities;
import io.github.taxolotl.item.custom.WandItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Wands.MOD_ID);

    public static final RegistryObject<Item> LEMON_DROP = ITEMS.register("lemon_drop",
            () -> new Item(new Item.Properties().food(ModFoods.LEMON_DROP)));

    public static final RegistryObject<Item> WAND = ITEMS.register("wand",
            () -> new WandItem(new Item.Properties()));

    public static final RegistryObject<Item> KNUT = ITEMS.register("knut",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SICKLE = ITEMS.register("sickle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GALLEON = ITEMS.register("galleon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EVERY_FLAVOUR_BEANS = ITEMS.register("every_flavour_beans",
            () -> new Item(new Item.Properties().food(ModFoods.EVERY_FLAVOUR_BEANS)));

    public static final RegistryObject<Item> MOUNTAIN_TROLL_SPAWN_EGG = ITEMS.register("mountain_troll_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MOUNTAIN_TROLL, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
