package net.mcreator.enemyexpproofofconcept.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.CrawlerEntity;

public class CrawlerModel extends AnimatedGeoModel<CrawlerEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(CrawlerEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/crawler.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(CrawlerEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/crawler.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(CrawlerEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
