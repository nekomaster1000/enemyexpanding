package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

public class CrawlerSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean spawning = false;
		if (y < (double) BetterConfigConfiguration.CRAWLERSPAWNINGDEPTH.get() && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) < 5) {
			spawning = true;
		} else {
			spawning = false;
		}
		return spawning;
	}
}
