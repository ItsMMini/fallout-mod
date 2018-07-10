package mini.fallout.objects.items.foods;

import mini.fallout.Main;
import mini.fallout.init.ItemInit;
import mini.fallout.util.IhasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoods extends ItemFood implements IhasModel
{
	
	private PotionEffect[] effects;

	public ItemFoods(String name, int amount, float saturation, boolean isWolfFood, PotionEffect...potionEffects) 
	{
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.effects = potionEffects;
		this.setCreativeTab(Main.tabFood);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) 
	{
		if(!worldIn.isRemote) 
		{
			for(PotionEffect effect : effects) 
				{
					player.addPotionEffect(new PotionEffect(effect));
					System.out.println("You drunk boyyy");
				}
			return;
		}
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
