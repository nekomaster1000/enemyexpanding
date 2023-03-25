package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

public class BabyZombieHealthProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double currentHealth = 0;
		if (entity.isAlive()) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							("/attribute @s generic.max_health base set babyzombiehealth".replace("babyzombiehealth", "" + (double) BetterConfigConfiguration.BABYZOMBIEHEALTH.get())));
			}
		}
	}
}
