package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.entity.EquestrianEntity;

public class EquestrianEntityIsHurtProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EquestrianEntity) {
			((EquestrianEntity) entity).animationprocedure = "panicked";
		}
	}
}
