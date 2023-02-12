
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.procedures.ScorpionModelProcedure;
import net.mcreator.enemyexpproofofconcept.procedures.ScorpionLayerProcedure;
import net.mcreator.enemyexpproofofconcept.entity.ScorpionEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ScorpionRenderer extends GeoEntityRenderer<ScorpionEntity> {
	public ScorpionRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ScorpionModelProcedure());
		this.shadowRadius = 0.6f;
		this.addLayer(new ScorpionLayerProcedure(this));
	}

	@Override
	public RenderType getRenderType(ScorpionEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
