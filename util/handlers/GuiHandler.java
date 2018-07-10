package mini.fallout.util.handlers;

import mini.fallout.objects.blocks.stations.cooking.ContainerCookingStation;
import mini.fallout.objects.blocks.stations.cooking.GuiCookingStation;
import mini.fallout.objects.blocks.stations.cooking.TileEntityCookingStation;
import mini.fallout.objects.blocks.stations.crafting.GuiCraftingStation;
import mini.fallout.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_COOKING_STATION) 
		{
			return new ContainerCookingStation(player.inventory, (TileEntityCookingStation)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		if(ID == Reference.GUI_CRAFTING_STATION) 
		{
			return new GuiCraftingStation(player.inventory, world, new BlockPos(x, y, z));
		}
		
		return null;

	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_COOKING_STATION) 
		{
			return new GuiCookingStation(player.inventory, (TileEntityCookingStation)world.getTileEntity(new BlockPos(x, y, z)));		
		}
		
		if(ID == Reference.GUI_CRAFTING_STATION) 
		{
			return new GuiCraftingStation(player.inventory, world, new BlockPos(x, y, z));
		}
		
		return null;

	}
	
}
