package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModParticleTypes;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class RestingVigorTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.03) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.VIGOR_EFFECT.get(), 200, 0, (false), (false)));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vex.ambient")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vex.ambient")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
						for (int index0 = 0; index0 < (int) (5); index0++) {
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
										_level.sendParticles((SimpleParticleType) (EnemyexpansionModParticleTypes.VIGOR_PARTICLE.get()), x, (y + 2), z, 1, 0.5, 0.5, 0.5, 0.2);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) Mth.nextDouble(new Random(), 1, 10));
						}
					}
				}
			}
		}
	}
}
