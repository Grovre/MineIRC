package github.poptartfrompluto.mineirc.messaging;

import java.util.Date;

public class Message {

    private final String senderName;
    private final Date dateSent;
    private final String text;

    public Message(String senderName, Date dateSent, String text) {
        this.senderName = senderName;
        this.dateSent = dateSent;
        this.text = text;
    }

    public String getSenderName() {
        return senderName;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public String getText() {
        return text;
    }
}
