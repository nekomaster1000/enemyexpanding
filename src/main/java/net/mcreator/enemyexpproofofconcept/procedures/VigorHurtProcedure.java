package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class VigorHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get());
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(sourceentity.getYRot() + 180)) * 2), (-0.3), (Math.cos(Math.toRadians(sourceentity.getYRot())) * 2)));
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
					EnemyexpansionMod.queueServerWork((int) Mth.nextDouble(RandomSource.create(), 10, 70), () -> {
						if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(EnemyexpansionModMobEffects.VIGOR_EFFECT.get()) : false) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 0, (false), (false)));
							entityiterator.hurt((new DamageSource("even_more_magic")), 8);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 0.5, 0.5, 0.5, 0.2);
						}
					});
				}
			}
		}
	}
}
