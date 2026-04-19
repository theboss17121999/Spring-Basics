package org.example;

public class Desktop implements Computer{

    Desktop(){
        System.out.println("fuck you");
    }
    @Override
    public void compile(){
        System.out.println("Compiling using desktop");
    }
}
