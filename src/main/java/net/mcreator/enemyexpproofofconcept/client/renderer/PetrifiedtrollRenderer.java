
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.procedures.PetrifiedtrollModelProcedure;
import net.mcreator.enemyexpproofofconcept.entity.PetrifiedtrollEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PetrifiedtrollRenderer extends GeoEntityRenderer<PetrifiedtrollEntity> {
	public PetrifiedtrollRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PetrifiedtrollModelProcedure());
		this.shadowRadius = 0.7f;
	}

	@Override
	public RenderType getRenderType(PetrifiedtrollEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
