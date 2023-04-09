
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.KelpieModel;
import net.mcreator.enemyexpproofofconcept.entity.layer.KelpieLayer;
import net.mcreator.enemyexpproofofconcept.entity.KelpieEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class KelpieRenderer extends GeoEntityRenderer<KelpieEntity> {
	public KelpieRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new KelpieModel());
		this.shadowRadius = 0.7999999999999999f;
		this.addLayer(new KelpieLayer(this));
	}

	@Override
	public RenderType getRenderType(KelpieEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
