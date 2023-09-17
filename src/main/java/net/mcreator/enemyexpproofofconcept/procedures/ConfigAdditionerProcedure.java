package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Strider;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ConfigAdditionerProcedure {
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
		if (Math.random() < (double) BetterConfigConfiguration.PETRIMANZOMBIEREPLACEMENT.get() && y < (double) BetterConfigConfiguration.PETRIMANZOMBIEREPLACEMENTDEPTH.get()) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("enemyexpansion:petrimanreplaces")))) {
				if (!world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_nether")))) {
					ReplaceWithPetrimenProcedure.execute(world, x, y, z);
				}
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.SILVERKINGSPIDERREPLACEMENT.get() && y < (double) BetterConfigConfiguration.SILVERKINGSPIDERREPLACEMENTDEPTH.get()) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("enemyexpansion:silverkingreplaces")))) {
				if (!new ResourceLocation("dripstone_caves").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
						&& !world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_hot")))) {
					ReplacewithSilverkingProcedure.execute(world, x, y, z, entity);
				}
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.CREEPSREPLACEMENT.get() && y < (double) BetterConfigConfiguration.CREEPSREPLACEMENTDEPTH.get()) {
			if (entity instanceof Creeper) {
				ReplaceWithCreepsProcedure.execute(world, x, y, z);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.VAMPIRESKELETONREPLACEMENT.get() && y < (double) BetterConfigConfiguration.VAMPIRESKELETONREPLACEMENTDEPTH.get()) {
			if (entity instanceof Skeleton) {
				ReplaceWithVampireProcedure.execute(world, x, y, z);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.TROLLENDERMANREPLACEMENT.get() && y < (double) BetterConfigConfiguration.TROLLENDERMANREPLACEMENTDEPTH.get()) {
			if (entity instanceof EnderMan) {
				ReplaceWithTrollProcedure.execute(world, x, y, z);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.SPUTTERSTRIDERREPLACEMENT.get()) {
			if (entity instanceof Strider) {
				ReplaceWithSputterProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.SKELETALHORSERIDERADDITION.get()) {
			if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
				if (entity instanceof Skeleton) {
					ReplaceWithSkeletonHorsemanProcedure.execute(world, x, y, z, entity);
				}
			}
		}
	}
}
