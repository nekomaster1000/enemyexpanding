package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class GladiladSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!(world instanceof Level _lvl && _lvl.isDay())) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WATER) {
				return true;
			}
		}
		return false;
	}
}
