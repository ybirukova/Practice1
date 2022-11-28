package com.example.practice1.lesson8.homework;

public class Economist extends Employee {
    @Override
    public void printInfo() {
        System.out.println("Economist has: ");
        super.printInfo();
    }
}