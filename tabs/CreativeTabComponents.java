package mini.fallout.tabs;

import mini.fallout.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabComponents extends CreativeTabs 
{

	public CreativeTabComponents(int index, String label) 
	{
		super(index, label);
	}
	
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.ITEM_GEAR);
	}
	
}
