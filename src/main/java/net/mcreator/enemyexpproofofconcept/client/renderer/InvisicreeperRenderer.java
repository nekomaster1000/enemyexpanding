
package net.mcreator.enemyexpproofofconcept.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enemyexpproofofconcept.entity.InvisicreeperEntity;
import net.mcreator.enemyexpproofofconcept.client.model.meathat;

public class InvisicreeperRenderer extends MobRenderer<InvisicreeperEntity, meathat<InvisicreeperEntity>> {
	public InvisicreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new meathat(context.bakeLayer(meathat.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(InvisicreeperEntity entity) {
		return new ResourceLocation("enemyexpansion:textures/entities/nothing.png");
	}
}
