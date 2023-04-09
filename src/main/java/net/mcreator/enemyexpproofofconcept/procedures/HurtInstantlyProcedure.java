package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class HurtInstantlyProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		entity.hurt((new DamageSource("anvil")), (float) DoubleArgumentType.getDouble(arguments, "amount"));
	}
}
