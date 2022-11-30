package com.example.practice1.lesson8.homework;

public class Headmaster extends Employee {
    @Override
    public void printInfo() {
        System.out.println("Headmaster has: ");
        super.printInfo();
    }
}