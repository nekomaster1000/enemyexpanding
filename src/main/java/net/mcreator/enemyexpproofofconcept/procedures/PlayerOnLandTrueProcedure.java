package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class PlayerOnLandTrueProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean advancementCheck = false;
		if (advancementCheck == true) {
			return true;
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player) {
					if (entityiterator.isOnGround() && !entityiterator.isInWaterOrBubble()) {
						advancementCheck = true;
					} else {
						advancementCheck = false;
					}
				}
			}
		}
		return false;
	}
}
