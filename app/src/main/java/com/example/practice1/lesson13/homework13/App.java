package com.example.practice1.lesson13.homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
    private static final List<Integer> randomNumbers = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final int BOUND = 30;
    private static final int FROM_NUM = 7;
    private static final int TO_NUM = 17;
    private static final int MULTIPLIER = 2;
    private static final int DIVIDER_IS_EVEN = 2;
    private static final int MIN_LIMIT = 10;
    private static Consumer<Integer> printEvenNumbersFrom7To17 = integer -> {
        if (integer % DIVIDER_IS_EVEN == 0 && integer >= FROM_NUM && integer <= TO_NUM) {
            System.out.print(integer + " ");
        }
    };

    public static void main(String[] args) {
        fillListRandomNumbers(enterAmountOfNumbers());
        System.out.println("Изначальный список чисел: " + randomNumbers);

        List<Integer> numberList = randomNumbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.print("Четные числа от 7 до 17: ");
        for (int number : numberList) {
            printEvenNumbersFrom7To17.accept(number);
        }
        numberList = numberList.stream()
                .map(number -> number * MULTIPLIER)
                .filter(number -> number > MIN_LIMIT)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("Элементы в стриме (после *2, >10): " + numberList);
        System.out.println("Количество элементов в стриме: " + numberList.size());
        System.out.println("Среднее арифметическое всех элементов в стриме: " + numberList.stream().collect(Collectors.averagingInt(num -> num)));
    }

    private static int enterAmountOfNumbers() {
        System.out.println("Введите желаемое количество рандомных чисел в коллекции");
        while (true) {
            try {
                return SCANNER.nextInt();
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Попробуйте ещё раз.");
                SCANNER.nextLine();
            }
        }
    }

    private static void fillListRandomNumbers(int amount) {
        for (int i = 0; i < amount; i++) {
            randomNumbers.add(RANDOM.nextInt(BOUND));
        }
    }
}