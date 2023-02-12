
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.procedures.SilverkingModelProcedure;
import net.mcreator.enemyexpproofofconcept.procedures.SilverkingLayerProcedure;
import net.mcreator.enemyexpproofofconcept.entity.SilverkingEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SilverkingRenderer extends GeoEntityRenderer<SilverkingEntity> {
	public SilverkingRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SilverkingModelProcedure());
		this.shadowRadius = 0.5f;
		this.addLayer(new SilverkingLayerProcedure(this));
	}

	@Override
	public RenderType getRenderType(SilverkingEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
