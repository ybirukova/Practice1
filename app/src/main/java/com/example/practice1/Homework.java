package com.example.practice1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        evenOrOddNumber();

        defineTheSmallestNumber();
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

}

