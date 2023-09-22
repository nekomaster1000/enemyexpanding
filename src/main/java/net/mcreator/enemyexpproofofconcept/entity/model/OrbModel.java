package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.OrbEntity;

public class OrbModel extends AnimatedGeoModel<OrbEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrbEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/orb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrbEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/orb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrbEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
