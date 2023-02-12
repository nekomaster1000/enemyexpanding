package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class FireChargeHitEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING) == true) {
			if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.isBlocking() : false) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 0, Explosion.BlockInteraction.BREAK);
			} else {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.BREAK);
			}
		} else {
			if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.isBlocking() : false) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 0, Explosion.BlockInteraction.NONE);
			} else {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.NONE);
			}
		}
		if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
			world.setBlock(new BlockPos(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
		}
	}
}
