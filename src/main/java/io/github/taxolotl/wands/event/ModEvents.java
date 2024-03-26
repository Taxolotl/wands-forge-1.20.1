package io.github.taxolotl.wands.event;

import io.github.taxolotl.wands.Wands;
import io.github.taxolotl.wands.item.ModItems;
import io.github.taxolotl.wands.villagers.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collection;
import java.util.List;

@Mod.EventBusSubscriber(modid = Wands.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void onMobDrops(LivingDropsEvent event) {
        LivingEntity entity = event.getEntity();
        Collection<ItemEntity> drops = event.getDrops();

        ItemStack stack = ItemStack.EMPTY;
        ItemEntity itemEntity = new ItemEntity(entity.level(), entity.getX(), entity.getY(), entity.getZ(), stack);

        if(entity instanceof Goat) {
            stack = new ItemStack(ModItems.BEZOAR.get());
        } else if(entity instanceof EnderDragon) {
            itemEntity.setItem(new ItemStack(ModItems.DRAGON_LIVER.get()));
            drops.add(itemEntity);

            stack = new ItemStack(ModItems.DRAGON_HEARTSTRING.get());
        } else if(entity instanceof Bat) {
            stack = new ItemStack(ModItems.BAT_SPLEEN.get());
        }

        itemEntity.setItem(stack);
        drops.add(itemEntity);
    }

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == ModVillagers.CANDY_MAKER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.KNUT.get(), 1),
                    new ItemStack(ModItems.LEMON_DROP.get(), 5),
                    10, 15, 0.02f
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.KNUT.get(), 1),
                    new ItemStack(ModItems.KNUT.get(), 1),
                    new ItemStack(ModItems.EVERY_FLAVOUR_BEANS.get(), 3),
                    10, 15, 0.02f
            ));

            trades.get(2).add(((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SICKLE.get(), 1),
                    new ItemStack(ModItems.CHOCOLATE_FROG.get(), 5),
                    10, 15, 0.02f
            )));
            trades.get(2).add(((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SICKLE.get(), 1),
                    new ItemStack(ModItems.KNUT.get(), 1),
                    new ItemStack(ModItems.BLOWING_GUM.get(), 5),
                    10, 15, 0.02f
            )));

            trades.get(3).add(((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SICKLE.get(), 1),
                    new ItemStack(ModItems.SICKLE.get(), 1),
                    new ItemStack(ModItems.LICORICE_WAND.get(), 10),
                    10, 15, 0.02f
            )));

            trades.get(3).add(((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.GALLEON.get(), 1),
                    new ItemStack(ModItems.WIZARD_CRACKER.get(), 34),
                    10, 15, 0.02f
            )));

        } else if(event.getType() == ModVillagers.EXCHANGER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();


            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.GALLEON.get(), 1),
                    10, 100, 0.02f
            ));


            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.GALLEON.get(), 1),
                    new ItemStack(ModItems.SICKLE.get(), 17),
                    10, 10, 0.02f
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SICKLE.get(), 1),
                    new ItemStack(ModItems.KNUT.get(), 29),
                    10, 10, 0.02f
            ));


            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.KNUT.get(), 29),
                    new ItemStack(ModItems.SICKLE.get(), 1),
                    10, 10, 0.02f
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SICKLE.get(), 16),
                    new ItemStack(ModItems.KNUT.get(), 29),
                    new ItemStack(ModItems.GALLEON.get(), 1),
                    10, 10, 0.02f
            ));
        } else if (event.getType() == ModVillagers.WANDMAKER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.GALLEON.get(), 8),
                    new ItemStack(ModItems.WAND.get(), 1),
                    10, 10, 0.02f
            ));
        }
    }
}
