package cz.kedlub.ondra.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageBox {

    @Autowired
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message.getMessage());
    }
}
