package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class DragonflyDodgePatternProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.DIG_SPEED);
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(sourceentity.getYRot() + 180)) * 1.3), (-0.2), (Math.cos(Math.toRadians(sourceentity.getYRot())) * 1.3)));
		EnemyexpansionMod.queueServerWork(30, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0, (false), (false)));
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DIG_SPEED) : false) {
				entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1), (-0.3), (Math.cos(Math.toRadians(entity.getYRot())) * 1)));
				for (int index0 = 0; index0 < (int) (10); index0++) {
					EnemyexpansionMod.queueServerWork((int) Mth.nextDouble(RandomSource.create(), 20, 300), () -> {
						entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + Mth.nextDouble(RandomSource.create(), 90, 270))) * 0.6), 0, (Math.cos(Math.toRadians(entity.getYRot())) * 0.6)));
					});
					EnemyexpansionMod.queueServerWork((int) Mth.nextDouble(RandomSource.create(), 30, 300), () -> {
						if (Math.random() < 0.5) {
							entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + Mth.nextDouble(RandomSource.create(), 90, 100))) * 0.8), 0, (Math.cos(Math.toRadians(entity.getYRot())) * 0.4)));
						} else {
							entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + Mth.nextDouble(RandomSource.create(), 260, 270))) * 0.6), 0, (Math.cos(Math.toRadians(entity.getYRot())) * 0.6)));
						}
					});
				}
			}
		});
	}
}
