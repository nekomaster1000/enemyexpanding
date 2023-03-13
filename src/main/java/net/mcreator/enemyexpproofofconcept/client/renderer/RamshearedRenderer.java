
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.RamshearedModel;
import net.mcreator.enemyexpproofofconcept.entity.RamshearedEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RamshearedRenderer extends GeoEntityRenderer<RamshearedEntity> {
	public RamshearedRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RamshearedModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(RamshearedEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
