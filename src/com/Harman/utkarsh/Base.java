package com.Harman.utkarsh;

public class Base {

    void display(){
        System.out.println("Parent class");

    }
}

class Child extends Base{
    @Override
    void display(){
        super.display();
        //System.out.println("Child class");

    }

    void Calculator()
    {
        System.out.println("Calculator");
    }


    public static void main(String[] args) {

        Child c = new Child();
        c.display();
        @SuppressWarnings({"deprectaed","unused"})
        int x;
        c.Calculator();


    }
}