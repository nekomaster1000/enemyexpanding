package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.SilverpetEntity;

public class SilverpetModel extends AnimatedGeoModel<SilverpetEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(SilverpetEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/silverpet.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(SilverpetEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/silverpet.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SilverpetEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
