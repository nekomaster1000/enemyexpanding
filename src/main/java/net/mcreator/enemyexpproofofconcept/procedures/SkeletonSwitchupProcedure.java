package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.enemyexpproofofconcept.entity.HuntsmanskeletonEntity;
import net.mcreator.enemyexpproofofconcept.entity.GuardsmanEntity;
import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SkeletonSwitchupProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity sourceentity) {
		execute(null, world, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (Math.random() < (double) BetterConfigConfiguration.SKELETONSWITCHUP.get()) {
			if (sourceentity instanceof Skeleton && !(sourceentity instanceof HuntsmanskeletonEntity)) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BOW) {
					if (Math.random() < 0.2) {
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(Items.STONE_SWORD);
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if (Math.random() < 0.4) {
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(Items.STONE_AXE);
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if (Math.random() < 0.6) {
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(Items.STONE_SHOVEL);
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if (Math.random() < 0.8) {
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(Items.STONE_HOE);
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else if (Math.random() < 0.8) {
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(Items.STONE_PICKAXE);
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
					if (sourceentity instanceof HuntsmanskeletonEntity animatable)
						animatable.setTexture("huntsman_bowless");
					if (sourceentity instanceof GuardsmanEntity animatable)
						animatable.setTexture("guardsman_bowless");
					EnemyexpansionMod.queueServerWork(200, () -> {
						if (sourceentity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(Items.BOW);
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						if (sourceentity instanceof HuntsmanskeletonEntity animatable)
							animatable.setTexture("huntsman");
						if (sourceentity instanceof GuardsmanEntity animatable)
							animatable.setTexture("guardsman");
					});
				}
			}
		}
	}
}
