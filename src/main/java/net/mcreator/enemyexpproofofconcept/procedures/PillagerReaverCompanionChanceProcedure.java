package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PillagerReaverCompanionChanceProcedure {
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
		if (entity instanceof Pillager) {
			if (Math.random() < (double) BetterConfigConfiguration.PILLAGERWITHREAVER.get()) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "summon enemyexpansion:reaver ~ ~ ~ {Health:22f,Attributes:[{Name:generic.max_health,Base:22}]}");
				}
			}
		}
	}
}
