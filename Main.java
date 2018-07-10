package mini.fallout;

import org.lwjgl.input.Keyboard;

import mini.fallout.client.gui.GuiHPOverlay;
//import mini.fallout.client.gui.GuiHPOverlay;
import mini.fallout.entity.EntityInit;
import mini.fallout.init.BiomeInit;
import mini.fallout.init.ItemInit;
import mini.fallout.proxy.CommonProxy;
import mini.fallout.tabs.CreativeTabBlocks;
import mini.fallout.tabs.CreativeTabComponents;
import mini.fallout.tabs.CreativeTabExplosives;
import mini.fallout.tabs.CreativeTabFood;
import mini.fallout.tabs.CreativeTabMedical;
import mini.fallout.tabs.CreativeTabMelee;
import mini.fallout.tabs.CreativeTabModMisc;
import mini.fallout.util.KeyHandler;
import mini.fallout.util.Reference;
import mini.fallout.util.handlers.GuiHandler;
import mini.fallout.util.handlers.PacketHandler;
import mini.fallout.util.handlers.RenderHandler;
import mini.fallout.world.gen.WorldGenCustomStructures;
import mini.fallout.world.types.WorldTypeWasteland;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class Main
{
	public static final int ENTITY_BRAHMIN = 120;
	public static final int ENTITY_RADROACH = 121;
	
	public static KeyBinding keyBinding = new KeyBinding("Enable/Disable Fallout overlay", Keyboard.KEY_O, "category.fallout");
	public static KeyBinding key_pipboy = new KeyBinding("key.pipboy", Keyboard.KEY_P, "category.fallout");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@Instance
	public static Main instance;
	
	public static CreativeTabComponents tabComponents;
	public static CreativeTabBlocks tabBlocks;
	public static CreativeTabFood tabFood;
	public static CreativeTabMedical tabMedical;
	public static CreativeTabMelee tabMelee;
	public static CreativeTabExplosives tabExplosives;
	public static CreativeTabModMisc tabModMisc;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{
		tabComponents = new CreativeTabComponents(CreativeTabs.getNextID(), "tab_components");
		tabBlocks = new CreativeTabBlocks(CreativeTabs.getNextID(), "tab_blocks");
		tabFood = new CreativeTabFood(CreativeTabs.getNextID(), "tab_food");
		tabMedical = new CreativeTabMedical(CreativeTabs.getNextID(), "tab_medical");
		tabMelee = new CreativeTabMelee(CreativeTabs.getNextID(), "tab_melee");
		tabExplosives = new CreativeTabExplosives(CreativeTabs.getNextID(), "tab_explosives");
		tabModMisc = new CreativeTabModMisc(CreativeTabs.getNextID(), "tab_mod_misc");
		
		EntityInit.registerEntities();
		RenderHandler.registerEnityRenders();
		PacketHandler.init();
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		BiomeInit.registerBiomes();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		ClientRegistry.registerKeyBinding(keyBinding);
		ClientRegistry.registerKeyBinding(key_pipboy);
		FMLCommonHandler.instance().bus().register(new KeyHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		
		GameRegistry.addSmelting(ItemInit.FOOD_BRAHMIN, new ItemStack(ItemInit.FOOD_RIBEYE), 5F);
		BrewingRecipeRegistry.addRecipe(new ItemStack(Items.WATER_BUCKET), new ItemStack(Items.MAGMA_CREAM), new ItemStack(ItemInit.ITEM_ACID));
		BrewingRecipeRegistry.addRecipe(new ItemStack(Items.POTIONITEM, 6), new ItemStack(Items.POTATO), new ItemStack(ItemInit.ITEM_ALCOHOL));
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
		WorldType WASTE = new WorldTypeWasteland();
		MinecraftForge.EVENT_BUS.register(new GuiHPOverlay());
	}
}
