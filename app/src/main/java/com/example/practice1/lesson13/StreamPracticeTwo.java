package com.example.practice1.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPracticeTwo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbersList = new ArrayList<>();
        System.out.println("Изначальный список чисел:");
        for (int i = 0; i < random.nextInt(20); i++) {
            numbersList.add(random.nextInt(100));
        }
        for (int number : numbersList) {
            System.out.println(number);
        }

        Predicate<Integer> predicate = number -> number % 2 == 0;
        List<Integer> filteredNumbers = numbersList.stream()
                .filter(predicate)
                .collect(Collectors.toList());

//        List<Integer> filteredNumbers = numbersList.stream()
//                .filter(number -> number % 2 == 0)
//                .collect(Collectors.toList());

        System.out.println("Четные числа:");
        System.out.println(filteredNumbers);
    }
}