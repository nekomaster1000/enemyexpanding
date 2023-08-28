package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.monster.Strider;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;
import net.mcreator.enemyexpproofofconcept.entity.RoosterEntity;
import net.mcreator.enemyexpproofofconcept.entity.RamEntity;
import net.mcreator.enemyexpproofofconcept.entity.BullEntity;
import net.mcreator.enemyexpproofofconcept.entity.BoarEntity;
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
		if (Math.random() < (double) BetterConfigConfiguration.PETRIMANZOMBIEREPLACEMENT.get() && y < (double) BetterConfigConfiguration.PETRIMANZOMBIEREPLACEMENTDEPTH.get()) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("enemyexpansion:petrimanreplaces")))) {
				if (!world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_nether")))) {
					ReplaceWithPetrimenProcedure.execute(world, x, y, z, entity);
				}
			}
		}
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
				ReplaceWithCreepsProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.VAMPIRESKELETONREPLACEMENT.get() && y < (double) BetterConfigConfiguration.VAMPIRESKELETONREPLACEMENTDEPTH.get()) {
			if (entity instanceof Skeleton) {
				ReplaceWithVampireProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.TROLLENDERMANREPLACEMENT.get() && y < (double) BetterConfigConfiguration.TROLLENDERMANREPLACEMENTDEPTH.get()) {
			if (entity instanceof EnderMan) {
				ReplaceWithTrollProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.PIGBOARREPLACEMENT.get()) {
			if (entity instanceof Pig && !(entity instanceof BoarEntity) && world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_taiga")))) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(EnemyexpansionModMobEffects.IRREPLACABLE.get()) : false)) {
					ReplaceWithBoarProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.IRREPLACABLE.get(), 99999, 0, (false), (false)));
				}
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.COWBULLREPLACEMENT.get()) {
			if (entity instanceof Cow && !(entity instanceof BullEntity) && world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_hot")))) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(EnemyexpansionModMobEffects.IRREPLACABLE.get()) : false)) {
					ReplaceWithBullProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.IRREPLACABLE.get(), 99999, 0, (false), (false)));
				}
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.SHEEPRAMREPLACEMENT.get()) {
			if (entity instanceof Sheep && !(entity instanceof RamEntity) && world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_mountain")))) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(EnemyexpansionModMobEffects.IRREPLACABLE.get()) : false)) {
					ReplaceWithRamProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.IRREPLACABLE.get(), 99999, 0, (false), (false)));
				}
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.CHICKENROOSTERREPLACEMENT.get()) {
			if (entity instanceof Chicken && !(entity instanceof RoosterEntity) && world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_jungle")))) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(EnemyexpansionModMobEffects.IRREPLACABLE.get()) : false)) {
					ReplaceWithRoosterProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.IRREPLACABLE.get(), 99999, 0, (false), (false)));
				}
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
		if (Math.random() < (double) BetterConfigConfiguration.SPUTTERSTRIDERREPLACEMENT.get()) {
			if (entity instanceof Strider) {
				ReplaceWithSputterProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.HORNETVEXREPLACEMENT.get()) {
			if (entity instanceof Vex) {
				ReplaceWithHornetProcedure.execute(world, x, y, z, entity);
			}
		}
		if (Math.random() < (double) BetterConfigConfiguration.SKELETALHORSERIDERADDITION.get()) {
			if (entity instanceof Skeleton) {
				if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
					ReplaceWithSkeletonHorsemanProcedure.execute(world, x, y, z, entity);
				}
			}
		}
	}
}
