
package net.mcreator.enemyexpproofofconcept.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.enemyexpproofofconcept.procedures.ChampionActiveProcedure;

public class ChampionMobEffect extends MobEffect {
	public ChampionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.enemyexpansion.champion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ChampionActiveProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
