package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;

import java.util.Random;

public class DragonflyErraticFlightProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.005) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get(), 30, 0, (false), (false)));
		} else if (Math.random() < 0.01) {
			entity.setDeltaMovement(new Vec3((Mth.nextDouble(new Random(), -0.6, 0.6)), (Mth.nextDouble(new Random(), -0.5, 0.2)), (Mth.nextDouble(new Random(), 0.6, 0.6))));
		}
	}
}
