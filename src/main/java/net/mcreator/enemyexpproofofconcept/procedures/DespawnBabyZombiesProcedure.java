package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class DespawnBabyZombiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		EnemyexpansionMod.queueServerWork(1, () -> {
			if (entity.isAlive()) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		});
	}
}
