package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.enemyexpproofofconcept.entity.IntruderEntity;
import net.mcreator.enemyexpproofofconcept.entity.CrawlerEntity;

import java.util.Random;

public class FuseTouchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.05) {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 6, 6, 6), e -> true).isEmpty()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0, (false), (false)));
				entity.setSecondsOnFire(2);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 10, 0.3, 0.3, 0.3, 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.HOSTILE, 1, 1, false);
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
						if (entity.isAlive()) {
							if (entity instanceof CrawlerEntity && !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 6, 6, 6), e -> true).isEmpty()) {
								entity.setDeltaMovement(new Vec3((Mth.nextDouble(new Random(), -0.4, 0.4)), 0.6, (Mth.nextDouble(new Random(), -0.4, 0.4))));
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"/summon enemyexpansion:invisicreeper ~ ~ ~ {Silent:1b,NoAI:1b,Health:1f,Fuse:1,ignited:1b,ExplosionRadius:2b,CustomName:'{\"text\":\"Crawler\"}'}");
							} else if (entity instanceof IntruderEntity && !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 8, 8, 8), e -> true).isEmpty()) {
								entity.setDeltaMovement(new Vec3((Mth.nextDouble(new Random(), -0.25, 0.25)), 0.6, (Mth.nextDouble(new Random(), -0.25, 0.25))));
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"/summon enemyexpansion:invisicreeper ~ ~ ~ {Silent:1b,NoAI:1b,Health:1f,Fuse:1,ignited:1b,ExplosionRadius:4b,CustomName:'{\"text\":\"Intruder\"}'}");
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 40);
			}
		}
	}
}
