package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.enemyexpproofofconcept.entity.MeatureEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MeatureLevelingProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity sourceentity) {
		execute(null, world, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		String max_health = "";
		String attribute_command = "";
		if (sourceentity instanceof MeatureEntity) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) < 40) {
				max_health = new java.text.DecimalFormat("##.##").format((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + 2);
				attribute_command = "/attribute @s minecraft:generic.max_health base set (max_health)".replace("(max_health)", max_health);
				{
					Entity _ent = sourceentity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), attribute_command);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HEART, (sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), 5, 3, 3, 3, 1);
				max_health = new java.text.DecimalFormat("##.##").format(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
			}
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) < 30) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 0, (false), (false)));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0, (false), (true)));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 0, (false), (false)));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 10, 0, (false), (false)));
			} else {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 1, (false), (false)));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, (false), (true)));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 1, (false), (false)));
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 10, 1, (false), (false)));
			}
		}
	}
}
