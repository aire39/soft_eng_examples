import java.util.Iterator;

public class SearchMessageByUser implements Iterator {

    private int counter = 0;
    private ChatHistory chatHistory;
    private Iterator iter;
    User user;

    SearchMessageByUser(ChatHistory chat_history, User user_to_search_with) {
        chatHistory = chat_history;
        user = user_to_search_with;

        Iterator<Message> it_next = chat_history.GetHistory().iterator();
        Iterator<Message> it_prev = chat_history.GetHistory().iterator();
        while(it_next.hasNext()) {
            Message msg = it_next.next();
            counter++;

            if (msg.GetUser().equals(user_to_search_with) || msg.GetReceivers().contains(user))
            {
                iter = it_prev;
                break;
            }

            it_prev.next();
        }
    }

    @Override
    public boolean hasNext() {
        boolean found = false;

        Iterator it_check = chatHistory.GetHistory().iterator();
        for(int i=0; i<counter; i++) {
            it_check.next();
        }

        while(iter.hasNext()) {
            Message msg = (Message) iter.next();

            if (msg.GetUser().equals(user) || msg.GetReceivers().contains(user))
            {
                iter = it_check;
                found = true;
                break;
            }

            it_check.next();
        }

        return found;
    }

    @Override
    public Object next() {
        Message msg = null;

        if (hasNext()) {
            counter++;
            Message check_msg = (Message) iter.next();

            if (check_msg.GetUser().equals(user) || check_msg.GetReceivers().contains(user)) {
                msg = check_msg;
            }
        }

        return msg;
    }

}
