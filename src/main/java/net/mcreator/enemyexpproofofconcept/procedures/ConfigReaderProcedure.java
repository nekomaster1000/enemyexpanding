package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.loading.FMLPaths;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.enemyexpproofofconcept.network.EnemyexpansionModVariables;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.Gson;

public class ConfigReaderProcedure {
	public static boolean execute(LevelAccessor world, double y) {
		boolean spawning = false;
		File enemyexpansion = new File("");
		com.google.gson.JsonObject mainjsonobject = new com.google.gson.JsonObject();
		enemyexpansion = new File((FMLPaths.GAMEDIR.get().toString() + "/config/"), File.separator + "enemyexpansion.json");
		{
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(enemyexpansion));
				StringBuilder jsonstringbuilder = new StringBuilder();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					jsonstringbuilder.append(line);
				}
				bufferedReader.close();
				mainjsonobject = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
				if ((EnemyexpansionModVariables.WorldVariables.get(world).returnConfig).equals("petrimanSpawningDepth")) {
					if (y < mainjsonobject.get("petrimanSpawningDepth").getAsDouble()) {
						spawning = true;
					} else {
						spawning = false;
					}
				}
				if ((EnemyexpansionModVariables.WorldVariables.get(world).returnConfig).equals("silverkingSpawningDepth")) {
					if (y < mainjsonobject.get("silverkingSpawningDepth").getAsDouble()) {
						spawning = true;
					} else {
						spawning = false;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return spawning;
	}
}
