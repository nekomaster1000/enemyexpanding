
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.procedures.GladiusModelProcedure;
import net.mcreator.enemyexpproofofconcept.entity.GladiusEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GladiusRenderer extends GeoEntityRenderer<GladiusEntity> {
	public GladiusRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GladiusModelProcedure());
		this.shadowRadius = 1f;
	}

	@Override
	public RenderType getRenderType(GladiusEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
