package com.example.practice1.lesson9;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println("Enter index");
        Scanner scanner = new Scanner(System.in);

        int process = 0;
        while (process == 0) {
            try {
                String indexStr;
                indexStr = scanner.nextLine();
                int index = Integer.parseInt(indexStr.trim());
                System.out.println(numbers[index]);

            } catch (IndexOutOfBoundsException ioe) {
                System.out.println("index is too large");

            } catch (NumberFormatException nfe) {
                System.out.println("entered symbol is not int");

            } catch (Exception e) {
                System.out.println("unknowing error");

            } finally {
                System.out.println("the end");
            }
        }
    }
}