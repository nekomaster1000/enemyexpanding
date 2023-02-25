
package net.mcreator.enemyexpproofofconcept.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.enemyexpproofofconcept.procedures.WolfsbaneModelProcedure;
import net.mcreator.enemyexpproofofconcept.procedures.WolfsbaneLayerProcedure;
import net.mcreator.enemyexpproofofconcept.entity.WolfsbaneEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WolfsbaneRenderer extends GeoEntityRenderer<WolfsbaneEntity> {
	public WolfsbaneRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new WolfsbaneModelProcedure());
		this.shadowRadius = 0.5f;
		this.addLayer(new WolfsbaneLayerProcedure(this));
	}

	@Override
	public RenderType getRenderType(WolfsbaneEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
