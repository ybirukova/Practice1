package com.example.practice1.lesson12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    static Set<Integer> numbers = new HashSet<>();
    private static final String INPUT_PATTERN = "[\\d]{1,20}";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String entryNumbers = scanner.nextLine();
        String[] numbersStr = entryNumbers.split(" ");
        for (String numberStr : numbersStr) {
            if (numberStr.matches(INPUT_PATTERN)) {
                numbers.add(Integer.parseInt(numberStr));
            }
        }
        for (int numb : numbers) {
            System.out.println(numb);
        }
    }
}
