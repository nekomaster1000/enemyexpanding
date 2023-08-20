package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.FishCarrierEntity;

public class MarauderTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.05) {
			if (entity.isOnGround() && !entity.isInWater()) {
				if (!entity.isPassenger()) {
					if (world instanceof ServerLevel _serverLevelForEntitySpawn) {
						Entity _entityForSpawning = new FishCarrierEntity(EnemyexpansionModEntities.FISH_CARRIER.get(), _serverLevelForEntitySpawn);
						_entityForSpawning.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						entity.startRiding(_entityForSpawning);
						if (_entityForSpawning instanceof Mob _mobForSpawning)
							_mobForSpawning.finalizeSpawn(_serverLevelForEntitySpawn, world.getCurrentDifficultyAt(_entityForSpawning.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(_entityForSpawning);
					}
				}
			}
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.ICE) {
			world.destroyBlock(new BlockPos(x, y + 1, z), false);
		}
	}
}
