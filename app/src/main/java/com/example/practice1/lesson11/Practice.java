package com.example.practice1.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Yana", "111011A", 5, 4));
        students.add(new Student("Maria", "111011A", 5, 2));
        students.add(new Student("Anna", "111011A", 5, 5));
        students.add(new Student("Olga", "111011A", 3, 5));
        students.add(new Student("Anton", "111011A", 2, 3));
        students.add(new Student("Kolya", "111022A", 1, 4));
        students.add(new Student("Max", "111022A", 4, 3));

        printAllStudents(students);
        System.out.println();
        for (Student student : students) {
            student.upCourse();
        }

        printAllStudents(students);
        printStudentsOnCourse(students, 5);
        deleteStudents(students);
        printAllStudents(students);
    }

    static void printAllStudents(List<Student> students) {
        int i = 0;
        for (Student student : students) {
            System.out.println(i + ". Name: " + student.name + " group: " + student.group + " grade: " + student.grade + " course: " + student.course);
            i++;
        }
    }

    static void deleteStudents(List<Student> students) {
        int size = students.size();
        for (int i = 0; i < size; i++) {
            if (students.get(i).grade < 3) {
                students.remove(i);
                i--;
                size--;
            }
        }
    }

    static void printStudentsOnCourse(List<Student> students, int course) {
        System.out.println("Students of " + course + " course:");
        for (Student student : students) {
            if (student.course == course) {
                System.out.println("Name: " + student.name + " group: " + student.group + " grade: " + student.grade + " course: " + student.course);
            }
        }
    }
}