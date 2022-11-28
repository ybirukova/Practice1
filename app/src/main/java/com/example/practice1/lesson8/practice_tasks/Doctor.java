package com.example.practice1.lesson8.practice_tasks;

public class Doctor extends Employee{
    public Doctor(String name, int age, int experience) {
        super(name, age, experience);
    }

    @Override
    String getSpecialization() {
        return "doctor";
    }
}
