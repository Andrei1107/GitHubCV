package multithreading;

//exemplu cu notify si wait

public class Message {
    private String message;

    Message(String mess) {
        this.message = mess;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
