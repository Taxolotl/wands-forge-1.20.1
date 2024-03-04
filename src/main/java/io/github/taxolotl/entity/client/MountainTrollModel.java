package io.github.taxolotl.entity.client;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.taxolotl.Wands;
import io.github.taxolotl.entity.animations.ModAnimationDefinitions;
import io.github.taxolotl.entity.custom.MountainTrollEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class MountainTrollModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Wands.MOD_ID, "mountain_troll_model"), "main");
	private final ModelPart troll;
	private final ModelPart head;

	public MountainTrollModel(ModelPart root) {
		this.troll = root.getChild("troll");
		this.head = troll.getChild("body")
				.getChild("torso")
				.getChild("upper_torso")
				.getChild("neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition troll = partdefinition.addOrReplaceChild("troll", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition body = troll.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(10.0F, -40.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(-2.0F, 2.0F, 0.0F));

		PartDefinition upper_torso = torso.addOrReplaceChild("upper_torso", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -8.0F, -9.0F, 13.0F, 12.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -2.0F, 0.0F));

		PartDefinition neck = upper_torso.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(76, 49).addBox(-2.0F, -6.0F, -5.0F, 7.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -5.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(40, 37).addBox(-9.0F, -9.0F, -7.0F, 9.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 51).addBox(-3.0F, -51.0F, -8.0F, 8.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 50.0F, 0.0F));

		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(-7.0F, 50.0F, 0.0F));

		PartDefinition l_ear_r1 = left_ear.addOrReplaceChild("l_ear_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -55.0F, -7.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-7.0F, 50.0F, 0.0F));

		PartDefinition r_ear_r1 = right_ear.addOrReplaceChild("r_ear_r1", CubeListBuilder.create().texOffs(32, 56).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -55.0F, 7.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition middle_torso = torso.addOrReplaceChild("middle_torso", CubeListBuilder.create().texOffs(0, 30).addBox(-7.0F, 4.0F, -8.0F, 11.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -2.0F, 0.0F));

		PartDefinition lower_torso = torso.addOrReplaceChild("lower_torso", CubeListBuilder.create().texOffs(48, 16).addBox(-6.0F, 9.0F, -7.0F, 10.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -2.0F, 0.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(68, 68).addBox(-4.0F, -5.0F, -10.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -2.0F, -9.0F));

		PartDefinition left_upper_arm = left_arm.addOrReplaceChild("left_upper_arm", CubeListBuilder.create().texOffs(82, 0).addBox(-4.0F, 0.0F, -18.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.0F, 9.0F));

		PartDefinition left_forearm = left_upper_arm.addOrReplaceChild("left_forearm", CubeListBuilder.create().texOffs(56, 102).addBox(-3.0F, 12.0F, -17.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_hand = left_forearm.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(88, 27).addBox(-4.0F, 19.0F, -18.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(38, 59).addBox(-4.0F, -5.0F, 0.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -2.0F, 9.0F));

		PartDefinition right_upper_arm = right_arm.addOrReplaceChild("right_upper_arm", CubeListBuilder.create().texOffs(38, 79).addBox(-4.0F, 0.0F, 10.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.0F, -9.0F));

		PartDefinition right_forearm = right_upper_arm.addOrReplaceChild("right_forearm", CubeListBuilder.create().texOffs(100, 42).addBox(-3.0F, 12.0F, 11.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_hand = right_forearm.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(70, 87).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 14.0F));

		PartDefinition club = right_hand.addOrReplaceChild("club", CubeListBuilder.create().texOffs(72, 42).addBox(-5.0F, 22.0F, 13.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(5.0F, 21.0F, 12.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-9.0F, 21.0F, 12.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(44, 0).addBox(-18.0F, 19.0F, 10.0F, 9.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 69).addBox(-27.0F, 18.0F, 9.0F, 9.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-29.0F, 20.0F, 11.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -19.0F, -14.0F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 100).addBox(-3.0F, 0.0F, -3.0F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 14.0F, -4.0F));

		PartDefinition left_calf = left_leg.addOrReplaceChild("left_calf", CubeListBuilder.create().texOffs(112, 22).addBox(-2.0F, 0.0F, -2.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(104, 60).addBox(-2.0F, 5.0F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(38, 35).addBox(-2.0F, 12.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition left_foot = left_calf.addOrReplaceChild("left_foot", CubeListBuilder.create().texOffs(94, 94).addBox(-9.0F, 0.0F, -5.0F, 10.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(106, 12).addBox(-14.0F, 1.0F, -5.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(18, 107).addBox(-15.0F, 2.0F, -5.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 14.0F, 0.0F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(30, 99).addBox(-3.0F, 0.0F, -3.0F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 14.0F, 4.0F));

		PartDefinition right_calf = right_leg.addOrReplaceChild("right_calf", CubeListBuilder.create().texOffs(106, 105).addBox(-2.0F, 0.0F, -2.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(102, 81).addBox(-2.0F, 5.0F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 12).addBox(-2.0F, 12.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition right_foot = right_calf.addOrReplaceChild("right_foot", CubeListBuilder.create().texOffs(0, 89).addBox(-9.0F, 0.0F, -3.0F, 10.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(80, 105).addBox(-14.0F, 1.0F, -3.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(28, 70).addBox(-15.0F, 2.0F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 14.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.MOUNTAIN_TROLL_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((MountainTrollEntity) entity).idleAnimationState, ModAnimationDefinitions.MOUNTAIN_TROLL_IDLE, ageInTicks, 1f);
		this.animate(((MountainTrollEntity) entity).attackAnimationState, ModAnimationDefinitions.MOUNTAIN_TROLL_ATTACK, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		troll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return troll;
	}
}