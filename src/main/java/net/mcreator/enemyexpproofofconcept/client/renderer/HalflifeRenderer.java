
package net.mcreator.enemyexpproofofconcept.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.enemyexpproofofconcept.entity.HalflifeEntity;

public class HalflifeRenderer extends HumanoidMobRenderer<HalflifeEntity, HumanoidModel<HalflifeEntity>> {
	public HalflifeRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<HalflifeEntity, HumanoidModel<HalflifeEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("enemyexpansion:textures/entities/half-life_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HalflifeEntity entity) {
		return new ResourceLocation("enemyexpansion:textures/entities/half-life.png");
	}
}
