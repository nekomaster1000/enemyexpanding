
package net.mcreator.enemyexpproofofconcept.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.enemyexpproofofconcept.procedures.SwiftFlightActiveProcedure;

public class SwiftFlightMobEffect extends MobEffect {
	public SwiftFlightMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750157);
	}

	@Override
	public String getDescriptionId() {
		return "effect.enemyexpansion.swift_flight";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SwiftFlightActiveProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}
