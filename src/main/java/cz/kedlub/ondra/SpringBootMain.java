/*package cz.kedlub.ondra;

import cz.kedlub.ondra.components.DynamicMessage;
import cz.kedlub.ondra.components.MessageBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMain implements CommandLineRunner{

    @Autowired
    private MessageBox messageBox;

    @Autowired
    private DynamicMessage dynamicMessage;

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(SpringBootMain.class);
        System.out.println("Start app");
        app.run(args);

    }

    @Override
    public void run(String[] args){
        System.out.println("Running app");
        messageBox.printMessage();
        dynamicMessage.printProp();
    }
}*/
