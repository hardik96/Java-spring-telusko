package com.first.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Alien{

    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
public Alien(){
    System.out.println("Object Created");
}
public Alien(int age){
    this.age=age;
}

    public void code(){
        System.out.println("Hello World");
    }
}



