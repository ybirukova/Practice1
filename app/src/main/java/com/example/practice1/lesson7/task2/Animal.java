package com.example.practice1.lesson7.task2;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    void sound() {
        System.out.println("Some animal make noise");
    }

    void eat() {
        System.out.println("Some animal eats");
    }

    void sleep() {
        System.out.println("Some animal sleeps");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}