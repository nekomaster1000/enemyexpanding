package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.OrbEntity;

public class OrbModel extends AnimatedGeoModel<OrbEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(OrbEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/orb.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(OrbEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/orb.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(OrbEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
