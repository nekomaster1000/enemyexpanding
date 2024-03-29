package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.CakeroverEntity;
import net.mcreator.enemyexpproofofconcept.entity.BakerEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class BakerHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BakerEntity) {
			((BakerEntity) entity).setAnimation("sprint");
		}
		if (entity instanceof BakerEntity) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DIG_SLOWDOWN) : false)) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new CakeroverEntity(EnemyexpansionModEntities.CAKEROVER.get(), _level);
					entityToSpawn.moveTo(x, (y + 1.3), z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			EnemyexpansionMod.queueServerWork(2, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 20, 0, (false), (false)));
			});
		}
	}
}
