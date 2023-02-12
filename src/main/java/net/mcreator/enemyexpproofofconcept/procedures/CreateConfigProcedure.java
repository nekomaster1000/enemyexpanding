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
		if (!(mainjsonobject.get("config_explanation") != null)) {
			mainjsonobject.addProperty("config_explanation", "heey");
		}
		if (!(mainjsonobject.get("noBabyZombies") != null)) {
			mainjsonobject.addProperty("noBabyZombies", (true));
		}
		if (!(mainjsonobject.get("petrimanSpawningDepth") != null)) {
			mainjsonobject.addProperty("petrimanSpawningDepth", (-25));
		}
		if (!(mainjsonobject.get("silverkingSpawningDepth") != null)) {
			mainjsonobject.addProperty("silverkingSpawningDepth", (-25));
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
