import java.util.Vector;

public interface ChatServer {
    void send(Message message);
    void send(Message message, User user);
    void send(Message message, Vector<User> users);
    void addUser(User user);
    void ViewChatHistory(User user);
}
