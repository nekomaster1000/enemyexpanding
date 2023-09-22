package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.entity.GhoulEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class GhoulBreakBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.TORCH) {
			if (entity instanceof GhoulEntity) {
				((GhoulEntity) entity).setAnimation("attack");
			}
			EnemyexpansionMod.queueServerWork(10, () -> {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			});
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.LANTERN) {
			if (entity instanceof GhoulEntity) {
				((GhoulEntity) entity).setAnimation("attack");
			}
			EnemyexpansionMod.queueServerWork(10, () -> {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			});
		}
		if (entity.isOnFire()) {
			entity.hurt(DamageSource.ON_FIRE, 4);
		}
	}
}
