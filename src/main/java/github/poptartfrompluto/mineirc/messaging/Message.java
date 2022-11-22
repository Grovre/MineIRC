package github.poptartfrompluto.mineirc.messaging;

import java.time.Instant;

public class Message {

    private final String senderName;
    private final Instant dateSent;
    private final String text;

    public Message(String senderName, Instant dateSent, String text) {
        this.senderName = senderName;
        this.dateSent = dateSent;
        this.text = text;
    }

    public String getSenderName() {
        return senderName;
    }

    public Instant getDateSent() {
        return dateSent;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "senderName='" + senderName + '\'' +
                ", dateSent=" + dateSent +
                ", text='" + text + '\'' +
                '}';
    }

    public String toFormattedString() {
        return senderName + ":" + dateSent.toString() + ":" + text;
    }

    public static Message fromFormattedString(String str) {
        String[] parts = new String[3];
        for (int i = 0; i < parts.length; i++) {
            int colonIndex = str.indexOf(':');
            parts[i] = str.substring(0, colonIndex);
            str = str.substring(colonIndex);
        }

        // TODO: 11/21/2022 Test parsing
        return new Message(parts[0], Instant.parse(parts[1]), parts[2]);
    }
}
