package com.example.practice1.lesson8.practice_tasks;

public class Teacher extends Employee{
    public Teacher(String name, int age, int experience) {
        super(name, age, experience);
    }

    @Override
    String getSpecialization() {
        return "teacher";
    }
}
