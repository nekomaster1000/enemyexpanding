package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.BiterEntity;

public class BiterModel extends AnimatedGeoModel<BiterEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BiterEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/biter.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BiterEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/biter.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BiterEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
