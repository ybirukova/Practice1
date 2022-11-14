package com.example.practice1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy {
    public static void main(String[] args) {
        literalByIndex();

        arrayReverseArray();

        randomArray();
    }

    static void literalByIndex() {
        System.out.println("Введите любое число");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        if (index >= array.length || index <= 0) {
            System.out.println(index + " - неверный индекс");
        } else System.out.println(array[index]);
    }

    static void arrayReverseArray() {
        System.out.println("Введите любое число (размер массива)");
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        int[] arrayInverse = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            arrayInverse[i] = array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(arrayInverse));
    }

    static void randomArray() {
        System.out.println("Введите любое число (размер массива)");
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}