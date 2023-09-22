package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class DireJumpActivateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		EnemyexpansionMod.queueServerWork(20, () -> {
			DireJumpProcedure.execute(world, x, y, z, entity);
		});
	}
}
