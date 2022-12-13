package com.example.practice1.lesson7.task2;

public class Cat extends Animal {
    String slaveName;

    public Cat(String slaveName, String food, String location) {
        super(food, location);
        this.slaveName = slaveName;
    }

    @Override
    void sound() {
        System.out.println("Meow-meow");
    }

    @Override
    void eat() {
        System.out.println("Cat eats " + getFood());
    }
}