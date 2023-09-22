package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BowQuickDrawProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (BetterConfigConfiguration.QUICKDRAW.get() == true) {
			if (entity instanceof Skeleton) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BOW) {
					if (world.getDifficulty() == Difficulty.HARD) {
						EnemyexpansionMod.queueServerWork(10, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 20, 0, (false), (false)));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.FIREWORK, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 5, 0, 0, 0, 0.5);
						});
					} else {
						EnemyexpansionMod.queueServerWork(20, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 20, 0, (false), (false)));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.FIREWORK, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 5, 0, 0, 0, 0.5);
						});
					}
				}
			}
		}
	}
}
