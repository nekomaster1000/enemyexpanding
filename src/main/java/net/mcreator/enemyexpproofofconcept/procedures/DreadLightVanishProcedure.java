package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class DreadLightVanishProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7 || entity.isInWater()) {
			DreadDespawnProcedure.execute(world, x, y, z, entity);
		}
	}
}
