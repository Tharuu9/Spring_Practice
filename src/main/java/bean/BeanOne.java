package bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BeanOne {
    public BeanOne(){
        System.out.println("I m Bean One");

    }
}
