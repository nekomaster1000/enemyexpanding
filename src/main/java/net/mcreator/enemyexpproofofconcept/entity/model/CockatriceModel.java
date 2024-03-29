package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.CockatriceEntity;

public class CockatriceModel extends AnimatedGeoModel<CockatriceEntity> {
	@Override
	public ResourceLocation getAnimationResource(CockatriceEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/cockatrice.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CockatriceEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/cockatrice.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CockatriceEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
