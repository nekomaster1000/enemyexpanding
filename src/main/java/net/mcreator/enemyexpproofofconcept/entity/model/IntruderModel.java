package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.IntruderEntity;

public class IntruderModel extends AnimatedGeoModel<IntruderEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(IntruderEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/intruder.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(IntruderEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/intruder.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(IntruderEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
