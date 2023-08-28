package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class PiecrabHostilityProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (!(world instanceof Level _lvl && _lvl.isDay()) && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 10) {
			return true;
		}
		return false;
	}
}
