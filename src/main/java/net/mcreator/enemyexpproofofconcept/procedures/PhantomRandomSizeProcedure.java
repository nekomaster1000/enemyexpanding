package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class PhantomRandomSizeProcedure {
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
		if (entity instanceof Phantom) {
			if (BetterConfigConfiguration.RANDOMPHANTOMSIZE.get() == true) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), ("/data merge entity @s[type=phantom] {Size:x}".replace("x", "" + Mth.nextDouble(new Random(), 1, 5))));
				}
			}
		}
	}
}
