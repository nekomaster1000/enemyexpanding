package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;
import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import java.util.Random;

public class ChampionSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double randomlevel = 0;
		String max_health = "";
		String attribute_command = "";
		if (BetterConfigConfiguration.HATTEDMOBSARECHAMPIONS.get() == true) {
			randomlevel = Mth.nextDouble(new Random(), 0, 3);
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.CHAMPION.get(), 50000, (int) randomlevel, (false), (true)));
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), ("/attribute @s minecraft:generic.max_health base set var".replace("var",
							"" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 1.5) * (randomlevel + 1)))));
			}
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) > 100) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/attribute @s minecraft:generic.max_health base set 100");
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(100);
			}
		}
	}
}
