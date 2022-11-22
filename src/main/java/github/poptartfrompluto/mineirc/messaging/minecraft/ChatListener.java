package github.poptartfrompluto.mineirc.messaging.minecraft;

import github.poptartfrompluto.mineirc.messaging.Message;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.time.Instant;
import java.util.Date;

public class ChatListener implements Listener {

    @EventHandler
    public void ChatListenerEvent(AsyncPlayerChatEvent event) {
        // TODO: 11/21/2022 Opt-out option
        String senderName = event.getPlayer().getName();
        Instant instant = Instant.now();
        String text = event.getMessage();

        Message message = new Message(senderName, instant, text);
        // TODO: 11/21/2022 Send to relay
    }
}
