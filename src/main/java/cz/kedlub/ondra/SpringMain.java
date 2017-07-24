package cz.kedlub.ondra;

import cz.kedlub.ondra.components.DynamicMessage;
import cz.kedlub.ondra.components.MessageBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "cz.kedlub.ondra.components")
public class SpringMain {

    @Autowired
    private MessageBox messageBox;

    @Autowired
    private DynamicMessage dynamicMessage;

    public static void main(String[] args) {
        System.out.println("Start app");
        ApplicationContext context
                = new AnnotationConfigApplicationContext(SpringMain.class);
        SpringMain p = context.getBean(SpringMain.class);
        p.start();
    }

    private void start(){
        System.out.println("Running app");
        messageBox.printMessage();
        dynamicMessage.printProp();
    }
}
