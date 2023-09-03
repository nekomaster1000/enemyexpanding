package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModParticleTypes;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class VigorTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.01) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get(), 30, 0, (false), (false)));
		} else if (Math.random() < 0.05) {
			entity.setDeltaMovement(new Vec3((Mth.nextDouble(new Random(), -0.4, 0.4)), (Mth.nextDouble(new Random(), -0.4, 0.2)), (Mth.nextDouble(new Random(), -0.4, 0.4))));
		}
		if (Math.random() < 0.01) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.VIGOR_EFFECT.get(), 200, 0, (false), (false)));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (EnemyexpansionModParticleTypes.VIGOR_PARTICLE.get()), x, (y + 1), z, 1, 0.5, 0.5, 0.5, 0.2);
					}
				}
			}
		}
		if (entity.isInWaterRainOrBubble()) {
			entity.hurt((new DamageSource("drown")), 100);
		}
	}
}
