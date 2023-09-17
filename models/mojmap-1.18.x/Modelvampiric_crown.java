// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelvampiric_crown<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "vampiric_crown"), "main");
	private final ModelPart all2;

	public Modelvampiric_crown(ModelPart root) {
		this.all2 = root.getChild("all2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all2 = partdefinition.addOrReplaceChild("all2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -0.4F));

		PartDefinition biter = all2.addOrReplaceChild("biter", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.0F, 1.0F));

		PartDefinition botharms = biter.addOrReplaceChild("botharms", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 2.8311F, -2.2053F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftarm2 = botharms.addOrReplaceChild("leftarm2",
				CubeListBuilder.create().texOffs(33, 39)
						.addBox(-1.0F, -0.8311F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 39)
						.addBox(-1.0F, -0.8311F, 1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -0.5F, 0.0F, -1.5708F, 0.0F, 0.0873F));

		PartDefinition rightarm2 = botharms.addOrReplaceChild("rightarm2",
				CubeListBuilder.create().texOffs(33, 39).mirror()
						.addBox(-1.0F, -0.8311F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(41, 39).mirror()
						.addBox(-1.0F, -0.8311F, 1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, -0.5F, 0.0F, -1.5708F, 0.0F, -0.0873F));

		PartDefinition head2 = biter.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F,
				-8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 3.9134F, -0.5922F));

		PartDefinition wings = head2.addOrReplaceChild("wings", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.9134F, -2.0078F));

		PartDefinition leftear = wings.addOrReplaceChild("leftear", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.0F, -0.0866F, 0.0078F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftwing = leftear
				.addOrReplaceChild("leftwing",
						CubeListBuilder.create().texOffs(1, 32).addBox(0.0F, -5.0F, 0.0F, 0.0F, 13.0F, 19.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition rightear = wings.addOrReplaceChild("rightear", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.0F, -0.0866F, 0.0078F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rightwing = rightear.addOrReplaceChild("rightwing",
				CubeListBuilder.create().texOffs(1, 32).mirror()
						.addBox(0.0F, -5.0F, 0.0F, 0.0F, 13.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		all2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}