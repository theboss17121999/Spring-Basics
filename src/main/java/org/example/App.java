package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien a = (Alien) context.getBean("alien");
//        a.setAge(12);
        System.out.println(a.getAge()+" "+a.getSalary());
        a.code();
//        Alien a1 = (Alien) context.getBean("alien");
//        a.code();

        Computer com = context.getBean(Computer.class);
        Desktop obj = context.getBean("com1", Desktop.class);
    }
}
