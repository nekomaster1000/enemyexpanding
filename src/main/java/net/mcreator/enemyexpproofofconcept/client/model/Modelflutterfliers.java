package net.mcreator.enemyexpproofofconcept.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modelflutterfliers<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("enemyexpansion", "modelflutterfliers"), "main");
	public final ModelPart all;
	public final ModelPart leftarm;
	public final ModelPart rightarm;

	public Modelflutterfliers(ModelPart root) {
		this.all = root.getChild("all");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition mainguy = all.addOrReplaceChild("mainguy", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.0F));
		PartDefinition mainguyleftwing = mainguy.addOrReplaceChild("mainguyleftwing", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -18.0F, 0.0F, 20.0F, 40.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition mainguyrightwing = mainguy.addOrReplaceChild("mainguyrightwing", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-20.0F, -18.0F, 0.0F, 20.0F, 40.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(-4.0F, 2.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
