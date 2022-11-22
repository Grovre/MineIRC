package github.poptartfrompluto.mineirc;

import github.poptartfrompluto.mineirc.messaging.IMessenger;
import github.poptartfrompluto.mineirc.messaging.Message;
import org.bukkit.plugin.java.JavaPlugin;

public final class MineIRC extends JavaPlugin {

    protected static MineIRC plugin;
    public static IMessenger<Message> messenger;

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
