package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

public class PetrimanSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean spawning = false;
		boolean advancementCheck = false;
		if (y < (double) BetterConfigConfiguration.PETRIMANSPAWNINGDEPTH.get() && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) < 5) {
			return true;
		}
		return false;
	}
}
