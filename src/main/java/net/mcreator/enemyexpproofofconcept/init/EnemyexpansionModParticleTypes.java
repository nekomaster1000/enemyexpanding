
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class EnemyexpansionModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, EnemyexpansionMod.MODID);
	public static final RegistryObject<SimpleParticleType> RESISTENCE_PARTICLE = REGISTRY.register("resistence_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> FEATHER_PARTICLE = REGISTRY.register("feather_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> VIGOR_PARTICLE = REGISTRY.register("vigor_particle", () -> new SimpleParticleType(true));
}
