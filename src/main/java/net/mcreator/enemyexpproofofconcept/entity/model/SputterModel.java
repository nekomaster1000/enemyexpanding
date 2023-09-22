package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.SputterEntity;

public class SputterModel extends AnimatedGeoModel<SputterEntity> {
	@Override
	public ResourceLocation getAnimationResource(SputterEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/sputter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SputterEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/sputter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SputterEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
