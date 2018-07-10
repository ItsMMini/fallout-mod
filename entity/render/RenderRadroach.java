package mini.fallout.entity.render;

import mini.fallout.entity.EntityRadroach;
import mini.fallout.util.Reference;
import net.minecraft.client.model.ModelEnderMite;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRadroach extends RenderLiving<EntityRadroach> 
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/radroach.png");

	public RenderRadroach(RenderManager manager) 
	{
		super(manager, new ModelEnderMite(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityRadroach entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityRadroach entityLiving, float p_77043_2_, float p_77043_3_, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, p_77043_3_, partialTicks);
	}
}
