package mini.fallout.entity;

import mini.fallout.Main;
import mini.fallout.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	
	public static void registerEntities()
	{
		registerEntity("Brahmin", EntityBrahmin.class, Main.ENTITY_BRAHMIN, 25, 6232832, 7536640);
		registerEntity("Radroach", EntityRadroach.class, Main.ENTITY_RADROACH, 15, 2826240, 3416064);
		registerEntity("bullet", EntityBullet.class, 122, 64, 10, true);
		registerEntity("molotov_cocktail", EntityMolotov.class, 123, 64, 10, true);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int frequency, boolean updates)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, frequency, updates);
	}
}
