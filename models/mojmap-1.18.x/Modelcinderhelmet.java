// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcinderhelmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cinderhelmet"), "main");
	private final ModelPart head;

	public Modelcinderhelmet(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.3F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition helmet = head.addOrReplaceChild("helmet",
				CubeListBuilder.create().texOffs(17, 28)
						.addBox(-4.0F, 0.9F, -1.8F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.32F)).texOffs(23, 24)
						.addBox(-4.2F, -1.3F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.11F)).texOffs(1, 28)
						.addBox(-1.0F, -2.3F, -1.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(8, 28)
						.addBox(2.2F, -1.3F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.11F)).texOffs(52, 27)
						.addBox(-3.3F, 5.0F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(58, 27)
						.addBox(1.3F, 5.0F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(47, 25)
						.addBox(3.3F, 2.0F, -1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(42, 25)
						.addBox(-4.3F, 2.0F, -1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(36, 29)
						.addBox(-1.0F, 2.0F, -1.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0F, -3.5F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}