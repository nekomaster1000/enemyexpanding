package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DrownedKnockbackableProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Drowned) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.CONDUIT_POWER) : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeAllEffects();
				entity.setDeltaMovement(new Vec3((sourceentity.getLookAngle().x * 2), (entity.getLookAngle().y * 1.2), (sourceentity.getLookAngle().z * 2)));
			}
		}
	}
}
