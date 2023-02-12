// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltrollface<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "trollface"), "main");
	private final ModelPart trolled;

	public Modeltrollface(ModelPart root) {
		this.trolled = root.getChild("trolled");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition trolled = partdefinition.addOrReplaceChild("trolled", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition skull = trolled.addOrReplaceChild("skull",
				CubeListBuilder.create().texOffs(0, 28).addBox(-8.0F, -12.25F, -5.75F, 16.0F, 12.0F, 12.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, -1.25F, -2.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition jaw = skull.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(5, 53).addBox(-8.0F, 0.0F, -5.0F, 16.0F, 4.0F, 7.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 1.1781F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		trolled.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.trolled.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.trolled.xRot = headPitch / (180F / (float) Math.PI);
	}
}