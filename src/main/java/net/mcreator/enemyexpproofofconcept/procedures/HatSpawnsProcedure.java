package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModItems;
import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

public class HatSpawnsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomlevel = 0;
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("enemyexpansion:armor_wearer")))) {
			if (world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_hat_appropriate")))) {
				if (Math.random() < (double) BetterConfigConfiguration.MEATHEADWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.MEATHEAD_ARMOR_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.MEATHEAD_ARMOR_HELMET.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.HEADBITTENWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.HEADBITER_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.HEADBITER_HELMET.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.SLIMEHEADWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.SLIMEHEAD_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.SLIMEHEAD_HELMET.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.SPIDERLATCHWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.SPIDERLATCH_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.SPIDERLATCH_HELMET.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.SILVERHEADWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.SILVERHAT_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.SILVERHAT_HELMET.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.HORSEHEADWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.HORSEHEAD_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.HORSEHEAD_HELMET.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.MINIWITHERWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.MINI_WITHER_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.MINI_WITHER_HELMET.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.FLUTTERFLIERSWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(EnemyexpansionModItems.FLUTTERFLIERS_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(EnemyexpansionModItems.FLUTTERFLIERS_CHESTPLATE.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.BANEMASKWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.BANEMASK_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.BANEMASK_HELMET.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.GLADLINGWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.GLADLING_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.GLADLING_HELMET.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.GUARDSMASKWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.GUARDSMASK_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.GUARDSMASK_HELMET.get()));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(EnemyexpansionModItems.GUARDSMASK_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(EnemyexpansionModItems.GUARDSMASK_CHESTPLATE.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.PHANTASMWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.PHANTASM_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.PHANTASM_HELMET.get()));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(EnemyexpansionModItems.PHANTASM_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(EnemyexpansionModItems.PHANTASM_CHESTPLATE.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.SPECTRALWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.SPECTRAL_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.SPECTRAL_HELMET.get()));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(EnemyexpansionModItems.SPECTRAL_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(EnemyexpansionModItems.SPECTRAL_CHESTPLATE.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.BRUTISHGARMENTWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(EnemyexpansionModItems.BRUTISH_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(EnemyexpansionModItems.BRUTISH_CHESTPLATE.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.COCKATRICEWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.COCK_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.COCK_HELMET.get()));
						}
					}
					ChampionSpawnProcedure.execute(entity);
				}
				if (Math.random() < (double) BetterConfigConfiguration.RESTINGVIGORWEARERSPAWNING.get()) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "/data merge entity @s {ArmorItems:[{},{},{},{id:\"enemyexpansion:resting_vigor_helmet\",Count:1b}]}");
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.VIGOR_EFFECT.get(), 50000, 2, (false), (false)));
				}
			}
			if (world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_armor_appropriate")))) {
				if (Math.random() < (double) BetterConfigConfiguration.NETHERITEWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(Items.NETHERITE_HELMET));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.NETHERITE_HELMET));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(Items.NETHERITE_CHESTPLATE));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.NETHERITE_CHESTPLATE));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(1, new ItemStack(Items.NETHERITE_LEGGINGS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.NETHERITE_LEGGINGS));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(Items.NETHERITE_BOOTS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.NETHERITE_BOOTS));
						}
					}
				}
				if (Math.random() < (double) BetterConfigConfiguration.DIAMONDWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(Items.DIAMOND_HELMET));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.DIAMOND_HELMET));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(Items.DIAMOND_CHESTPLATE));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.DIAMOND_CHESTPLATE));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(1, new ItemStack(Items.DIAMOND_LEGGINGS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.DIAMOND_LEGGINGS));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(Items.DIAMOND_BOOTS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.DIAMOND_BOOTS));
						}
					}
				}
				if (Math.random() < (double) BetterConfigConfiguration.GOLDWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(Items.GOLDEN_HELMET));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.GOLDEN_HELMET));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(Items.GOLDEN_CHESTPLATE));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.GOLDEN_CHESTPLATE));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(1, new ItemStack(Items.GOLDEN_LEGGINGS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.GOLDEN_LEGGINGS));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(Items.GOLDEN_BOOTS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.GOLDEN_BOOTS));
						}
					}
				}
				if (Math.random() < (double) BetterConfigConfiguration.IRONWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(Items.IRON_HELMET));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.IRON_HELMET));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(Items.IRON_CHESTPLATE));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.IRON_CHESTPLATE));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(1, new ItemStack(Items.IRON_LEGGINGS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.IRON_LEGGINGS));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(Items.IRON_BOOTS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.IRON_BOOTS));
						}
					}
				}
				if (Math.random() < (double) BetterConfigConfiguration.CHAINMAILWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(Items.CHAINMAIL_HELMET));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.CHAINMAIL_HELMET));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(1, new ItemStack(Items.CHAINMAIL_LEGGINGS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.CHAINMAIL_LEGGINGS));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(Items.CHAINMAIL_BOOTS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.CHAINMAIL_BOOTS));
						}
					}
				}
				if (Math.random() < (double) BetterConfigConfiguration.LEATHERWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(Items.LEATHER_HELMET));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.LEATHER_HELMET));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(Items.LEATHER_CHESTPLATE));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.LEATHER_CHESTPLATE));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(1, new ItemStack(Items.LEATHER_LEGGINGS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.LEATHER_LEGGINGS));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(Items.LEATHER_BOOTS));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.LEATHER_BOOTS));
						}
					}
				}
				if (Math.random() < (double) BetterConfigConfiguration.EMERALDWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.POLISHED_EMERALD_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.POLISHED_EMERALD_HELMET.get()));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(EnemyexpansionModItems.POLISHED_EMERALD_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(EnemyexpansionModItems.POLISHED_EMERALD_CHESTPLATE.get()));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(1, new ItemStack(EnemyexpansionModItems.POLISHED_EMERALD_LEGGINGS.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(EnemyexpansionModItems.POLISHED_EMERALD_LEGGINGS.get()));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(EnemyexpansionModItems.POLISHED_EMERALD_BOOTS.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(EnemyexpansionModItems.POLISHED_EMERALD_BOOTS.get()));
						}
					}
				}
				if (Math.random() < (double) BetterConfigConfiguration.EMERALDWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.SPARKLING_AMETHYST_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.SPARKLING_AMETHYST_HELMET.get()));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(EnemyexpansionModItems.SPARKLING_AMETHYST_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(EnemyexpansionModItems.SPARKLING_AMETHYST_CHESTPLATE.get()));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(1, new ItemStack(EnemyexpansionModItems.SPARKLING_AMETHYST_LEGGINGS.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(EnemyexpansionModItems.SPARKLING_AMETHYST_LEGGINGS.get()));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(EnemyexpansionModItems.SPARKLING_AMETHYST_BOOTS.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(EnemyexpansionModItems.SPARKLING_AMETHYST_BOOTS.get()));
						}
					}
				}
			}
			if (world.getBiome(new BlockPos(x, y, z)).is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_hot")))) {
				if (Math.random() < (double) BetterConfigConfiguration.BULLSKULLWEARERSPAWNING.get()) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.BULL_SKULL_HELMET.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.BULL_SKULL_HELMET.get()));
						}
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(EnemyexpansionModItems.SPECTRAL_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(EnemyexpansionModItems.SPECTRAL_CHESTPLATE.get()));
						}
					}
				}
			}
		}
	}
}
