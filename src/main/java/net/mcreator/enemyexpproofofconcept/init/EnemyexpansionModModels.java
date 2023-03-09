
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enemyexpproofofconcept.client.model.meathat;
import net.mcreator.enemyexpproofofconcept.client.model.Modeltrollface;
import net.mcreator.enemyexpproofofconcept.client.model.Modelsteve;
import net.mcreator.enemyexpproofofconcept.client.model.Modelsprinter_zombie;
import net.mcreator.enemyexpproofofconcept.client.model.Modelspiderlatch;
import net.mcreator.enemyexpproofofconcept.client.model.Modelspectral_cloak;
import net.mcreator.enemyexpproofofconcept.client.model.Modelslimehead;
import net.mcreator.enemyexpproofofconcept.client.model.Modelsilverhat;
import net.mcreator.enemyexpproofofconcept.client.model.Modelsenior_zombie;
import net.mcreator.enemyexpproofofconcept.client.model.Modelphantasm;
import net.mcreator.enemyexpproofofconcept.client.model.Modelminiwither;
import net.mcreator.enemyexpproofofconcept.client.model.Modelmeature;
import net.mcreator.enemyexpproofofconcept.client.model.Modelmeatman;
import net.mcreator.enemyexpproofofconcept.client.model.Modelhuntsman;
import net.mcreator.enemyexpproofofconcept.client.model.Modelhorsehead;
import net.mcreator.enemyexpproofofconcept.client.model.Modelheadbiter;
import net.mcreator.enemyexpproofofconcept.client.model.Modelgladling;
import net.mcreator.enemyexpproofofconcept.client.model.Modelfrigid_zombie;
import net.mcreator.enemyexpproofofconcept.client.model.Modelflutterfliers;
import net.mcreator.enemyexpproofofconcept.client.model.Modelequestrian_zombie;
import net.mcreator.enemyexpproofofconcept.client.model.Modelcinderhelmet;
import net.mcreator.enemyexpproofofconcept.client.model.Modelbull_skull;
import net.mcreator.enemyexpproofofconcept.client.model.Modelbrutish_garment;
import net.mcreator.enemyexpproofofconcept.client.model.Modelbanemask;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EnemyexpansionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelgladling.LAYER_LOCATION, Modelgladling::createBodyLayer);
		event.registerLayerDefinition(Modelheadbiter.LAYER_LOCATION, Modelheadbiter::createBodyLayer);
		event.registerLayerDefinition(Modelhorsehead.LAYER_LOCATION, Modelhorsehead::createBodyLayer);
		event.registerLayerDefinition(Modelphantasm.LAYER_LOCATION, Modelphantasm::createBodyLayer);
		event.registerLayerDefinition(Modelsteve.LAYER_LOCATION, Modelsteve::createBodyLayer);
		event.registerLayerDefinition(Modelbanemask.LAYER_LOCATION, Modelbanemask::createBodyLayer);
		event.registerLayerDefinition(Modelequestrian_zombie.LAYER_LOCATION, Modelequestrian_zombie::createBodyLayer);
		event.registerLayerDefinition(Modelfrigid_zombie.LAYER_LOCATION, Modelfrigid_zombie::createBodyLayer);
		event.registerLayerDefinition(Modelspiderlatch.LAYER_LOCATION, Modelspiderlatch::createBodyLayer);
		event.registerLayerDefinition(Modelsilverhat.LAYER_LOCATION, Modelsilverhat::createBodyLayer);
		event.registerLayerDefinition(meathat.LAYER_LOCATION, meathat::createBodyLayer);
		event.registerLayerDefinition(Modelbrutish_garment.LAYER_LOCATION, Modelbrutish_garment::createBodyLayer);
		event.registerLayerDefinition(Modelsenior_zombie.LAYER_LOCATION, Modelsenior_zombie::createBodyLayer);
		event.registerLayerDefinition(Modelbull_skull.LAYER_LOCATION, Modelbull_skull::createBodyLayer);
		event.registerLayerDefinition(Modelmeature.LAYER_LOCATION, Modelmeature::createBodyLayer);
		event.registerLayerDefinition(Modelminiwither.LAYER_LOCATION, Modelminiwither::createBodyLayer);
		event.registerLayerDefinition(Modelspectral_cloak.LAYER_LOCATION, Modelspectral_cloak::createBodyLayer);
		event.registerLayerDefinition(Modelsprinter_zombie.LAYER_LOCATION, Modelsprinter_zombie::createBodyLayer);
		event.registerLayerDefinition(Modelflutterfliers.LAYER_LOCATION, Modelflutterfliers::createBodyLayer);
		event.registerLayerDefinition(Modeltrollface.LAYER_LOCATION, Modeltrollface::createBodyLayer);
		event.registerLayerDefinition(Modelcinderhelmet.LAYER_LOCATION, Modelcinderhelmet::createBodyLayer);
		event.registerLayerDefinition(Modelhuntsman.LAYER_LOCATION, Modelhuntsman::createBodyLayer);
		event.registerLayerDefinition(Modelmeatman.LAYER_LOCATION, Modelmeatman::createBodyLayer);
		event.registerLayerDefinition(Modelslimehead.LAYER_LOCATION, Modelslimehead::createBodyLayer);
	}
}
