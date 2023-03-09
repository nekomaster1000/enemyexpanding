package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.entity.GladiusEntity;
import net.mcreator.enemyexpproofofconcept.entity.GladiladEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GladiusSpawnProcedure {
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
		if (entity instanceof GladiusEntity) {
			((GladiusEntity) entity).getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(4.5);
		} else if (entity instanceof GladiladEntity) {
			((GladiladEntity) entity).getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(5.5);
		}
	}
}
