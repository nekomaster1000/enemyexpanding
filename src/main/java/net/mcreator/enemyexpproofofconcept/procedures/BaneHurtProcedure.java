package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.enemyexpproofofconcept.entity.WolfsbaneEntity;
import net.mcreator.enemyexpproofofconcept.entity.BanedasherEntity;

import java.util.Random;

public class BaneHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player && entity instanceof BanedasherEntity) {
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.2), 0.2, (entity.getLookAngle().z * 0.2)));
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
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 35, 0, (false), (false)));
					entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.5), (Mth.nextDouble(new Random(), 0.3, 1)), (entity.getLookAngle().z * 1.5)));
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 2);
		}
		if (Math.random() < 0.2) {
			if (entity instanceof WolfsbaneEntity) {
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
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									("/summon enemyexpansion:banedasher ~ ~ ~ {Health:20f}".replace("{Health:20f}", "{Health:" + ("" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) + "f}")));
						if (!entity.level.isClientSide())
							entity.discard();
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 2);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SQUID_INK, (entity.getX()), (entity.getY()), (entity.getZ()), 20, 1, 1, 1, 1);
	}
}
