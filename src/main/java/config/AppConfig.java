package config;

import bean.BeanOne;
import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//Spring Bean Definitions walata source ekak
//How to Scan POJOs and enter to the Application Context
@Configuration
@ComponentScan(basePackages = "bean") //beans thyen location ek hoygnn
//@ComponentScan(basePackageClasses = BeanOne.class)

public class AppConfig {
    public AppConfig(){
        System.out.println("App Config Object Created");

    }

    //When we are not allowed to put the @Component annotation we can use this method to
    //introduce a bean Spring bean to the Application Context
    @Bean("connection")
    public MyConnection getConnection(){
        return new MyConnection();

    }
}
