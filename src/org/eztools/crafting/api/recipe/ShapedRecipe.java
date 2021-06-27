package org.eztools.crafting.api.recipe;

import org.apache.commons.lang.Validate;
import org.bukkit.inventory.ItemStack;
import org.eztools.crafting.api.EzTKey;
import org.eztools.crafting.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ShapedRecipe implements Recipe {

    private final EzTKey registeredKey;

    private ItemStack result;

    private String[] shape = new String[] { "   ", "   ", "   " };

    private final Map<Character,Ingredient> ingredients = new HashMap<>();

    public ShapedRecipe(EzTKey ezTKey, ItemStack resultItemStack) {
        this.registeredKey = ezTKey;
        this.result = resultItemStack;
    }

    public ShapedRecipe setIngredient(char key, Ingredient ingredient) {
        if (ingredient == null) return this;
        if (!(shape[0].contains(String.valueOf(key)) || shape[1].contains(String.valueOf(key)) || shape[2].contains(String.valueOf(key)))) return this;
        this.ingredients.put(key, ingredient);
        return this;
    }

    public Ingredient getIngredient(char key) {
        return ingredients.containsKey(key) ? ingredients.get(key) : new EmptyIngredient();
    }

    public void setShape(String... shape) {
        if (shape == null) return;
        if (shape.length == 0 || shape.length >= 4) return;;
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : shape) {
            stringBuilder.append(string);
        }
        String last = stringBuilder.toString();
        if (last.length() == 0) return;
        if (last.length() > 9) last = last.substring(0, 9);
        if (9 - last.length() > 0) last += StringUtils.multiply(" ", 9 - last.length());
        if (StringUtils.isFullOfSpace(last)) return;
        this.shape = new String[] { last.substring(0, 3), last.substring(3, 6), last.substring(6, 9)};
    }

    public String[] getShape() {
        return shape;
    }

    @Override
    public EzTKey getRegisteredKey() {
        return registeredKey;
    }

    @Override
    public boolean compare(Recipe recipeToCompare) {
        return false;
    }

    @Override
    public ItemStack getResult() {
        return this.result;
    }

    public void setResult(ItemStack result) {
        this.result = result;
    }

}
