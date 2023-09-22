package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.ScorpionEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class ReplaceWithScorpionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		EnemyexpansionMod.queueServerWork(1, () -> {
			if (entity.isAlive()) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ScorpionEntity(EnemyexpansionModEntities.SCORPION.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		});
	}
}
