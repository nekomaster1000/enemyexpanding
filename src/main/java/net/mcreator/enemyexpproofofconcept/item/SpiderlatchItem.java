
package net.mcreator.enemyexpproofofconcept.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.IItemRenderProperties;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.enemyexpproofofconcept.procedures.SpiderlatchTickProcedure;
import net.mcreator.enemyexpproofofconcept.client.model.Modelspiderlatch;

import java.util.Map;
import java.util.List;
import java.util.Collections;

public abstract class SpiderlatchItem extends ArmorItem {
	public SpiderlatchItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 7;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 2, 2, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.parrot.imitate.spider"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.SPIDER_EYE));
			}

			@Override
			public String getName() {
				return "spiderlatch";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SpiderlatchItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("head", new Modelspiderlatch(Minecraft.getInstance().getEntityModels().bakeLayer(Modelspiderlatch.LAYER_LOCATION)).spiderhat, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("Attacks inflict Poison"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enemyexpansion:textures/entities/spiderlatch.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			SpiderlatchTickProcedure.execute(entity);
		}
	}
}
