package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.entity.TarantulaEntity;
import net.mcreator.enemyexpproofofconcept.entity.SilverkingEntity;
import net.mcreator.enemyexpproofofconcept.entity.ScorpionEntity;
import net.mcreator.enemyexpproofofconcept.entity.RoosterEntity;
import net.mcreator.enemyexpproofofconcept.entity.RamEntity;
import net.mcreator.enemyexpproofofconcept.entity.BullEntity;
import net.mcreator.enemyexpproofofconcept.entity.BoarEntity;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.Gson;

@Mod.EventBusSubscriber
public class ConfigReplacerProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		execute(event, event.getWorld(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean spawning = false;
		com.google.gson.JsonObject mainjsonobject = new com.google.gson.JsonObject();
		File enemyexpansion = new File("");
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
				if (Math.random() < mainjsonobject.get("petrimanZombieReplacement").getAsDouble()
						&& y < mainjsonobject.get("petrimanZombieReplacementDepth").getAsDouble()) {
					if (entity instanceof Zombie && !(entity instanceof Drowned)) {
						ReplaceWithPetrimenProcedure.execute(world, x, y, z, entity);
					}
				}
				if (Math.random() < mainjsonobject.get("silverkingSpiderReplacement").getAsDouble()
						&& y < mainjsonobject.get("silverkingSpiderReplacementDepth").getAsDouble()) {
					if (entity instanceof Spider && !(entity instanceof CaveSpider) && !(entity instanceof SilverkingEntity)) {
						if (!new ResourceLocation("dripstone_caves").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
								&& !world.getBiome(new BlockPos(x, y, z))
										.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_hot")))) {
							ReplacewithSilverkingProcedure.execute(world, x, y, z, entity);
						}
					}
				}
				if (Math.random() < mainjsonobject.get("creepsReplacement").getAsDouble()
						&& y < mainjsonobject.get("creepsReplacementDepth").getAsDouble()) {
					if (entity instanceof Creeper) {
						ReplaceWithCreepsProcedure.execute(world, x, y, z, entity);
					}
				}
				if (Math.random() < mainjsonobject.get("vampireSkeletonReplacement").getAsDouble()
						&& y < mainjsonobject.get("vampireSkeletonReplacementDepth").getAsDouble()) {
					if (entity instanceof Skeleton) {
						ReplaceWithVampireProcedure.execute(world, x, y, z, entity);
					}
				}
				if (Math.random() < mainjsonobject.get("trollEndermanReplacement").getAsDouble()
						&& y < mainjsonobject.get("trollEndermanReplacementDepth").getAsDouble()) {
					if (entity instanceof EnderMan) {
						ReplaceWithTrollProcedure.execute(world, x, y, z, entity);
					}
				}
				if (Math.random() < mainjsonobject.get("cinderBlazeReplacement").getAsDouble()) {
					if (entity instanceof Blaze) {
						ReplaceWithCinderProcedure.execute(world, x, y, z, entity);
					}
				}
				if (Math.random() < mainjsonobject.get("pigBoarReplacement").getAsDouble()) {
					if (entity instanceof Pig && !(entity instanceof BoarEntity) && world.getBiome(new BlockPos(x, y, z))
							.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_taiga")))) {
						if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)) {
							ReplaceWithBoarProcedure.execute(world, x, y, z, entity);
						}
					}
				}
				if (Math.random() < mainjsonobject.get("cowBullReplacement").getAsDouble()) {
					if (entity instanceof Cow && !(entity instanceof BullEntity) && world.getBiome(new BlockPos(x, y, z))
							.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_hot")))) {
						if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)) {
							ReplaceWithBullProcedure.execute(world, x, y, z, entity);
						}
					}
				}
				if (Math.random() < mainjsonobject.get("sheepRamReplacement").getAsDouble()) {
					if (entity instanceof Sheep && !(entity instanceof RamEntity) && world.getBiome(new BlockPos(x, y, z))
							.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_mountain")))) {
						if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)) {
							ReplaceWithRamProcedure.execute(world, x, y, z, entity);
						}
					}
				}
				if (Math.random() < mainjsonobject.get("chickenRoosterReplacement").getAsDouble()) {
					if (entity instanceof Chicken && !(entity instanceof RoosterEntity) && world.getBiome(new BlockPos(x, y, z))
							.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_jungle")))) {
						if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)) {
							ReplaceWithRoosterProcedure.execute(world, x, y, z, entity);
						}
					}
				}
				if (Math.random() < mainjsonobject.get("spiderScorpionReplacement").getAsDouble()) {
					if (entity instanceof Spider && !(entity instanceof CaveSpider) && !(entity instanceof ScorpionEntity) && world
							.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_hot")))) {
						ReplaceWithScorpionProcedure.execute(world, x, y, z, entity);
					}
				}
				if (Math.random() < mainjsonobject.get("spiderTarantulaReplacement").getAsDouble()) {
					if (entity instanceof Spider && !(entity instanceof CaveSpider) && !(entity instanceof TarantulaEntity)
							&& new ResourceLocation("dripstone_caves").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
						ReplaceWithTarantulaProcedure.execute(world, x, y, z, entity);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
