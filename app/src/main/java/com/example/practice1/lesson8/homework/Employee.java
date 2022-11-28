package com.example.practice1.lesson8.homework;

abstract public class Employee {
    Workplace workplace = new Workplace("HP", "Logitech", "Logitech", "Samsung");

    public void printInfo() {
        System.out.println("system unit: " + workplace.systemUnit + " keyword: " + workplace.keyword + " mouse: " + workplace.mouse + " monitor: " + workplace.monitor);
    }
}