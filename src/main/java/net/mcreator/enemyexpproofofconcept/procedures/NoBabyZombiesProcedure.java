package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

public class NoBabyZombiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() > (double) BetterConfigConfiguration.BABYZOMBIESPAWNING.get()) {
			DespawnBabyZombiesProcedure.execute(world, entity);
		}
	}
}
