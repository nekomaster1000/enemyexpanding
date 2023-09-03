package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.item.model.RestingVigorModel;
import net.mcreator.enemyexpproofofconcept.item.RestingVigorItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RestingVigorArmorRenderer extends GeoArmorRenderer<RestingVigorItem> {
	public RestingVigorArmorRenderer() {
		super(new RestingVigorModel());
		this.headBone = "armorHead";
		this.bodyBone = "armorBody";
		this.rightArmBone = "armorRightArm";
		this.leftArmBone = "armorLeftArm";
		this.rightLegBone = "armorRightLeg";
		this.leftLegBone = "armorLeftLeg";
		this.rightBootBone = "armorRightBoot";
		this.leftBootBone = "armorLeftBoot";
	}

	@Override
	public RenderType getRenderType(RestingVigorItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
