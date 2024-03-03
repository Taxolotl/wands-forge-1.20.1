package io.github.taxolotl.event;

import io.github.taxolotl.Wands;
import io.github.taxolotl.item.ModItems;
import io.github.taxolotl.villagers.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Wands.MOD_ID)
public class ModEvents {
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
        }
    }
}
