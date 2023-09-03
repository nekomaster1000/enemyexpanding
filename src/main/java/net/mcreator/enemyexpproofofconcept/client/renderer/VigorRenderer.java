
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.VigorModel;
import net.mcreator.enemyexpproofofconcept.entity.layer.VigorLayer;
import net.mcreator.enemyexpproofofconcept.entity.VigorEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class VigorRenderer extends GeoEntityRenderer<VigorEntity> {
	public VigorRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new VigorModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new VigorLayer(this));
	}

	@Override
	public RenderType getRenderType(VigorEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
