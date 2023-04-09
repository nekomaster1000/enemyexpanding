package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.entity.PiecrabEntity;
import net.mcreator.enemyexpproofofconcept.entity.KelpieEntity;
import net.mcreator.enemyexpproofofconcept.entity.GladiladEntity;
import net.mcreator.enemyexpproofofconcept.entity.AnglerEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SwimSpeedProcedure {
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
		if (entity instanceof GladiladEntity) {
			((GladiladEntity) entity).getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(5.5);
		} else if (entity instanceof AnglerEntity) {
			((AnglerEntity) entity).getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(7.5);
		} else if (entity instanceof KelpieEntity) {
			((KelpieEntity) entity).getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(3.5);
		} else if (entity instanceof PiecrabEntity) {
			((PiecrabEntity) entity).getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(5.5);
		}
	}
}
