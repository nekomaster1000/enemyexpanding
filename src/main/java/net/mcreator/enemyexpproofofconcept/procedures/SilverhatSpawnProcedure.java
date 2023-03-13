package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModItems;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class SilverhatSpawnProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == EnemyexpansionModItems.SILVERHAT_HELMET.get() && entity instanceof Monster) {
			if (!(sourceentity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				for (int index0 = 0; index0 < (int) (Mth.nextDouble(new Random(), 0, 3)); index0++) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon silverfish ~ ~ ~ {Health:2f}");
				}
			}
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == EnemyexpansionModItems.SILVERHAT_HELMET.get() && entity instanceof Player) {
			for (int index1 = 0; index1 < (int) (Mth.nextDouble(new Random(), 1, 3)); index1++) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
							"/summon enemyexpansion:silverpet ~ ~ ~ {Health:4f}");
			}
		}
	}
}
