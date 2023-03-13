package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class VampireSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.burn")), SoundSource.HOSTILE, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.burn")), SoundSource.HOSTILE, 1, 1, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SMALL_FLAME, x, y, z, 20, 0.3, 0.3, 0.3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SQUID_INK, x, y, z, 20, 0.3, 0.3, 0.3, 1);
		if (entity.isInWall()) {
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
					if (!entity.level.isClientSide())
						entity.discard();
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 1);
		}
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y + 1, z)) > 13 && world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
			entity.setSecondsOnFire(10);
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						("/attribute @s minecraft:generic.movement_speed base set variedspeed".replace("variedspeed", "" + Mth.nextDouble(new Random(), 0.2, 0.45))));
		}
	}
}
