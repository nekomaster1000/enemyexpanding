package net.mcreator.enemyexpproofofconcept.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelspiderlatch<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("enemyexpansion", "modelspiderlatch"), "main");
	public final ModelPart spiderhat;

	public Modelspiderlatch(ModelPart root) {
		this.spiderhat = root.getChild("spiderhat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition spiderhat = partdefinition.addOrReplaceChild("spiderhat", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spiderhead = spiderhat.addOrReplaceChild("spiderhead", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -4.0F, 4.0F));
		PartDefinition spiderbody = spiderhat.addOrReplaceChild("spiderbody", CubeListBuilder.create().texOffs(32, 32).addBox(-3.0F, -3.0F, -1.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition leg0 = spiderbody.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(32, 44).addBox(-13.0F, -1.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 4.0F, 0.0F, 0.3927F, -1.1781F));
		PartDefinition leg1 = spiderbody.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(32, 44).addBox(-1.0F, -1.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 4.0F, 0.0F, -0.3927F, 1.1781F));
		PartDefinition leg2 = spiderbody.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(32, 44).addBox(-13.0F, -1.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 3.0F, 0.0F, 0.0436F, -0.8727F));
		PartDefinition leg3 = spiderbody.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(32, 44).addBox(-1.0F, -1.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 3.0F, 0.0F, -0.0436F, 0.8727F));
		PartDefinition leg4 = spiderbody.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(32, 44).addBox(-13.0F, -1.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.21F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 2.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition leg5 = spiderbody.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(32, 44).addBox(-1.0F, -1.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.21F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 2.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition leg6 = spiderbody.addOrReplaceChild("leg6", CubeListBuilder.create().texOffs(32, 44).addBox(-13.0F, -1.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 1.0F, 0.0F, -0.7854F, -0.7854F));
		PartDefinition leg7 = spiderbody.addOrReplaceChild("leg7", CubeListBuilder.create().texOffs(32, 44).addBox(-1.0F, -1.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 1.0F, 0.0F, 0.7854F, 0.7854F));
		PartDefinition headbutt = spiderbody.addOrReplaceChild("headbutt", CubeListBuilder.create().texOffs(0, 44).addBox(-5.0F, -4.0F, 0.0F, 10.0F, 8.0F, 12.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		spiderhat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.spiderhat.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.spiderhat.xRot = headPitch / (180F / (float) Math.PI);
	}
}
