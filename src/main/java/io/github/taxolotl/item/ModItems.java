package io.github.taxolotl.item;

import io.github.taxolotl.Wands;
import io.github.taxolotl.entity.ModEntities;
import io.github.taxolotl.item.custom.BezoarItem;
import io.github.taxolotl.item.custom.WandItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Wands.MOD_ID);


    public static final RegistryObject<Item> WAND = ITEMS.register("wand",
            () -> new WandItem(new Item.Properties()));

    public static final RegistryObject<Item> KNUT = ITEMS.register("knut",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SICKLE = ITEMS.register("sickle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GALLEON = ITEMS.register("galleon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEMON_DROP = ITEMS.register("lemon_drop",
            () -> new Item(new Item.Properties().food(ModFoods.LEMON_DROP)));
    public static final RegistryObject<Item> EVERY_FLAVOUR_BEANS = ITEMS.register("every_flavour_beans",
            () -> new Item(new Item.Properties().food(ModFoods.EVERY_FLAVOUR_BEANS)));
    public static final RegistryObject<Item> BLOWING_GUM = ITEMS.register("blowing_gum",
            () -> new Item(new Item.Properties().food(ModFoods.BLOWING_GUM)));
    public static final RegistryObject<Item> CHOCOLATE_FROG = ITEMS.register("chocolate_frog",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_FROG))); // give it's own custom glass for a card that shows a random player on the server
    public static final RegistryObject<Item> PUMPKIN_PASTY = ITEMS.register("pumpkin_pasty",
            () -> new Item(new Item.Properties().food(ModFoods.PUMPKIN_PASTY)));
    public static final RegistryObject<Item> LICORICE_WAND = ITEMS.register("licorice_wand",
            () -> new Item(new Item.Properties().food(ModFoods.LICORICE_WAND)));
    public static final RegistryObject<Item> CAULDRON_CAKE = ITEMS.register("cauldron_cake",
            () -> new Item(new Item.Properties().food(ModFoods.CAULDRON_CAKE)));
    public static final RegistryObject<Item> PEPPERMINT_HUMBUG = ITEMS.register("peppermint_humbug",
            () -> new Item(new Item.Properties().food(ModFoods.PEPPERMINT_HUMBUG)));
    public static final RegistryObject<Item> WIZARD_CRACKER = ITEMS.register("wizard_cracker",
            () -> new Item(new Item.Properties().food(ModFoods.WIZARD_CRACKER))); // give it's own custom class to spawn a random spark spell
    public static final RegistryObject<Item> TREACLE_TART = ITEMS.register("treacle_tart",
            () -> new Item(new Item.Properties().food(ModFoods.TREACLE_TART)));


    public static final RegistryObject<Item> BEZOAR = ITEMS.register("bezoar",
            () -> new BezoarItem(new Item.Properties()));

    public static final RegistryObject<Item> MOUNTAIN_TROLL_SPAWN_EGG = ITEMS.register("mountain_troll_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MOUNTAIN_TROLL, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> MOUNTAIN_TROLL_BOOGERS = ITEMS.register("mountain_troll_boogers",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HORNED_SLUG_SPAWN_EGG = ITEMS.register("horned_slug_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.HORNED_SLUG, 0xffff00, 0x0101ff,
                    new Item.Properties()));
    public static final RegistryObject<Item> HORNED_SLUG = ITEMS.register("horned_slug",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAGON_LIVER = ITEMS.register("dragon_liver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_HEARTSTRING = ITEMS.register("dragon_heartstring",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BAT_SPLEEN = ITEMS.register("bat_spleen",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
