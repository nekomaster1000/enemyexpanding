package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.PiecrabEntity;

public class PiecrabModel extends AnimatedGeoModel<PiecrabEntity> {
	@Override
	public ResourceLocation getAnimationResource(PiecrabEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/piecrab.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PiecrabEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/piecrab.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PiecrabEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
