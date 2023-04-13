import java.util.Vector;

public class FacebookMessageApp extends MessagingApp {

    FacebookMessageApp() {
        super();
        appName = "Facebook";
        messages = new Vector<>();
        messagesSent = new Vector<>();
        messagesReceived = new Vector<>();
    }
}
