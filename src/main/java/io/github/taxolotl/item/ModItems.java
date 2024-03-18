package io.github.taxolotl.item;

import io.github.taxolotl.Wands;
import io.github.taxolotl.blocks.ModBlocks;
import io.github.taxolotl.entity.ModEntities;
import io.github.taxolotl.entity.custom.ModBoatEntity;
import io.github.taxolotl.item.custom.BezoarItem;
import io.github.taxolotl.item.custom.ModBoatItem;
import io.github.taxolotl.item.custom.WandItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Wands.MOD_ID);


    public static final RegistryObject<Item> WAND = ITEMS.register("wand",
            () -> new WandItem(new Item.Properties(), WoodType.OAK));

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

    public static final RegistryObject<Item> MAHOGANY_SIGN = ITEMS.register("mahogany_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.MAHOGANY_SIGN.get(), ModBlocks.MAHOGANY_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAHOGANY_HANGING_SIGN = ITEMS.register("mahogany_hanging_sign",
            () -> new HangingSignItem(ModBlocks.MAHOGANY_HANGING_SIGN.get(), ModBlocks.MAHOGANY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> WILLOW_SIGN = ITEMS.register("willow_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WILLOW_SIGN.get(), ModBlocks.WILLOW_WALL_SIGN.get()));
    public static final RegistryObject<Item> WILLOW_HANGING_SIGN = ITEMS.register("willow_hanging_sign",
            () -> new HangingSignItem(ModBlocks.WILLOW_HANGING_SIGN.get(), ModBlocks.WILLOW_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> YEW_SIGN = ITEMS.register("yew_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.YEW_SIGN.get(), ModBlocks.YEW_WALL_SIGN.get()));
    public static final RegistryObject<Item> YEW_HANGING_SIGN = ITEMS.register("yew_hanging_sign",
            () -> new HangingSignItem(ModBlocks.YEW_HANGING_SIGN.get(), ModBlocks.YEW_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> MAPLE_SIGN = ITEMS.register("maple_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.MAPLE_SIGN.get(), ModBlocks.MAPLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAPLE_HANGING_SIGN = ITEMS.register("maple_hanging_sign",
            () -> new HangingSignItem(ModBlocks.MAPLE_HANGING_SIGN.get(), ModBlocks.MAPLE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> EBONY_SIGN = ITEMS.register("ebony_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.EBONY_SIGN.get(), ModBlocks.EBONY_WALL_SIGN.get()));
    public static final RegistryObject<Item> EBONY_HANGING_SIGN = ITEMS.register("ebony_hanging_sign",
            () -> new HangingSignItem(ModBlocks.EBONY_HANGING_SIGN.get(), ModBlocks.EBONY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> HOLLY_SIGN = ITEMS.register("holly_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.HOLLY_SIGN.get(), ModBlocks.HOLLY_WALL_SIGN.get()));
    public static final RegistryObject<Item> HOLLY_HANGING_SIGN = ITEMS.register("holly_hanging_sign",
            () -> new HangingSignItem(ModBlocks.HOLLY_HANGING_SIGN.get(), ModBlocks.HOLLY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BEECHWOOD_SIGN = ITEMS.register("beechwood_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BEECHWOOD_SIGN.get(), ModBlocks.BEECHWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> BEECHWOOD_HANGING_SIGN = ITEMS.register("beechwood_hanging_sign",
            () -> new HangingSignItem(ModBlocks.BEECHWOOD_HANGING_SIGN.get(), ModBlocks.BEECHWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> MAHOGANY_BOAT = ITEMS.register("mahogany_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.MAHOGANY, new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_CHEST_BOAT = ITEMS.register("mahogany_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.MAHOGANY, new Item.Properties()));

    public static final RegistryObject<Item> WILLOW_BOAT = ITEMS.register("willow_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.WILLOW, new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_CHEST_BOAT = ITEMS.register("willow_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.WILLOW, new Item.Properties()));

    public static final RegistryObject<Item> YEW_BOAT = ITEMS.register("yew_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.YEW, new Item.Properties()));
    public static final RegistryObject<Item> YEW_CHEST_BOAT = ITEMS.register("yew_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.YEW, new Item.Properties()));

    public static final RegistryObject<Item> BEECHWOOD_BOAT = ITEMS.register("beechwood_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.BEECHWOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEECHWOOD_CHEST_BOAT = ITEMS.register("beechwood_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.BEECHWOOD, new Item.Properties()));

    public static final RegistryObject<Item> MAPLE_BOAT = ITEMS.register("maple_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.MAPLE, new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_CHEST_BOAT = ITEMS.register("maple_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.MAPLE, new Item.Properties()));

    public static final RegistryObject<Item> EBONY_BOAT = ITEMS.register("ebony_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.EBONY, new Item.Properties()));
    public static final RegistryObject<Item> EBONY_CHEST_BOAT = ITEMS.register("ebony_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.EBONY, new Item.Properties()));

    public static final RegistryObject<Item> HOLLY_BOAT = ITEMS.register("holly_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.HOLLY, new Item.Properties()));
    public static final RegistryObject<Item> HOLLY_CHEST_BOAT = ITEMS.register("holly_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.HOLLY, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
