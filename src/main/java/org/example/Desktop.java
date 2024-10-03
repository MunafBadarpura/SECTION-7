package org.example;

public class Desktop implements Computer{

    Desktop(){
        System.out.println("Desktop created");
    }

    @Override
    public void compile(){
        System.out.println("COMPILE WITH DESKTOP");
    }
}
