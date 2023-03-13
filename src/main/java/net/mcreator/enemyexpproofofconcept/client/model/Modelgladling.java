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

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgladling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("enemyexpansion", "modelgladling"), "main");
	public final ModelPart gladling;

	public Modelgladling(ModelPart root) {
		this.gladling = root.getChild("gladling");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition gladling = partdefinition.addOrReplaceChild("gladling", CubeListBuilder.create().texOffs(0, 0).addBox(-6.1F, -10.0F, -6.0F, 12.0F, 8.0F, 12.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition tentacle = gladling.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(36, 3).addBox(-4.5F, 2.5867F, -1.7825F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.01F)).texOffs(36, 3).mirror()
				.addBox(0.5F, 2.5867F, -1.7825F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -5.0F, -3.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r1 = tentacle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 3).mirror().addBox(0.0F, 1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 3.5867F, 0.2175F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r2 = tentacle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 3).addBox(-4.0F, 1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-2.0F, 3.5867F, 0.2175F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		gladling.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.gladling.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.gladling.xRot = headPitch / (180F / (float) Math.PI);
	}
}
