package github.poptartfrompluto.mineirc;

import org.bukkit.plugin.java.JavaPlugin;

public final class MineIRC extends JavaPlugin {

    protected static MineIRC plugin;

    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
