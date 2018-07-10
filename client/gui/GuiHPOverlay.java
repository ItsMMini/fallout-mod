package mini.fallout.client.gui;

import mini.fallout.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.FoodStats;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiHPOverlay extends Gui 
{
	private final ResourceLocation bars = new ResourceLocation(Reference.MODID + ":textures/gui/overlays.png");
	private final int tex_width = 122, tex_height = 10, bar_width = 100, bar_height = 5, com_width = 153, com_height = 20;
	
	@SubscribeEvent
	public void renderHPOverlay(RenderGameOverlayEvent event) 
	{
		if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT) 
		{
			Minecraft mc = Minecraft.getMinecraft();
			mc.renderEngine.bindTexture(bars);
			float oneUnit = (float)bar_width / mc.player.getMaxHealth();
			int currentWidth = (int)(oneUnit * mc.player.getHealth());
			drawTexturedModalRect(10, 240, 0, 0, tex_width, tex_height);
			drawTexturedModalRect(30, 240, 20, tex_height, currentWidth, bar_height);
		}
	}
	
	@SubscribeEvent
	public void renderAPOverlay(RenderGameOverlayEvent event) 
	{
		if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT) 
		{
			Minecraft mc = Minecraft.getMinecraft();
			mc.renderEngine.bindTexture(bars);
			drawTexturedModalRect(345, 240, 0, 16, tex_width, tex_height);
			drawTexturedModalRect(347, 240, 1, 26, bar_width, bar_height);
		}
	}
	
	@SubscribeEvent
	public void hideHealth(RenderGameOverlayEvent event) 
	{
		if (event.getType() == RenderGameOverlayEvent.ElementType.HEALTH && event.isCancelable())
		{
			event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void hideHunger(RenderGameOverlayEvent event) 
	{
		if (event.getType() == RenderGameOverlayEvent.ElementType.FOOD && event.isCancelable())
		{
			event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void hideLevels(RenderGameOverlayEvent event) 
	{
		if (event.getType() == RenderGameOverlayEvent.ElementType.EXPERIENCE && event.isCancelable())
		{
			event.setCanceled(true);
		}
	}
	
	/*@SubscribeEvent
	public void hideArmor(RenderGameOverlayEvent event) 
	{
		if (event.getType() == RenderGameOverlayEvent.ElementType.ARMOR && event.isCancelable())
		{
			event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void hideHotbar(RenderGameOverlayEvent event) 
	{
		if (event.getType() == RenderGameOverlayEvent.ElementType.HOTBAR && event.isCancelable())
		{
			event.setCanceled(true);
		}
	}*/
	
	/*@SubscribeEvent
	public void renderCompassOverlay(RenderGameOverlayEvent event) 
	{
		if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT) 
		{
			Minecraft mc = Minecraft.getMinecraft();
			mc.renderEngine.bindTexture(bars);
			drawTexturedModalRect(160, 240, 0, 32, com_width, com_height);
		}
	}*/	
}