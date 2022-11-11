package com.example.practice1;

public class Homework {
    public static void main(String[] args) {
        everyFifthNumber();
    }

    static void everyFifthNumber() {
        for (int i = 0; i <= 100; i += 5) {
            if (i == 0) continue;
            System.out.print(i + " ");
        }
    }
}
