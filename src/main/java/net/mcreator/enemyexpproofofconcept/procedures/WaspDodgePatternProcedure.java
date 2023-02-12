package net.mcreator.enemyexpproofofconcept.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class WaspDodgePatternProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 0.8, 0));
		if (sourceentity instanceof Player) {
			if (Math.random() < 0.3) {
				entity.setDeltaMovement(new Vec3((-0.4), 0.4, 0));
			}
			if (Math.random() < 0.3) {
				entity.setDeltaMovement(new Vec3(0.4, (-0.4), 0));
			}
			if (Math.random() < 0.3) {
				entity.setDeltaMovement(new Vec3(0, 0.7, 0.2));
			}
			if (Math.random() < 0.3) {
				entity.setDeltaMovement(new Vec3(0, (-0.2), (-0.4)));
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					entity.setDeltaMovement(new Vec3(0, 0.1, 0));
					if (Math.random() < 0.6) {
						entity.setDeltaMovement(new Vec3((-0.5), 0.5, 0.3));
					}
					if (Math.random() < 0.3) {
						entity.setDeltaMovement(new Vec3(0.5, (-0.2), 0));
					}
					if (Math.random() < 0.3) {
						entity.setDeltaMovement(new Vec3(0, 0.7, 0.03));
					}
					if (Math.random() < 0.3) {
						entity.setDeltaMovement(new Vec3(0, 0.1, (-0.5)));
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							entity.setDeltaMovement(new Vec3(0, 0.1, 0));
							if (Math.random() < 0.3) {
								entity.setDeltaMovement(new Vec3((-0.4), 0.7, 0.2));
							}
							if (Math.random() < 0.6) {
								entity.setDeltaMovement(new Vec3(0.4, (-0.3), 0));
							}
							if (Math.random() < 0.3) {
								entity.setDeltaMovement(new Vec3(0, 0.4, (-0.1)));
							}
							if (Math.random() < 0.3) {
								entity.setDeltaMovement(new Vec3(0, (-0.4), 0));
							}
							new Object() {
								private int ticks = 0;
								private float waitTicks;
								private LevelAccessor world;

								public void start(LevelAccessor world, int waitTicks) {
									this.waitTicks = waitTicks;
									MinecraftForge.EVENT_BUS.register(this);
									this.world = world;
								}

								@SubscribeEvent
								public void tick(TickEvent.ServerTickEvent event) {
									if (event.phase == TickEvent.Phase.END) {
										this.ticks += 1;
										if (this.ticks >= this.waitTicks)
											run();
									}
								}

								private void run() {
									entity.setDeltaMovement(new Vec3(0, 0.1, 0));
									if (Math.random() < 0.3) {
										entity.setDeltaMovement(new Vec3((-0.4), 0.6, 0.1));
									}
									if (Math.random() < 0.3) {
										entity.setDeltaMovement(new Vec3(0.4, 0.3, 0));
									}
									if (Math.random() < 0.3) {
										entity.setDeltaMovement(new Vec3(0, 0.4, 0.4));
									}
									if (Math.random() < 0.6) {
										entity.setDeltaMovement(new Vec3(0, (-0.4), (-0.2)));
									}
									new Object() {
										private int ticks = 0;
										private float waitTicks;
										private LevelAccessor world;

										public void start(LevelAccessor world, int waitTicks) {
											this.waitTicks = waitTicks;
											MinecraftForge.EVENT_BUS.register(this);
											this.world = world;
										}

										@SubscribeEvent
										public void tick(TickEvent.ServerTickEvent event) {
											if (event.phase == TickEvent.Phase.END) {
												this.ticks += 1;
												if (this.ticks >= this.waitTicks)
													run();
											}
										}

										private void run() {
											entity.setDeltaMovement(new Vec3(0, 0.1, 0));
											if (Math.random() < 0.6) {
												entity.setDeltaMovement(new Vec3((-0.4), (-0.2), 0.3));
											}
											if (Math.random() < 0.3) {
												entity.setDeltaMovement(new Vec3(0.4, 0, 0));
											}
											if (Math.random() < 0.3) {
												entity.setDeltaMovement(new Vec3(0, 0.3, 0.4));
											}
											if (Math.random() < 0.3) {
												entity.setDeltaMovement(new Vec3(0, 0.2, (-0.4)));
											}
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 10);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 10);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 10);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
		}
	}
}
