import java.util.Iterator;
import java.util.Vector;

public class User implements IterableByUser {
    private MessageMomento momento;
    private Message message;
    private Vector<Message> receivedMessages;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private User otherUser;
    private String userName;

    private Vector<User> blockedUsers;

    public User(String user_name, ChatServer server) {
        chatHistory = new ChatHistory();
        message = new Message(this);
        ConnectToServer(server);
        receivedMessages = new Vector<>();
        blockedUsers = new Vector<>();
        userName = user_name;
    }
    public void SetMessage(String text) {
        message.SetText(text);

    }
    public void Receive(Message message) {

        System.out.println(userName + " received message from " + message.GetUser().GetUsername());
        message.AddUserReceiver(this);

        receivedMessages.add(message);
        otherUser = message.GetUser();
        chatHistory.AddText(message);
    }
    public void Send() {

        System.out.println("Sending Message to Server...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chatHistory.AddText(message);
        chatServer.send(message);
    }

    public void Send(User user) {

        System.out.println("Sending Message to Server...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chatHistory.AddText(message);
        chatServer.send(message, user);
    }

    public void Send(Vector<User> users) {

        System.out.println("Sending Message to Server...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chatHistory.AddText(message);
        chatServer.send(message, users);
    }

    public void Save() {
        momento = message.Save();
    }

    public void Restore() {
        message.Restore(momento);
    }

    public String GetLastMessage() {
        return chatHistory.GetLastText().GetText();
    }

    public String GetUsername() {
        return userName;
    }

    public void ConnectToServer(ChatServer chat_server) {
        chatServer = chat_server;
        chatServer.addUser(this);
    }

    public void AddBlockedUser(User user) {
        blockedUsers.add(user);
    }

    public Vector<User> GetBlockUsers() {
        return blockedUsers;
    }

    public void ViewChatHistory() {
        chatServer.ViewChatHistory(this);
    }

    public ChatHistory GetChatHistory() {
        return chatHistory;
    }

    public void ViewCHatHistoryOfUser() {
        chatServer.ViewChatHistory(otherUser);
    }

    @Override
    public Iterator iterator(User user_to_search_with) {
        return chatHistory.iterator(user_to_search_with);
    }
}
