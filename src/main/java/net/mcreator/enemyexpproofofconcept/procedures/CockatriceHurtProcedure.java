package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModParticleTypes;
import net.mcreator.enemyexpproofofconcept.entity.CockatriceEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class CockatriceHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof CockatriceEntity) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
				entity.setDeltaMovement(new Vec3(0, 0.2, 0));
				EnemyexpansionMod.queueServerWork(2, () -> {
					entity.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -1, 1.5)), (Mth.nextDouble(RandomSource.create(), 0.3, 1)), (Mth.nextDouble(RandomSource.create(), -1, 1.5))));
				});
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (EnemyexpansionModParticleTypes.FEATHER_PARTICLE.get()), x, (y + 1), z, 10, 0.2, 0.2, 0.2, 0.2);
	}
}
