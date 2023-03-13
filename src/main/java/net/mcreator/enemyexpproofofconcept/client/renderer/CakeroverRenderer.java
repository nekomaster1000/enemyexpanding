
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.CakeroverModel;
import net.mcreator.enemyexpproofofconcept.entity.CakeroverEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CakeroverRenderer extends GeoEntityRenderer<CakeroverEntity> {
	public CakeroverRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CakeroverModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(CakeroverEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
