package com.example.practice1.lesson8.practice_tasks;

abstract public class Employee extends Person {
    int experience;

    public Employee(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }


    int getExperience() {
        return experience;
    }

    abstract String getSpecialization();


}
