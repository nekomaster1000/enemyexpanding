package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class AnglerSpawningProcedure {
	public static boolean execute(LevelAccessor world) {
		if (Math.random() < 0.2 && !(world instanceof Level _lvl && _lvl.isDay())) {
			return true;
		}
		return false;
	}
}
