
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.ZadybugModel;
import net.mcreator.enemyexpproofofconcept.entity.ZadybugEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ZadybugRenderer extends GeoEntityRenderer<ZadybugEntity> {
	public ZadybugRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ZadybugModel());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(ZadybugEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
