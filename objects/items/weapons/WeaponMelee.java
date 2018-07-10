package mini.fallout.objects.items.weapons;

import java.util.Collection;
import java.util.UUID;

import com.google.common.collect.Multimap;

import mini.fallout.Main;
import mini.fallout.init.ItemInit;
import mini.fallout.util.IhasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentArrowKnockback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class WeaponMelee extends ItemSword implements IhasModel
{

	public WeaponMelee(String name, ToolMaterial material)
	{
		super(material);
		setMaxStackSize(1);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabMelee);
		ItemInit.ITEMS.add(this);
	}
	
	
	 public float getAttackDamage()
	    {
	        return this.getAttackDamage();
	    }
	 
	 @Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) 
	 {
		 Vec3d look = attacker.getLookVec().normalize();
		 double knockback = 1.25;
		 target.addVelocity(look.x * knockback, look.y * knockback, look.z * knockback);
		 
		 
		return true;
	 }
	 
	 @Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) 
	 {
		 Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(slot, stack);
		 
		 if (slot == EntityEquipmentSlot.MAINHAND) 
		 {
		 multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4000000953674316D, 0));
		 }
		 return multimap;
	}


	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
