package mini.fallout.objects.items;

import mini.fallout.Main;
import mini.fallout.init.ItemInit;
import mini.fallout.util.IhasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IhasModel
{
	
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
