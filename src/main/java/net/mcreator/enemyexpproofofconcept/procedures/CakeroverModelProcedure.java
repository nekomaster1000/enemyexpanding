package net.mcreator.enemyexpproofofconcept.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.entity.CakeroverEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class CakeroverModelProcedure extends AnimatedGeoModel<CakeroverEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(CakeroverEntity entity) {
		return new ResourceLocation("enemyexpansion", "animations/cakerover.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(CakeroverEntity entity) {
		return new ResourceLocation("enemyexpansion", "geo/cakerover.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(CakeroverEntity entity) {
		return new ResourceLocation("enemyexpansion", "textures/entities/cakerover.png");
		/**
		}
		@Override
		public void setCustomAnimations(CakeroverEntity animatable, int instanceId, AnimationEvent animationEvent) {
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
