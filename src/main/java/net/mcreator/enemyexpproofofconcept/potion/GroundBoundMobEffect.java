
package net.mcreator.enemyexpproofofconcept.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.enemyexpproofofconcept.procedures.GroundBoundActiveProcedure;

public class GroundBoundMobEffect extends MobEffect {
	public GroundBoundMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434778);
	}

	@Override
	public String getDescriptionId() {
		return "effect.enemyexpansion.ground_bound";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GroundBoundActiveProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
