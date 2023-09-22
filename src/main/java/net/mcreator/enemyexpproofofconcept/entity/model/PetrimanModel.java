package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.PetrimanEntity;

public class PetrimanModel extends AnimatedGeoModel<PetrimanEntity> {
	@Override
	public ResourceLocation getAnimationResource(PetrimanEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/petriman.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PetrimanEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/petriman.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PetrimanEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
