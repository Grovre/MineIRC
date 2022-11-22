package github.poptartfrompluto.mineirc.messaging;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MinecraftDiscordMessenger implements IMessenger<Message> {

    private Queue<Message> sendQueue = new ConcurrentLinkedQueue<>();
    private Queue<Message> receiveQueue = new ConcurrentLinkedQueue<>();

    @Override
    public boolean send(Message toSend) {
        sendQueue.add(toSend);
    }

    @Override
    public Message receive() {
        // TODO: 11/21/2022 Receive from discord
        throw new NotImplementedException();
    }
}
