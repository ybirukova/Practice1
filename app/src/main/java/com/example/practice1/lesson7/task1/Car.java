package com.example.practice1.lesson7.task1;

public class Car {
    String mark;

    public Car(String mark){
        this.mark = mark;
    }

    void printName() {
        System.out.println("I'm car " + mark);
    }
}