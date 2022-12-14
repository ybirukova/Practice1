package com.example.practice1.lesson13.homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
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
        List<Integer> randomNumbers = createListOfRandomNumbers(enterAmountOfNumbers());

        System.out.println("Изначальный список чисел: " + randomNumbers);
        System.out.print("Четные числа от 7 до 17: ");
        List<Integer> numberList = randomNumbers.stream()
                .distinct()
                .peek(printEvenNumbersFrom7To17)
                .map(number -> number * MULTIPLIER)
                .filter(number -> number > MIN_LIMIT)
                .collect(Collectors.toList());

        System.out.println();
        long amountOfElementsInStream = numberList.stream().count();
        double averageOfAllElementsInStream = numberList.stream().collect(Collectors.averagingInt(num -> num));
        System.out.println("Количество элементов в стриме (после удаления дубликатов, *2 и фильтра >10): " + amountOfElementsInStream );
        System.out.println("Среднее арифметическое всех элементов в стриме: " + averageOfAllElementsInStream);
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

    private static List<Integer> createListOfRandomNumbers(int amount) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            randomNumbers.add(RANDOM.nextInt(BOUND));
        }
        return randomNumbers;
    }
}