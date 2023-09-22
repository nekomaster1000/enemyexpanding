package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class KelpieHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.isAlive()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 0));
			if (sourceentity instanceof Player) {
				entity.setDeltaMovement(new Vec3((sourceentity.getLookAngle().x * 2), (-0.5), (sourceentity.getLookAngle().z * 2)));
				EnemyexpansionMod.queueServerWork(20, () -> {
					if (Math.random() < 0.5) {
						entity.setDeltaMovement(new Vec3((-4), (Mth.nextDouble(RandomSource.create(), 0, 1)), (Mth.nextDouble(RandomSource.create(), -2, 2))));
					} else {
						entity.setDeltaMovement(new Vec3(4, (Mth.nextDouble(RandomSource.create(), 0, 1)), (Mth.nextDouble(RandomSource.create(), -2, 2))));
					}
				});
			}
			if ((world.getBlockState(new BlockPos(sourceentity.getX() - Mth.nextDouble(RandomSource.create(), -8, 8), sourceentity.getY() - 1, sourceentity.getZ() - Mth.nextDouble(RandomSource.create(), -8, 8)))).getBlock() == Blocks.WATER) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("enemyexpansion:kelpie.reinforcement")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("enemyexpansion:kelpie.reinforcement")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				EnemyexpansionMod.queueServerWork(30, () -> {
					for (int index0 = 0; index0 < (int) (Mth.nextDouble(RandomSource.create(), 1, 2)); index0++) {
						if (world instanceof ServerLevel _serverLevelForEntitySpawn) {
							Entity _entityForSpawning = new Drowned(EntityType.DROWNED, _serverLevelForEntitySpawn);
							_entityForSpawning.moveTo((sourceentity.getX() - Mth.nextDouble(RandomSource.create(), -8, 8)), (sourceentity.getY() - 1), (sourceentity.getZ() - Mth.nextDouble(RandomSource.create(), -8, 8)),
									world.getRandom().nextFloat() * 360F, 0);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(_entityForSpawning.getX(), _entityForSpawning.getY(), _entityForSpawning.getZ()),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.converted_to_drowned")), SoundSource.HOSTILE, 1, 1);
								} else {
									_level.playLocalSound((_entityForSpawning.getX()), (_entityForSpawning.getY()), (_entityForSpawning.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.converted_to_drowned")),
											SoundSource.HOSTILE, 1, 1, false);
								}
							}
							if (_entityForSpawning instanceof LivingEntity _entity)
								_entity.setHealth(10);
							if (_entityForSpawning instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, (int) Mth.nextDouble(RandomSource.create(), 150, 250), 0, (false), (true)));
							if (_entityForSpawning instanceof Mob _mobForSpawning)
								_mobForSpawning.finalizeSpawn(_serverLevelForEntitySpawn, world.getCurrentDifficultyAt(_entityForSpawning.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(_entityForSpawning);
						}
					}
				});
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SOUL, x, y, z, 30, 3, 3, 3, 0.3);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Drowned) {
						EnemyexpansionMod.queueServerWork(20, () -> {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, (int) Mth.nextDouble(RandomSource.create(), 150, 250), 0, (false), (true)));
							if (entityiterator instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 4));
						});
					}
				}
			}
			if (!sourceentity.isInWater()) {
				entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), 0.5, (entity.getLookAngle().z * 2)));
			}
		}
	}
}
