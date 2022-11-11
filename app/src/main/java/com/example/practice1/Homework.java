package com.example.practice1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        evenOrOddNumber();
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

}

