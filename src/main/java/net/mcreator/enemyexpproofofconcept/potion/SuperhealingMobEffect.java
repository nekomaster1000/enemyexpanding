
package net.mcreator.enemyexpproofofconcept.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.enemyexpproofofconcept.procedures.SuperhealingActiveProcedure;

public class SuperhealingMobEffect extends MobEffect {
	public SuperhealingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -26164);
	}

	@Override
	public String getDescriptionId() {
		return "effect.enemyexpansion.superhealing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SuperhealingActiveProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
