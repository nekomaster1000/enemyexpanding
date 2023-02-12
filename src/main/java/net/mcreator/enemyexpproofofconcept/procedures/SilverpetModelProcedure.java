package net.mcreator.enemyexpproofofconcept.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.SilverpetEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class SilverpetModelProcedure extends AnimatedGeoModel<SilverpetEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(SilverpetEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/silverpet.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(SilverpetEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/silverpet.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SilverpetEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/silverpet.png");
		/**
		}
		@Override
		public void setCustomAnimations(SilverpetEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
