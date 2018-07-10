package mini.fallout.init;

import java.util.ArrayList;
import java.util.List;

import mini.fallout.objects.armor.ArmorBase;
import mini.fallout.objects.items.ItemBase;
import mini.fallout.objects.items.ItemGun;
import mini.fallout.objects.items.ItemMedical;
import mini.fallout.objects.items.ItemMisc;
import mini.fallout.objects.items.ItemScrapMaterial;
import mini.fallout.objects.items.foods.ItemFoods;
import mini.fallout.objects.items.weapons.ItemExplosive;
import mini.fallout.objects.items.weapons.WeaponMelee;
import mini.fallout.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ArmorMaterial ARMOR_T45 = EnumHelper.addArmorMaterial("armor_T45", Reference.MODID + ":army", 50, new int[]{6, 9, 11, 6}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F); 
	public static final ToolMaterial MELEE_WOOD = EnumHelper.addToolMaterial("melee_wood", 0, 100, 3.5F, 1.5F, 0);
	
	//Components
	public static final Item ITEM_ACID = new ItemScrapMaterial("item_acid");
	public static final Item ITEM_ADHESIVE = new ItemScrapMaterial("item_adhesive");
	public static final Item ITEM_ALUMINUM = new ItemScrapMaterial("item_aluminum");
	public static final Item ITEM_ANTISEPTIC = new ItemScrapMaterial("item_antiseptic");
	public static final Item ITEM_ASBESTOS = new ItemScrapMaterial("item_asbestos");
	public static final Item ITEM_BALLISTICFIBER = new ItemScrapMaterial("item_ballisticfiber");
	public static final Item ITEM_CERAMIC = new ItemScrapMaterial("item_ceramic");
	public static final Item ITEM_CIRCUITRY = new ItemScrapMaterial("item_circuitry");
	public static final Item ITEM_CLOTH = new ItemScrapMaterial("item_cloth");
	public static final Item ITEM_COPPER = new ItemScrapMaterial("item_copper");
	public static final Item ITEM_CORK = new ItemScrapMaterial("item_cork");
	public static final Item ITEM_CRYSTAL = new ItemScrapMaterial("item_crystal");
	public static final Item ITEM_FERTILIZER = new ItemScrapMaterial("item_fertilizer");
	public static final Item ITEM_FIBEROPTICS = new ItemScrapMaterial("item_fiberoptics");
	public static final Item ITEM_FIBERGLASS = new ItemScrapMaterial("item_fiberglass");
	public static final Item ITEM_GEAR = new ItemScrapMaterial("item_gear");
	public static final Item ITEM_LEAD = new ItemScrapMaterial("item_lead");
	public static final Item ITEM_NUCLEARMATERIAL = new ItemScrapMaterial("item_nuclearmaterial");
	public static final Item ITEM_OIL = new ItemScrapMaterial("item_oil");
	public static final Item ITEM_PLASTIC = new ItemScrapMaterial("item_plastic");
	public static final Item ITEM_RUBBER = new ItemScrapMaterial("item_rubber");
	public static final Item ITEM_SCREW = new ItemScrapMaterial("item_screw");
	public static final Item ITEM_SILVER = new ItemScrapMaterial("item_silver");
	public static final Item ITEM_SPRING = new ItemScrapMaterial("item_spring");
	public static final Item ITEM_STEEL = new ItemScrapMaterial("item_steel");
	
	//Foodstuffs
	public static final Item FOOD_NOODLES = new ItemFoods("food_noodles", 0, 0, false, new PotionEffect(Potion.getPotionById(10), 100, 3));
	public static final Item FOOD_RIBEYE = new ItemFoods("food_ribeye", 4, 6, false);
	public static final Item FOOD_BRAHMIN = new ItemFoods("food_brahmin", 1, 4, false);
	public static final Item NUKA_COLA = new ItemFoods("nuka_cola", 3, 6, false);
	public static final Item ITEM_ALCOHOL = new ItemFoods("item_alcohol", 3, 6, false, new PotionEffect(Potion.getPotionById(9), 1200, 2, false, false));
	public static final Item FOOD_TATO = new ItemFoods("food_tato", 4, 5, false); 
	
	//Miscellaneous
	public static final Item ITEM_CIG = new ItemMisc("item_cig");
	public static final Item ITEM_NUKE = new ItemMisc("item_nuke");
	public static final Item VAULTTEC_BOOK = new ItemMisc("item_vaulttec_manual");
	public static final Item BURNED_VAULTTEC_BOOK = new ItemMisc("item_tattered_vaulttec_manual");
	public static final Item GUIDE_BOOK = new ItemMisc("item_survival_guide");
	
	public static final Item MOLOTOV = new ItemExplosive("item_molotov");
	
	//Medical
	public static final Item MED_STIMPACK = new ItemMedical("med_stimpack");
	public static final Item MED_JET  = new ItemMedical("med_jet");
	
	public static final Item GUN_10MM = new ItemGun("gun_10mm", 5, 2.0F);
	public static final Item BASEBALL_BAT = new WeaponMelee("baseball_bat", MELEE_WOOD);
	
	//Armor
	public static final Item T45_HELMET = new ArmorBase("t45_helmet", ARMOR_T45, 1, EntityEquipmentSlot.HEAD);
	public static final Item T45_HELMET_RUSTED = new ItemMisc("t45_helmet_rusted");
	public static final Item T51_HELMET = new ItemMisc("t51_helmet");
	public static final Item ARMY_HELMET = new ArmorBase("army_helmet", ARMOR_T45, 1, EntityEquipmentSlot.HEAD);
	
	
	public static final Item MOD_LOGO = new ItemBase("mod_logo");
}
