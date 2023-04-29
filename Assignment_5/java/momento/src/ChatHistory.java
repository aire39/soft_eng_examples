import java.util.Iterator;
import java.util.Vector;

public class ChatHistory implements IterableByUser {
    private final Vector<Message> history;

    public ChatHistory() {
        history = new Vector<>();
    }

    public void AddText(Message text) {
        history.add(text);
    }

    public Message GetLastText() {
        Message last_text = null;

        if(!history.isEmpty()) {
            last_text = history.get(history.size()-1);
        }

        return last_text;
    }

    Vector<Message> GetHistory() {
        return history;
    }

    @Override
    public Iterator iterator(User user_to_search_with) {
        return new SearchMessageByUser(this, user_to_search_with);
    }
}
