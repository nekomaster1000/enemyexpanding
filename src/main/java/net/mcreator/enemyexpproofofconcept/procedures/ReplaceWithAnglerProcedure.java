package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.AnglerEntity;
import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class ReplaceWithAnglerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean advancementCheck = false;
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (entity.isAlive() && !(world instanceof Level _lvl && _lvl.isDay())) {
					if (BetterConfigConfiguration.ADVANCEMENTBASEDSPAWNING.get() == false) {
						if (!entity.level.isClientSide())
							entity.discard();
						for (int index0 = 0; index0 < (int) (Mth.nextDouble(new Random(), 1, 3)); index0++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new AnglerEntity(EnemyexpansionModEntities.ANGLER.get(), _level);
								entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					} else if (BetterConfigConfiguration.ADVANCEMENTBASEDSPAWNING.get() == true) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(256 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof Player) {
									if (entityiterator instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
											? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("enemyexpansion:enter_the_angler"))).isDone()
											: false) {
										if (!entity.level.isClientSide())
											entity.discard();
										for (int index1 = 0; index1 < (int) (Mth.nextDouble(new Random(), 1, 3)); index1++) {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = new AnglerEntity(EnemyexpansionModEntities.ANGLER.get(), _level);
												entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
												if (entityToSpawn instanceof Mob _mobToSpawn)
													_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
												world.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
							}
						}
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 1);
	}
}
