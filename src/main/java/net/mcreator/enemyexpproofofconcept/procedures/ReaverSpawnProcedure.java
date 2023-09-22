package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class ReaverSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 20) {
			EnemyexpansionMod.queueServerWork(1, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level.getServer(), _ent),
								"/summon enemyexpansion:reaver ~ ~ ~ {Health:22f,Passengers:[{id:\"minecraft:pillager\",HandItems:[{id:\"minecraft:crossbow\",Count:1b},{}]}],Attributes:[{Name:generic.max_health,Base:22}]}");
					}
				}
				if (!entity.level.isClientSide())
					entity.discard();
			});
		}
	}
}
