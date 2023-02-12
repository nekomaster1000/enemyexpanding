package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.enemyexpproofofconcept.network.EnemyexpansionModVariables;

public class CrawlerSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		EnemyexpansionModVariables.WorldVariables.get(world).configMob = "crawler";
		EnemyexpansionModVariables.WorldVariables.get(world).syncData(world);
		EnemyexpansionModVariables.WorldVariables.get(world).returnConfig = "SpawningDepth";
		EnemyexpansionModVariables.WorldVariables.get(world).syncData(world);
		return ConfigDepthProcedure.execute(world, x, y, z);
	}
}
