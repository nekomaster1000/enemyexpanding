
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.enemyexpproofofconcept.potion.InvulnerabilityMobEffect;
import net.mcreator.enemyexpproofofconcept.potion.GroundBoundMobEffect;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class EnemyexpansionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EnemyexpansionMod.MODID);
	public static final RegistryObject<MobEffect> INVULNERABILITY = REGISTRY.register("invulnerability", () -> new InvulnerabilityMobEffect());
	public static final RegistryObject<MobEffect> GROUND_BOUND = REGISTRY.register("ground_bound", () -> new GroundBoundMobEffect());
}
