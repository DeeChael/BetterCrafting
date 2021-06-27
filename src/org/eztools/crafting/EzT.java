package org.eztools.crafting;

import org.bukkit.plugin.java.JavaPlugin;

public class EzT extends JavaPlugin {

    protected static BetterCrafting INSTANCE;

    public static BetterCrafting instance() {
        return INSTANCE;
    }

}
