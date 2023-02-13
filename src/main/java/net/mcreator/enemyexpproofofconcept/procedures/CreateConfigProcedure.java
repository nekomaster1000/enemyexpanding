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
					"mobMobReplacement: mob will replace Mob based on the percentage chance and depth level specified, much like babyZombieSpawning and mobSpawningDepth.");
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
		if (!(mainjsonobject.get("spiderMobReplacementExplained") != null)) {
			mainjsonobject.addProperty("spiderMobReplacementExplained",
					"Spiders will be replaced by Scorpions in Deserts/Mesas and Tarantulas in Dripstone Caves.");
		}
		if (!(mainjsonobject.get("spiderScorpionReplacement") != null)) {
			mainjsonobject.addProperty("spiderScorpionReplacement", 0.8);
		}
		if (!(mainjsonobject.get("spiderTarantulaReplacement") != null)) {
			mainjsonobject.addProperty("spiderTarantulaReplacement", 1);
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
