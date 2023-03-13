
package net.mcreator.enemyexpproofofconcept.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.common.DungeonHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.enemyexpproofofconcept.procedures.HuntsmanGetAwayProcedure;
import net.mcreator.enemyexpproofofconcept.init.EnemyexpansionModEntities;

import java.util.Set;

@Mod.EventBusSubscriber
public class HuntsmanskeletonEntity extends Skeleton {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("stony_shore"), new ResourceLocation("sunflower_plains"), new ResourceLocation("sparse_jungle"),
			new ResourceLocation("birch_forest"), new ResourceLocation("flower_forest"), new ResourceLocation("lush_caves"), new ResourceLocation("snowy_slopes"), new ResourceLocation("bamboo_jungle"), new ResourceLocation("ice_spikes"),
			new ResourceLocation("dark_forest"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("stony_peaks"), new ResourceLocation("frozen_peaks"), new ResourceLocation("meadow"),
			new ResourceLocation("old_growth_spruce_taiga"), new ResourceLocation("snowy_beach"), new ResourceLocation("savanna_plateau"), new ResourceLocation("dripstone_caves"), new ResourceLocation("snowy_plains"), new ResourceLocation("taiga"),
			new ResourceLocation("jagged_peaks"), new ResourceLocation("snowy_taiga"), new ResourceLocation("swamp"), new ResourceLocation("eroded_badlands"), new ResourceLocation("badlands"), new ResourceLocation("old_growth_birch_forest"),
			new ResourceLocation("grove"), new ResourceLocation("windswept_hills"), new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("beach"), new ResourceLocation("wooded_badlands"), new ResourceLocation("windswept_savanna"),
			new ResourceLocation("windswept_forest"), new ResourceLocation("jungle"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("river"), new ResourceLocation("desert"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(EnemyexpansionModEntities.HUNTSMANSKELETON.get(), 60, 1, 1));
	}

	public HuntsmanskeletonEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EnemyexpansionModEntities.HUNTSMANSKELETON.get(), world);
	}

	public HuntsmanskeletonEntity(EntityType<HuntsmanskeletonEntity> type, Level world) {
		super(type, world);
		xpReward = 8;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.BOW));
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public double getPassengersRidingOffset() {
		return super.getPassengersRidingOffset() + 0.5;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.death"));
	}

	@Override
	public void playerTouch(Player sourceentity) {
		super.playerTouch(sourceentity);
		HuntsmanGetAwayProcedure.execute(this);
	}

	public static void init() {
		SpawnPlacements.register(EnemyexpansionModEntities.HUNTSMANSKELETON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
		DungeonHooks.addDungeonMob(EnemyexpansionModEntities.HUNTSMANSKELETON.get(), 180);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.42);
		builder = builder.add(Attributes.MAX_HEALTH, 24);
		builder = builder.add(Attributes.ARMOR, 6);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1.5);
		return builder;
	}
}
