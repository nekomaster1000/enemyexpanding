
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.SilverkingModel;
import net.mcreator.enemyexpproofofconcept.entity.layer.SilverkingLayer;
import net.mcreator.enemyexpproofofconcept.entity.SilverkingEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SilverkingRenderer extends GeoEntityRenderer<SilverkingEntity> {
	public SilverkingRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SilverkingModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new SilverkingLayer(this));
	}

	@Override
	public RenderType getRenderType(SilverkingEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
