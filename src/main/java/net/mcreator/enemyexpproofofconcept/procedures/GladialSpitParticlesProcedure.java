package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class GladialSpitParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.SQUID_INK, x, y, z, 0, 0, 0);
	}
}
