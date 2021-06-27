package org.eztools.crafting.api.recipe;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class EmptyIngredient implements Ingredient {

    @Override
    public ItemStack getItemStack() {
        return new ItemStack(Material.AIR);
    }

    @Override
    public boolean isSame(ItemStack itemStack) {
        return itemStack != null && itemStack.getType() == Material.AIR;
    }

}
