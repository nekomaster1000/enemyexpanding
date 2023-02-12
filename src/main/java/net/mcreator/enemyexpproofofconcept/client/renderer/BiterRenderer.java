
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.procedures.BiterModelProcedure;
import net.mcreator.enemyexpproofofconcept.procedures.BiterLayerProcedure;
import net.mcreator.enemyexpproofofconcept.entity.BiterEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BiterRenderer extends GeoEntityRenderer<BiterEntity> {
	public BiterRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BiterModelProcedure());
		this.shadowRadius = 0.5f;
		this.addLayer(new BiterLayerProcedure(this));
	}

	@Override
	public RenderType getRenderType(BiterEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
