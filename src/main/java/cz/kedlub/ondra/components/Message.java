package cz.kedlub.ondra.components;

import org.springframework.stereotype.Component;

@Component
public class Message {

    private String message = "Spring here";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
