package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.FlyEntity;

public class FlyModel extends AnimatedGeoModel<FlyEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlyEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/fly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlyEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/fly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlyEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
