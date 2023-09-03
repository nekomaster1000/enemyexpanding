
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.enemyexpproofofconcept.client.particle.VigorParticleParticle;
import net.mcreator.enemyexpproofofconcept.client.particle.ResistenceParticleParticle;
import net.mcreator.enemyexpproofofconcept.client.particle.FeatherParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnemyexpansionModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) EnemyexpansionModParticleTypes.RESISTENCE_PARTICLE.get(), ResistenceParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) EnemyexpansionModParticleTypes.FEATHER_PARTICLE.get(), FeatherParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) EnemyexpansionModParticleTypes.VIGOR_PARTICLE.get(), VigorParticleParticle::provider);
	}
}
