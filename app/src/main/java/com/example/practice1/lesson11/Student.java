package com.example.practice1.lesson11;

public class Student {
    String name;
    String group;
    int grade;
    int course;

    public Student(String name, String group, int grade, int course) {
        this.name = name;
        this.group = group;
        this.grade = grade;
        this.course = course;
    }

    void upCourse() {
        if (grade >= 3) {
            course += 1;
        }
    }
}