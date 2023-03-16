package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Random;

public class GladiladBounceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.WATER)) {
			if (Math.random() < 0.06) {
				entity.setDeltaMovement(new Vec3((Mth.nextDouble(new Random(), -1, 1)), (Mth.nextDouble(new Random(), 0.6, 1.2)), (Mth.nextDouble(new Random(), -1, 1))));
			}
		}
		if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER) && !entity.isInWater()) {
			if (Math.random() < 0.02) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
							("/summon enemyexpansion:gladius ~ ~ ~ {Health:20f}".replace("{Health:20f}", "{Health:" + ("" + (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) + "f}")));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SQUID_INK, x, y, z, 30, 1, 1, 1, 0.3);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
