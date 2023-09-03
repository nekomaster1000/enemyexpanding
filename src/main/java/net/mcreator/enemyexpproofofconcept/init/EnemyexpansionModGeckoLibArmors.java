package net.mcreator.enemyexpproofofconcept.init;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.enemyexpproofofconcept.item.RestingVigorItem;
import net.mcreator.enemyexpproofofconcept.client.renderer.RestingVigorArmorRenderer;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

@Mod.EventBusSubscriber(modid = EnemyexpansionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnemyexpansionModGeckoLibArmors {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			EnemyexpansionModGeckoLibArmors.GeckoLibArmorItems.REGISTRY.register(bus);
		});
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.AddLayers event) {
		GeoArmorRenderer.registerArmorRenderer(RestingVigorItem.class, () -> new RestingVigorArmorRenderer());
	}

	public class GeckoLibArmorItems {
		public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EnemyexpansionMod.MODID);
		public static final RegistryObject<RestingVigorItem> RESTING_VIGOR_HELMET = REGISTRY.register("resting_vigor_helmet", () -> new RestingVigorItem(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

	}
}
