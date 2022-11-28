package com.example.practice1.lesson8.homework;

public class Programmer extends Employee {
    @Override
    public void printInfo() {
        System.out.println("Programmer has: ");
        super.printInfo();
    }
}