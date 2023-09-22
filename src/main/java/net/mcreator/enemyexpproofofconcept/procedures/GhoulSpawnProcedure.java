package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class GhoulSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
						"/data merge entity @s {ArmorItems:[{id:\"minecraft:leather_boots\",Count:1b,tag:{Enchantments:[{id:\"minecraft:frost_walker\",lvl:1s}]}},{},{},{}]}");
			}
		}
		EnemyexpansionMod.queueServerWork(2, () -> {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) && entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("enemyexpansion:zombievariants")))) {
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity.isInWall()) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		});
	}
}
