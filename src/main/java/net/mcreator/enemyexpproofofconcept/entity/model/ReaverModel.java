package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.ReaverEntity;

public class ReaverModel extends AnimatedGeoModel<ReaverEntity> {
	@Override
	public ResourceLocation getAnimationResource(ReaverEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/reaver.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ReaverEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/reaver.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ReaverEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
