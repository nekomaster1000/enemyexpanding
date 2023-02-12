
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.procedures.TrollModelProcedure;
import net.mcreator.enemyexpproofofconcept.procedures.TrollLayerProcedure;
import net.mcreator.enemyexpproofofconcept.entity.TrollEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TrollRenderer extends GeoEntityRenderer<TrollEntity> {
	public TrollRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TrollModelProcedure());
		this.shadowRadius = 0.7f;
		this.addLayer(new TrollLayerProcedure(this));
	}

	@Override
	public RenderType getRenderType(TrollEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
