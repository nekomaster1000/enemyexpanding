package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class SpeedCheckProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.05) {
			EnemyexpansionMod.LOGGER.info(entity.getDeltaMovement().z());
		}
	}
}
