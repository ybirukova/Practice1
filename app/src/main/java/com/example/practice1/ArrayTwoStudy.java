package com.example.practice1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTwoStudy {
    public static void main(String[] args) {
        //создать 3хмерный массив, заполнить случайными числами
        System.out.println("Введите три числа, для определения размерностей 3хмерного массива");
        Scanner in = new Scanner(System.in);
        int arraySize1 = in.nextInt();
        int arraySize2 = in.nextInt();
        int arraySize3 = in.nextInt();

        int[][][] array = new int[arraySize1][arraySize2][arraySize3];

        for (int[][] a : array) {
            for (int[] b : a) {
                for (int c = 0; c < b.length; c++) {
                    b[c] = (int) (Math.random() * 100);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

        //вывести шахматную доску
        String[][] chess = new String[8][8];
        for (int w1 = 0; w1 < chess.length; w1++) {
            for (int w2 = 0; w2 < chess[w1].length; w2++) {
                if ((w1 + w2) % 2 == 0) {
                    chess[w1][w2] = "b";
                } else {
                    chess[w1][w2] = "w";
                }
            }
            System.out.println(Arrays.toString(chess[w1]));
        }

        //практика на занятии
        int[][] array1 = new int[2][3]; //{{1,2,3},{1,2,3}};
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[1][0] = 1;
        array1[1][1] = 2;
        array1[1][2] = 3;
        System.out.println(Arrays.equals(array[0], array[1]));
        System.out.println(Arrays.deepToString(array));

        for (int[] a : array1) {
            for (int b : a) {
                System.out.println(b);
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        int[] array3 = new int[]{1, 2};
        int[] array4 = new int[]{1, 2};
        System.out.println(Arrays.equals(array3, array4));
    }
}