package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.enemyexpproofofconcept.entity.SluggerEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class SluggerzombieEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!entity.isOnFire() && (sourceentity instanceof LivingEntity || sourceentity instanceof Arrow) && !(sourceentity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 24, 6));
			EnemyexpansionMod.queueServerWork(14, () -> {
				if (entity instanceof SluggerEntity) {
					((SluggerEntity) entity).setAnimation("sprint");
				}
			});
		}
	}
}
