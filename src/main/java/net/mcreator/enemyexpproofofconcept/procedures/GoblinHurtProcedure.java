package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.ZobgoblinEntity;
import net.mcreator.enemyexpproofofconcept.entity.GoblinFearEntity;
import net.mcreator.enemyexpproofofconcept.entity.GoblinEntity;
import net.mcreator.enemyexpproofofconcept.entity.ErrantEntity;
import net.mcreator.enemyexpproofofconcept.entity.BouncerEntity;

public class GoblinHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.3 || (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 6) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GoblinFearEntity(EnemyexpansionModEntities.GOBLIN_FEAR.get(), _level);
				entityToSpawn.moveTo((x - 2), y, (z - 2), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fox.screech")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fox.screech")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
		}
		if (entity instanceof BouncerEntity) {
			((BouncerEntity) entity).setAnimation("sprint");
		}
		if (entity instanceof ErrantEntity) {
			((ErrantEntity) entity).setAnimation("sprint");
		}
		if (entity instanceof ZobgoblinEntity) {
			((ZobgoblinEntity) entity).setAnimation("sprint");
		}
		if (entity instanceof GoblinEntity) {
			((GoblinEntity) entity).setAnimation("sprint");
		}
		if (entity instanceof GoblinEntity) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 2));
		}
	}
}
