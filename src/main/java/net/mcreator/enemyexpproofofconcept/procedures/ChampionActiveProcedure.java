package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class ChampionActiveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.4) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 1, 0.5, 1.6, 0.5, 0.1);
		}
	}
}
