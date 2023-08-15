package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import java.util.Random;

public class DragonflyDodgePatternProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.DIG_SPEED);
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(sourceentity.getYRot() + 180)) * 1.3), (-0.2), (Math.cos(Math.toRadians(sourceentity.getYRot())) * 1.3)));
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
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0, (false), (false)));
				if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DIG_SPEED) : false) {
					entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 0.7), (-0.3), (Math.cos(Math.toRadians(entity.getYRot())) * 0.7)));
					for (int index0 = 0; index0 < (int) (10); index0++) {
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
								entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + Mth.nextDouble(new Random(), 90, 270))) * 0.4), 0, (Math.cos(Math.toRadians(entity.getYRot())) * 0.4)));
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) Mth.nextDouble(new Random(), 20, 300));
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
								if (Math.random() < 0.5) {
									entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + Mth.nextDouble(new Random(), 90, 100))) * 0.6), 0, (Math.cos(Math.toRadians(entity.getYRot())) * 0.3)));
								} else {
									entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + Mth.nextDouble(new Random(), 260, 270))) * 0.6), 0, (Math.cos(Math.toRadians(entity.getYRot())) * 0.3)));
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) Mth.nextDouble(new Random(), 30, 300));
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 30);
	}
}
