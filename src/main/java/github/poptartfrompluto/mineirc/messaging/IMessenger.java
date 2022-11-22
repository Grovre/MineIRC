package github.poptartfrompluto.mineirc.messaging;

public interface IMessenger<T> {

    boolean send(T toSend);
    T receive();
}
