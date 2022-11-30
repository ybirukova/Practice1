package com.example.practice1.lesson8.homework;

public class Designer extends Employee {
    @Override
    public void printInfo() {
        System.out.println("Designer has: ");
        super.printInfo();
    }
}