package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.entity.EquestrianEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class EquestrianLeapProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		EnemyexpansionMod.queueServerWork(20, () -> {
			if (entity instanceof EquestrianEntity) {
				entity.setDeltaMovement(new Vec3(0, 0.3, 0));
			}
		});
	}
}
