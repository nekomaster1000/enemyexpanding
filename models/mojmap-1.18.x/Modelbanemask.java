// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbanemask<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "banemask"), "main");
	private final ModelPart banehead;

	public Modelbanemask(ModelPart root) {
		this.banehead = root.getChild("banehead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition banehead = partdefinition.addOrReplaceChild("banehead",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F)).texOffs(40, 38)
						.addBox(-3.0F, -3.0046F, -7.0083F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(29, 31)
						.addBox(-3.0F, -0.0046F, -7.0083F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition earl = banehead.addOrReplaceChild("earl", CubeListBuilder.create().texOffs(0, 52).addBox(-1.01F,
				-6.9424F, 0.3243F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -4.7782F, -2.1924F));

		PartDefinition earr = banehead.addOrReplaceChild("earr",
				CubeListBuilder.create().texOffs(0, 52).mirror()
						.addBox(-0.99F, -6.9424F, 0.3243F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.0F, -4.7782F, -2.1924F));

		PartDefinition lowerjaw = banehead.addOrReplaceChild("lowerjaw",
				CubeListBuilder.create().texOffs(17, 42)
						.addBox(-3.0F, -0.95F, -4.85F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)).texOffs(2, 57)
						.addBox(-3.0F, 0.05F, -4.85F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, -0.0546F, -2.1583F, 0.9599F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		banehead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.banehead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.banehead.xRot = headPitch / (180F / (float) Math.PI);
	}
}