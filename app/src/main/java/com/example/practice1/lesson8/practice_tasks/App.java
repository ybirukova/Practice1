package com.example.practice1.lesson8.practice_tasks;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //task1
        Triangle triangle = new Triangle(5);
        Rectangle rectangle = new Rectangle(3, 5);
        Circle circle = new Circle(4);
        System.out.println("Triangle square: " + triangle.getSquare());
        System.out.println("Rectangle square: " + rectangle.getSquare());
        System.out.println("Circle square: " + circle.getSquare());
        System.out.println();

        //task2
        System.out.println("Введите число работников для биржи работ.");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Employee[] employees = new Employee[size];
        for (int i = 0; i < employees.length; i++) {
            switch (rnd(1, 4)) {
                case 1:
                    employees[i] = new Pilot("Jack", 24, 4);
                    break;
                case 2:
                    employees[i] = new Programmer("Bob", 32, 10);
                    break;
                case 3:
                    employees[i] = new Teacher("Rose", 45, 25);
                    break;
                case 4:
                    employees[i] = new Doctor("Bill", 52, 30);
                    break;
            }
        }

        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + " Age: " + employee.getAge() + " Specialization: " + employee.getSpecialization() + " Experience:" + employee.getExperience());
        }
    }

    static int rnd(int min, int max) {
        int diff = max - min;
        Random random = new Random();
        return random.nextInt(diff + 1) + min;
    }
}