package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class CinderSlowFallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 0, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60, 0, (false), (false)));
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.LAVA) {
			if (Math.random() < 0.5) {
				entity.setDeltaMovement(new Vec3((-0.6), 3, (-0.6)));
			} else {
				entity.setDeltaMovement(new Vec3(0.6, 3, 0.6));
			}
		}
		if (entity.isInWater()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 1, 3, 3, 3, 1);
			entity.hurt(DamageSource.DROWN, 6);
		}
	}
}
