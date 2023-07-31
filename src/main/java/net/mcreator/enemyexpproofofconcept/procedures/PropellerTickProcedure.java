package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.enemyexpproofofconcept.entity.PropellerEntity;

public class PropellerTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof PropellerEntity) {
			if (Math.random() < 0.005) {
				if (entity.isInWaterRainOrBubble() && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN) : false)) {
					if (entity instanceof PropellerEntity animatable)
						animatable.setTexture("propeller_weathered");
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 30, 0.3, 0.3, 0.3, 0.3);
				}
				if (entity.isInWaterRainOrBubble()) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 2, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600, 0, (false), (true)));
				}
			}
		}
	}
}
