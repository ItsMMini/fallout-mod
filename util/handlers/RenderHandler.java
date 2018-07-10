package mini.fallout.util.handlers;

import mini.fallout.entity.EntityBrahmin;
import mini.fallout.entity.EntityRadroach;
import mini.fallout.entity.render.RenderBrahmin;
import mini.fallout.entity.render.RenderRadroach;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEnityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBrahmin.class, new IRenderFactory<EntityBrahmin>()
		{
			@Override
			public Render<? super EntityBrahmin> createRenderFor(RenderManager manager) {
				return new RenderBrahmin(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityRadroach.class, new IRenderFactory<EntityRadroach>()
		{
			@Override
			public Render<? super EntityRadroach> createRenderFor(RenderManager manager) {
				return new RenderRadroach(manager);
			}
		});
	}
}
