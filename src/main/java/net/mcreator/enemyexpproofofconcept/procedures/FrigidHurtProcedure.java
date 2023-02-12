package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.FrigidEntity;

public class FrigidHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isOnFire()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 24, 1));
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
					if (entity instanceof FrigidEntity) {
						((FrigidEntity) entity).animationprocedure = "sprint";
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 14);
		}
		if (Math.random() < 0.02 && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 17) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new FrigidEntity(EnemyexpansionModEntities.FRIGID.get(), _level);
				entityToSpawn.moveTo((x - 6), y, (z - 6), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			if (entity.isInWall()) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
		if (Math.random() < 0.03 && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 10) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new FrigidEntity(EnemyexpansionModEntities.FRIGID.get(), _level);
				entityToSpawn.moveTo((x - 6), y, (z - 6), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			if (entity.isInWall()) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
		if (Math.random() < 0.04 && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 6) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new FrigidEntity(EnemyexpansionModEntities.FRIGID.get(), _level);
				entityToSpawn.moveTo((x - 6), y, (z - 6), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			if (entity.isInWall()) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
