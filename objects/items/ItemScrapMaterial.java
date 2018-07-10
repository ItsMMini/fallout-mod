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

public class ItemScrapMaterial extends Item implements IhasModel
{
	public ItemScrapMaterial(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabComponents);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) 
	{
		tooltip.add("Crafting Component");
		super.addInformation(stack, world, tooltip, flag);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
