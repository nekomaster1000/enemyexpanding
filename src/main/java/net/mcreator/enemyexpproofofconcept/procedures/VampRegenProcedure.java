package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.entity.VampireEntity;

public class VampRegenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof VampireEntity) {
			if (Math.random() < 0.03) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 0, (false), (true)));
			}
		}
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y + 1, z)) > 13) {
			if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 1, 0.5, 2, 0.5, 0.1);
			}
		}
	}
}
