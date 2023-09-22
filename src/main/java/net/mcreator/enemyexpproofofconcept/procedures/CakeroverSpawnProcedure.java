package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class CakeroverSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((-0.3), 0.6, (-0.3)));
		EnemyexpansionMod.queueServerWork(400, () -> {
			if (entity.isAlive()) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.NONE);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 15, 1, 1, 1, 1);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		});
	}
}
