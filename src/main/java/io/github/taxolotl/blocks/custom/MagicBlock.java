package io.github.taxolotl.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MagicBlock extends Block {
    public MagicBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        if(pContext instanceof EntityCollisionContext) {
            EntityCollisionContext entityCollisionContext = (EntityCollisionContext) pContext;
            if(entityCollisionContext.getEntity() != null) {
                if (entityCollisionContext.getEntity().getType() == EntityType.PLAYER && entityCollisionContext.getEntity().isSprinting()) {
                    return Shapes.empty();
                }
            }
        }

        return super.getCollisionShape(pState, pLevel, pPos, pContext);
    }

    /*
    Use this code for the ghost entity
    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        pEntity.setIsInPowderSnow(true);
        super.entityInside(pState, pLevel, pPos, pEntity);
    } */
}
