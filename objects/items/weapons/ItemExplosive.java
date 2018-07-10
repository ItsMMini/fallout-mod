package mini.fallout.objects.items.weapons;

import java.util.List;

import mini.fallout.Main;
import mini.fallout.entity.EntityMolotov;
import mini.fallout.init.ItemInit;
import mini.fallout.objects.items.ItemBase;
import mini.fallout.objects.items.ItemScrapMaterial;
import mini.fallout.proxy.ClientProxy;
import mini.fallout.util.IhasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntityLlamaSpit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemExplosive extends ItemBase
{
	public ItemExplosive(String name) 
	{
		super(name);
		this.maxStackSize = 16;
		setCreativeTab(Main.tabExplosives);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		EntityEgg fireball = new EntityEgg(worldIn, 1, 1, 1);
		
		fireball.setPosition(playerIn.posX + aim.x * 2D, playerIn.posY + aim.y * 6D, playerIn.posZ + aim.z * 6D);
		worldIn.spawnEntity(fireball);
		
		item.shrink(1);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
	
}
