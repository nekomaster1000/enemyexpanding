package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

public class TrollSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean advancementCheck = false;
		if (y < (double) BetterConfigConfiguration.TROLLSPAWNINGDEPTH.get() && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) < 5) {
			return true;
		}
		return false;
	}
}
