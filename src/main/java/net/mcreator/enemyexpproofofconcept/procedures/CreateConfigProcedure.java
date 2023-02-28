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
		if (!(mainjsonobject.get("horseheadWearerSpawning") != null)) {
			mainjsonobject.addProperty("horseheadWearerSpawning", 0.01);
		}
		if (!(mainjsonobject.get("miniWitherWearerSpawning") != null)) {
			mainjsonobject.addProperty("miniWitherWearerSpawning", 0.01);
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
		if (!(mainjsonobject.get("bruteGarmentWearerSpawning") != null)) {
			mainjsonobject.addProperty("bruteGarmentWearerSpawning", 0.01);
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
		if (!(mainjsonobject.get("miscOptionsExplained") != null)) {
			mainjsonobject.addProperty("miscOptionsExplained", "Various other options you can change if you so wish.");
		}
		if (!(mainjsonobject.get("ramPunchingDropsWoolChance") != null)) {
			mainjsonobject.addProperty("ramPunchingDropsWoolChance", 0);
		}
		if (!(mainjsonobject.get("wanderingTraderBecomesIllusionerOnHitChance") != null)) {
			mainjsonobject.addProperty("wanderingTraderBecomesIllusionerOnHitChance", 0.99);
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
