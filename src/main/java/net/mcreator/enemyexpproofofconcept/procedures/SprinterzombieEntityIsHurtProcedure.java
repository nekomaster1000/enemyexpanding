package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.enemyexpproofofconcept.entity.SprinterEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class SprinterzombieEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity && !(sourceentity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1, (false), (true)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 35, 1, (false), (true)));
			if (entity instanceof SprinterEntity) {
				((SprinterEntity) entity).setAnimation("staggered");
			}
			EnemyexpansionMod.queueServerWork(36, () -> {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.UNLUCK) : false)) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, (entity.getX()), (entity.getY()), (entity.getZ()), 5, 1, 1, 1, 0.6);
				}
			});
		}
	}
}
