package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreateConfigProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		File enemyexpansion = new File("");
		com.google.gson.JsonObject mainjsonobject = new com.google.gson.JsonObject();
		enemyexpansion = new File((FMLPaths.GAMEDIR.get().toString() + "/config/"), File.separator + "enemyexpansion.json");
		if (!enemyexpansion.exists()) {
			try {
				enemyexpansion.getParentFile().mkdirs();
				enemyexpansion.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		if (!(mainjsonobject.get("babyZombieSpawningExplained") != null)) {
			mainjsonobject.addProperty("babyZombieSpawningExplained",
					"0 fully disables it, 1 fully enables it, and an inbetween acts as a percentage chance for it to work (0.3 being 30%, for example.)");
		}
		if (!(mainjsonobject.get("babyZombieSpawning") != null)) {
			mainjsonobject.addProperty("babyZombieSpawning", 0);
		}
		if (!(mainjsonobject.get("mobSpawningDepthExplained") != null)) {
			mainjsonobject.addProperty("mobSpawningDepthExplained",
					"Mob will only naturally spawn below the specified y-level. This is so certain mobs are cave-exclusive by default.");
		}
		if (!(mainjsonobject.get("petrimanSpawningDepth") != null)) {
			mainjsonobject.addProperty("petrimanSpawningDepth", 55);
		}
		if (!(mainjsonobject.get("silverkingSpawningDepth") != null)) {
			mainjsonobject.addProperty("silverkingSpawningDepth", (-10));
		}
		if (!(mainjsonobject.get("crawlerSpawningDepth") != null)) {
			mainjsonobject.addProperty("crawlerSpawningDepth", (-10));
		}
		if (!(mainjsonobject.get("trollSpawningDepth") != null)) {
			mainjsonobject.addProperty("trollSpawningDepth", (-10));
		}
		if (!(mainjsonobject.get("vampireSpawningDepth") != null)) {
			mainjsonobject.addProperty("vampireSpawningDepth", (-10));
		}
		if (!(mainjsonobject.get("mobReplacementExplained") != null)) {
			mainjsonobject.addProperty("mobReplacementExplained",
					"Mob1 will replace Mob2 based on the percentage chance and depth level specified, much like babyZombieSpawning and mobSpawningDepth.");
		}
		if (!(mainjsonobject.get("petrimanZombieReplacement") != null)) {
			mainjsonobject.addProperty("petrimanZombieReplacement", 1);
		}
		if (!(mainjsonobject.get("petrimanZombieReplacementDepth") != null)) {
			mainjsonobject.addProperty("petrimanZombieReplacementDepth", 55);
		}
		if (!(mainjsonobject.get("silverkingSpiderReplacement") != null)) {
			mainjsonobject.addProperty("silverkingSpiderReplacement", 0.4);
		}
		if (!(mainjsonobject.get("silverkingSpiderReplacementDepth") != null)) {
			mainjsonobject.addProperty("silverkingSpiderReplacementDepth", (-10));
		}
		if (!(mainjsonobject.get("creepsReplacement") != null)) {
			mainjsonobject.addProperty("creepsReplacement", 0.3);
		}
		if (!(mainjsonobject.get("creepsReplacementDepth") != null)) {
			mainjsonobject.addProperty("creepsReplacementDepth", (-10));
		}
		if (!(mainjsonobject.get("vampireSkeletonReplacement") != null)) {
			mainjsonobject.addProperty("vampireSkeletonReplacement", 0.75);
		}
		if (!(mainjsonobject.get("vampireSkeletonReplacementDepth") != null)) {
			mainjsonobject.addProperty("vampireSkeletonReplacementDepth", (-10));
		}
		if (!(mainjsonobject.get("trollEndermanReplacement") != null)) {
			mainjsonobject.addProperty("trollEndermanReplacement", 1);
		}
		if (!(mainjsonobject.get("trollEndermanReplacementDepth") != null)) {
			mainjsonobject.addProperty("trollEndermanReplacementDepth", (-10));
		}
		if (!(mainjsonobject.get("cinderBlazeReplacement") != null)) {
			mainjsonobject.addProperty("cinderBlazeReplacement", 0.2);
		}
		if (!(mainjsonobject.get("pigBoarReplacement") != null)) {
			mainjsonobject.addProperty("pigBoarReplacement", 0.65);
		}
		if (!(mainjsonobject.get("cowBullReplacement") != null)) {
			mainjsonobject.addProperty("cowBullReplacement", 0.75);
		}
		if (!(mainjsonobject.get("sheepRamReplacement") != null)) {
			mainjsonobject.addProperty("sheepRamReplacement", 0.85);
		}
		if (!(mainjsonobject.get("chickenRoosterReplacement") != null)) {
			mainjsonobject.addProperty("chickenRoosterReplacement", 0.55);
		}
		if (!(mainjsonobject.get("spiderTarantulaReplacement") != null)) {
			mainjsonobject.addProperty("spiderTarantulaReplacement", 1);
		}
		if (!(mainjsonobject.get("spiderScorpionReplacement") != null)) {
			mainjsonobject.addProperty("spiderScorpionReplacement", 1);
		}
		if (!(mainjsonobject.get("hatWearerSpawningExplained") != null)) {
			mainjsonobject.addProperty("hatWearerSpawningExplained",
					"Some mobs will spawn wearing certain special gear. Edit the minecraft:is_meatury tag to choose what biomes these mobs spawn in.");
		}
		if (!(mainjsonobject.get("meatheadWearerSpawning") != null)) {
			mainjsonobject.addProperty("meatheadWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("headbittenWearerSpawning") != null)) {
			mainjsonobject.addProperty("headbittenWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("slimeheadWearerSpawning") != null)) {
			mainjsonobject.addProperty("slimeheadWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("spiderlatchWearerSpawning") != null)) {
			mainjsonobject.addProperty("spiderlatchWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("silverheadWearerSpawning") != null)) {
			mainjsonobject.addProperty("silverheadWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("flutterfliersWearerSpawning") != null)) {
			mainjsonobject.addProperty("flutterfliersWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("phantasmWearerSpawning") != null)) {
			mainjsonobject.addProperty("phantasmWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("spectralWearerSpawning") != null)) {
			mainjsonobject.addProperty("spectralWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("bullSkullWearerSpawning") != null)) {
			mainjsonobject.addProperty("bullSkullWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("netheriteWearerSpawning") != null)) {
			mainjsonobject.addProperty("netheriteWearerSpawning", 0.001);
		}
		if (!(mainjsonobject.get("diamondWearerSpawning") != null)) {
			mainjsonobject.addProperty("diamondWearerSpawning", 0.0025);
		}
		if (!(mainjsonobject.get("goldWearerSpawning") != null)) {
			mainjsonobject.addProperty("goldWearerSpawning", 0.005);
		}
		if (!(mainjsonobject.get("ironWearerSpawning") != null)) {
			mainjsonobject.addProperty("ironWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("chainmailWearerSpawning") != null)) {
			mainjsonobject.addProperty("chainmailWearerSpawning", 0.015);
		}
		if (!(mainjsonobject.get("leatherWearerSpawning") != null)) {
			mainjsonobject.addProperty("leatherWearerSpawning", 0.02);
		}
		if (!(mainjsonobject.get("ramPunchingDropsWool") != null)) {
			mainjsonobject.addProperty("ramPunchingDropsWool", 0);
		}
		{
			Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
			try {
				FileWriter fileWriter = new FileWriter(enemyexpansion);
				fileWriter.write(mainGSONBuilderVariable.toJson(mainjsonobject));
				fileWriter.close();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
	}
}
