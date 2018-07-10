package mini.fallout.client.event;

import org.lwjgl.input.Keyboard;

import com.ibm.icu.impl.ICUService.Key;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;


public class InputEvent 
{	
	public static boolean pipboy = false;
	
	@SubscribeEvent
	public void onKeyInput(KeyInputEvent event) 
	{
		pipboy = Keyboard.isKeyDown(Keyboard.KEY_P);
		System.out.println("PipBoy on");
	}
}
