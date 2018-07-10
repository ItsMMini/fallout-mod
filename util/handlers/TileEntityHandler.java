package mini.fallout.util.handlers;

import mini.fallout.objects.blocks.stations.cooking.TileEntityCookingStation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities() 
	{
		GameRegistry.registerTileEntity(TileEntityCookingStation.class, "cooking_station");
	}
}
