package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.VigorEntity;

public class VigorModel extends AnimatedGeoModel<VigorEntity> {
	@Override
	public ResourceLocation getAnimationResource(VigorEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/vigor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VigorEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/vigor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VigorEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
