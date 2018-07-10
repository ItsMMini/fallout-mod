package mini.fallout.objects.items;

import java.util.List;

import mini.fallout.Main;
import mini.fallout.init.ItemInit;
import mini.fallout.proxy.ClientProxy;
import mini.fallout.util.IhasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMedical extends Item implements IhasModel
{
	public ItemMedical(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabMedical);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
