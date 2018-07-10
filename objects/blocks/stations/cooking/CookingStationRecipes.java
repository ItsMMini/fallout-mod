package mini.fallout.objects.blocks.stations.cooking;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import mini.fallout.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CookingStationRecipes 
{
	private static final CookingStationRecipes INSTANCE = new CookingStationRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> cookingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

	public static CookingStationRecipes getInstance() 
	{
		return INSTANCE;
	}
	
	private CookingStationRecipes() 
	{
		addCookingRecipe(new ItemStack(ItemInit.ITEM_PLASTIC), new ItemStack(Items.BEEF), new ItemStack(Items.BREAD), 5.0F);
		addCookingRecipe(new ItemStack(Items.WHEAT), new ItemStack(Items.WATER_BUCKET), new ItemStack(ItemInit.FOOD_NOODLES), 5.0F);
	}
	
	public void addCookingRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getCookingResult(input1, input2) != ItemStack.EMPTY) return;
		this.cookingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getCookingResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.cookingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) 
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getCookingList()
	{
		return this.cookingList;
	}
	
	public float getCookingExperience(ItemStack stack) 
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}

}
