package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class EquestrianSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean advancementCheck = false;
		if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && !(world instanceof Level _lvl && _lvl.isDay())) {
			return true;
		}
		return false;
	}
}
