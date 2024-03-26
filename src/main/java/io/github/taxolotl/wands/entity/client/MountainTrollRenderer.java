package io.github.taxolotl.wands.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import io.github.taxolotl.wands.Wands;
import io.github.taxolotl.wands.entity.custom.MountainTrollEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MountainTrollRenderer extends MobRenderer<MountainTrollEntity, MountainTrollModel<MountainTrollEntity>> {
    public MountainTrollRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MountainTrollModel<>(pContext.bakeLayer(ModModelLayers.MOUNTAIN_TROLL_LAYER)), 1.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(MountainTrollEntity pEntity) {
        return new ResourceLocation(Wands.MOD_ID, "textures/entity/mountain_troll.png");
    }

    @Override
    public void render(MountainTrollEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
