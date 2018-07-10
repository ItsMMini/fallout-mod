package mini.fallout.world.biomes;

import mini.fallout.entity.EntityBrahmin;
import mini.fallout.init.BlockInit;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockOre;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeWasteland extends Biome 
{
	public BiomeWasteland() 
	{
		super(new BiomeProperties("Wasteland").setBaseHeight(0.3F).setHeightVariation(0.1F).setTemperature(3.0F).setRainDisabled().setWaterColor(5531648));
		
		topBlock = BlockInit.WASTE_DIRT.getDefaultState();
		
		this.decorator.deadBushPerChunk = 2;
		this.decorator.treesPerChunk = -999;
		this.decorator.clayPerChunk = -999;
		this.decorator.flowersPerChunk = -999;
		this.decorator.grassPerChunk = -999;
		this.decorator.reedsPerChunk = -999;
		this.decorator.sandPatchesPerChunk = 1;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityBrahmin.class, 2, 1, 2));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float currentTemperature) 
	{
		return 14144920;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getModdedBiomeGrassColor(int original) 
	{
		return 6579222;
	}
	
}
