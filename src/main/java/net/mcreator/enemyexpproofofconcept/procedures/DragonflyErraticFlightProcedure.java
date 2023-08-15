package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import java.util.Random;

public class DragonflyErraticFlightProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.01) {
			entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + Mth.nextDouble(new Random(), 90, 270))) * 0.7), 0, (Math.cos(Math.toRadians(entity.getYRot())) * 0.7)));
		}
	}
}
