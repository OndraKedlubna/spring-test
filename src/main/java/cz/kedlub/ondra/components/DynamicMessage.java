package cz.kedlub.ondra.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DynamicMessage {

    @Autowired
    private PropertyLoad propertyLoad;

    public void printProp(){
        System.out.println(propertyLoad.getTest());
    }

}
