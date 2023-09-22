package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

public class BabyZombieHealthProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double currentHealth = 0;
		if (entity.isAlive()) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
							("/attribute @s generic.max_health base set babyzombiehealth".replace("babyzombiehealth", "" + (double) BetterConfigConfiguration.BABYZOMBIEHEALTH.get())));
				}
			}
		}
	}
}
