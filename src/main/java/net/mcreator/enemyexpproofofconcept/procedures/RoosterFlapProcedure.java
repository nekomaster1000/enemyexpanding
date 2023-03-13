package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.entity.RoosterEntity;

public class RoosterFlapProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
			if (entity instanceof RoosterEntity) {
				((RoosterEntity) entity).setAnimation("flap");
			}
		}
	}
}
