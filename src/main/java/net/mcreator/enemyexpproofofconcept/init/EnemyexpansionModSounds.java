
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnemyexpansionModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("enemyexpansion", "silentstep"), new SoundEvent(new ResourceLocation("enemyexpansion", "silentstep")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "troll.roar"), new SoundEvent(new ResourceLocation("enemyexpansion", "troll.roar")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "troll.hurt.2"), new SoundEvent(new ResourceLocation("enemyexpansion", "troll.hurt.2")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "troll.death"), new SoundEvent(new ResourceLocation("enemyexpansion", "troll.death")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "troll.idle.1"), new SoundEvent(new ResourceLocation("enemyexpansion", "troll.idle.1")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "troll.hurt.1"), new SoundEvent(new ResourceLocation("enemyexpansion", "troll.hurt.1")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "bane.idle"), new SoundEvent(new ResourceLocation("enemyexpansion", "bane.idle")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "bane.hurt"), new SoundEvent(new ResourceLocation("enemyexpansion", "bane.hurt")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "kelpie_idle"), new SoundEvent(new ResourceLocation("enemyexpansion", "kelpie_idle")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "kelpie.reinforcement"), new SoundEvent(new ResourceLocation("enemyexpansion", "kelpie.reinforcement")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "dreadnought.idle"), new SoundEvent(new ResourceLocation("enemyexpansion", "dreadnought.idle")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "dreadnought.hurt"), new SoundEvent(new ResourceLocation("enemyexpansion", "dreadnought.hurt")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "dreadnought.death"), new SoundEvent(new ResourceLocation("enemyexpansion", "dreadnought.death")));
		REGISTRY.put(new ResourceLocation("enemyexpansion", "starved.chomp"), new SoundEvent(new ResourceLocation("enemyexpansion", "starved.chomp")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
