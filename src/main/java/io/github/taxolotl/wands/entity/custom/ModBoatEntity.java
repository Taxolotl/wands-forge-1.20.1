package io.github.taxolotl.wands.entity.custom;

import io.github.taxolotl.wands.block.ModBlocks;
import io.github.taxolotl.wands.entity.ModEntities;
import io.github.taxolotl.wands.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.function.IntFunction;

public class ModBoatEntity extends Boat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public ModBoatEntity(EntityType<? extends Boat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ModBoatEntity(Level level, double pX, double pY, double pZ) {
        this(ModEntities.MOD_BOAT.get(), level);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public Item getDropItem() {
        return switch (getModVariant()) {
            case MAHOGANY -> ModItems.MAHOGANY_BOAT.get();
            case WILLOW -> ModItems.WILLOW_BOAT.get();
            case YEW -> ModItems.YEW_BOAT.get();
            case BEECHWOOD -> ModItems.BEECHWOOD_BOAT.get();
            case MAPLE -> ModItems.MAPLE_BOAT.get();
            case EBONY -> ModItems.EBONY_BOAT.get();
            case HOLLY -> ModItems.HOLLY_BOAT.get();
        };
    }

    public void setVariant(Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }

    public Type getModVariant() {
        return Type.byId(this.entityData.get(DATA_ID_TYPE));
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, Type.MAHOGANY.ordinal());
    }

    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if(pCompound.contains("Type", 8)) {
            this.setVariant(Type.byName(pCompound.getString("Type")));
        }
    }

    public static enum Type implements StringRepresentable {
        MAHOGANY(ModBlocks.MAHOGANY_PLANKS.get(), "mahogany"),
        WILLOW(ModBlocks.WILLOW_PLANKS.get(), "willow"),
        YEW(ModBlocks.YEW_PLANKS.get(), "yew"),
        BEECHWOOD(ModBlocks.BEECHWOOD_PLANKS.get(), "beechwood"),
        MAPLE(ModBlocks.MAPLE_PLANKS.get(), "maple"),
        EBONY(ModBlocks.EBONY_PLANKS.get(), "ebony"),
        HOLLY(ModBlocks.HOLLY_PLANKS.get(), "holly");

        private final String name;
        private final Block planks;
        @SuppressWarnings("deprecation")
        public static final StringRepresentable.EnumCodec<ModBoatEntity.Type> CODEC = StringRepresentable.fromEnum(ModBoatEntity.Type::values);
        private static final IntFunction<ModBoatEntity.Type> BY_ID = ByIdMap.continuous(Enum::ordinal, values(), ByIdMap.OutOfBoundsStrategy.ZERO);

        private Type(Block pPlanks, String pName) {
            this.name = pName;
            this.planks = pPlanks;
        }

        public String getSerializedName() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }

        public Block getPlanks() {
            return this.planks;
        }

        public String toString() {
            return this.name;
        }

        /**
         * Get a boat type by its enum ordinal
         */
        public static ModBoatEntity.Type byId(int pId) {
            return BY_ID.apply(pId);
        }

        public static ModBoatEntity.Type byName(String pName) {
            return CODEC.byName(pName, MAHOGANY);
        }
    }
}
