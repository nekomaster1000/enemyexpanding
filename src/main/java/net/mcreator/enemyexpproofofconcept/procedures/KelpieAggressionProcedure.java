package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;
import net.mcreator.enemyexpproofofconcept.entity.KelpieEntity;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class KelpieAggressionProcedure {
	@SubscribeEvent
	public static void onEntitySetsAttackTarget(LivingSetAttackTargetEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(), event.getEntityLiving());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		execute(null, world, x, y, z, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof KelpieEntity) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DOLPHINS_GRACE) : false)) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN) : false)) {
					if (sourceentity instanceof KelpieEntity) {
						((KelpieEntity) sourceentity).setAnimation("walk");
					}
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 162, 0, (false), (false)));
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.roar")), SoundSource.HOSTILE, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.roar")), SoundSource.HOSTILE, 1, 1, false);
								}
							}
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
									if (sourceentity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 15, 0, (false), (false)));
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 6);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 6);
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.LUCK) : false) {
				{
					final Vec3 _center = new Vec3(x, (y + 1), (sourceentity.getZ() - 1));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							entityiterator.startRiding(sourceentity);
							if (sourceentity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.GROUND_BOUND.get(), 20, 2, (false), (false)));
							if (entityiterator instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.GROUND_BOUND.get(), 20, 2, (false), (false)));
						}
					}
				}
			}
		}
	}
}
