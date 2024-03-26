package io.github.taxolotl.wands.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MagicSlabBlock extends SlabBlock {
    public MagicSlabBlock(Properties pProperties) {
        super(pProperties);
    }

    @SuppressWarnings("deprecation")
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
