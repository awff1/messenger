package organ.itis403;

public class User {
    private String nickname;
    private String username;
    private String phoneNumber;
    private String password;

    public User() {}

    public User(String nickname, String username, String phoneNumber, String password) {
        this.nickname = nickname;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}