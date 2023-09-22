package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.PetrifiedtrollEntity;

public class PetrifiedtrollModel extends AnimatedGeoModel<PetrifiedtrollEntity> {
	@Override
	public ResourceLocation getAnimationResource(PetrifiedtrollEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/petrifiedtroll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PetrifiedtrollEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/petrifiedtroll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PetrifiedtrollEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
