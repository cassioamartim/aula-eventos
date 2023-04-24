package com.aula;

import com.aula.event.type.JogadorEntrouMesmoEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void join(PlayerJoinEvent event) {
        event.setJoinMessage(null);

        new JogadorEntrouMesmoEvent(event.getPlayer()).call();
    }

    @EventHandler
    public void jogador(JogadorEntrouMesmoEvent event) {
        Player player = event.getPlayer();

        player.sendMessage("§aVocê entrou mesmo!");
    }
}

