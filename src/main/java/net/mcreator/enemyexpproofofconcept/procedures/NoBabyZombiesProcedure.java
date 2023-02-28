package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import java.io.File;

public class NoBabyZombiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		File enemyexpansion = new File("");
		com.google.gson.JsonObject mainjsonobject = new com.google.gson.JsonObject();
		if (Math.random() > (double) BetterConfigConfiguration.BABYZOMBIESPAWNING.get()) {
			DespawnBabyZombiesProcedure.execute(world, entity);
		}
	}
}
