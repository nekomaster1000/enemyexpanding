package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class RandomHostilityProcedure {
	public static boolean execute(LevelAccessor world) {
		if (!(world instanceof Level _lvl && _lvl.isDay())) {
			return true;
		}
		return false;
	}
}
