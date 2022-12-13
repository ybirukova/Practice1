package com.example.practice1.lesson7.task2;

public class Duck extends Animal {
    String color;

    public Duck(String color, String food, String location) {
        super(food, location);
        this.color = color;
    }

    @Override
    void sound() {
        System.out.println("Quack-quack");
    }

    @Override
    void eat() {
        System.out.println("Duck eats " + getFood());
    }
}