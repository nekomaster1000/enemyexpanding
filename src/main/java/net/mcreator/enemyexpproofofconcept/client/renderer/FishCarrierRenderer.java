
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.FishCarrierModel;
import net.mcreator.enemyexpproofofconcept.entity.FishCarrierEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FishCarrierRenderer extends GeoEntityRenderer<FishCarrierEntity> {
	public FishCarrierRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FishCarrierModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(FishCarrierEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.1f, 0.1f, 0.1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
