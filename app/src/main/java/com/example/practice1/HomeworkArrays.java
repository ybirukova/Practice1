package com.example.practice1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArrays {
    public static void main(String[] args) {
        createArrayOfNames();

        remakeRandomArrayToEvenArray();

        deleteNumberFromArray();
    }

    static void createArrayOfNames(){
        String[] arrayOfNames = new String[]{"Yana", "Max", "Maria", "Helga", "Anna", "Timur", "Egor"};
        Arrays.sort(arrayOfNames);
        System.out.println(Arrays.toString(arrayOfNames));
    }

    static void remakeRandomArrayToEvenArray() {
        System.out.println("Чтобы задать размер массива, введите любое число больше 5 и меньше либо равно 10.");
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();

        while (arraySize <= 5 || arraySize > 10) {
            System.out.println("Чтобы задать размер массива, введите любое число больше 5 и меньше либо равно 10.");
            arraySize = in.nextInt();
        }

        int[] arrayOfRandomNumbers = new int[arraySize];

        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = (int) (Math.random() * 100);
        }

        System.out.println("Сгенерированный массив: " + Arrays.toString(arrayOfRandomNumbers));

        int counterOfEven = 0;
        for (int var : arrayOfRandomNumbers) {
            counterOfEven = var % 2 == 0 ? ++counterOfEven : counterOfEven;
        }

        int[] arrayOfEvenNumbers = new int[counterOfEven];

        if (counterOfEven == 0) {
            System.out.println("Четных чисел в массиве нет.");
        } else {
            int i = 0;
            for (int var : arrayOfRandomNumbers) {
                if (var % 2 == 0) {
                    arrayOfEvenNumbers[i] = var;
                    i++;
                }
            }
            System.out.println("Массив из четных чисел первоначального массива: " + Arrays.toString(arrayOfEvenNumbers));
        }
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
