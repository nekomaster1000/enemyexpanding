package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.OrbEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class PetrimanSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWall()) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
		for (int index0 = 0; index0 < (int) (10); index0++) {
			if (world instanceof ServerLevel _serverLevelForEntitySpawn) {
				Entity _entityForSpawning = new OrbEntity(EnemyexpansionModEntities.ORB.get(), _serverLevelForEntitySpawn);
				_entityForSpawning.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				EnemyexpansionMod.queueServerWork(6, () -> {
					if (!_entityForSpawning.level.isClientSide())
						_entityForSpawning.discard();
				});
				if (_entityForSpawning instanceof Mob _mobForSpawning)
					_mobForSpawning.finalizeSpawn(_serverLevelForEntitySpawn, world.getCurrentDifficultyAt(_entityForSpawning.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(_entityForSpawning);
			}
		}
	}
}
