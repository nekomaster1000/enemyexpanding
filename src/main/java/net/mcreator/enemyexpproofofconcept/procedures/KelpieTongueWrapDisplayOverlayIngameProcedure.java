package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;

public class KelpieTongueWrapDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(EnemyexpansionModMobEffects.GROUND_BOUND.get()) : false) && (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.CONFUSION) : false)) {
			return true;
		}
		return false;
	}
}
