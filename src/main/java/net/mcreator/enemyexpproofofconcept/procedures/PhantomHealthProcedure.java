package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import java.io.File;

public class PhantomHealthProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		File enemyexpansion = new File("");
		com.google.gson.JsonObject mainjsonobject = new com.google.gson.JsonObject();
		double currentHealth = 0;
		if (entity.isAlive()) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							("/attribute @s generic.max_health base set phantomhealth".replace("phantomhealth", "" + (double) BetterConfigConfiguration.PHANTOMHEALTH.get())));
			}
		}
	}
}
