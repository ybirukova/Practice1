package com.example.practice1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        printDayOfTheWeek();
    }

    static void printDayOfTheWeek() {
        System.out.println("Введите любое число в промежутке от 1 до 7");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неизвестный день недели");
        }
    }
}
