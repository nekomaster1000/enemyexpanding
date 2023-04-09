package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModParticleTypes;
import net.mcreator.enemyexpproofofconcept.entity.CockatriceEntity;

import java.util.Random;

public class CockatriceHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof CockatriceEntity) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
				entity.setDeltaMovement(new Vec3(0, 0.2, 0));
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
						entity.setDeltaMovement(new Vec3((Mth.nextDouble(new Random(), -1, 1.5)), (Mth.nextDouble(new Random(), 0.3, 1)), (Mth.nextDouble(new Random(), -1, 1.5))));
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 2);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (EnemyexpansionModParticleTypes.FEATHER_PARTICLE.get()), x, (y + 1), z, 10, 0.2, 0.2, 0.2, 0.2);
	}
}
