package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.entity.RoosterEntity;

public class RoosterHurtProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof RoosterEntity) {
			((RoosterEntity) entity).setAnimation("flap");
		}
	}
}
