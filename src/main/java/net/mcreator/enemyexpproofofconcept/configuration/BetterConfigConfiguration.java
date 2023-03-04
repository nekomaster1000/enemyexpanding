package net.mcreator.enemyexpproofofconcept.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class BetterConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> BABYZOMBIESPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> BABYZOMBIEHEALTH;
	public static final ForgeConfigSpec.ConfigValue<Double> PHANTOMHEALTH;
	public static final ForgeConfigSpec.ConfigValue<Double> PETRIMANSPAWNINGDEPTH;
	public static final ForgeConfigSpec.ConfigValue<Double> SILVERKINGSPAWNINGDEPTH;
	public static final ForgeConfigSpec.ConfigValue<Double> CRAWLERSPAWNINGDEPTH;
	public static final ForgeConfigSpec.ConfigValue<Double> TROLLSPAWNINGDEPTH;
	public static final ForgeConfigSpec.ConfigValue<Double> VAMPIRESPAWNINGDEPTH;
	public static final ForgeConfigSpec.ConfigValue<Double> PETRIMANZOMBIEREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> SILVERKINGSPIDERREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> CREEPSREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> VAMPIRESKELETONREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> TROLLENDERMANREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> CINDERBLAZEREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> PIGBOARREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> COWBULLREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> SHEEPRAMREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> CHICKENROOSTERREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> SPIDERTARANTULAREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> SPIDERSCORPIONREPLACEMENT;
	public static final ForgeConfigSpec.ConfigValue<Double> PETRIMANZOMBIEREPLACEMENTDEPTH;
	public static final ForgeConfigSpec.ConfigValue<Double> SILVERKINGSPIDERREPLACEMENTDEPTH;
	public static final ForgeConfigSpec.ConfigValue<Double> CREEPSREPLACEMENTDEPTH;
	public static final ForgeConfigSpec.ConfigValue<Double> VAMPIRESKELETONREPLACEMENTDEPTH;
	public static final ForgeConfigSpec.ConfigValue<Double> TROLLENDERMANREPLACEMENTDEPTH;
	public static final ForgeConfigSpec.ConfigValue<Double> MEATHEADWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> HEADBITTENWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> SLIMEHEADWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> SPIDERLATCHWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> SILVERHEADWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> HORSEHEADWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> MINIWITHERWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> FLUTTERFLIERSWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> PHANTASMWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> SPECTRALWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> BRUTISHGARMENTWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> BULLSKULLWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> LEATHERWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> CHAINMAILWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> IRONWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> GOLDWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> DIAMONDWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> NETHERITEWEARERSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Double> PUNCHINGRAMDROPSWOOLCHANCE;
	public static final ForgeConfigSpec.ConfigValue<Double> WANDERINGTRADERBECOMESILLUSIONERONHITCHANCE;
	public static final ForgeConfigSpec.ConfigValue<Double> BURNINGUNDEADSPEEDUP;
	public static final ForgeConfigSpec.ConfigValue<Double> STRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> SPEED;
	public static final ForgeConfigSpec.ConfigValue<Double> RESISTANCE;
	public static final ForgeConfigSpec.ConfigValue<Double> HASTE;
	public static final ForgeConfigSpec.ConfigValue<Double> FIRERES;
	static {
		BUILDER.push("mobSpawning");
		BABYZOMBIESPAWNING = BUILDER.comment(
				"0 fully disables it, 1 fully enables it, and an inbetween acts as a percentage chance for it to work (0.13 being 13%, for example.)")
				.define("Baby Zombie Spawning", (double) 0.13);
		BUILDER.pop();
		BUILDER.push("mobHealth");
		BABYZOMBIEHEALTH = BUILDER.comment(
				"Allows you to set the amount of health mobs spawn with (if they're allowed to spawn at all.) I made it really low by default so as to make them less annoying to deal with if you do have to encounter them.")
				.define("Baby Zombie Health", (double) 2);
		PHANTOMHEALTH = BUILDER.define("Phantom Health", (double) 6);
		BUILDER.pop();
		BUILDER.push("spawningDepth");
		PETRIMANSPAWNINGDEPTH = BUILDER.comment(
				"The specified mob will only naturally spawn below the specified y-level. This is so certain mobs are cave-exclusive by default.")
				.define("Petriman Spawning Depth", (double) 55);
		SILVERKINGSPAWNINGDEPTH = BUILDER.define("Silverking Spawning Depth", (double) -10);
		CRAWLERSPAWNINGDEPTH = BUILDER.define("Crawler Spawning Depth", (double) -10);
		TROLLSPAWNINGDEPTH = BUILDER.define("Troll Spawning Depth", (double) -10);
		VAMPIRESPAWNINGDEPTH = BUILDER.define("Vampire Spawning Depth", (double) -10);
		BUILDER.pop();
		BUILDER.push("mobReplacement");
		PETRIMANZOMBIEREPLACEMENT = BUILDER.define("Petriman Zombie Replacement", (double) 1);
		SILVERKINGSPIDERREPLACEMENT = BUILDER.define("Silverking Spider Replacement", (double) 0.4);
		CREEPSREPLACEMENT = BUILDER.define("Crawler/Intruder Creeper Replacement", (double) 0.3);
		VAMPIRESKELETONREPLACEMENT = BUILDER.define("Vampire Skeleton Replacement", (double) 0.75);
		TROLLENDERMANREPLACEMENT = BUILDER.define("Troll Enderman Replacement", (double) 1);
		CINDERBLAZEREPLACEMENT = BUILDER.define("Cinder Blaze Replacement", (double) 0.2);
		PIGBOARREPLACEMENT = BUILDER.define("Pig Boar Replacement", (double) 0.65);
		COWBULLREPLACEMENT = BUILDER.define("Cow Bull Replacement", (double) 0.75);
		SHEEPRAMREPLACEMENT = BUILDER.define("Sheep Ram Replacement", (double) 0.85);
		CHICKENROOSTERREPLACEMENT = BUILDER.define("Chicken Rooster Replacement", (double) 0.55);
		SPIDERTARANTULAREPLACEMENT = BUILDER.define("Tarantula Spider Replacement", (double) 1);
		SPIDERSCORPIONREPLACEMENT = BUILDER.define("Scorpion Spider Replacement", (double) 1);
		BUILDER.pop();
		BUILDER.push("mobReplacementDepth");
		PETRIMANZOMBIEREPLACEMENTDEPTH = BUILDER.define("Petriman Zombie Replacement Depth", (double) 55);
		SILVERKINGSPIDERREPLACEMENTDEPTH = BUILDER.define("Silverking Spider Replacement Depth", (double) -10);
		CREEPSREPLACEMENTDEPTH = BUILDER.define("Crawler/Intruder Creeper Replacement Depth", (double) -10);
		VAMPIRESKELETONREPLACEMENTDEPTH = BUILDER.define("Vampire Skeleton Replacement Depth", (double) -10);
		TROLLENDERMANREPLACEMENTDEPTH = BUILDER.define("Troll Enderman Replacement Depth", (double) -10);
		BUILDER.pop();
		BUILDER.push("hatWearerSpawning");
		MEATHEADWEARERSPAWNING = BUILDER.comment(
				"Some Zombies and Skeletons will spawn wearing certain special gear. edit the minecraft:is_meatury tag to choose what biomes these mobs spawn in.")
				.define("Meat Head Wearer Spawning", (double) 0.01);
		HEADBITTENWEARERSPAWNING = BUILDER.define("Headbitten Wearer Spawning", (double) 0.01);
		SLIMEHEADWEARERSPAWNING = BUILDER.define("Slimehead Wearer Spawning", (double) 0.01);
		SPIDERLATCHWEARERSPAWNING = BUILDER.define("Spiderlatch Wearer Spawning", (double) 0.01);
		SILVERHEADWEARERSPAWNING = BUILDER.define("Silverhead Wearer Spawning", (double) 0.01);
		HORSEHEADWEARERSPAWNING = BUILDER.define("Horsehead Wearer Spawning", (double) 0.01);
		MINIWITHERWEARERSPAWNING = BUILDER.define("Miniwither Wearer Spawning", (double) 0.01);
		FLUTTERFLIERSWEARERSPAWNING = BUILDER.define("Flutterfliers Wearer Spawning", (double) 0.01);
		PHANTASMWEARERSPAWNING = BUILDER.define("Phantasm Wearer Spawning", (double) 0.01);
		SPECTRALWEARERSPAWNING = BUILDER.define("Spectral Wearer Spawning", (double) 0.01);
		BRUTISHGARMENTWEARERSPAWNING = BUILDER.define("Brutish Garment Wearer Spawning", (double) 0.01);
		BULLSKULLWEARERSPAWNING = BUILDER.define("Bull Skull Wearer Spawning", (double) 0.01);
		BUILDER.pop();
		BUILDER.push("armorWearerSpawning");
		LEATHERWEARERSPAWNING = BUILDER.define("Leather Wearer Spawning", (double) 0.01);
		CHAINMAILWEARERSPAWNING = BUILDER.define("Chainmail Wearer Spawning", (double) 0.01);
		IRONWEARERSPAWNING = BUILDER.define("Iron Wearer Spawning", (double) 0.01);
		GOLDWEARERSPAWNING = BUILDER.define("Gold Wearer Spawning", (double) 0.007);
		DIAMONDWEARERSPAWNING = BUILDER.define("Diamond Wearer Spawning", (double) 0.004);
		NETHERITEWEARERSPAWNING = BUILDER.define("Netherite Wearer Spawning", (double) 0.001);
		BUILDER.pop();
		BUILDER.push("miscOptions");
		PUNCHINGRAMDROPSWOOLCHANCE = BUILDER.define("Punching Ram Drops Wool Chance", (double) 0);
		WANDERINGTRADERBECOMESILLUSIONERONHITCHANCE = BUILDER.define("Wandering Trader becomes Illusioner on-death Chance", (double) 0.95);
		BURNINGUNDEADSPEEDUP = BUILDER.define("Burning Undead mobs gain Speed III Chance", (double) 0.2);
		BUILDER.pop();
		BUILDER.push("effectSpawning");
		STRENGTH = BUILDER.define("Chance of Strength effect applied on mob-spawn", (double) 0.01);
		SPEED = BUILDER.define("Chance of Speed effect applied on mob-spawn", (double) 0.01);
		RESISTANCE = BUILDER.define("Chance of Resistance effect applied on mob-spawn", (double) 0.01);
		HASTE = BUILDER.define("Chance of Haste effect applied on mob-spawn", (double) 0.01);
		FIRERES = BUILDER.define("Chance of Fire Resistance effect applied on mob-spawn", (double) 0.01);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
