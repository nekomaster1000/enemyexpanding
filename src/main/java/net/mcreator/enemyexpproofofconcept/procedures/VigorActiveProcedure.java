package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModParticleTypes;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;

import java.util.Random;

public class VigorActiveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.025) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 0, (false), (false)));
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 0, (false), (false)));
			}
			for (int index0 = 0; index0 < (int) (3); index0++) {
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
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.CONFUSION) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(EnemyexpansionModMobEffects.VIGOR_EFFECT.get());
		}
	}
}
