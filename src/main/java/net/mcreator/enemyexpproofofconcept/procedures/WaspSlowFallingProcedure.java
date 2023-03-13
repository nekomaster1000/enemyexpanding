package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class WaspSlowFallingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
		if (entity.isInWall()) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
