package mini.fallout.objects.armor;

import java.util.List;

import mini.fallout.Main;
import mini.fallout.init.ItemInit;
import mini.fallout.util.IhasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ArmorBase extends ItemArmor implements IhasModel 
{

	public ArmorBase(String name, ArmorMaterial material, int damageReduceAmount, EntityEquipmentSlot equipmentSlot) 
	{
		super(material, damageReduceAmount, equipmentSlot);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
	}
		
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
