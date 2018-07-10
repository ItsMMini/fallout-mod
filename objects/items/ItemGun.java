package mini.fallout.objects.items;

import java.util.List;

import mini.fallout.Main;
import mini.fallout.entity.EntityBullet;
import mini.fallout.init.ItemInit;
import mini.fallout.proxy.ClientProxy;
import mini.fallout.util.IhasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import scala.swing.TextComponent;

public class ItemGun extends Item implements IhasModel
{
	
	private final double damage;
	private final float accuracy;
	
	public ItemGun(String name, double damage, float accuracy) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		this.damage = damage;
		this.accuracy = accuracy;
		this.setCreativeTab(Main.tabModMisc);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		if(!worldIn.isRemote) 
		{
			playerIn.sendMessage(new TextComponentString("Firing!"));
			EntityBullet bullet = new EntityBullet(worldIn, playerIn, accuracy);
			worldIn.spawnEntity(bullet);
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
