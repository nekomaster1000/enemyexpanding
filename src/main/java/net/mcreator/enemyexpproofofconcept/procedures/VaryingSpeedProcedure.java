package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class VaryingSpeedProcedure {
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
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("enemyexpansion:varying_speed")))) {
			if (Math.random() < (double) BetterConfigConfiguration.VARYINGSPEED.get()) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								("/attribute @s minecraft:generic.movement_speed base set number".replace("number", "" + Mth.nextDouble(new Random(), 0.23, 0.35))));
				}
			}
		}
	}
}
