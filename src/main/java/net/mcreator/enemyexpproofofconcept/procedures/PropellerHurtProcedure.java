package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.entity.PropellerEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PropellerHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof PropellerEntity) {
			((PropellerEntity) entity).setAnimation("hurt");
		}
		if (entity instanceof PropellerEntity) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
				entity.setDeltaMovement(new Vec3(0, 0.2, 0));
				EnemyexpansionMod.queueServerWork(2, () -> {
					entity.setDeltaMovement(new Vec3(0, 1.2, 0));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0, (false), (false)));
					EnemyexpansionMod.queueServerWork(4, () -> {
						entity.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -1, 1.5)), (Mth.nextDouble(RandomSource.create(), 0.3, 2)), (Mth.nextDouble(RandomSource.create(), -1, 1.5))));
					});
				});
			}
			if (Math.random() < 0.25 && (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 8) {
				if (entity instanceof PropellerEntity animatable)
					animatable.setTexture("propeller_weathered");
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 2, (false), (true)));
			}
		}
	}
}
