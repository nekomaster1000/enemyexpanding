package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class EyestalkerTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWaterRainOrBubble()) {
			entity.hurt((new DamageSource("drown")), 1);
		}
	}
}
