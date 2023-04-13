import java.util.Vector;

public class TelegramMessageApp extends MessagingApp {
    TelegramMessageApp() {
        super();
        appName = "Telegram";
        messages = new Vector<>();
        messagesSent = new Vector<>();
        messagesReceived = new Vector<>();
    }
}
