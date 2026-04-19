package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private int salary;
    private Computer com;

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

    Alien(){
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
//        System.out.println("coding");
        com.compile();
    }
}
