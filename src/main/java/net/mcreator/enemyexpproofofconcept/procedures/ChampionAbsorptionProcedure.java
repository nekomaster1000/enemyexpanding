package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;

public class ChampionAbsorptionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 999999,
					(int) (((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EnemyexpansionModMobEffects.CHAMPION.get()) ? _livEnt.getEffect(EnemyexpansionModMobEffects.CHAMPION.get()).getAmplifier() : 0) + 1) * 2), (false), (false)));
	}
}
