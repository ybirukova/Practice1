package com.example.practice1.lesson8.practice_tasks;

public class Pilot extends Employee{
    public Pilot(String name, int age, int experience) {
        super(name, age, experience);
    }

    @Override
    String getSpecialization() {
        return "pilot";
    }
}
