package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.VampireEntity;
import net.mcreator.enemyexpproofofconcept.entity.TrollEntity;
import net.mcreator.enemyexpproofofconcept.entity.TarantulaEntity;
import net.mcreator.enemyexpproofofconcept.entity.SilverkingEntity;
import net.mcreator.enemyexpproofofconcept.entity.ScorpionEntity;
import net.mcreator.enemyexpproofofconcept.entity.PetrimanEntity;
import net.mcreator.enemyexpproofofconcept.entity.PetriboulderEntity;
import net.mcreator.enemyexpproofofconcept.entity.IntruderEntity;
import net.mcreator.enemyexpproofofconcept.entity.CrawlerEntity;
import net.mcreator.enemyexpproofofconcept.entity.CinderEntity;

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
					if (entity instanceof Zombie || entity instanceof ZombieVillager) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
						if (Math.random() > 0.3) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new PetrimanEntity(EnemyexpansionModEntities.PETRIMAN.get(), _level);
								entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
											MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new PetriboulderEntity(EnemyexpansionModEntities.PETRIBOULDER.get(), _level);
								entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
											MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
				if (Math.random() < mainjsonobject.get("silverkingSpiderReplacement").getAsDouble()
						&& y < mainjsonobject.get("silverkingSpiderReplacementDepth").getAsDouble()) {
					if (entity instanceof Spider && !(entity instanceof CaveSpider)) {
						if (!new ResourceLocation("dripstone_caves").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
								|| !world.getBiome(new BlockPos(x, y, z))
										.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_desert")))
								|| !world.getBiome(new BlockPos(x, y, z))
										.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_badlands")))) {
							if (event != null && event.isCancelable()) {
								event.setCanceled(true);
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new SilverkingEntity(EnemyexpansionModEntities.SILVERKING.get(), _level);
								entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
											MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
				if (Math.random() < mainjsonobject.get("creepsReplacement").getAsDouble()
						&& y < mainjsonobject.get("creepsReplacementDepth").getAsDouble()) {
					if (entity instanceof Creeper) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new CrawlerEntity(EnemyexpansionModEntities.CRAWLER.get(), _level);
								entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
											MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new IntruderEntity(EnemyexpansionModEntities.INTRUDER.get(), _level);
								entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
											MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
				if (Math.random() < mainjsonobject.get("vampireSkeletonReplacement").getAsDouble()
						&& y < mainjsonobject.get("vampireSkeletonReplacementDepth").getAsDouble()) {
					if (entity instanceof Skeleton) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new VampireEntity(EnemyexpansionModEntities.VAMPIRE.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < mainjsonobject.get("trollEndermanReplacement").getAsDouble()
						&& y < mainjsonobject.get("trollEndermanReplacementDepth").getAsDouble()) {
					if (entity instanceof EnderMan) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new TrollEntity(EnemyexpansionModEntities.TROLL.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < mainjsonobject.get("cinderBlazeReplacement").getAsDouble()) {
					if (entity instanceof Blaze) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new CinderEntity(EnemyexpansionModEntities.CINDER.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < mainjsonobject.get("spiderScorpionReplacement").getAsDouble()) {
					if (entity instanceof Spider && !(entity instanceof ScorpionEntity)
							&& (world.getBiome(new BlockPos(x, y, z))
									.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_desert")))
									|| world.getBiome(new BlockPos(x, y, z))
											.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_badlands"))))) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new ScorpionEntity(EnemyexpansionModEntities.SCORPION.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() < mainjsonobject.get("spiderTarantulaReplacement").getAsDouble()) {
					if (entity instanceof Spider && !(entity instanceof TarantulaEntity)
							&& new ResourceLocation("dripstone_caves").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new TarantulaEntity(EnemyexpansionModEntities.TARANTULA.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
