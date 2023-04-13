import java.util.Vector;

public class WhatsAppMessageApp extends MessagingApp {
    WhatsAppMessageApp() {
        super();
        appName = "WhatsApp";
        messages = new Vector<>();
        messagesSent = new Vector<>();
        messagesReceived = new Vector<>();
    }
}
