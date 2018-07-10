package mini.fallout.util.handlers;

import mini.fallout.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
	public static final ResourceLocation ENTITY_BRAHMIN = LootTableList.register(new ResourceLocation(Reference.MODID, "brahmin"));
}
