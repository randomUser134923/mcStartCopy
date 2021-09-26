package com.signition.listener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.function.Predicate;

public class ChatListener implements Listener {

    Predicate<Entity> isPlayer = (Entity) -> (Entity instanceof Player);

    @EventHandler(priority = EventPriority.MONITOR)
    public void onChatEvent(AsyncPlayerChatEvent event) {


    }

}
