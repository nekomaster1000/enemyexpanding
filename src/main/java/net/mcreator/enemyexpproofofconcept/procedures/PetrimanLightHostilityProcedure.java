package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class PetrimanLightHostilityProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!(world instanceof Level _lvl && _lvl.isDay()) && world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) || world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) < 14) {
			return true;
		}
		return false;
	}
}
