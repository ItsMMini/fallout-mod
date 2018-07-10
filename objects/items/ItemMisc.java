package mini.fallout.objects.items;

import mini.fallout.Main;
import mini.fallout.init.ItemInit;
import mini.fallout.util.IhasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMisc extends Item implements IhasModel
{
	public ItemMisc(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabModMisc);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");		
	}

}
