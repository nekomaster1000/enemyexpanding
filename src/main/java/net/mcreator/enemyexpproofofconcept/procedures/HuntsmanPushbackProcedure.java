package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.Comparator;

public class HuntsmanPushbackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity == ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null))) {
			entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(sourceentity.getYRot() + 180)) * 1.5 * 1), ((Math.sin(Math.toRadians(0 - sourceentity.getXRot())) + 0.5) * 1), (Math.cos(Math.toRadians(sourceentity.getYRot())) * 2 * 0.5)));
		}
	}
}
