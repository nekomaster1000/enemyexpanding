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
public class Modelslimehead<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("enemyexpansion", "modelslimehead"), "main");
	public final ModelPart slime;

	public Modelslimehead(ModelPart root) {
		this.slime = root.getChild("slime");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition slime = partdefinition.addOrReplaceChild("slime",
				CubeListBuilder.create().texOffs(0, 52).addBox(-3.0F, -8.5F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(1.1F)).texOffs(32, 0).addBox(-4.0F, -9.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.5F)).texOffs(32, 48)
						.addBox(-4.0F, 1.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.5F)).texOffs(56, 30).addBox(0.0F, -4.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 26)
						.addBox(1.3F, -7.5F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 22).addBox(-3.3F, -7.5F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.5F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		slime.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.slime.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.slime.xRot = headPitch / (180F / (float) Math.PI);
	}
}
