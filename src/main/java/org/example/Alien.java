package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    @Value("21")
    private int age;
    private int salary;
    @Autowired
    @Qualifier("laptop") //feild INjection
    private Computer com;

    @Override
    public String toString() {
        return "Alien{" +
                "age=" + age +
                ", salary=" + salary +
                ", com=" + com +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Alien(){
//        System.out.println("Object Created");
    }
//    @ConstructorProperties({"age","lap","salary"})
//    Alien(int age, Laptop lap, int salary){
//        this.age = age;
//        this.lap = lap;
//        this.salary = salary;
//        System.out.println("Object Created cons");
//    }
    public void code(){
        System.out.println("coding");
        com.compile();
    }
}
