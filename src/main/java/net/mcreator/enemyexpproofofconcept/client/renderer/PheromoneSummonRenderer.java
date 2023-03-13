
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.PheromoneSummonModel;
import net.mcreator.enemyexpproofofconcept.entity.PheromoneSummonEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PheromoneSummonRenderer extends GeoEntityRenderer<PheromoneSummonEntity> {
	public PheromoneSummonRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PheromoneSummonModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(PheromoneSummonEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
