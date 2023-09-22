package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class CinderFireChargeAntigravityProcedure {
	public static void execute(LevelAccessor world, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setSecondsOnFire(10);
		immediatesourceentity.setNoGravity((true));
		EnemyexpansionMod.queueServerWork(80, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
	}
}
