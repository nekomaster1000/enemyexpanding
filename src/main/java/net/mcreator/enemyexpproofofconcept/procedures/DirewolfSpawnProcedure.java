package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class DirewolfSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.07) {
			if (world instanceof ServerLevel _serverLevelForEntitySpawn) {
				Entity _entityForSpawning = new Skeleton(EntityType.SKELETON, _serverLevelForEntitySpawn);
				_entityForSpawning.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				_entityForSpawning.startRiding(entity);
				if (_entityForSpawning instanceof Mob _mobForSpawning)
					_mobForSpawning.finalizeSpawn(_serverLevelForEntitySpawn, world.getCurrentDifficultyAt(_entityForSpawning.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(_entityForSpawning);
			}
		}
	}
}
