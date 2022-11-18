package com.example.practice1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
       createOneDArrayFromTwoDArray();
    }

    static void createOneDArrayFromTwoDArray() {
        System.out.println("Введите два целых числа (>=0) для определения размерности двумерного массива.");
        Scanner in = new Scanner(System.in);
        int arraySize1 = in.nextInt();
        int arraySize2 = in.nextInt();
        int[][] array = new int[arraySize1][arraySize2];
        Random rnd = new Random();

        for (int[] innerArray : array) {
            for (int index2 = 0; index2<innerArray.length; index2++) {
                innerArray[index2] = rnd.nextInt(100);
            }
        }
        System.out.println("Двумерный массив: " + Arrays.deepToString(array));

        int newArraySize = arraySize1*arraySize2;
        int[]newArray = new int [newArraySize];

        int newArrayIndex = 0;
        for (int[] innerArray : array) {
            for (int index2 = 0; index2<innerArray.length; index2++) {
                newArray[newArrayIndex] = innerArray[index2];
                newArrayIndex++;
            }
        }

        System.out.println("Одномерный массив, сформированный из двумерного: " + Arrays.toString(newArray));
    }
}