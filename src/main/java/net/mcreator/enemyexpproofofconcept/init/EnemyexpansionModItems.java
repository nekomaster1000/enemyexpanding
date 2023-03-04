
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.enemyexpproofofconcept.item.WaspStingProjectileItem;
import net.mcreator.enemyexpproofofconcept.item.TrollfaceItem;
import net.mcreator.enemyexpproofofconcept.item.TrollSpitItem;
import net.mcreator.enemyexpproofofconcept.item.TrollInvincibleItem;
import net.mcreator.enemyexpproofofconcept.item.SuspiciousSliceItem;
import net.mcreator.enemyexpproofofconcept.item.SprintshortsItem;
import net.mcreator.enemyexpproofofconcept.item.SpiderlatchItem;
import net.mcreator.enemyexpproofofconcept.item.SpectralItem;
import net.mcreator.enemyexpproofofconcept.item.SlugvestItem;
import net.mcreator.enemyexpproofofconcept.item.SlimeheadItem;
import net.mcreator.enemyexpproofofconcept.item.SlimeballThrowItem;
import net.mcreator.enemyexpproofofconcept.item.SilverhatItem;
import net.mcreator.enemyexpproofofconcept.item.PreposterousPortionItem;
import net.mcreator.enemyexpproofofconcept.item.PheromoneProjectileItem;
import net.mcreator.enemyexpproofofconcept.item.PhantasmItem;
import net.mcreator.enemyexpproofofconcept.item.MiniWitherItem;
import net.mcreator.enemyexpproofofconcept.item.MeatureMeatballItem;
import net.mcreator.enemyexpproofofconcept.item.MeatheadArmorItem;
import net.mcreator.enemyexpproofofconcept.item.KillstickItem;
import net.mcreator.enemyexpproofofconcept.item.HuntsmanPunchItem;
import net.mcreator.enemyexpproofofconcept.item.HorseheadItem;
import net.mcreator.enemyexpproofofconcept.item.HealingGooStewItem;
import net.mcreator.enemyexpproofofconcept.item.HealingGooItemItem;
import net.mcreator.enemyexpproofofconcept.item.HealingGooItem;
import net.mcreator.enemyexpproofofconcept.item.HeadbiterItem;
import net.mcreator.enemyexpproofofconcept.item.GhoulSpitItem;
import net.mcreator.enemyexpproofofconcept.item.GhoulSlashItem;
import net.mcreator.enemyexpproofofconcept.item.GallantSwingsItem;
import net.mcreator.enemyexpproofofconcept.item.FrigidTouchProjectileItem;
import net.mcreator.enemyexpproofofconcept.item.FlutterfliersItem;
import net.mcreator.enemyexpproofofconcept.item.EnemyMeleeProjectileItem;
import net.mcreator.enemyexpproofofconcept.item.CrawlerExplosiveItem;
import net.mcreator.enemyexpproofofconcept.item.CinderSliceItem;
import net.mcreator.enemyexpproofofconcept.item.CinderScrapItem;
import net.mcreator.enemyexpproofofconcept.item.CinderHelmItem;
import net.mcreator.enemyexpproofofconcept.item.CinderFireChargeItem;
import net.mcreator.enemyexpproofofconcept.item.CastSpellItem;
import net.mcreator.enemyexpproofofconcept.item.BullSkullItem;
import net.mcreator.enemyexpproofofconcept.item.BrutishItem;
import net.mcreator.enemyexpproofofconcept.item.BouncerKickProjectileItem;
import net.mcreator.enemyexpproofofconcept.item.BanemaskItem;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

