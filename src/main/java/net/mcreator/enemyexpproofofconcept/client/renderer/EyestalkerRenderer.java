
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.entity.model.EyestalkerModel;
import net.mcreator.enemyexpproofofconcept.entity.layer.EyestalkerLayer;
import net.mcreator.enemyexpproofofconcept.entity.EyestalkerEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EyestalkerRenderer extends GeoEntityRenderer<EyestalkerEntity> {
	public EyestalkerRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EyestalkerModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new EyestalkerLayer(this));
	}

	@Override
	public RenderType getRenderType(EyestalkerEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.5f, 1.5f, 1.5f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
