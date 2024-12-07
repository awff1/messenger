package organ.itis403;

public class Message {
    private String userSend;
    private String userGet;
    private String text;
    private String date;

    public Message() {}

    public Message(String userSend, String userGet, String text, String date) {
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

    public String getUserGet() {
        return userGet;
    }

    public String getUserSend() {
        return userSend;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUserGet(String userGet) {
        this.userGet = userGet;
    }

    public void setUserSend(String userSend) {
        this.userSend = userSend;
    }
}
