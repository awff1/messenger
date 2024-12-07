package service;

import organ.itis403.Message;
import organ.itis403.User;

public class MessageService {

    public String[] create4Message(User user1, User user2) {
        String messages[] = new String[4];
        messages[0] = new Message(user1, user2, "hi","12.12.2012");
        messages[1] = new Message(user2, user1, "hi", "13.12.2012");
        messages[2] = new Message(user1, user2, "how are u?","13.12.2012");
        messages[3] = new Message(user2, user1,"im fine", "14.12.2012");
        return messages;
    }

}
