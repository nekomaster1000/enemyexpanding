
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.BiterModel;
import net.mcreator.enemyexpproofofconcept.entity.layer.BiterLayer;
import net.mcreator.enemyexpproofofconcept.entity.BiterEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BiterRenderer extends GeoEntityRenderer<BiterEntity> {
	public BiterRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BiterModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new BiterLayer(this));
	}

	@Override
	public RenderType getRenderType(BiterEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
