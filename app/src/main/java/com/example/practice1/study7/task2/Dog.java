package com.example.practice1.study7.task2;

public class Dog extends Animal {
    String ownerName;

    public Dog(String ownerName, String food, String location) {
        super(food, location);
        this.ownerName = ownerName;
    }

    @Override
    void sound() {
        System.out.println("Bow-bow");
    }

    @Override
    void eat() {
        System.out.println("Dog eats " + getFood());
    }
}