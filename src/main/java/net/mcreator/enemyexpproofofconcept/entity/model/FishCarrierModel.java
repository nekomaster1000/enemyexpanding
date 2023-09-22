package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.FishCarrierEntity;

public class FishCarrierModel extends AnimatedGeoModel<FishCarrierEntity> {
	@Override
	public ResourceLocation getAnimationResource(FishCarrierEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/orb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FishCarrierEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/orb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FishCarrierEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
