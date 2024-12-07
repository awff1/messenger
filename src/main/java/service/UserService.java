package service;

import organ.itis403.User;

public class UserService {
    public User[] create4Users() {
        User users[] = new User[4];
        users[0] = (new User("lol", "David Flopo", "8907287087", "12.09.1990"));
        users[1] = (new User("kek", "Lola molhp", "128736186", "brownmoon"));
        users[2] = (new User("sun2006" , "Saha maxilop", "1237812129","89r29881283"));
        users[3] = (new User("vilont", "Anna upouuq", "12309772", "polenova212"));
        return users;
    }
}
