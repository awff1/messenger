import organ.itis403.Message;
import organ.itis403.User;
import service.MessageService;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User users[] = userService.create4Users();
        System.out.println("Users:");
        for(int i = 0; i < users.length;i++) {
            System.out.print(users[i] + " ");
        }
        System.out.println();

        MessageService messageService = new MessageService();
        Message[] messages = messageService.create4Message(users[0], users[1]);
        System.out.println("Messages:");
        for(int i = 0; i < messages.length; i++) {
            System.out.print(messages[i].getUserSend() + " ");
        }
    }
}
