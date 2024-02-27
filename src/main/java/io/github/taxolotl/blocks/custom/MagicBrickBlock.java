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

public class MagicBrickBlock extends Block {
    public MagicBrickBlock(Properties pProperties) {
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
}
