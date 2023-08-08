
package net.mcreator.enemyexpproofofconcept.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModItems;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class SputterEntityProjectile extends AbstractArrow implements ItemSupplier {
	public SputterEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(EnemyexpansionModEntities.SPUTTER_PROJECTILE.get(), world);
	}

	public SputterEntityProjectile(EntityType<? extends SputterEntityProjectile> type, Level world) {
		super(type, world);
	}

	public SputterEntityProjectile(EntityType<? extends SputterEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public SputterEntityProjectile(EntityType<? extends SputterEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(EnemyexpansionModItems.SPUTTER_FIRE_CHARGE.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(EnemyexpansionModItems.SPUTTER_FIRE_CHARGE.get());
	}
}
