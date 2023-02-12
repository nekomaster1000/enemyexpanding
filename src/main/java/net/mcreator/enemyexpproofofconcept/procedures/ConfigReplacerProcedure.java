package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.loading.FMLPaths;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.network.EnemyexpansionModVariables;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.Gson;

public class ConfigReplacerProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
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
				if ((EnemyexpansionModVariables.WorldVariables.get(world).returnConfig).equals("SpawningDepth")) {
					if (y < mainjsonobject.get((EnemyexpansionModVariables.WorldVariables.get(world).configMob + ""
							+ EnemyexpansionModVariables.WorldVariables.get(world).returnConfig)).getAsDouble()
							&& world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) < 5) {
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
