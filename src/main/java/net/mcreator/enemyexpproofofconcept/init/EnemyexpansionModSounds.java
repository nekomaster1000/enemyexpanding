
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class EnemyexpansionModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EnemyexpansionMod.MODID);
	public static final RegistryObject<SoundEvent> SILENTSTEP = REGISTRY.register("silentstep", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "silentstep")));
	public static final RegistryObject<SoundEvent> TROLL_ROAR = REGISTRY.register("troll.roar", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "troll.roar")));
	public static final RegistryObject<SoundEvent> TROLL_HURT_2 = REGISTRY.register("troll.hurt.2", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "troll.hurt.2")));
	public static final RegistryObject<SoundEvent> TROLL_DEATH = REGISTRY.register("troll.death", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "troll.death")));
	public static final RegistryObject<SoundEvent> TROLL_IDLE_1 = REGISTRY.register("troll.idle.1", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "troll.idle.1")));
	public static final RegistryObject<SoundEvent> TROLL_HURT_1 = REGISTRY.register("troll.hurt.1", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "troll.hurt.1")));
	public static final RegistryObject<SoundEvent> KELPIE_IDLE = REGISTRY.register("kelpie_idle", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "kelpie_idle")));
	public static final RegistryObject<SoundEvent> KELPIE_REINFORCEMENT = REGISTRY.register("kelpie.reinforcement", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "kelpie.reinforcement")));
	public static final RegistryObject<SoundEvent> DREADNOUGHT_IDLE = REGISTRY.register("dreadnought.idle", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "dreadnought.idle")));
	public static final RegistryObject<SoundEvent> DREADNOUGHT_HURT = REGISTRY.register("dreadnought.hurt", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "dreadnought.hurt")));
	public static final RegistryObject<SoundEvent> DREADNOUGHT_DEATH = REGISTRY.register("dreadnought.death", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "dreadnought.death")));
	public static final RegistryObject<SoundEvent> STARVED_CHOMP = REGISTRY.register("starved.chomp", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "starved.chomp")));
	public static final RegistryObject<SoundEvent> BANE_HURT = REGISTRY.register("bane.hurt", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "bane.hurt")));
	public static final RegistryObject<SoundEvent> BANE_IDLE = REGISTRY.register("bane.idle", () -> new SoundEvent(new ResourceLocation("enemyexpansion", "bane.idle")));
}
