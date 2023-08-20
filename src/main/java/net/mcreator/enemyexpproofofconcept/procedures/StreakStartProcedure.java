package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModMobEffects;
import net.mcreator.enemyexpproofofconcept.configuration.BetterConfigConfiguration;

import javax.annotation.Nullable;

import java.util.Optional;

@Mod.EventBusSubscriber
public class StreakStartProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		execute(null, world, x, y, z, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		String max_health = "";
		String attribute_command = "";
		if (BetterConfigConfiguration.KILLSTREAKEFFECT.get() == true) {
			if (sourceentity instanceof Player) {
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (sourceentity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.STREAK.get(), 200, 0, (false), (false)));
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 10);
			}
			if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(EnemyexpansionModMobEffects.STREAK.get()) : false) {
				if ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(EnemyexpansionModMobEffects.STREAK.get()) ? _livEnt.getEffect(EnemyexpansionModMobEffects.STREAK.get()).getAmplifier() : 0) >= 0) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(EnemyexpansionModMobEffects.STREAK.get(), 200, 1, (false), (true)));
					if (world instanceof ServerLevel _level && _level.getServer() != null) {
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("enemyexpansion:killstreak_effect"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null));
					}
				}
			}
		}
	}
}
