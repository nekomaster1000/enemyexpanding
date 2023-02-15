package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModItems;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.Gson;

@Mod.EventBusSubscriber
public class HatSpawnsProcedure {
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
				if (Math.random() < mainjsonobject.get("meatHeadWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_meatury")))) {
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.MEATHEAD_ARMOR_HELMET.get()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.MEATHEAD_ARMOR_HELMET.get()));
								}
							}
						}
					}
				}
				if (Math.random() < mainjsonobject.get("headbittenWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_meatury")))) {
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.HEADBITER_HELMET.get()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.HEADBITER_HELMET.get()));
								}
							}
						}
					}
				}
				if (Math.random() < mainjsonobject.get("slimeheadWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_meatury")))) {
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.SLIMEHEAD_HELMET.get()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.SLIMEHEAD_HELMET.get()));
								}
							}
						}
					}
				}
				if (Math.random() < mainjsonobject.get("spiderlatchWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_meatury")))) {
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.SPIDERLATCH_HELMET.get()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.SPIDERLATCH_HELMET.get()));
								}
							}
						}
					}
				}
				if (Math.random() < mainjsonobject.get("silverheadWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_meatury")))) {
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(3, new ItemStack(EnemyexpansionModItems.SILVERHAT_HELMET.get()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(EnemyexpansionModItems.SILVERHAT_HELMET.get()));
								}
							}
						}
					}
				}
				if (Math.random() < mainjsonobject.get("phantasmWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_meatury")))) {
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
						}
					}
				}
				if (Math.random() < mainjsonobject.get("spectralWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_meatury")))) {
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
						}
					}
				}
				if (Math.random() < mainjsonobject.get("bullSkullWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_hot")))) {
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
				if (Math.random() < mainjsonobject.get("ironWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_meatury")))) {
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
					}
				}
				if (Math.random() < mainjsonobject.get("chainmailWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_meatury")))) {
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
					}
				}
				if (Math.random() < mainjsonobject.get("leatherWearerSpawning").getAsDouble()) {
					if (entity instanceof Zombie || entity instanceof Skeleton) {
						if (world.getBiome(new BlockPos(x, y, z))
								.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:is_meatury")))) {
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
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
