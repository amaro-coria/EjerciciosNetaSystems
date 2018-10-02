package net.netasystems.main;

import net.netasystems.business.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo Spring!!");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Programmer programmer = ctx.getBean(Programmer.class);
        System.out.println("Trabajando con: "+programmer.sayHello());
    }

}