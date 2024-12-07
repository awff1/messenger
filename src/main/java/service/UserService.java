package service;

import organ.itis403.User;

public class UserService {
    public String[] create4Users() {
        String users[] = new String[4];
        users[0] = String.valueOf(new User("lol", "David Flopo", "8907287087", "12.09.1990"));
        users[1] = String.valueOf(new User("kek", "Lola molhp", "128736186", "brownmoon"));
        users[2] = String.valueOf(new User("sun2006" , "Saha maxilop", "1237812129","89r29881283"));
        users[3] = String.valueOf(new User("vilont", "Anna upouuq", "12309772", "polenova212"));
        return users;
    }
}
