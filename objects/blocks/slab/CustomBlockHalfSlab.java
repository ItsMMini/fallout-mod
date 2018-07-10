package mini.fallout.objects.blocks.slab;

import mini.fallout.Main;
import net.minecraft.item.Item;

public class CustomBlockHalfSlab extends CustomBlockSlab
{

	public CustomBlockHalfSlab(String name) 
	{
		super(name);
	}

	@Override
	public boolean isDouble() 
	{
		return false;
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
