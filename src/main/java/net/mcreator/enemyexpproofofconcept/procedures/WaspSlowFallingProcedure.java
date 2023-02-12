package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class WaspSlowFallingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 36000, 0, (false), (false)));
		if (entity.isInWall()) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
