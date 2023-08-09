package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import java.util.Random;

public class AnglerTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnGround() && !entity.isInWater()) {
			entity.setDeltaMovement(new Vec3((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), 0.3, 0.9)), (Mth.nextDouble(new Random(), -1, 1))));
		}
	}
}
