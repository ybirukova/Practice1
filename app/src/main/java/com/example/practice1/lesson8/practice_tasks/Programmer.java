package com.example.practice1.lesson8.practice_tasks;

public class Programmer extends Employee{
    public Programmer(String name, int age, int experience) {
        super(name, age, experience);
    }

    @Override
    String getSpecialization() {
        return "programmer";
    }
}
