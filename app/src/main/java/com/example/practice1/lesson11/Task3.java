package com.example.practice1.lesson11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Queue<String> people = new LinkedList<String>();
        people.offer("Yana");
        people.offer("Maria");
        people.offer("Anna");
        people.offer("Max");
        people.offer("Olga");
        people.offer("Miron");
        System.out.println("Очередь:");

        for (String name : people) {
            System.out.println(name);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("К остановке подъехала маршрутка. Введите количество свободных мест.");
        int freeSits = scanner.nextInt();

        for (int i = 0; i < freeSits; i++) {
            if (people.peek() == null && i < freeSits - 1) {
                System.out.println("Очередь закончилась, в маршрутке осталось " + (freeSits - i - 1));
                break;
            } else {
                people.poll();
            }
        }

        System.out.println("На остановке остались: ");

        if (people.peek() == null) {
        } else {
            for (String name : people) {
                System.out.println("никого");
                System.out.println(name);
            }
        }
    }
}