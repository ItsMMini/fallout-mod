package mini.fallout.util;

import mini.fallout.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyHandler 
{
	@SubscribeEvent
	public void onKeyPressed(KeyInputEvent event) 
	{
		if(Main.keyBinding.isKeyDown()) 
		{
			
		}
	}
}
