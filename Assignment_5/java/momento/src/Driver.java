import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class Driver {
    public static void main(String[] args) {
        ChatServerImpl chat_server = new ChatServerImpl();
        User user_john = new User("John", chat_server);
        User user_amy = new User("Amy", chat_server);
        User user_melody = new User("Melody", chat_server);
        User user_jason = new User("Jason", chat_server);

        user_john.SetMessage("Test");
        user_john.Save();
        user_john.Send();

        user_john.SetMessage("Throwout!");
        user_john.Send();
        user_john.Restore();
        user_john.Send();

        user_john.SetMessage(user_john.GetLastMessage());
        user_john.Send();

        user_amy.SetMessage("Hello, John!");
        user_amy.Send(user_john);

        user_john.AddBlockedUser(user_amy);
        user_amy.Send(user_john);

        user_john.Send(new Vector<User>(Arrays.asList(user_amy, user_jason)));
        user_john.SetMessage("Every else but Amy!");
        user_john.Send();

        Iterator chat_history_iter = user_john.iterator(user_amy);

        System.out.println("Amys messages from Johns history...");
        while(chat_history_iter.hasNext()) {
            Message msg = (Message) chat_history_iter.next();
            System.out.println(msg.GetText());
        }
    }
}