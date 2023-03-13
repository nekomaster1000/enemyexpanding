package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

public class CockatriceSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean spawning = false;
		if (y < (double) BetterConfigConfiguration.COCKATRICESPAWNINGDEPTH.get() && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) < 5) {
			spawning = true;
		} else {
			spawning = false;
		}
		return spawning;
	}
}
