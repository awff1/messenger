import organ.itis403.Message;
import organ.itis403.User;
import service.MessageService;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        String users[] = userService.create4Users();
        System.out.println("Users:");
        for(int i = 0; i < users.length;i++) {
            System.out.print(users[i] + " ");
        }

        MessageService messageService = new MessageService();
        String messages = messageService.create4Message(users);

    }
}
