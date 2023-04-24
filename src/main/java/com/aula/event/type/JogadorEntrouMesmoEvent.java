package com.aula.event.type;

import com.aula.event.EventBuilder;
import org.bukkit.entity.Player;

public class JogadorEntrouMesmoEvent extends EventBuilder {

    private final Player player;

    public JogadorEntrouMesmoEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

}
