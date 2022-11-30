package com.example.practice1.lesson8.homework;

abstract public class Employee {
    Workplace workplace = new Workplace("Macbook");

    public void printInfo() {
        System.out.println("laptop: " + workplace.laptop);
    }
}