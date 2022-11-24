package com.example.practice1.study7.task1;

public class Audi extends Car {
    String model;

    public Audi(String mark, String model) {
        super(mark);
        this.model = model;
    }

    @Override
    void printName() {
        System.out.println("I'm car " + mark + " " + model);
    }
}