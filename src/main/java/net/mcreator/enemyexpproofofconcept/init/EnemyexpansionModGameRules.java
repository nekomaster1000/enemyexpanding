
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enemyexpproofofconcept.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnemyexpansionModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> TARANTULAREPLACEMENTRULE = GameRules.register("tarantulaReplacementRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> CINDERREPLACEMENTRULE = GameRules.register("cinderReplacementRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> SCORPIONREPLACEMENTRULE = GameRules.register("scorpionReplacementRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> PETRIMANREPLACEMENTRULE = GameRules.register("petrimanReplacementRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> PETRIMANDONTSPAWNABOVEGROUNDRULE = GameRules
			.register("petrimanDontSpawnAboveGroundRule", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> PETRIMANRANDOMRULE = GameRules.register("petrimanRandomRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> INTRUDERREPLACEMENTRULE = GameRules.register("intruderReplacementRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> SILVERKINGREPLACEMENTRULE = GameRules.register("silverkingReplacementRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> SILVERKINGDONTSPAWNABOVEDEEPSLATERULE = GameRules
			.register("silverkingDontSpawnAboveDeepslateRule", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> CRAWLERREPLACEMENTRULE = GameRules.register("crawlerReplacementRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> CRAWLERDONTSPAWNABOVEDEEPSLATERULE = GameRules
			.register("crawlerDontSpawnAboveDeepslateRule", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> TROLLDONTSPAWNABOVEDEEPSLATERULE = GameRules
			.register("trollDontSpawnAboveDeepslateRule", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> VAMPIREDONTSPAWNABOVEDEEPSLATERULE = GameRules
			.register("vampireDontSpawnAboveDeepslateRule", GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> VAMPIREREPLACEMENTRULE = GameRules.register("vampireReplacementRule",
			GameRules.Category.PLAYER, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.IntegerValue> TROLLREPLACEMENTRULE = GameRules.register("trollReplacementRule",
			GameRules.Category.SPAWNING, GameRules.IntegerValue.create(1));
}
