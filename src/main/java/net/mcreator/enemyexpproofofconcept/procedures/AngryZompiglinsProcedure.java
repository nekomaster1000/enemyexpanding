package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AngryZompiglinsProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ZombifiedPiglin) {
			if (Math.random() < (double) BetterConfigConfiguration.ANGRYZOMBIFIEDPIGLINS.get()) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"/data modify entity @e[type=minecraft:zombified_piglin,limit=1,sort=nearest] AngryAt set from entity @e[limit=1,sort=nearest,type=minecraft:player,gamemode=!spectator,gamemode=!creative,distance=0..10] UUID");
				}
			}
		}
	}
}
