import java.util.Scanner;

public class Message1 {
    int id;
    String message;
    String messageAuthor;
    String messageDateTime;

    public Message1(){

    }

    public Message1(String message, String messageAuthor, String messageDateTime) {
        this.message = message;
        this.messageAuthor = messageAuthor;
        this.messageDateTime = messageDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public String getMessageDateTime() {
        return messageDateTime;
    }

    public void setMessageDateTime(String messageDateTime) {
        this.messageDateTime = messageDateTime;
    }
}
