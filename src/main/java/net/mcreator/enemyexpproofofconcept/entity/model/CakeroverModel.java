package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.CakeroverEntity;

public class CakeroverModel extends AnimatedGeoModel<CakeroverEntity> {
	@Override
	public ResourceLocation getAnimationResource(CakeroverEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/cakerover.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CakeroverEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/cakerover.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CakeroverEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
