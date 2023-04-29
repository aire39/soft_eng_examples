import java.util.Vector;

public class ChatServerImpl implements ChatServer {
    private Vector<User> users;

    ChatServerImpl() {
        users = new Vector<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void ViewChatHistory(User user) {
        ChatHistory chat_history = user.GetChatHistory();

        System.out.println("Chat history of " + user.GetUsername() + ":");
        for (Message msg : chat_history.GetHistory()) {
            System.out.println(msg.GetText());
        }
    }

    @Override
    public void send(Message message) {
        boolean users_are_sent_a_message = false;
        for (User user: users) {
            if (!message.GetUser().equals(user)) {

                boolean user_is_blocked = false;
                User blocked_user = null;
                for (User buser : message.GetUser().GetBlockUsers()) {
                    if (user.equals(buser)) {
                        user_is_blocked = true;
                        blocked_user = buser;
                        break;
                    }
                }

                if (!user_is_blocked) {
                    user.Receive(message);
                    System.out.println("User (" + message.GetUser().GetUsername() + ") sent: " + message.GetText() + " to " + user.GetUsername());
                }
                else {
                    System.out.println("User (" + user.GetUsername() + ") has blocked " + blocked_user.GetUsername());
                }

                users_are_sent_a_message = true;
            }
        }

        if (!users_are_sent_a_message) {
            System.out.println("No other users on server to send to!");
        }
    }

    @Override
    public void send(Message message, User user) {
        boolean users_are_sent_a_message = false;
        for (User connected_user : users) {
            if (connected_user.equals(user)) {

                boolean user_is_blocked = false;
                User blocked_user = null;
                for (User buser : user.GetBlockUsers()) {
                    if (message.GetUser().equals(buser)) {
                        user_is_blocked = true;
                        blocked_user = buser;
                        break;
                    }
                }

                if (!user_is_blocked) {
                    user.Receive(message);
                    System.out.println("User (" + message.GetUser().GetUsername() + ") sent: " + message.GetText() + " to " + user.GetUsername());
                }
                else {
                    System.out.println("User (" + user.GetUsername() + ") has blocked " + blocked_user.GetUsername());
                }

                users_are_sent_a_message = true;
                break;
            }
        }

        if (!users_are_sent_a_message) {
            System.out.println("No other users on server to send to!");
        }
    }

    @Override
    public void send(Message message, Vector<User> users) {
        for (User user : users) {
            send(message, user);
        }
    }
}
