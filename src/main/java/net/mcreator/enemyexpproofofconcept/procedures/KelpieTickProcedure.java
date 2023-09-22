package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class KelpieTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnGround() && !entity.isInWater()) {
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x), (Mth.nextDouble(RandomSource.create(), 0.2, 0.5)), (entity.getLookAngle().z)));
		}
	}
}
