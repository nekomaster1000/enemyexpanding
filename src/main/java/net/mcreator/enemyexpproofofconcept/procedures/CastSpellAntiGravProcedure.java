package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class CastSpellAntiGravProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity((true));
		world.addParticle(ParticleTypes.FIREWORK, x, y, z, 0.3, 0.3, 0.3);
		EnemyexpansionMod.queueServerWork(80, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
	}
}
