package org.eztools.crafting.api.recipe;

import org.bukkit.inventory.ItemStack;
import org.eztools.crafting.api.EzTKey;

public interface Recipe {

    EzTKey getRegisteredKey();

    boolean compare(Recipe recipeToCompare);

    ItemStack getResult();

}
