package mini.fallout.util.message;

import io.netty.buffer.ByteBuf;
import mini.fallout.util.handlers.PacketHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessagePipboy implements IMessage, IMessageHandler<MessagePipboy, IMessage>
{
	private boolean pipboy;
	
	public MessagePipboy() {}
	
	public MessagePipboy(boolean pipboy) 
	{
		this.pipboy = pipboy;
	}

	@Override
	public IMessage onMessage(MessagePipboy message, MessageContext ctx) 
	{
		EntityPlayer player = ctx.getServerHandler().player;
		PacketHandler.INSTANCE.sendToAll(new MessageUpdate(player.getEntityId(), message.pipboy));
		return null;
	}

	@Override
	public void fromBytes(ByteBuf buf) 
	{
		this.pipboy = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeBoolean(pipboy);
	}

}
