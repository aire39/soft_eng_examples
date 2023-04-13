import java.util.Vector;

public abstract class MessagingApp {
    protected Vector<MessageType> messages;
    protected Vector<MessageType> messagesSent;
    protected Vector<MessageType> messagesReceived;

    protected String appName;

    void ReceiveMessage(MessageType message) {
        messages.add(message);
        messagesReceived.add(message);
        System.out.println(appName + " received message!");
    }

    void SendMessage(MessageType message, MessagingApp message_app) {
        message_app.ReceiveMessage(message);
        messagesSent.add(message);

        System.out.print(appName + " ");
        message.SendMessage();
    }
}
