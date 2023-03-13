package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;

public class GroundBoundActiveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(
				new Vec3(0, ((-0.25) * ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EnemyexpansionModMobEffects.GROUND_BOUND.get()) ? _livEnt.getEffect(EnemyexpansionModMobEffects.GROUND_BOUND.get()).getAmplifier() : 0) + 1)), 0));
	}
}
