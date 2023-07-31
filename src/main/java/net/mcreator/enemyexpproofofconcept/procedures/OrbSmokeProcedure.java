package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.Random;

public class OrbSmokeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SQUID_INK, x, y, z, 1, 0.1, 0.1, 0.1, 0.1);
		if (Math.random() < 0.2) {
			entity.setDeltaMovement(new Vec3((Mth.nextDouble(new Random(), -0.6, 0.6)), (Mth.nextDouble(new Random(), -0.4, 0.4)), (Mth.nextDouble(new Random(), -0.6, 0.6))));
		}
	}
}
