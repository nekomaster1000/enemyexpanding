// Made with Blockbench 4.5.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhuntsman<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "huntsman"), "main");
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;
	private final ModelPart leftArm;
	private final ModelPart rightArm;
	private final ModelPart head;
	private final ModelPart cape;
	private final ModelPart bb_main;

	public Modelhuntsman(ModelPart root) {
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
		this.head = root.getChild("head");
		this.cape = root.getChild("cape");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(9, 18).mirror()
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 10.0F, 0.0F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(9, 18)
				.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 10.0F, 0.0F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(0, 43)
				.mirror().addBox(0.0F, -3.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 18).mirror().addBox(0.0F, -2.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 36).mirror()
				.addBox(-0.5F, 6.5F, -2.1F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(15, 40)
				.mirror().addBox(-0.5F, 7.5F, -2.1F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, -4.0F, -0.75F, -1.4111F, 0.3614F, 0.1572F));

		PartDefinition leftItem = leftArm.addOrReplaceChild("leftItem", CubeListBuilder.create(),
				PartPose.offset(2.0F, 12.0F, 1.0F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm",
				CubeListBuilder.create().texOffs(0, 43)
						.addBox(-2.0F, -3.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-1.5F, 6.5F, -2.1F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(15, 40)
						.addBox(-1.5F, 7.5F, -2.1F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -4.0F, -0.75F, -1.4385F, -0.0806F, -0.0335F));

		PartDefinition rightItem = rightArm.addOrReplaceChild("rightItem", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 12.0F, 1.0F));

		PartDefinition bow = rightArm.addOrReplaceChild("bow",
				CubeListBuilder.create().texOffs(25, 6)
						.addBox(-0.5F, -0.3431F, 9.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-0.5F, 0.6569F, 8.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-0.5F, 1.6569F, 7.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-0.5F, 2.6569F, 6.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-0.5F, 3.6569F, 5.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-0.5F, 4.6569F, 4.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-0.5F, 5.6569F, 3.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-0.5F, 6.6569F, 2.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-0.5F, 7.6569F, 1.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-0.5F, 8.6569F, 0.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(-0.5F, 9.6569F, -0.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 9.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 10.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 10.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -1.3431F, 9.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -1.3431F, 10.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -2.3431F, 10.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -2.3431F, 8.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -1.3431F, 7.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -0.3431F, 6.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -0.3431F, 5.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -0.3431F, 4.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -0.3431F, 3.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -1.3431F, 2.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, -1.3431F, 1.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 1.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 2.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 2.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 3.6569F, -0.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 4.6569F, -0.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 5.6569F, -0.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 6.6569F, -0.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 7.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-0.5F, 8.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 9.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 9.6569F, -3.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 8.6569F, -3.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 7.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 6.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 5.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 4.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 3.6569F, -3.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 2.6569F, -3.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 1.6569F, -3.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, 0.6569F, -3.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -0.3431F, -3.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -1.3431F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -2.3431F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -3.3431F, -0.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -3.3431F, 0.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -3.3431F, 1.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -3.3431F, 2.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -3.3431F, 3.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -2.3431F, 4.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -2.3431F, 5.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -2.3431F, 6.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -2.3431F, 7.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -3.3431F, 8.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -3.3431F, 9.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -2.3431F, 9.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-0.5F, -2.3431F, 9.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 3)
						.addBox(-0.5F, -1.3431F, 6.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 3)
						.addBox(-0.5F, -1.3431F, 5.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 3)
						.addBox(-0.5F, -2.3431F, 3.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 3)
						.addBox(-0.5F, -2.3431F, 2.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 3)
						.addBox(-0.5F, 2.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 3)
						.addBox(-0.5F, 3.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 3)
						.addBox(-0.5F, 5.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 3)
						.addBox(-0.5F, 6.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 3)
						.addBox(-0.5F, 4.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 3)
						.addBox(-0.5F, 3.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 3)
						.addBox(-0.5F, 1.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 3)
						.addBox(-0.5F, -2.3431F, 1.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 3)
						.addBox(-0.5F, -1.3431F, 3.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 3)
						.addBox(-0.5F, -1.3431F, 4.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 3)
						.addBox(-0.5F, -1.3431F, 0.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 3)
						.addBox(-0.5F, -0.3431F, -0.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 3)
						.addBox(-0.5F, 0.6569F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 3)
						.addBox(-0.5F, -0.3431F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 3)
						.addBox(-0.5F, -1.3431F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 3)
						.addBox(-0.5F, -2.3431F, -0.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-0.5F, -2.3431F, 0.6569F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-0.5F, -1.3431F, -0.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-0.5F, -0.3431F, -1.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-0.5F, 0.6569F, -2.3431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 15.0F, -1.0F, 2.3562F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition cape = partdefinition.addOrReplaceChild("cape", CubeListBuilder.create(),
				PartPose.offset(0.0F, -6.0F, 3.0F));

		PartDefinition cape_r1 = cape
				.addOrReplaceChild("cape_r1",
						CubeListBuilder.create().texOffs(38, 52).addBox(-5.0F, -0.2F, -0.98F, 10.0F, 11.0F, 1.0F,
								new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 52)
						.addBox(-5.0F, -30.2F, -3.0F, 10.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-4.0F, -30.0F, -2.0F, 8.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cape.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.cape.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}