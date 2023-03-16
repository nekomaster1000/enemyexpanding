package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.GladiladEntity;

public class GladiusTransformProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWater()) {
			if (world instanceof ServerLevel _serverLevelForEntitySpawn) {
				Entity _entityForSpawning = new GladiladEntity(EnemyexpansionModEntities.GLADILAD.get(), _serverLevelForEntitySpawn);
				_entityForSpawning.moveTo((entity.getX()), (entity.getY() + 1.5), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
				if (_entityForSpawning instanceof LivingEntity _entity)
					_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
				if (_entityForSpawning instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.GROUND_BOUND.get(), 60, 1, (false), (false)));
				if (_entityForSpawning instanceof Mob _mobForSpawning)
					_mobForSpawning.finalizeSpawn(_serverLevelForEntitySpawn, world.getCurrentDifficultyAt(_entityForSpawning.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(_entityForSpawning);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SQUID_INK, x, y, z, 30, 1.6, 1.6, 1.6, 0.3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.converted_to_drowned")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.converted_to_drowned")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
