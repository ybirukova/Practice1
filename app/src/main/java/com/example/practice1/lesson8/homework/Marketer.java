package com.example.practice1.lesson8.homework;

public class Marketer extends Employee {
    @Override
    public void printInfo() {
        System.out.println("Marketer has: ");
        super.printInfo();
    }
}