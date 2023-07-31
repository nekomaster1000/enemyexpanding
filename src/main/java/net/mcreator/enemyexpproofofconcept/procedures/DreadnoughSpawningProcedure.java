package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DreadnoughSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean spawning = false;
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) < 3) {
			spawning = true;
		} else {
			spawning = false;
		}
		return spawning;
	}
}
