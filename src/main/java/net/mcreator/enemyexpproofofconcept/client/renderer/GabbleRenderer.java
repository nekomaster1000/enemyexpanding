
package net.mcreator.enemyexpproofofconcept.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enemyexpproofofconcept.entity.GabbleEntity;
import net.mcreator.enemyexpproofofconcept.client.model.meathat;

public class GabbleRenderer extends MobRenderer<GabbleEntity, meathat<GabbleEntity>> {
	public GabbleRenderer(EntityRendererProvider.Context context) {
		super(context, new meathat(context.bakeLayer(meathat.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(GabbleEntity entity) {
		return new ResourceLocation("enemyexpansion:textures/entities/nothing.png");
	}
}
