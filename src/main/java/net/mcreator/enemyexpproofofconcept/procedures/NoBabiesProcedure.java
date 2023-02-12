package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class NoBabiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)
				&& entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("enemyexpansion:zombievariants")))) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else if (entity.isInWall()) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
