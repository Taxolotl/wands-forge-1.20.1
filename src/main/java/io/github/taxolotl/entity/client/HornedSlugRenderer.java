package io.github.taxolotl.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import io.github.taxolotl.Wands;
import io.github.taxolotl.entity.custom.HornedSlugEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class HornedSlugRenderer extends MobRenderer<HornedSlugEntity, HornedSlugModel<HornedSlugEntity>> {
    public HornedSlugRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new HornedSlugModel<>(pContext.bakeLayer(ModModelLayers.HORNED_SLUG_LAYER)), 0.2f);
    }

    @Override
    public ResourceLocation getTextureLocation(HornedSlugEntity pEntity) {
        return new ResourceLocation(Wands.MOD_ID, "textures/entity/horned_slug.png");
    }

    @Override
    public void render(HornedSlugEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
