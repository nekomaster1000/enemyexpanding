
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enemyexpproofofconcept.client.particle.VigorParticleParticle;
import net.mcreator.enemyexpproofofconcept.client.particle.ResistenceParticleParticle;
import net.mcreator.enemyexpproofofconcept.client.particle.FeatherParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnemyexpansionModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(EnemyexpansionModParticleTypes.RESISTENCE_PARTICLE.get(), ResistenceParticleParticle::provider);
		event.register(EnemyexpansionModParticleTypes.FEATHER_PARTICLE.get(), FeatherParticleParticle::provider);
		event.register(EnemyexpansionModParticleTypes.VIGOR_PARTICLE.get(), VigorParticleParticle::provider);
	}
}
