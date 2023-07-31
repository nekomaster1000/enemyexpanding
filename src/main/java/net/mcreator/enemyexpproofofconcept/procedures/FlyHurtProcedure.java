package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;

public class FlyHurtProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get());
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(sourceentity.getYRot() + 180)) * 1.5 * 1), ((Math.sin(Math.toRadians(0 - sourceentity.getXRot())) + 0.5) * 1), (Math.cos(Math.toRadians(sourceentity.getYRot())) * 2 * 0.5)));
	}
}
