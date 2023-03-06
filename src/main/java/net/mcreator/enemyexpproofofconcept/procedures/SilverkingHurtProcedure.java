package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.enemyexpproofofconcept.entity.SilverkingEntity;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class SilverkingHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(),
					event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof SilverkingEntity && entity instanceof Player) {
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
					for (int index0 = 0; index0 < (int) (Mth.nextDouble(new Random(), 0, 3)); index0++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "",
											new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon silverfish ~ ~ ~ {Health:1f}");
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 6);
		}
		if (sourceentity instanceof Player && !(sourceentity instanceof Player _plr ? _plr.getAbilities().instabuild : false)
				&& entity instanceof SilverkingEntity) {
			if (Math.random() < 0.2) {
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
						for (int index1 = 0; index1 < (int) (Mth.nextDouble(new Random(), 0, 3)); index1++) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "",
												new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon silverfish ~ ~ ~ {Health:1f}");
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 6);
			}
		}
	}
}
