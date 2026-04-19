package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien a = (Alien) context.getBean("alien");
////        a.setAge(12);
//        System.out.println(a.getAge()+" "+a.getSalary());
//        a.code();
////        Alien a1 = (Alien) context.getBean("alien");
////        a.code();
//
//        Computer com = context.getBean(Computer.class);
//        Desktop obj = context.getBean("com1", Desktop.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj1 = context.getBean(Alien.class);
//        obj1.setAge(21);
        obj1.code();
        System.out.println(obj1);
        Desktop dt = context.getBean(Desktop.class);
        dt.compile();
        Desktop dt1 = context.getBean(Desktop.class);
        dt1.compile();
        System.out.println(dt1==dt);
    }
}
