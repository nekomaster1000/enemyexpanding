package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class PillagerReaverCompanionChanceProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		execute(event, event.getWorld(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean advancementCheck = false;
		if (entity instanceof Pillager) {
			if (BetterConfigConfiguration.ADVANCEMENTBASEDSPAWNING.get() == true) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(256 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							if (entityiterator instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
									? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("enemyexpansion:enter_the_reaver"))).isDone()
									: false) {
								if (Math.random() < (double) BetterConfigConfiguration.PILLAGERWITHREAVER.get()) {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null)
											_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
													"summon enemyexpansion:reaver ~ ~ ~ {Health:22f,Attributes:[{Name:generic.max_health,Base:22}]}");
									}
								}
							}
						}
					}
				}
			} else if (BetterConfigConfiguration.ADVANCEMENTBASEDSPAWNING.get() == false) {
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
}
