import java.util.Vector;

public class Message {
    private String text;
    private final User user;
    private Vector<User> receivingUsers;


    Message(User user) {
        this.user = user;
        receivingUsers = new Vector<>();
    }
    User GetUser() {
        return user;
    }
    public void SetText(String set_text) {
        text = set_text;
    }

    public String GetText() {
        return text;
    }

    public MessageMomento Save() {
        System.out.println("Memento Created!");
        return new MessageMomento(text);
    }

    public void Restore(MessageMomento momento) {
        System.out.println("Memento Restored!");
        text = momento.GetText();
    }

    public void AddUserReceiver(User receiver) {
        receivingUsers.add(receiver);
    }

    Vector<User> GetReceivers() {
        return receivingUsers;
    }
}
