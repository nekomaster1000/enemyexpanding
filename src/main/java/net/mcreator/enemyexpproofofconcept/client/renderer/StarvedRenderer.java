
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.StarvedModel;
import net.mcreator.enemyexpproofofconcept.entity.StarvedEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StarvedRenderer extends GeoEntityRenderer<StarvedEntity> {
	public StarvedRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new StarvedModel());
		this.shadowRadius = 0.4f;
	}

	@Override
	public RenderType getRenderType(StarvedEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
