// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelequestrian_zombie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "equestrian_zombie"), "main");
	private final ModelPart riderhead_r1;
	private final ModelPart Body;
	private final ModelPart Leg1A;
	private final ModelPart Leg2A;
	private final ModelPart Leg3A;
	private final ModelPart Leg4A;
	private final ModelPart bb_main;

	public Modelequestrian_zombie(ModelPart root) {
		this.riderhead_r1 = root.getChild("riderhead_r1");
		this.Body = root.getChild("Body");
		this.Leg1A = root.getChild("Leg1A");
		this.Leg2A = root.getChild("Leg2A");
		this.Leg3A = root.getChild("Leg3A");
		this.Leg4A = root.getChild("Leg4A");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition riderhead_r1 = partdefinition.addOrReplaceChild("riderhead_r1", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, -6.9664F, -4.5237F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.2813F, 3.6973F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 96)
				.addBox(-5.0F, -8.0F, -20.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 9.0F));

		PartDefinition Saddle = Body.addOrReplaceChild("Saddle", CubeListBuilder.create().texOffs(26, 64).addBox(-5.0F,
				1.0F, -5.5F, 10.0F, 9.0F, 9.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -9.0F, -7.0F));

		PartDefinition TailA = Body
				.addOrReplaceChild("TailA",
						CubeListBuilder.create().texOffs(42, 100).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -7.0F, 2.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition HeadSaddle = Body.addOrReplaceChild("HeadSaddle",
				CubeListBuilder.create().texOffs(19, 64)
						.addBox(-2.0F, -16.0F, -5.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.25F)).texOffs(0, 64)
						.addBox(-3.0F, -16.0F, -3.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -17.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 77)
						.addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
						.addBox(-2.0F, -5.0F, -11.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, -20.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Ear1 = Body.addOrReplaceChild("Ear1",
				CubeListBuilder.create().texOffs(19, 80).mirror()
						.addBox(-0.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.0F, -17.0F, 0.5236F, 0.0F, 0.0873F));

		PartDefinition Ear2 = Body.addOrReplaceChild("Ear2",
				CubeListBuilder.create().texOffs(19, 80).addBox(-1.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -17.0F, 0.5236F, 0.0F, -0.0873F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(0, 99)
						.addBox(-2.0F, -11.0F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(56, 100)
						.addBox(-1.0F, -16.0F, 4.01F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -17.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Bag1 = Body.addOrReplaceChild("Bag1",
				CubeListBuilder.create().texOffs(26, 85).addBox(-9.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -8.0F, 2.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Bag2 = Body.addOrReplaceChild("Bag2",
				CubeListBuilder.create().texOffs(26, 85).mirror()
						.addBox(1.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, -8.0F, 2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition SaddleMouthL = Body.addOrReplaceChild("SaddleMouthL",
				CubeListBuilder.create().texOffs(29, 69).addBox(2.0F, -14.0F, -6.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -17.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition SaddleMouthR = Body.addOrReplaceChild("SaddleMouthR",
				CubeListBuilder.create().texOffs(29, 69).addBox(-3.0F, -14.0F, -6.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -17.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition SaddleMouthLine = Body.addOrReplaceChild("SaddleMouthLine", CubeListBuilder.create()
				.texOffs(32, 66).addBox(3.1F, -10.0F, -11.5F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, -17.0F));

		PartDefinition SaddleMouthLineR = Body.addOrReplaceChild("SaddleMouthLineR", CubeListBuilder.create()
				.texOffs(32, 66).addBox(-3.1F, -10.0F, -11.5F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, -17.0F));

		PartDefinition Leg1A = partdefinition.addOrReplaceChild("Leg1A",
				CubeListBuilder.create().texOffs(48, 85).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.0F, 13.0F, 9.0F));

		PartDefinition Leg2A = partdefinition.addOrReplaceChild("Leg2A", CubeListBuilder.create().texOffs(48, 85)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 9.0F));

		PartDefinition Leg3A = partdefinition.addOrReplaceChild("Leg3A",
				CubeListBuilder.create().texOffs(48, 85).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.0F, 13.0F, -9.0F));

		PartDefinition Leg4A = partdefinition.addOrReplaceChild("Leg4A", CubeListBuilder.create().texOffs(48, 85)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, -9.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(16, 16)
				.addBox(-4.0F, -33.3829F, 1.3424F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition riderarmleft_r1_r1 = bb_main.addOrReplaceChild("riderarmleft_r1_r1",
				CubeListBuilder.create().texOffs(40, 17).addBox(3.4511F, -32.8203F, 5.017F, 3.0F, 12.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5805F, -17.1727F, -25.2619F, -0.8447F, -0.1101F, 0.3588F));

		PartDefinition riderarmright_r1_r1 = bb_main.addOrReplaceChild("riderarmright_r1_r1",
				CubeListBuilder.create().texOffs(40, 17).mirror()
						.addBox(-6.4511F, -32.8203F, 5.017F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(2.5805F, -17.1727F, -25.2619F, -0.8447F, 0.1101F, -0.3588F));

		PartDefinition riderlegleft_r1_r1 = bb_main.addOrReplaceChild("riderlegleft_r1_r1",
				CubeListBuilder.create().texOffs(4, 17).addBox(0.0F, -18.5F, 4.5F, 3.0F, 12.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.3511F, -14.7176F, -13.7592F, -0.7999F, -0.5269F, -0.1785F));

		PartDefinition riderlegright_r1_r1 = bb_main.addOrReplaceChild("riderlegright_r1_r1",
				CubeListBuilder.create().texOffs(4, 17).mirror()
						.addBox(-3.0F, -18.5F, 4.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.3511F, -14.7176F, -13.7592F, -0.7999F, 0.5269F, 0.1785F));

		return LayerDefinition.create(meshdefinition, 64, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		riderhead_r1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg1A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg2A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg3A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg4A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Leg1A.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.riderhead_r1.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.riderhead_r1.xRot = headPitch / (180F / (float) Math.PI);
		this.Leg3A.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Leg2A.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leg4A.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}