
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.enemyexpproofofconcept.entity.ZobgoblinEntity;
import net.mcreator.enemyexpproofofconcept.entity.ZadybugEntity;
import net.mcreator.enemyexpproofofconcept.entity.WolfsbaneEntity;
import net.mcreator.enemyexpproofofconcept.entity.WaspStingProjectileEntity;
import net.mcreator.enemyexpproofofconcept.entity.WaspEntity;
import net.mcreator.enemyexpproofofconcept.entity.VampireEntity;
import net.mcreator.enemyexpproofofconcept.entity.TrollSpitEntity;
import net.mcreator.enemyexpproofofconcept.entity.TrollInvincibleEntity;
import net.mcreator.enemyexpproofofconcept.entity.TrollEntity;
import net.mcreator.enemyexpproofofconcept.entity.TarantulaEntity;
import net.mcreator.enemyexpproofofconcept.entity.SprinterEntity;
import net.mcreator.enemyexpproofofconcept.entity.SpectreEntity;
import net.mcreator.enemyexpproofofconcept.entity.SluggerEntity;
import net.mcreator.enemyexpproofofconcept.entity.SlimeballThrowEntity;
import net.mcreator.enemyexpproofofconcept.entity.SilverpetEntity;
import net.mcreator.enemyexpproofofconcept.entity.SilverkingEntity;
import net.mcreator.enemyexpproofofconcept.entity.SeniorEntity;
import net.mcreator.enemyexpproofofconcept.entity.ScorpionEntity;
import net.mcreator.enemyexpproofofconcept.entity.RoosterEntity;
import net.mcreator.enemyexpproofofconcept.entity.RancherEntity;
import net.mcreator.enemyexpproofofconcept.entity.RamshearedEntity;
import net.mcreator.enemyexpproofofconcept.entity.RamEntity;
import net.mcreator.enemyexpproofofconcept.entity.PropellerEntity;
import net.mcreator.enemyexpproofofconcept.entity.PheromoneSummonEntity;
import net.mcreator.enemyexpproofofconcept.entity.PheromoneProjectileEntity;
import net.mcreator.enemyexpproofofconcept.entity.PetrimanEntity;
import net.mcreator.enemyexpproofofconcept.entity.PetrifiedtrollEntity;
import net.mcreator.enemyexpproofofconcept.entity.PetricrawlerEntity;
import net.mcreator.enemyexpproofofconcept.entity.PetriboulderEntity;
import net.mcreator.enemyexpproofofconcept.entity.MeatureEntity;
import net.mcreator.enemyexpproofofconcept.entity.LadybugEntity;
import net.mcreator.enemyexpproofofconcept.entity.InvisicreeperEntity;
import net.mcreator.enemyexpproofofconcept.entity.IntruderEntity;
import net.mcreator.enemyexpproofofconcept.entity.HuntsmanskeletonEntity;
import net.mcreator.enemyexpproofofconcept.entity.HuntsmanPunchEntity;
import net.mcreator.enemyexpproofofconcept.entity.HealingGooEntity;
import net.mcreator.enemyexpproofofconcept.entity.GoblinFearEntity;
import net.mcreator.enemyexpproofofconcept.entity.GoblinEntity;
import net.mcreator.enemyexpproofofconcept.entity.GhoulSpitEntity;
import net.mcreator.enemyexpproofofconcept.entity.GhoulSlashEntity;
import net.mcreator.enemyexpproofofconcept.entity.GhoulEntity;
import net.mcreator.enemyexpproofofconcept.entity.GallantSwingsEntity;
import net.mcreator.enemyexpproofofconcept.entity.GallantEntity;
import net.mcreator.enemyexpproofofconcept.entity.GabbleEntity;
import net.mcreator.enemyexpproofofconcept.entity.FrigidTouchProjectileEntity;
import net.mcreator.enemyexpproofofconcept.entity.FrigidEntity;
import net.mcreator.enemyexpproofofconcept.entity.FlutterflyEntity;
import net.mcreator.enemyexpproofofconcept.entity.ErrantEntity;
import net.mcreator.enemyexpproofofconcept.entity.EquestrianEntity;
import net.mcreator.enemyexpproofofconcept.entity.EnemyMeleeProjectileEntity;
import net.mcreator.enemyexpproofofconcept.entity.CrawlerExplosiveEntity;
import net.mcreator.enemyexpproofofconcept.entity.CrawlerEntity;
import net.mcreator.enemyexpproofofconcept.entity.CinderSliceEntity;
import net.mcreator.enemyexpproofofconcept.entity.CinderFireChargeEntity;
import net.mcreator.enemyexpproofofconcept.entity.CinderEntity;
import net.mcreator.enemyexpproofofconcept.entity.CasterEntity;
import net.mcreator.enemyexpproofofconcept.entity.CastSpellEntity;
import net.mcreator.enemyexpproofofconcept.entity.CakeroverEntity;
import net.mcreator.enemyexpproofofconcept.entity.BullEntity;
import net.mcreator.enemyexpproofofconcept.entity.BouncerKickProjectileEntity;
import net.mcreator.enemyexpproofofconcept.entity.BouncerEntity;
import net.mcreator.enemyexpproofofconcept.entity.BoarEntity;
import net.mcreator.enemyexpproofofconcept.entity.BiterEntity;
import net.mcreator.enemyexpproofofconcept.entity.BanedasherEntity;
import net.mcreator.enemyexpproofofconcept.entity.BakerEntity;
import net.mcreator.enemyexpproofofconcept.EnemyexpansionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnemyexpansionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, EnemyexpansionMod.MODID);
	public static final RegistryObject<EntityType<MeatureEntity>> MEATURE = register("meature",
			EntityType.Builder.<MeatureEntity>of(MeatureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MeatureEntity::new).fireImmune().sized(0.6f, 0.95f));
	public static final RegistryObject<EntityType<TarantulaEntity>> TARANTULA = register("tarantula",
			EntityType.Builder.<TarantulaEntity>of(TarantulaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TarantulaEntity::new)

					.sized(1.5f, 1.1f));
	public static final RegistryObject<EntityType<ScorpionEntity>> SCORPION = register("scorpion",
			EntityType.Builder.<ScorpionEntity>of(ScorpionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ScorpionEntity::new)

					.sized(1.5f, 1.1f));
	public static final RegistryObject<EntityType<HuntsmanskeletonEntity>> HUNTSMANSKELETON = register("huntsmanskeleton",
			EntityType.Builder.<HuntsmanskeletonEntity>of(HuntsmanskeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HuntsmanskeletonEntity::new)

					.sized(0.7f, 1.95f));
	public static final RegistryObject<EntityType<WaspEntity>> WASP = register("wasp",
			EntityType.Builder.<WaspEntity>of(WaspEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WaspEntity::new)

					.sized(0.45f, 1.6f));
	public static final RegistryObject<EntityType<PheromoneSummonEntity>> PHEROMONE_SUMMON = register("pheromone_summon",
			EntityType.Builder.<PheromoneSummonEntity>of(PheromoneSummonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PheromoneSummonEntity::new)

					.sized(0.45f, 1.6f));
	public static final RegistryObject<EntityType<SprinterEntity>> SPRINTER = register("sprinter",
			EntityType.Builder.<SprinterEntity>of(SprinterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SprinterEntity::new)

					.sized(0.7f, 1.95f));
	public static final RegistryObject<EntityType<SluggerEntity>> SLUGGER = register("slugger",
			EntityType.Builder.<SluggerEntity>of(SluggerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SluggerEntity::new)

					.sized(0.8f, 1.8f));
	public static final RegistryObject<EntityType<SeniorEntity>> SENIOR = register("senior",
			EntityType.Builder.<SeniorEntity>of(SeniorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SeniorEntity::new)

					.sized(0.9f, 1.8f));
	public static final RegistryObject<EntityType<EquestrianEntity>> EQUESTRIAN = register("equestrian",
			EntityType.Builder.<EquestrianEntity>of(EquestrianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EquestrianEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FrigidEntity>> FRIGID = register("frigid",
			EntityType.Builder.<FrigidEntity>of(FrigidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FrigidEntity::new).fireImmune().sized(0.8f, 0.95f));
	public static final RegistryObject<EntityType<LadybugEntity>> LADYBUG = register("ladybug",
			EntityType.Builder.<LadybugEntity>of(LadybugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(LadybugEntity::new)

					.sized(0.9f, 0.95f));
	public static final RegistryObject<EntityType<ZadybugEntity>> ZADYBUG = register("zadybug",
			EntityType.Builder.<ZadybugEntity>of(ZadybugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ZadybugEntity::new)

					.sized(0.9f, 0.95f));
	public static final RegistryObject<EntityType<SpectreEntity>> SPECTRE = register("spectre",
			EntityType.Builder.<SpectreEntity>of(SpectreEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SpectreEntity::new)

					.sized(0.4f, 1.95f));
	public static final RegistryObject<EntityType<GhoulEntity>> GHOUL = register("ghoul",
			EntityType.Builder.<GhoulEntity>of(GhoulEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GhoulEntity::new)

					.sized(0.8f, 2.2f));
	public static final RegistryObject<EntityType<CinderEntity>> CINDER = register("cinder",
			EntityType.Builder.<CinderEntity>of(CinderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CinderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GallantEntity>> GALLANT = register("gallant",
			EntityType.Builder.<GallantEntity>of(GallantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GallantEntity::new)

					.sized(0.8f, 1.95f));
	public static final RegistryObject<EntityType<GoblinEntity>> GOBLIN = register("goblin",
			EntityType.Builder.<GoblinEntity>of(GoblinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GoblinEntity::new)

					.sized(0.7f, 1.65f));
	public static final RegistryObject<EntityType<BouncerEntity>> BOUNCER = register("bouncer",
			EntityType.Builder.<BouncerEntity>of(BouncerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BouncerEntity::new)

					.sized(0.7f, 1.65f));
	public static final RegistryObject<EntityType<RancherEntity>> RANCHER = register("rancher",
			EntityType.Builder.<RancherEntity>of(RancherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RancherEntity::new)

					.sized(0.7f, 1.65f));
	public static final RegistryObject<EntityType<BakerEntity>> BAKER = register("baker",
			EntityType.Builder.<BakerEntity>of(BakerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BakerEntity::new)

					.sized(0.7f, 1.65f));
	public static final RegistryObject<EntityType<ErrantEntity>> ERRANT = register("errant",
			EntityType.Builder.<ErrantEntity>of(ErrantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ErrantEntity::new)

					.sized(0.7f, 1.65f));
	public static final RegistryObject<EntityType<CasterEntity>> CASTER = register("caster",
			EntityType.Builder.<CasterEntity>of(CasterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CasterEntity::new)

					.sized(0.7f, 1.65f));
	public static final RegistryObject<EntityType<GabbleEntity>> GABBLE = register("gabble",
			EntityType.Builder.<GabbleEntity>of(GabbleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GabbleEntity::new)

					.sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<ZobgoblinEntity>> ZOBGOBLIN = register("zobgoblin",
			EntityType.Builder.<ZobgoblinEntity>of(ZobgoblinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZobgoblinEntity::new)

					.sized(0.7f, 1.65f));
	public static final RegistryObject<EntityType<CakeroverEntity>> CAKEROVER = register("cakerover",
			EntityType.Builder.<CakeroverEntity>of(CakeroverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CakeroverEntity::new)

					.sized(0.9f, 0.7f));
	public static final RegistryObject<EntityType<PetrimanEntity>> PETRIMAN = register("petriman",
			EntityType.Builder.<PetrimanEntity>of(PetrimanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PetrimanEntity::new).fireImmune().sized(0.6f, 1.75f));
	public static final RegistryObject<EntityType<PetricrawlerEntity>> PETRICRAWLER = register("petricrawler",
			EntityType.Builder.<PetricrawlerEntity>of(PetricrawlerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PetricrawlerEntity::new).fireImmune().sized(0.95f, 1.1f));
	public static final RegistryObject<EntityType<PetriboulderEntity>> PETRIBOULDER = register("petriboulder",
			EntityType.Builder.<PetriboulderEntity>of(PetriboulderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PetriboulderEntity::new).fireImmune().sized(0.6f, 1.6f));
	public static final RegistryObject<EntityType<SilverkingEntity>> SILVERKING = register("silverking",
			EntityType.Builder.<SilverkingEntity>of(SilverkingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SilverkingEntity::new)

					.sized(0.9f, 0.95f));
	public static final RegistryObject<EntityType<CrawlerEntity>> CRAWLER = register("crawler",
			EntityType.Builder.<CrawlerEntity>of(CrawlerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CrawlerEntity::new)

					.sized(0.95f, 0.95f));
	public static final RegistryObject<EntityType<IntruderEntity>> INTRUDER = register("intruder",
			EntityType.Builder.<IntruderEntity>of(IntruderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(IntruderEntity::new)

					.sized(0.9f, 1.75f));
	public static final RegistryObject<EntityType<TrollEntity>> TROLL = register("troll",
			EntityType.Builder.<TrollEntity>of(TrollEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TrollEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GoblinFearEntity>> GOBLIN_FEAR = register("goblin_fear",
			EntityType.Builder.<GoblinFearEntity>of(GoblinFearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(GoblinFearEntity::new)

					.sized(0.01f, 0.01f));
	public static final RegistryObject<EntityType<SilverpetEntity>> SILVERPET = register("silverpet",
			EntityType.Builder.<SilverpetEntity>of(SilverpetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SilverpetEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<InvisicreeperEntity>> INVISICREEPER = register("invisicreeper",
			EntityType.Builder.<InvisicreeperEntity>of(InvisicreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(InvisicreeperEntity::new)

					.sized(0f, 0f));
	public static final RegistryObject<EntityType<VampireEntity>> VAMPIRE = register("vampire",
			EntityType.Builder.<VampireEntity>of(VampireEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(VampireEntity::new)

					.sized(0.7f, 1.95f));
	public static final RegistryObject<EntityType<BiterEntity>> BITER = register("biter",
			EntityType.Builder.<BiterEntity>of(BiterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BiterEntity::new)

					.sized(0.9f, 1.95f));
	public static final RegistryObject<EntityType<PetrifiedtrollEntity>> PETRIFIEDTROLL = register("petrifiedtroll",
			EntityType.Builder.<PetrifiedtrollEntity>of(PetrifiedtrollEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PetrifiedtrollEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PropellerEntity>> PROPELLER = register("propeller",
			EntityType.Builder.<PropellerEntity>of(PropellerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PropellerEntity::new).fireImmune().sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<FlutterflyEntity>> FLUTTERFLY = register("flutterfly",
			EntityType.Builder.<FlutterflyEntity>of(FlutterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlutterflyEntity::new)

					.sized(0.6f, 2.8f));
	public static final RegistryObject<EntityType<BoarEntity>> BOAR = register("boar",
			EntityType.Builder.<BoarEntity>of(BoarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BoarEntity::new)

					.sized(0.95f, 0.65f));
	public static final RegistryObject<EntityType<BullEntity>> BULL = register("bull",
			EntityType.Builder.<BullEntity>of(BullEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BullEntity::new)

					.sized(1.3f, 1.55f));
	public static final RegistryObject<EntityType<RamEntity>> RAM = register("ram",
			EntityType.Builder.<RamEntity>of(RamEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RamEntity::new)

					.sized(1.3f, 1.55f));
	public static final RegistryObject<EntityType<RoosterEntity>> ROOSTER = register("rooster",
			EntityType.Builder.<RoosterEntity>of(RoosterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RoosterEntity::new)

					.sized(0.95f, 0.95f));
	public static final RegistryObject<EntityType<RamshearedEntity>> RAMSHEARED = register("ramsheared",
			EntityType.Builder.<RamshearedEntity>of(RamshearedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RamshearedEntity::new)

					.sized(1.3f, 1.55f));
	public static final RegistryObject<EntityType<PheromoneProjectileEntity>> PHEROMONE_PROJECTILE = register("projectile_pheromone_projectile",
			EntityType.Builder.<PheromoneProjectileEntity>of(PheromoneProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(PheromoneProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HuntsmanPunchEntity>> HUNTSMAN_PUNCH = register("projectile_huntsman_punch",
			EntityType.Builder.<HuntsmanPunchEntity>of(HuntsmanPunchEntity::new, MobCategory.MISC).setCustomClientFactory(HuntsmanPunchEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnemyMeleeProjectileEntity>> ENEMY_MELEE_PROJECTILE = register("projectile_enemy_melee_projectile",
			EntityType.Builder.<EnemyMeleeProjectileEntity>of(EnemyMeleeProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(EnemyMeleeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaspStingProjectileEntity>> WASP_STING_PROJECTILE = register("projectile_wasp_sting_projectile",
			EntityType.Builder.<WaspStingProjectileEntity>of(WaspStingProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(WaspStingProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FrigidTouchProjectileEntity>> FRIGID_TOUCH_PROJECTILE = register(
			"projectile_frigid_touch_projectile",
			EntityType.Builder.<FrigidTouchProjectileEntity>of(FrigidTouchProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(FrigidTouchProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HealingGooEntity>> HEALING_GOO = register("projectile_healing_goo",
			EntityType.Builder.<HealingGooEntity>of(HealingGooEntity::new, MobCategory.MISC).setCustomClientFactory(HealingGooEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GhoulSlashEntity>> GHOUL_SLASH = register("projectile_ghoul_slash",
			EntityType.Builder.<GhoulSlashEntity>of(GhoulSlashEntity::new, MobCategory.MISC).setCustomClientFactory(GhoulSlashEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GhoulSpitEntity>> GHOUL_SPIT = register("projectile_ghoul_spit",
			EntityType.Builder.<GhoulSpitEntity>of(GhoulSpitEntity::new, MobCategory.MISC).setCustomClientFactory(GhoulSpitEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CinderSliceEntity>> CINDER_SLICE = register("projectile_cinder_slice",
			EntityType.Builder.<CinderSliceEntity>of(CinderSliceEntity::new, MobCategory.MISC).setCustomClientFactory(CinderSliceEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CinderFireChargeEntity>> CINDER_FIRE_CHARGE = register("projectile_cinder_fire_charge",
			EntityType.Builder.<CinderFireChargeEntity>of(CinderFireChargeEntity::new, MobCategory.MISC)
					.setCustomClientFactory(CinderFireChargeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GallantSwingsEntity>> GALLANT_SWINGS = register("projectile_gallant_swings",
			EntityType.Builder.<GallantSwingsEntity>of(GallantSwingsEntity::new, MobCategory.MISC).setCustomClientFactory(GallantSwingsEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BouncerKickProjectileEntity>> BOUNCER_KICK_PROJECTILE = register(
			"projectile_bouncer_kick_projectile",
			EntityType.Builder.<BouncerKickProjectileEntity>of(BouncerKickProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(BouncerKickProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SlimeballThrowEntity>> SLIMEBALL_THROW = register("projectile_slimeball_throw",
			EntityType.Builder.<SlimeballThrowEntity>of(SlimeballThrowEntity::new, MobCategory.MISC).setCustomClientFactory(SlimeballThrowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CastSpellEntity>> CAST_SPELL = register("projectile_cast_spell",
			EntityType.Builder.<CastSpellEntity>of(CastSpellEntity::new, MobCategory.MISC).setCustomClientFactory(CastSpellEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrawlerExplosiveEntity>> CRAWLER_EXPLOSIVE = register("projectile_crawler_explosive",
			EntityType.Builder.<CrawlerExplosiveEntity>of(CrawlerExplosiveEntity::new, MobCategory.MISC)
					.setCustomClientFactory(CrawlerExplosiveEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TrollInvincibleEntity>> TROLL_INVINCIBLE = register("projectile_troll_invincible",
			EntityType.Builder.<TrollInvincibleEntity>of(TrollInvincibleEntity::new, MobCategory.MISC)
					.setCustomClientFactory(TrollInvincibleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TrollSpitEntity>> TROLL_SPIT = register("projectile_troll_spit",
			EntityType.Builder.<TrollSpitEntity>of(TrollSpitEntity::new, MobCategory.MISC).setCustomClientFactory(TrollSpitEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WolfsbaneEntity>> WOLFSBANE = register("wolfsbane",
			EntityType.Builder.<WolfsbaneEntity>of(WolfsbaneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WolfsbaneEntity::new)

					.sized(0.9f, 2.45f));
	public static final RegistryObject<EntityType<BanedasherEntity>> BANEDASHER = register("banedasher",
			EntityType.Builder.<BanedasherEntity>of(BanedasherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BanedasherEntity::new)

					.sized(1.7000000000000002f, 1.45f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MeatureEntity.init();
			TarantulaEntity.init();
			ScorpionEntity.init();
			HuntsmanskeletonEntity.init();
			WaspEntity.init();
			PheromoneSummonEntity.init();
			SprinterEntity.init();
			SluggerEntity.init();
			SeniorEntity.init();
			EquestrianEntity.init();
			FrigidEntity.init();
			LadybugEntity.init();
			ZadybugEntity.init();
			SpectreEntity.init();
			GhoulEntity.init();
			CinderEntity.init();
			GallantEntity.init();
			GoblinEntity.init();
			BouncerEntity.init();
			RancherEntity.init();
			BakerEntity.init();
			ErrantEntity.init();
			CasterEntity.init();
			GabbleEntity.init();
			ZobgoblinEntity.init();
			CakeroverEntity.init();
			PetrimanEntity.init();
			PetricrawlerEntity.init();
			PetriboulderEntity.init();
			SilverkingEntity.init();
			CrawlerEntity.init();
			IntruderEntity.init();
			TrollEntity.init();
			GoblinFearEntity.init();
			SilverpetEntity.init();
			InvisicreeperEntity.init();
			VampireEntity.init();
			BiterEntity.init();
			PetrifiedtrollEntity.init();
			PropellerEntity.init();
			FlutterflyEntity.init();
			BoarEntity.init();
			BullEntity.init();
			RamEntity.init();
			RoosterEntity.init();
			RamshearedEntity.init();
			WolfsbaneEntity.init();
			BanedasherEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MEATURE.get(), MeatureEntity.createAttributes().build());
		event.put(TARANTULA.get(), TarantulaEntity.createAttributes().build());
		event.put(SCORPION.get(), ScorpionEntity.createAttributes().build());
		event.put(HUNTSMANSKELETON.get(), HuntsmanskeletonEntity.createAttributes().build());
		event.put(WASP.get(), WaspEntity.createAttributes().build());
		event.put(PHEROMONE_SUMMON.get(), PheromoneSummonEntity.createAttributes().build());
		event.put(SPRINTER.get(), SprinterEntity.createAttributes().build());
		event.put(SLUGGER.get(), SluggerEntity.createAttributes().build());
		event.put(SENIOR.get(), SeniorEntity.createAttributes().build());
		event.put(EQUESTRIAN.get(), EquestrianEntity.createAttributes().build());
		event.put(FRIGID.get(), FrigidEntity.createAttributes().build());
		event.put(LADYBUG.get(), LadybugEntity.createAttributes().build());
		event.put(ZADYBUG.get(), ZadybugEntity.createAttributes().build());
		event.put(SPECTRE.get(), SpectreEntity.createAttributes().build());
		event.put(GHOUL.get(), GhoulEntity.createAttributes().build());
		event.put(CINDER.get(), CinderEntity.createAttributes().build());
		event.put(GALLANT.get(), GallantEntity.createAttributes().build());
		event.put(GOBLIN.get(), GoblinEntity.createAttributes().build());
		event.put(BOUNCER.get(), BouncerEntity.createAttributes().build());
		event.put(RANCHER.get(), RancherEntity.createAttributes().build());
		event.put(BAKER.get(), BakerEntity.createAttributes().build());
		event.put(ERRANT.get(), ErrantEntity.createAttributes().build());
		event.put(CASTER.get(), CasterEntity.createAttributes().build());
		event.put(GABBLE.get(), GabbleEntity.createAttributes().build());
		event.put(ZOBGOBLIN.get(), ZobgoblinEntity.createAttributes().build());
		event.put(CAKEROVER.get(), CakeroverEntity.createAttributes().build());
		event.put(PETRIMAN.get(), PetrimanEntity.createAttributes().build());
		event.put(PETRICRAWLER.get(), PetricrawlerEntity.createAttributes().build());
		event.put(PETRIBOULDER.get(), PetriboulderEntity.createAttributes().build());
		event.put(SILVERKING.get(), SilverkingEntity.createAttributes().build());
		event.put(CRAWLER.get(), CrawlerEntity.createAttributes().build());
		event.put(INTRUDER.get(), IntruderEntity.createAttributes().build());
		event.put(TROLL.get(), TrollEntity.createAttributes().build());
		event.put(GOBLIN_FEAR.get(), GoblinFearEntity.createAttributes().build());
		event.put(SILVERPET.get(), SilverpetEntity.createAttributes().build());
		event.put(INVISICREEPER.get(), InvisicreeperEntity.createAttributes().build());
		event.put(VAMPIRE.get(), VampireEntity.createAttributes().build());
		event.put(BITER.get(), BiterEntity.createAttributes().build());
		event.put(PETRIFIEDTROLL.get(), PetrifiedtrollEntity.createAttributes().build());
		event.put(PROPELLER.get(), PropellerEntity.createAttributes().build());
		event.put(FLUTTERFLY.get(), FlutterflyEntity.createAttributes().build());
		event.put(BOAR.get(), BoarEntity.createAttributes().build());
		event.put(BULL.get(), BullEntity.createAttributes().build());
		event.put(RAM.get(), RamEntity.createAttributes().build());
		event.put(ROOSTER.get(), RoosterEntity.createAttributes().build());
		event.put(RAMSHEARED.get(), RamshearedEntity.createAttributes().build());
		event.put(WOLFSBANE.get(), WolfsbaneEntity.createAttributes().build());
		event.put(BANEDASHER.get(), BanedasherEntity.createAttributes().build());
	}
}
