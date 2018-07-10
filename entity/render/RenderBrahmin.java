package mini.fallout.entity.render;

import mini.fallout.entity.EntityBrahmin;
import mini.fallout.entity.model.ModelBrahmin;
import mini.fallout.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrahmin extends RenderLiving<EntityBrahmin>
{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/brahmin.png");

	public RenderBrahmin(RenderManager manager) 
	{
		super(manager, new ModelBrahmin(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityBrahmin entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityBrahmin entityLiving, float p_77043_2_, float p_77043_3_, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, p_77043_3_, partialTicks);
	}
	
}
