package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModGameRules;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.CrawlerEntity;

public class CrawlerSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getLevelData().getGameRules().getInt(EnemyexpansionModGameRules.CRAWLERDONTSPAWNABOVEDEEPSLATERULE)) == 1 && y < -15) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new CrawlerEntity(EnemyexpansionModEntities.CRAWLER.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			return true;
		} else if ((world.getLevelData().getGameRules().getInt(EnemyexpansionModGameRules.CRAWLERDONTSPAWNABOVEDEEPSLATERULE)) == 0
				&& !(world instanceof Level _lvl && _lvl.isDay())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new CrawlerEntity(EnemyexpansionModEntities.CRAWLER.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			return true;
		}
		return false;
	}
}
