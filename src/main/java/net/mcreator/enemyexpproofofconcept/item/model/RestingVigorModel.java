package net.mcreator.enemyexpproofofconcept.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.item.RestingVigorItem;

public class RestingVigorModel extends AnimatedGeoModel<RestingVigorItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(RestingVigorItem object) {
		return new ResourceLocation("enemyexpansion", "animations/restingvigor.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(RestingVigorItem object) {
		return new ResourceLocation("enemyexpansion", "geo/restingvigor.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(RestingVigorItem object) {
		return new ResourceLocation("enemyexpansion", "textures/items/restingvigor_item.png");
	}
}
