package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import javax.annotation.Nullable;

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
		if (Math.random() < (double) BetterConfigConfiguration.HORDEZOMBIEREPLACEMENT.get()) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("enemyexpansion:hordereplaces")))) {
				ReplaceWithHordeProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.CINDERBLAZEREPLACEMENT.get()) {
			if (entity instanceof Blaze) {
				ReplaceWithCinderProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.SPIDERSCORPIONREPLACEMENT.get()) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("enemyexpansion:scorpionreplaces")))
					&& world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_hot")))) {
				ReplaceWithScorpionProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.SPIDERTARANTULAREPLACEMENT.get()) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("enemyexpansion:tarantulareplaces")))
					&& new ResourceLocation("dripstone_caves").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
				ReplaceWithTarantulaProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.ILLAGERVILLAGERREPLACEMENT.get()) {
			if (entity instanceof Villager) {
				ReplaceWithIllagerProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.IRONGOLEMRAVAGERREPLACEMENT.get()) {
			if (entity instanceof IronGolem) {
				ReplaceWithRavagerProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.RAVAGERMARAUDERREPLACEMENT.get()) {
			if (entity instanceof Ravager) {
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WATER) {
					ReplaceWithMarauderProcedure.execute(world, x, y, z, entity);
				}
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.HORNETVEXREPLACEMENT.get()) {
			if (entity instanceof Vex) {
				ReplaceWithHornetProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}
