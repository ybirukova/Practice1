package com.example.practice1.lesson8.homework;

public class DataScientist extends Employee {
    @Override
    public void printInfo() {
        System.out.println("DataScientist has: ");
        super.printInfo();
    }
}