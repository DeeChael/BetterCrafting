package org.eztools.crafting.api;

import org.bukkit.plugin.Plugin;

public class EzTKey {

    private final String prefix;

    private final String name;

    protected EzTKey(String prefix, String name) {
        this.prefix = prefix;
        this.name = name;
    }

    public EzTKey(Plugin plugin, String name) {
        this(plugin.getName(), name);
    }

    public String getPrefix() {
        return prefix;
    }

    public String getName() {
        return name;
    }

}
