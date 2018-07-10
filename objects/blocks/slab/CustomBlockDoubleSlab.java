package mini.fallout.objects.blocks.slab;

import mini.fallout.Main;
import net.minecraft.item.Item;

public class CustomBlockDoubleSlab extends CustomBlockSlab
{

	public CustomBlockDoubleSlab(String name) 
	{
		super(name);
	}

	@Override
	public boolean isDouble() 
	{
		return true;
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
