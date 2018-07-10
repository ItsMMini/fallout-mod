package mini.fallout.init;

import java.util.ArrayList;
import java.util.List;

import mini.fallout.Main;
import mini.fallout.objects.blocks.BlockBase;
import mini.fallout.objects.blocks.BlockKit;
import mini.fallout.objects.blocks.BlockTatoPlant;
import mini.fallout.objects.blocks.BlockTent;
import mini.fallout.objects.blocks.BlockVending;
import mini.fallout.objects.blocks.slab.CustomBlockDoubleSlab;
import mini.fallout.objects.blocks.slab.CustomBlockHalfSlab;
import mini.fallout.objects.blocks.stations.cooking.BlockCookingStation;
import mini.fallout.objects.blocks.stations.crafting.BlockCraftingStation;
import mini.fallout.tabs.CreativeTabBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;
import net.minecraft.creativetab.CreativeTabs;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COOKING_STATION = new BlockCookingStation("cooking_station");
	public static final Block CRAFTING_STATION = new BlockCraftingStation("crafting_station");
	
	public static final Block WASTE_DIRT = new BlockBase("waste_dirt", Material.GROUND).setHardness(0.7F);
	public static final Block NUKA_MACHINE = new BlockVending("nukacola_machine", Material.IRON);
	public static final Block MED_KIT = new BlockKit("medkit", Material.IRON);
	public static final Block TEST_TENT = new BlockTent("test_tent", Material.CLOTH);
	public static final Block TATO_PLANT = new BlockTatoPlant("tato_plant");
	
	public static final Block BLUE_HALF = new CustomBlockHalfSlab("blue_slab_half");
	public static final Block BLUE_DOUBLE = new CustomBlockDoubleSlab("blue_slab_double");
	
}
