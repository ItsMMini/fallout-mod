package mini.fallout.util.compat.jei.cookingStation;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Lists;
import com.google.common.collect.Table;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import mini.fallout.objects.blocks.stations.cooking.CookingStationRecipes;
import net.minecraft.item.ItemStack;

public class CookingRecipeMaker 
{
	public static List<CookingRecipe> getRecipes(IJeiHelpers helpers)
	{
		IStackHelper stackHelper = helpers.getStackHelper();
		CookingStationRecipes instance = CookingStationRecipes.getInstance();
		Table<ItemStack, ItemStack, ItemStack> recipes = instance.getCookingList();
		List<CookingRecipe> jeiRecipes = Lists.newArrayList();
		
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : recipes.columnMap().entrySet()) 
		{
			for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
			{
				ItemStack input1 = entry.getKey();
				ItemStack input2 = ent.getKey();
				ItemStack output = ent.getValue();
				List<ItemStack> inputs = Lists.newArrayList(input1, input2);
				CookingRecipe recipe = new CookingRecipe(inputs, output);
				jeiRecipes.add(recipe);
			}
		}
		return jeiRecipes;
	}
}
