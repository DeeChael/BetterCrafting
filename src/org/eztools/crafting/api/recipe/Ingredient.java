package org.eztools.crafting.api.recipe;

import org.bukkit.inventory.ItemStack;

public interface Ingredient {

    ItemStack getItemStack();

    boolean isSame(ItemStack itemStack);

}
