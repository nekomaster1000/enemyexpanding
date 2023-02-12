
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.procedures.LadybugModelProcedure;
import net.mcreator.enemyexpproofofconcept.entity.LadybugEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LadybugRenderer extends GeoEntityRenderer<LadybugEntity> {
	public LadybugRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new LadybugModelProcedure());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(LadybugEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
