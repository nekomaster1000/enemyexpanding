/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.enemyexpproofofconcept;

import software.bernie.geckolib3.GeckoLib;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModPotions;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModParticleTypes;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModItems;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("enemyexpansion")
public class EnemyexpansionMod {
	public static final Logger LOGGER = LogManager.getLogger(EnemyexpansionMod.class);
	public static final String MODID = "enemyexpansion";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public EnemyexpansionMod() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		EnemyexpansionModItems.REGISTRY.register(bus);
		EnemyexpansionModEntities.REGISTRY.register(bus);

		EnemyexpansionModMobEffects.REGISTRY.register(bus);
		EnemyexpansionModPotions.REGISTRY.register(bus);

		EnemyexpansionModParticleTypes.REGISTRY.register(bus);
		GeckoLib.initialize();
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
