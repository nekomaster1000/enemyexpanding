package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;
import net.mcreator.enemyexpproofofconcept.entity.ZobgoblinEntity;
import net.mcreator.enemyexpproofofconcept.entity.CastSpellEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

import java.util.Iterator;

public class CastSpellRandomEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level.isClientSide())
			immediatesourceentity.discard();
		if (entity instanceof Villager) {
			VillagerGoblinTransformationProcedure.execute(world, x, y, z, entity);
		}
		if (entity instanceof ZombieVillager) {
			EnemyexpansionMod.queueServerWork(2, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 20, 3, 3, 3, 0.5);
				EnemyexpansionMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ZobgoblinEntity(EnemyexpansionModEntities.ZOBGOBLIN.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			});
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.isBlocking() : false) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level;
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new CastSpellEntity(EnemyexpansionModEntities.CAST_SPELL.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 3, 1);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/deflect_arrow"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enemyexpansion:cast_away"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else {
			entity.hurt(DamageSource.MAGIC, 1);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			if (Math.random() < 0.1) {
				entity.setDeltaMovement(new Vec3(0, 1, 0));
			} else if (Math.random() < 0.15) {
				entity.setDeltaMovement(new Vec3(1.5, 1.2, 0));
			} else if (Math.random() < 0.2) {
				entity.setDeltaMovement(new Vec3(0, 1.2, 1.5));
			} else if (Math.random() < 0.25) {
				entity.setDeltaMovement(new Vec3((-1.5), 1.2, 0));
			} else if (Math.random() < 0.3) {
				entity.setDeltaMovement(new Vec3(0, 1.2, (-1.5)));
			} else if (Math.random() < 0.35) {
				entity.setDeltaMovement(new Vec3(1.5, 1.2, 1.5));
			} else if (Math.random() < 0.4) {
				entity.setDeltaMovement(new Vec3((-1.5), 1.2, (-1.5)));
			} else if (Math.random() < 0.75) {
				entity.setDeltaMovement(new Vec3(0, 0.5, 0));
				EnemyexpansionMod.queueServerWork(10, () -> {
					entity.setDeltaMovement(new Vec3(1.5, 0.5, 0));
					EnemyexpansionMod.queueServerWork(10, () -> {
						entity.setDeltaMovement(new Vec3(0, 0.5, 1.5));
						EnemyexpansionMod.queueServerWork(10, () -> {
							entity.setDeltaMovement(new Vec3((-1.5), 0.5, 0));
							EnemyexpansionMod.queueServerWork(10, () -> {
								entity.setDeltaMovement(new Vec3(0, 0.5, (-1.5)));
								EnemyexpansionMod.queueServerWork(10, () -> {
									entity.setDeltaMovement(new Vec3(1.5, 0.5, 1.5));
									EnemyexpansionMod.queueServerWork(10, () -> {
										entity.setDeltaMovement(new Vec3((-1.5), 0.5, (-1.5)));
									});
								});
							});
						});
					});
				});
			} else if (Math.random() < 0.99) {
				entity.setDeltaMovement(new Vec3(0, 1.5, 0));
			}
		}
	}
}
