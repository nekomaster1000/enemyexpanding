
package net.mcreator.enemyexpproofofconcept.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enemyexpproofofconcept.entity.GoblinFearEntity;
import net.mcreator.enemyexpproofofconcept.client.model.Modelmeature;

public class GoblinFearRenderer extends MobRenderer<GoblinFearEntity, Modelmeature<GoblinFearEntity>> {
	public GoblinFearRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmeature(context.bakeLayer(Modelmeature.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoblinFearEntity entity) {
		return new ResourceLocation("enemyexpansion:textures/entities/nothing.png");
	}
}
