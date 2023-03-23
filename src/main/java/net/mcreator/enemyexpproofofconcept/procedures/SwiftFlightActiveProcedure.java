package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;

public class SwiftFlightActiveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(
				(Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1.5
						* (0.1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get()) ? _livEnt.getEffect(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get()).getAmplifier() : 0) / 10)),
				((Math.sin(Math.toRadians(0 - entity.getXRot())) + 0)
						* (0.1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get()) ? _livEnt.getEffect(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get()).getAmplifier() : 0) / 10)),
				(Math.cos(Math.toRadians(entity.getYRot())) * 2
						* (0.1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get()) ? _livEnt.getEffect(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get()).getAmplifier() : 0) / 20))));
	}
}
