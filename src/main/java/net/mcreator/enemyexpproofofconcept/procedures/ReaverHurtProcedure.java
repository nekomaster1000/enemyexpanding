package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class ReaverHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(EnemyexpansionModMobEffects.SWIFT_FLIGHT.get());
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(sourceentity.getYRot() + 180)) * 1.3), (-0.3), (Math.cos(Math.toRadians(sourceentity.getYRot())) * 1.3)));
		EnemyexpansionMod.queueServerWork(20, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.phantom.ambient")), SoundSource.HOSTILE, 1, 2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.phantom.ambient")), SoundSource.HOSTILE, 1, 2, false);
				}
			}
			entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 0.7), (-0.3), (Math.cos(Math.toRadians(entity.getYRot())) * 0.7)));
			if (entity.isVehicle()) {
				for (int index0 = 0; index0 < (int) (10); index0++) {
					EnemyexpansionMod.queueServerWork((int) Mth.nextDouble(RandomSource.create(), 20, 200), () -> {
						entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + Mth.nextDouble(RandomSource.create(), 0, 360))) * 0.7), 0.1, (Math.cos(Math.toRadians(entity.getYRot())) * 0.7)));
					});
				}
			} else {
				for (int index1 = 0; index1 < (int) (10); index1++) {
					EnemyexpansionMod.queueServerWork((int) Mth.nextDouble(RandomSource.create(), 20, 240), () -> {
						entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + Mth.nextDouble(RandomSource.create(), 90, 270))) * 0.7), 0.1, (Math.cos(Math.toRadians(entity.getYRot())) * 0.7)));
					});
				}
			}
		});
	}
}
