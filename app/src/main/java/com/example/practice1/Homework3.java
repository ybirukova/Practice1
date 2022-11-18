package com.example.practice1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        createOneDArrayFromTwoDArray();

        create3DArray();
    }

    static void createOneDArrayFromTwoDArray() {
        System.out.println("Введите два целых числа (>=0) для определения размерности двумерного массива.");
        Scanner in = new Scanner(System.in);
        int arraySize1 = in.nextInt();
        int arraySize2 = in.nextInt();
        int[][] array = new int[arraySize1][arraySize2];
        Random rnd = new Random();

        for (int[] innerArray : array) {
            for (int index2 = 0; index2 < innerArray.length; index2++) {
                innerArray[index2] = rnd.nextInt(100);
            }
        }
        System.out.println("Двумерный массив: " + Arrays.deepToString(array));

        int newArraySize = arraySize1 * arraySize2;
        int[] newArray = new int[newArraySize];

        int newArrayIndex = 0;
        for (int[] innerArray : array) {
            for (int index2 = 0; index2 < innerArray.length; index2++) {
                newArray[newArrayIndex] = innerArray[index2];
                newArrayIndex++;
            }
        }

        System.out.println("Одномерный массив, сформированный из двумерного: " + Arrays.toString(newArray));
    }

    static void create3DArray() {
        System.out.println("Введите три целых числа (>=0) для определения размерности трехмерного массива.");
        Scanner in = new Scanner(System.in);
        int arraySize1 = in.nextInt();
        int arraySize2 = in.nextInt();
        int arraySize3 = in.nextInt();
        int[][][] array = new int[arraySize1][arraySize2][arraySize3];
        Random rnd = new Random();

        for (int[][] innerArray1 : array) {
            for (int[] innerArray2 : innerArray1) {
                for (int index = 0; index < innerArray2.length; index++) {
                    innerArray2[index] = rnd.nextInt(10) + 1;
                }
            }
        }
        System.out.println("Числовой массив: " + Arrays.deepToString(array));

        String[][][] arrayString = new String[arraySize1][arraySize2][arraySize3];
        String numberName = null;

        for (int index1 = 0; index1 < arraySize1; index1++) {
            for (int index2 = 0; index2 < arraySize2; index2++) {
                for (int index3 = 0; index3 < arraySize3; index3++) {
                    int number = array[index1][index2][index3];

                    switch (number) {
                        case 1: {numberName = "one";break;}
                        case 2: {numberName = "two";break;}
                        case 3: {numberName = "three";break;}
                        case 4: {numberName = "four";break;}
                        case 5: {numberName = "five";break;}
                        case 6: {numberName = "six";break;}
                        case 7: {numberName = "seven";break;}
                        case 8: {numberName = "eight";break;}
                        case 9: {numberName = "nine";break;}
                        case 10: {numberName = "ten";break;}
                    }
                    arrayString[index1][index2][index3] = numberName;
                }
            }
        }
        System.out.println("Строковое представление массива: " + Arrays.deepToString(arrayString));
    }
}