package com.example.practice1.lesson13;

import java.util.Optional;
import java.util.Scanner;

public class NumberOpt {
    public static void main(String[] args) {
        Integer number = enterNumber();
        Optional<Integer> numberOpt = Optional.ofNullable(number);
        if (numberOpt.isPresent()) {
            System.out.println(numberOpt.get());
        } else System.out.println("Incorrect entering.");
    }

    static Integer enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        try {
            String numberStr = scanner.nextLine();
            Integer number = Integer.parseInt(numberStr);
            return number;
        } catch (Exception e) {
            return null;
        }
    }
}