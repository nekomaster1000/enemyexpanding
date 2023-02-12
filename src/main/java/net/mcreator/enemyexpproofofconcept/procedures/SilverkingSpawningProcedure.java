package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.enemyexpproofofconcept.network.EnemyexpansionModVariables;

public class SilverkingSpawningProcedure {
	public static boolean execute(LevelAccessor world, double y) {
		EnemyexpansionModVariables.WorldVariables.get(world).returnConfig = "SilverkingSpawningDepth";
		EnemyexpansionModVariables.WorldVariables.get(world).syncData(world);
		return ConfigReaderProcedure.execute(world, y);
	}
}
