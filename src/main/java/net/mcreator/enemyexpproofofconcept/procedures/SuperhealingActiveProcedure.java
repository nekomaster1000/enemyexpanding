package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class SuperhealingActiveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String max_health = "";
		String attribute_command = "";
		if (Math.random() < 0.05) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
		}
	}
}
