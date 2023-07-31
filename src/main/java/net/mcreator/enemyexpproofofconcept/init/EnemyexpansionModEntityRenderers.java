
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.enemyexpproofofconcept.client.renderer.ZobgoblinRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.ZadybugRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.WolfsbaneRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.WaspRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.VampireRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.TrollRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.TrollInvincibleRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.TarantulaRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.SprinterRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.SpectreRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.SluggerRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.SilverpetRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.SilverkingRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.SeniorRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.ScorpionRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.RoosterRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.ReaverRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.RancherRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.RamshearedRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.RamRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.PropellerRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.PiecrabRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.PheromoneSummonRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.PetrimanRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.PetrifiedtrollRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.OrbRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.MeatureRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.LadybugRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.KelpieRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.InvisicreeperRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.IntruderRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.HuntsmanskeletonRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GoblinRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GoblinFearRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GladiusRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GladiladRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GhoulRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GallantRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.GabbleRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.FrigidRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.FlyRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.FlutterflyRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.ErrantRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.EquestrianRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.DreadnoughtRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.CrawlerRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.CrawlerExplosiveRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.CockatriceRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.CinderRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.CasterRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.CakeroverRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.BullRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.BouncerRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.BoarRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.BiterRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.BanedasherRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.BakerRenderer;
import net.mcreator.enemyexpproofofconcept.client.renderer.AnglerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnemyexpansionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EnemyexpansionModEntities.MEATURE.get(), MeatureRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SPRINTER.get(), SprinterRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SLUGGER.get(), SluggerRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SENIOR.get(), SeniorRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.EQUESTRIAN.get(), EquestrianRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.FRIGID.get(), FrigidRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.HUNTSMANSKELETON.get(), HuntsmanskeletonRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SPECTRE.get(), SpectreRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GHOUL.get(), GhoulRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GALLANT.get(), GallantRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.PROPELLER.get(), PropellerRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CINDER.get(), CinderRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GOBLIN.get(), GoblinRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.BOUNCER.get(), BouncerRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.RANCHER.get(), RancherRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.BAKER.get(), BakerRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CAKEROVER.get(), CakeroverRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ERRANT.get(), ErrantRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CASTER.get(), CasterRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ZOBGOBLIN.get(), ZobgoblinRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GABBLE.get(), GabbleRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CRAWLER.get(), CrawlerRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.INTRUDER.get(), IntruderRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.PETRIMAN.get(), PetrimanRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SILVERKING.get(), SilverkingRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SILVERPET.get(), SilverpetRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.TROLL.get(), TrollRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.PETRIFIEDTROLL.get(), PetrifiedtrollRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.VAMPIRE.get(), VampireRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.BITER.get(), BiterRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.WOLFSBANE.get(), WolfsbaneRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.BANEDASHER.get(), BanedasherRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GLADIUS.get(), GladiusRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GLADILAD.get(), GladiladRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.COCKATRICE.get(), CockatriceRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.TARANTULA.get(), TarantulaRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SCORPION.get(), ScorpionRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.WASP.get(), WaspRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.PHEROMONE_SUMMON.get(), PheromoneSummonRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.LADYBUG.get(), LadybugRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ZADYBUG.get(), ZadybugRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.FLUTTERFLY.get(), FlutterflyRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.BOAR.get(), BoarRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.BULL.get(), BullRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ROOSTER.get(), RoosterRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.RAM.get(), RamRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.RAMSHEARED.get(), RamshearedRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GOBLIN_FEAR.get(), GoblinFearRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.INVISICREEPER.get(), InvisicreeperRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ANGLER.get(), AnglerRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.KELPIE.get(), KelpieRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.PIECRAB.get(), PiecrabRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.FLY.get(), FlyRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.PHEROMONE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.HUNTSMAN_PUNCH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ENEMY_MELEE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.WASP_STING_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.FRIGID_TOUCH_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.HEALING_GOO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GHOUL_SLASH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GHOUL_SPIT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CINDER_SLICE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CINDER_FIRE_CHARGE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GALLANT_SWINGS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.BOUNCER_KICK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.SLIMEBALL_THROW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CAST_SPELL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.CRAWLER_EXPLOSIVE.get(), CrawlerExplosiveRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.TROLL_INVINCIBLE.get(), TrollInvincibleRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.TROLL_SPIT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.GLADIUS_INK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.DREADNOUGHT.get(), DreadnoughtRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.ORB.get(), OrbRenderer::new);
		event.registerEntityRenderer(EnemyexpansionModEntities.REAVER.get(), ReaverRenderer::new);
	}
}
