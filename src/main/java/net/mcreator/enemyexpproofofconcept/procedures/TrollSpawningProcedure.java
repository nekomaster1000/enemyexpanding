package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.enemyexpproofofconcept.network.EnemyexpansionModVariables;

import java.io.File;

public class TrollSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean spawning = false;
		File enemyexpansion = new File("");
		EnemyexpansionModVariables.WorldVariables.get(world).configMob = "troll";
		EnemyexpansionModVariables.WorldVariables.get(world).syncData(world);
		EnemyexpansionModVariables.WorldVariables.get(world).returnConfig = "SpawningDepth";
		EnemyexpansionModVariables.WorldVariables.get(world).syncData(world);
		return ConfigDepthProcedure.execute(world, x, y, z);
	}
}
