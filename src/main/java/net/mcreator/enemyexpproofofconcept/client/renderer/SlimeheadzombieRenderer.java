
package net.mcreator.enemyexpproofofconcept.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enemyexpproofofconcept.entity.SlimeheadzombieEntity;
import net.mcreator.enemyexpproofofconcept.client.model.Modelmeatman;

public class SlimeheadzombieRenderer extends MobRenderer<SlimeheadzombieEntity, Modelmeatman<SlimeheadzombieEntity>> {
	public SlimeheadzombieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmeatman(context.bakeLayer(Modelmeatman.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SlimeheadzombieEntity entity) {
		return new ResourceLocation("enemyexpansion:textures/entities/nothing.png");
	}
}
