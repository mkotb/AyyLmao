package ayy;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * ayy lmao
 */
public class Lmao extends JavaPlugin implements Listener {

    @Override
    public void onLoad() {
        getLogger().info("ayy lmao");
    }

    @Override
    public void onEnable() {
        getLogger().info("ayy lmao");
    }

    @Override
    public void onDisable() {
        getLogger().info("ayy lmao");
    }

    @EventHandler
    public void ayyLmao(PlayerChatEvent ayy) {
        if (ayy.getMessage().contains("alien")) {
            Bukkit.broadcastMessage("ayy lmao");
        }

         if (ayy.getMessage().contains("ayy")) {
             Bukkit.broadcastMessage("lmao");
         }
    }
}
