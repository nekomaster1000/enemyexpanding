package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class MeatureSpawningProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean spawning = false;
		boolean advancementCheck = false;
		if (!(world instanceof Level _lvl && _lvl.isDay())) {
			return true;
		}
		return false;
	}
}
