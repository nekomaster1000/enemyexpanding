package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.Random;

public class StarvedSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			final int _slotid = 0;
			final ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("enemyexpansion:starved_stomach"))).getRandomElement(new Random()).orElseGet(() -> Items.AIR)));
			_setstack.setCount(1);
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandler)
					_modHandler.setStackInSlot(_slotid, _setstack);
			});
		}
	}
}
