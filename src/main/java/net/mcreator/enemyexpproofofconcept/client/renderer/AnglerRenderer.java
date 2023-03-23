
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.AnglerModel;
import net.mcreator.enemyexpproofofconcept.entity.layer.AnglerLayer;
import net.mcreator.enemyexpproofofconcept.entity.AnglerEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AnglerRenderer extends GeoEntityRenderer<AnglerEntity> {
	public AnglerRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new AnglerModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new AnglerLayer(this));
	}

	@Override
	public RenderType getRenderType(AnglerEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
