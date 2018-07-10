package mini.fallout.util.handlers;

import mini.fallout.util.Reference;
import mini.fallout.util.message.MessagePipboy;
import mini.fallout.util.message.MessageUpdate;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class PacketHandler 
{	
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID);
	
	public static void init() 
	{
		
		
		INSTANCE.registerMessage(MessagePipboy.class, MessagePipboy.class, 0, Side.SERVER);
		INSTANCE.registerMessage(MessageUpdate.class, MessageUpdate.class, 1, Side.CLIENT);
	}
}
