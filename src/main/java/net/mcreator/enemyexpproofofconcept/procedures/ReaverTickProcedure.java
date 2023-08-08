package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class ReaverTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.2) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Pillager) {
						entityiterator.startRiding(entity);
					}
				}
			}
		}
		if (Math.random() < 0.005) {
			entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + Mth.nextDouble(new Random(), 90, 270))) * 0.7), 0, (Math.cos(Math.toRadians(entity.getYRot())) * 0.7)));
		}
	}
}
