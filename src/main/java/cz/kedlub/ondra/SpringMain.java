package cz.kedlub.ondra;

import cz.kedlub.ondra.components.DynamicMessage;
import cz.kedlub.ondra.components.MessageBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@ComponentScan(basePackages = "cz.kedlub.ondra.components")
@SpringBootApplication
public class SpringMain implements CommandLineRunner{

    @Autowired
    private MessageBox messageBox;

    @Autowired
    private DynamicMessage dynamicMessage;

    public static void main(String[] args) {

        /*System.out.println("Start app");
        ApplicationContext context
                = new AnnotationConfigApplicationContext(SpringMain.class);
        SpringMain p = context.getBean(SpringMain.class);
        p.start();*/

        SpringApplication app = new SpringApplication(SpringMain.class);
        System.out.println("Start app");
        app.run(args);

    }

    private void start(){
        System.out.println("Running app");
        messageBox.printMessage();
        dynamicMessage.printProp();
    }

    @Override
    public void run(String[] args){
        System.out.println("Running app");
        messageBox.printMessage();
        dynamicMessage.printProp();
    }
}
