package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class OrbBlindnessProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.BLINDNESS) : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 0, (false), (true)));
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