public class EnemyexpansionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EnemyexpansionMod.MODID);
	public static final RegistryObject<Item> MEATURE = REGISTRY.register("meature_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.MEATURE, -6730933, -5081483, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TARANTULA = REGISTRY.register("tarantula_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.TARANTULA, -8497616, -7373714,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCORPION = REGISTRY.register("scorpion_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.SCORPION, -11782091, -7439758,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HUNTSMANSKELETON = REGISTRY.register("huntsmanskeleton_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.HUNTSMANSKELETON, -2894893, -10273499,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WASP = REGISTRY.register("wasp_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.WASP, -1195197, -830911, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SPRINTER = REGISTRY.register("sprinter_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.SPRINTER, -14269861, -9273797,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SLUGGER = REGISTRY.register("slugger_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.SLUGGER, -12244867, -10910598,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SENIOR = REGISTRY.register("senior_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.SENIOR, -14997182, -13476771, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> EQUESTRIAN = REGISTRY.register("equestrian_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.EQUESTRIAN, -7711442, -7425636,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FRIGID = REGISTRY.register("frigid_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.FRIGID, -16751762, -11821426, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LADYBUG = REGISTRY.register("ladybug_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.LADYBUG, -7266027, -15396077, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ZADYBUG = REGISTRY.register("zadybug_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.ZADYBUG, -4627929, -15396077, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SPECTRE = REGISTRY.register("spectre_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.SPECTRE, -16777216, -14278357,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GHOUL = REGISTRY.register("ghoul_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.GHOUL, -8564393, -6048317, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CINDER = REGISTRY.register("cinder_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.CINDER, -238848, -11132, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GALLANT = REGISTRY.register("gallant_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.GALLANT, -10192776, -3332032, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GOBLIN = REGISTRY.register("goblin_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.GOBLIN, -12038042, -11433587, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BOUNCER = REGISTRY.register("bouncer_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.BOUNCER, -10656906, -11433587,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RANCHER = REGISTRY.register("rancher_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.RANCHER, -8664222, -11433587, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BAKER = REGISTRY.register("baker_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.BAKER, -4499427, -11433587, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ERRANT = REGISTRY.register("errant_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.ERRANT, -8284282, -11433587, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CASTER = REGISTRY.register("caster_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.CASTER, -3426768, -11433587, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GABBLE = REGISTRY.register("gabble_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.GABBLE, -15269838, -11433587, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ZOBGOBLIN = REGISTRY.register("zobgoblin_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.ZOBGOBLIN, -12038042, -4993836,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CAKEROVER = REGISTRY.register("cakerover_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.CAKEROVER, -4499427, -133928, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PETRIMAN = REGISTRY.register("petriman_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.PETRIMAN, -10067881, -8421505,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PETRICRAWLER = REGISTRY.register("petricrawler_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.PETRICRAWLER, -10067881, -10856102,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PETRIBOULDER = REGISTRY.register("petriboulder_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.PETRIBOULDER, -10067881, -13356492,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SILVERKING = REGISTRY.register("silverking_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.SILVERKING, -8947849, -6247520,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CRAWLER = REGISTRY.register("crawler_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.CRAWLER, -9453258, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> INTRUDER = REGISTRY.register("intruder_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.INTRUDER, -14918613, -16777216,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TROLL = REGISTRY.register("troll_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.TROLL, -2172995, -2902212, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> VAMPIRE = REGISTRY.register("vampire_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.VAMPIRE, -12699048, -9014373, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BITER = REGISTRY.register("biter_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.BITER, -7238220, -4277028, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PROPELLER = REGISTRY.register("propeller_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.PROPELLER, -7048125, -6052694,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FLUTTERFLY = REGISTRY.register("flutterfly_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.FLUTTERFLY, -10744820, -1506043,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BOAR = REGISTRY.register("boar_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.BOAR, -10793658, -6122617, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BULL = REGISTRY.register("bull_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.BULL, -14278628, -10461088, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RAM = REGISTRY.register("ram_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.RAM, -526345, -11123407, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ROOSTER = REGISTRY.register("rooster_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.ROOSTER, -156144, -16746667, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PHEROMONE_PROJECTILE = REGISTRY.register("pheromone_projectile", () -> new PheromoneProjectileItem());
	public static final RegistryObject<Item> HEALING_GOO_ITEM = REGISTRY.register("healing_goo_item", () -> new HealingGooItemItem());
	public static final RegistryObject<Item> MEATHEAD_ARMOR_HELMET = REGISTRY.register("meathead_armor_helmet", () -> new MeatheadArmorItem.Helmet());
	public static final RegistryObject<Item> SLUGVEST_CHESTPLATE = REGISTRY.register("slugvest_chestplate", () -> new SlugvestItem.Chestplate());
	public static final RegistryObject<Item> SPRINTSHORTS_LEGGINGS = REGISTRY.register("sprintshorts_leggings",
			() -> new SprintshortsItem.Leggings());
	public static final RegistryObject<Item> PHANTASM_HELMET = REGISTRY.register("phantasm_helmet", () -> new PhantasmItem.Helmet());
	public static final RegistryObject<Item> PHANTASM_CHESTPLATE = REGISTRY.register("phantasm_chestplate", () -> new PhantasmItem.Chestplate());
	public static final RegistryObject<Item> SLIMEHEAD_HELMET = REGISTRY.register("slimehead_helmet", () -> new SlimeheadItem.Helmet());
	public static final RegistryObject<Item> CINDER_HELM_HELMET = REGISTRY.register("cinder_helm_helmet", () -> new CinderHelmItem.Helmet());
	public static final RegistryObject<Item> HEADBITER_HELMET = REGISTRY.register("headbiter_helmet", () -> new HeadbiterItem.Helmet());
	public static final RegistryObject<Item> SILVERHAT_HELMET = REGISTRY.register("silverhat_helmet", () -> new SilverhatItem.Helmet());
	public static final RegistryObject<Item> SPIDERLATCH_HELMET = REGISTRY.register("spiderlatch_helmet", () -> new SpiderlatchItem.Helmet());
	public static final RegistryObject<Item> TROLLFACE_HELMET = REGISTRY.register("trollface_helmet", () -> new TrollfaceItem.Helmet());
	public static final RegistryObject<Item> SPECTRAL_HELMET = REGISTRY.register("spectral_helmet", () -> new SpectralItem.Helmet());
	public static final RegistryObject<Item> SPECTRAL_CHESTPLATE = REGISTRY.register("spectral_chestplate", () -> new SpectralItem.Chestplate());
	public static final RegistryObject<Item> BULL_SKULL_HELMET = REGISTRY.register("bull_skull_helmet", () -> new BullSkullItem.Helmet());
	public static final RegistryObject<Item> FLUTTERFLIERS_CHESTPLATE = REGISTRY.register("flutterfliers_chestplate",
			() -> new FlutterfliersItem.Chestplate());
	public static final RegistryObject<Item> CINDER_SCRAP = REGISTRY.register("cinder_scrap", () -> new CinderScrapItem());
	public static final RegistryObject<Item> MEATURE_MEATBALL = REGISTRY.register("meature_meatball", () -> new MeatureMeatballItem());
	public static final RegistryObject<Item> HEALING_GOO_SOUP = REGISTRY.register("healing_goo_soup", () -> new HealingGooStewItem());
	public static final RegistryObject<Item> SUSPICIOUS_SLICE = REGISTRY.register("suspicious_slice", () -> new SuspiciousSliceItem());
	public static final RegistryObject<Item> PREPOSTEROUS_PORTION = REGISTRY.register("preposterous_portion", () -> new PreposterousPortionItem());
	public static final RegistryObject<Item> HUNTSMAN_PUNCH = REGISTRY.register("huntsman_punch", () -> new HuntsmanPunchItem());
	public static final RegistryObject<Item> ENEMY_MELEE_PROJECTILE = REGISTRY.register("enemy_melee_projectile",
			() -> new EnemyMeleeProjectileItem());
	public static final RegistryObject<Item> WASP_STING_PROJECTILE = REGISTRY.register("wasp_sting_projectile", () -> new WaspStingProjectileItem());
	public static final RegistryObject<Item> FRIGID_TOUCH_PROJECTILE = REGISTRY.register("frigid_touch_projectile",
			() -> new FrigidTouchProjectileItem());
	public static final RegistryObject<Item> HEALING_GOO = REGISTRY.register("healing_goo", () -> new HealingGooItem());
	public static final RegistryObject<Item> KILLSTICK = REGISTRY.register("killstick", () -> new KillstickItem());
	public static final RegistryObject<Item> GHOUL_SLASH = REGISTRY.register("ghoul_slash", () -> new GhoulSlashItem());
	public static final RegistryObject<Item> GHOUL_SPIT = REGISTRY.register("ghoul_spit", () -> new GhoulSpitItem());
	public static final RegistryObject<Item> CINDER_SLICE = REGISTRY.register("cinder_slice", () -> new CinderSliceItem());
	public static final RegistryObject<Item> CINDER_FIRE_CHARGE = REGISTRY.register("cinder_fire_charge", () -> new CinderFireChargeItem());
	public static final RegistryObject<Item> GALLANT_SWINGS = REGISTRY.register("gallant_swings", () -> new GallantSwingsItem());
	public static final RegistryObject<Item> BOUNCER_KICK_PROJECTILE = REGISTRY.register("bouncer_kick_projectile",
			() -> new BouncerKickProjectileItem());
	public static final RegistryObject<Item> SLIMEBALL_THROW = REGISTRY.register("slimeball_throw", () -> new SlimeballThrowItem());
	public static final RegistryObject<Item> CAST_SPELL = REGISTRY.register("cast_spell", () -> new CastSpellItem());
	public static final RegistryObject<Item> CRAWLER_EXPLOSIVE = REGISTRY.register("crawler_explosive", () -> new CrawlerExplosiveItem());
	public static final RegistryObject<Item> TROLL_INVINCIBLE = REGISTRY.register("troll_invincible", () -> new TrollInvincibleItem());
	public static final RegistryObject<Item> TROLL_SPIT = REGISTRY.register("troll_spit", () -> new TrollSpitItem());
	public static final RegistryObject<Item> HORSEHEAD_HELMET = REGISTRY.register("horsehead_helmet", () -> new HorseheadItem.Helmet());
	public static final RegistryObject<Item> MINI_WITHER_HELMET = REGISTRY.register("mini_wither_helmet", () -> new MiniWitherItem.Helmet());
	public static final RegistryObject<Item> BRUTISH_CHESTPLATE = REGISTRY.register("brutish_chestplate", () -> new BrutishItem.Chestplate());
	public static final RegistryObject<Item> WOLFSBANE = REGISTRY.register("wolfsbane_spawn_egg",
			() -> new ForgeSpawnEggItem(EnemyexpansionModEntities.WOLFSBANE, -10730918, -462600,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BANEMASK_HELMET = REGISTRY.register("banemask_helmet", () -> new BanemaskItem.Helmet());
}
