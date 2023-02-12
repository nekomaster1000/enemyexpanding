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
					"babyZombieSpawning: 0 fully disables it, 1 fully enables it, and an inbetween acts as a percentage chance for it to work (0.3 being a 30% chance for a Baby Zombie to successfully spawn, for example.)");
		}
		if (!(mainjsonobject.get("babyZombieSpawning") != null)) {
			mainjsonobject.addProperty("babyZombieSpawning", 0);
		}
		if (!(mainjsonobject.get("mobSpawningDepthExplained") != null)) {
			mainjsonobject.addProperty("mobSpawningDepthExplained",
					"mobSpawningDepth: Mob will only naturally spawn below the specified y-level. This is so certain mobs are cave-exclusive by default.");
		}
		if (!(mainjsonobject.get("petrimanSpawningDepth") != null)) {
			mainjsonobject.addProperty("petrimanSpawningDepth", (-10));
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
			mainjsonobject.addProperty("mobReplacementExplained", "mobReplacement: ...?");
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
