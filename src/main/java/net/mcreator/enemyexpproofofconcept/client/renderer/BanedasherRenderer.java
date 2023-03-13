
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.BanedasherModel;
import net.mcreator.enemyexpproofofconcept.entity.layer.BanedasherLayer;
import net.mcreator.enemyexpproofofconcept.entity.BanedasherEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BanedasherRenderer extends GeoEntityRenderer<BanedasherEntity> {
	public BanedasherRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BanedasherModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new BanedasherLayer(this));
	}

	@Override
	public RenderType getRenderType(BanedasherEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
