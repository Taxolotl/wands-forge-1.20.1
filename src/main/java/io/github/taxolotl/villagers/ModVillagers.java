package io.github.taxolotl.villagers;

import com.google.common.collect.ImmutableSet;
import io.github.taxolotl.Wands;
import io.github.taxolotl.blocks.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, Wands.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, Wands.MOD_ID);




    public static final RegistryObject<PoiType> CANDY_POI = POI_TYPES.register("candy_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.MAGIC_BRICKS.get().getStateDefinition().getPossibleStates()),
                    2, 2));

    public static final RegistryObject<PoiType> EXCHANGER_POI = POI_TYPES.register("exchanger_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.MAGIC_BRICK_SLAB.get().getStateDefinition().getPossibleStates()),
                    2, 2));



    public static final RegistryObject<VillagerProfession> CANDY_MAKER =
            VILLAGER_PROFESSIONS.register("candy_maker", () -> new VillagerProfession("candy_maker",
                    holder -> holder.get() == CANDY_POI.get(), holder -> holder.get() == CANDY_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_FARMER));

    public static final RegistryObject<VillagerProfession> EXCHANGER =
            VILLAGER_PROFESSIONS.register("exchanger", () -> new VillagerProfession("exchanger",
                    holder -> holder.get() == EXCHANGER_POI.get(), holder -> holder.get() == EXCHANGER_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));


    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
