package mini.fallout.world.types;

import mini.fallout.init.BiomeInit;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldTypeWasteland extends WorldType
{

	public WorldTypeWasteland() 
	{
		super("Wasteland");
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world) 
	{
		return new BiomeProviderSingle(BiomeInit.WASTE);
	}

}
