
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.enemyexpproofofconcept.world.inventory.StarvedGUIMenu;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class EnemyexpansionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EnemyexpansionMod.MODID);
	public static final RegistryObject<MenuType<StarvedGUIMenu>> STARVED_GUI = REGISTRY.register("starved_gui", () -> IForgeMenuType.create(StarvedGUIMenu::new));
}
