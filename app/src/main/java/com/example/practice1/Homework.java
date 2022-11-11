package com.example.practice1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        evenOrOddNumber();

        defineTheSmallestNumber();

        printDayOfTheWeek();

        everyFifthNumber();
    }

    static void evenOrOddNumber() {
        System.out.println("Введите любое число");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число " + a + " - чётное.");
        } else {
            System.out.println("Число " + a + " - нечётное.");
        }
    }

    static void defineTheSmallestNumber() {
        System.out.println("Введите три числа.");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        a = (a < 0) ? (-a) : a;
        b = (b < 0) ? (-b) : b;
        c = (c < 0) ? (-c) : c;

        if (a <= b && a <= c) {
            System.out.println("Наименьшее по модулю число: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Наименьшее по модулю число: " + b);
        } else if (c <= a && c <= b) {
            System.out.println("Наименьшее по модулю число: " + b);
        }
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

    static void everyFifthNumber() {
        for (int i = 0; i <= 100; i += 5) {
            if (i == 0) continue;
            System.out.print(i + " ");
        }
    }

}

