package ayy;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * ayyy lmao
 */
public class Lmao extends JavaPlugin implements Listener {

    /**
     *  ayyy lmao
     */
    @Override
    public void onLoad() {
        getLogger().info("ayyy lmao");
    }

    /**
     *  ayyy lmao
     */
    @Override
    public void onEnable() {
        getLogger().info("ayyy lmao");
    }

    /**
     *  ayyy lmao
     */
    @Override
    public void onDisable() {
        getLogger().info("ayyy lmao");
    }

    /**
     *  ayyy lmao
     */
    @EventHandler
    public void ayyLmao(PlayerChatEvent ayy) {
        if (ayy.getMessage().contains("alien")) { // ayyy lmao
            Bukkit.broadcastMessage("ayy lmao");
        }

         if (ayy.getMessage().contains("ayyy")) { // ayyy lmao
             Bukkit.broadcastMessage("lmao");
         }
    }
}
