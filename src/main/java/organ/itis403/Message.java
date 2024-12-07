package organ.itis403;

public class Message {
    private User userSend;
    private User userGet;
    private String text;
    private String date;

    public Message() {}

    public Message(User userSend, User userGet, String text, String date) {
        this.date = date;
        this.text = text;
        this.userGet = userGet;
        this.userSend = userSend;
    }

    public String getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public User getUserGet() {
        return userGet;
    }

    public User getUserSend() {
        return userSend;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUserGet(User userGet) {
        this.userGet = userGet;
    }

    public void setUserSend(User userSend) {
        this.userSend = userSend;
    }
}

