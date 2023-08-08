
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class EnemyexpansionModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, EnemyexpansionMod.MODID);
	public static final RegistryObject<Potion> GROUNDBOUND_POTION = REGISTRY.register("groundbound_potion", () -> new Potion(new MobEffectInstance(EnemyexpansionModMobEffects.GROUND_BOUND.get(), 3600, 1, false, true)));
	public static final RegistryObject<Potion> CHAMPION_POTION = REGISTRY.register("champion_potion", () -> new Potion(new MobEffectInstance(EnemyexpansionModMobEffects.CHAMPION.get(), 3600, 0, false, false)));
}
