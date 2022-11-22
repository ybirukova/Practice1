package com.example.practice1.classesAndObjects;

public class PersonWithCar {
    String name;
    int age;
    Car car;

    public PersonWithCar(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonWithCar(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public void printInfo (){
        System.out.println(name + " " + age);
    }

    public void sayMyName(){
        System.out.println("My name is " + name);
    }

    public int getAge (){
        return age;
    }

    void nameYourCar (){
        System.out.println("Моя машина " + car.getModel());
    }
}