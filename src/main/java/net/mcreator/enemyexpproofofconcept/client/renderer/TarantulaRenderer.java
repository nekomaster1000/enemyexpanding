
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.procedures.TarantulaModelProcedure;
import net.mcreator.enemyexpproofofconcept.entity.TarantulaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TarantulaRenderer extends GeoEntityRenderer<TarantulaEntity> {
	public TarantulaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TarantulaModelProcedure());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(TarantulaEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
