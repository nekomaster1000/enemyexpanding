
package net.mcreator.enemyexpproofofconcept.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enemyexpproofofconcept.entity.HuntsmanskeletonEntity;
import net.mcreator.enemyexpproofofconcept.client.model.Modelhuntsman;

public class HuntsmanskeletonRenderer extends MobRenderer<HuntsmanskeletonEntity, Modelhuntsman<HuntsmanskeletonEntity>> {
	public HuntsmanskeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhuntsman(context.bakeLayer(Modelhuntsman.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HuntsmanskeletonEntity entity) {
		return new ResourceLocation("enemyexpansion:textures/entities/huntsman.png");
	}
}
