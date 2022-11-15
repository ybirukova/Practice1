package com.example.practice1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArrays {
    public static void main(String[] args) {
        deleteNumberFromArray();
    }

    static void deleteNumberFromArray() {
        int[] firstArray = {1, 2, 4, 4, 5, 4, 9, 0, 0};

        System.out.println("Дан массив: " + Arrays.toString(firstArray));
        System.out.println("Введите любое число, все вхождения которого хотите удалить из массива");
        Scanner in = new Scanner(System.in);
        int numberForDeleting = in.nextInt();

        int counter = 0;
        for (int numberOfFirstArray : firstArray) {
            counter = (numberOfFirstArray == numberForDeleting) ? ++counter : counter;
        }

        int secondArraySize = firstArray.length - counter;
        int[] secondArray = new int[secondArraySize];
        int i = 0;

        if (counter == 0) {
            System.out.println("Такого числа в массиве нет.");
        } else {
            for (int numberOfFirstArray : firstArray) {
                if (numberOfFirstArray == numberForDeleting) {
                } else {
                    secondArray[i] = numberOfFirstArray;
                    i++;
                }
            }
            System.out.println("Новый массив: " + Arrays.toString(secondArray));
        }
    }
}
