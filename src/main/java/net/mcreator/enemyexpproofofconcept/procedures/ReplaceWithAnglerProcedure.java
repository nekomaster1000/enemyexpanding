package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.AnglerEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class ReplaceWithAnglerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean advancementCheck = false;
		EnemyexpansionMod.queueServerWork(1, () -> {
			if (entity.isAlive() && !(world instanceof Level _lvl && _lvl.isDay())) {
				if (!entity.level.isClientSide())
					entity.discard();
				for (int index0 = 0; index0 < (int) (Mth.nextDouble(RandomSource.create(), 1, 3)); index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AnglerEntity(EnemyexpansionModEntities.ANGLER.get(), _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		});
	}
}
