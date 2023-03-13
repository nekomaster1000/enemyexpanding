package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Random;

public class SilverkingDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (9); index0++) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + Mth.nextDouble(new Random(), 0, 1)), (y + Mth.nextDouble(new Random(), 0, 1)), (z + Mth.nextDouble(new Random(), 0, 1))),
						Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "/summon silverfish ~ ~ ~ {Health:1f}");
		}
	}
}
