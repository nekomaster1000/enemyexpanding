package net.mcreator.enemyexpproofofconcept.procedures;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.enemyexpproofofconcept.entity.MeatureEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class MeatureModelProcedure extends AnimatedGeoModel<MeatureEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(MeatureEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/meature.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(MeatureEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/meature.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(MeatureEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/meature.png");
	}

	@Override
	public void setCustomAnimations(MeatureEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
		/** **/
	}
}
